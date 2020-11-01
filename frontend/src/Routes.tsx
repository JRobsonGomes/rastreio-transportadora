import Home from 'pages/Home';
import Tracking from 'pages/Tracking';
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
            <Route path="/tracking">
                <Tracking />
            </Route>
        </Switch>
    </BrowserRouter>
);

export default Routes;