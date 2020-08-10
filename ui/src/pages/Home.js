import React from 'react';
import {
    Container,
    Typography,
    Button,
    Grid
} from '@material-ui/core';
import { useHistory } from "react-router-dom";
import { makeStyles } from '@material-ui/core/styles';
import orangePicture from '../SignupTrainnerImg.png';

const useStyles = makeStyles((theme) => ({
    root: {
        flexGrow: 1,
        border: "1px solid red",
    },
    paper: {
        marginTop: theme.spacing(20),
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
    },
    submit: {
        margin: theme.spacing(3, 0, 2),
        backgroundColor: '#BF472C',
        '&:hover': {
            backgroundColor: '#BF472C',
        }
    },
    text: {
        color: '#204C73',
    }
}));

function Home() {

    const classes = useStyles();

    let history = useHistory();

    /* function login() {
        history.push("/login");
    } */

    function generatemenu() {
        history.push("/generatemenu");
    }

    return (
        <div className={classes.root}>

            <Grid container spacing={3}>

                <Grid item xs={1} />

                <Grid item xs={5} >
                    <img
                        src={orangePicture}
                    />
                </Grid>

                <Grid item xs={1} />

                <Grid item xs={4} >

                </Grid>

                <Grid item xs={1} />

            </Grid>

        </div>

    );
}

export default Home;