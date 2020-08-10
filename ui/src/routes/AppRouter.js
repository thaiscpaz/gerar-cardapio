import React from 'react';
import { Route, BrowserRouter } from 'react-router-dom';
import Home from '../pages/Home';


function AppRouter() {

    return (
        <BrowserRouter>
            <Route path='/' exact={true} component={Home} />
        </BrowserRouter>
    );
}

export default AppRouter;