import React, { useState } from 'react';
import './styles.scss';
import logo from 'core/assets/images/logo.png';
import { Link } from 'react-router-dom';

const NavBar = () => {
    const [search, setSearch] = useState('');

    const handleOnChange = (event: React.ChangeEvent<HTMLInputElement>) => {
        setSearch(event.target.value);
    }

    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault();
    }

    return (
        <nav className="navbar bg-custom">
            <a href="/" className="navbar-brand">
                <img className="logo" src={logo} alt="logo" />
            </a>
            <div className="d-flex align-items-center ml-4">
                <form onSubmit={handleSubmit} className="form-inline">
                    <input
                        value={search}
                        type="text"
                        className="form-control mr-sm-2"
                        onChange={handleOnChange}
                        placeholder="Digite um número"
                        aria-label="Search"
                    />
                    <Link to={`/orders/${search}`} className="btn btn-primary my-2 my-sm-0" type="submit">
                        Buscar
                    </Link>
                </form>
            </div>
        </nav>
    );
}

export default NavBar;