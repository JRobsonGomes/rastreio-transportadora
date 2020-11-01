import { makeRequest } from 'core/utils/request';
import React, { useEffect, useState } from 'react';
import { Order } from 'core/types/Order';
import { useParams } from 'react-router-dom';
import './styles.scss';

type ParamsType = {
    orderId: string;
}

const formatDate = (date: string) => {
    const dateFormated = new Date(date);

    const options = {
        year: 'numeric', month: 'numeric', day: 'numeric',
        hour: 'numeric', minute: 'numeric', second: 'numeric',
        hour12: false,
    };

    return (new Intl.DateTimeFormat('pt-BR', options).format(dateFormated));
}

const OrderTracking = () => {
    const { orderId } = useParams<ParamsType>();
    const [order, setOrder] = useState<Order>();

    useEffect(() => {

        makeRequest({ url: `/orders/${orderId}` })
            .then(response => setOrder(response.data));
    }, [orderId]);

    return (
        <div className="card">
            <div className="card-header">
                <h2 className="card-title">
                    {order?.description}
                </h2>
            </div>
            <div className="card-body">
                <div className="card-header">
                    <h3 className="card-title">Rastreamento (Status)</h3>
                </div>
                <div className="card-body-containt">
                    {order?.trackings.map(
                        tracking => (
                            <div className={tracking.status === "Entre ao Destinatário"? "card text-white bg-success mb-3" : "card text-white bg-secondary mb-3"}>
                                <div className="card-header">{tracking.status}</div>
                                <div className="card-body">
                                    <h5 className="card-title">{tracking.location}</h5>
                                    <p className="card-text">{formatDate(tracking.moment)}</p>
                                </div>
                            </div>
                        )
                    )}
                </div>
            </div>
        </div>
    );
};

export default OrderTracking;