import React from 'react';
import {
    Button,
    TextField,
    Container,
    Avatar,
    Typography,
    FormControlLabel,
    Grid,
    Link,
    Checkbox
} from '@material-ui/core';
import LockOutlinedIcon from '@material-ui/icons/LockOutlined';
import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles((theme) => ({
    paper: {
        marginTop: theme.spacing(20),
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
    },
    avatar: {
        margin: theme.spacing(1),
        backgroundColor: '#BF472C',
    },
    form: {
        width: '100%',
        marginTop: theme.spacing(1),
    },
    submit: {
        margin: theme.spacing(3, 0, 2),
        backgroundColor: '#BF472C',
        '&:hover': {
            backgroundColor: '#BF472C',
        }
    },
    link: {
        color: '#204C73',
    },
    root: {
        '& .MuiOutlinedInput-root.Mui-focused .MuiOutlinedInput-notchedOutline': {
            borderColor: '#204C73',
        },
        '& .MuiFormLabel-root.Mui-focused': {
            color: '#204C73',
        }
    }
}));

function Login() {

    const classes = useStyles();

    return (
        <Container component="main" maxWidth="xs">
            <div className={classes.paper}>

                <Avatar className={classes.avatar}>
                    <LockOutlinedIcon />
                </Avatar>

                <Typography component="h1" variant="h5">
                    Login
                </Typography>

                <form className={classes.form} noValidate>

                    <TextField
                        variant="outlined"
                        margin="normal"
                        required
                        fullWidth
                        id="email"
                        label="Email"
                        name="email"
                        autoComplete="email"
                        className={classes.root}
                        autoFocus />

                    <TextField
                        variant="outlined"
                        margin="normal"
                        required
                        fullWidth
                        name="password"
                        label="Senha"
                        type="password"
                        id="password"
                        autoComplete="current-password"
                        className={classes.root} />

                    <FormControlLabel
                        control={<Checkbox value="remember" color="primary" />}
                        label="Lembre-me" />

                    <Button
                        type="submit"
                        fullWidth
                        variant="contained"
                        color="primary"
                        className={classes.submit}>
                        Entrar
                    </Button>

                    <Grid container>
                        <Grid item xs>
                            <Link href="#" variant="body2" className={classes.link}>
                                Esqueceu a senha?
                            </Link>
                        </Grid>

                        <Grid item>
                            <Link href="#" variant="body2" className={classes.link}>
                                {"Cadastre-se"}
                            </Link>
                        </Grid>

                    </Grid>
                </form>
            </div>
        </Container>
    );
}

export default Login;