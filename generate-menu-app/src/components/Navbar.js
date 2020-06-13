import React from 'react';
import {
    AppBar,
    Toolbar,
    Button,
    Typography,
} from '@material-ui/core';
import { makeStyles } from '@material-ui/core/styles';
import { useHistory } from "react-router-dom";

const useStyles = makeStyles((theme) => ({
    root: {
        flexGrow: 1,
    },
    title: {
        flexGrow: 1,
    },
    navbar: {
        backgroundColor: '#204C73',
    }
}));

function Navbar() {

    const classes = useStyles();

    let history = useHistory();

    function handleClick() {
        history.push("/login");
    }

    return (
        <div className={classes.root}>
            <AppBar position="static" className = {classes.navbar}>
                <Toolbar>

                    <Typography variant="h6" className={classes.title}>
                        Meu Cardápio
                    </Typography>

                    <Button
                        color="inherit"
                        onClick={handleClick}>
                        Login
                    </Button>

                </Toolbar>
            </AppBar>
        </div>

    );
}

export default Navbar;