import React from 'react';
import {
    Container,
    Typography,
    Button
} from '@material-ui/core';
import { useHistory } from "react-router-dom";
import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles((theme) => ({
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

    function handleClick() {
        history.push("/login");
    }

    return (

        <Container component="main" maxWidth="md">
            <div className={classes.paper}>

                <Typography variant="h3" gutterBottom className= {classes.text} >
                    Bem Vinda ao Meu Cardápio!
                </Typography>

                <Typography variant="h6" gutterBottom className= {classes.text}>
                    Vamos criar um cardápio maravilhoso para a sua semana
                </Typography>

                <Button
                    id="login_button"
                    onClick={handleClick}
                    variant="contained"
                    color="primary"
                    className= {classes.submit}>
                    Fazer Login
                </Button>

            </div>
        </Container >

    );
}

export default Home;