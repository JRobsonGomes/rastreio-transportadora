import Home from 'pages/Home';
import OrderTracking from 'pages/OrderTracking';
import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import NavBar from './core/components/NavBar';

const Routes = () => (
    <BrowserRouter>
        <NavBar />
        <Switch>
            <Route path="/" exact >
                <Home />
            </Route>
            <Route path="/orders/:orderId" exact>
                <OrderTracking />
            </Route>
        </Switch>
    </BrowserRouter>
);

export default Routes;