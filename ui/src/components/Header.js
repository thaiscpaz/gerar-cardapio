import React from 'react';
import {
  Grid,
  Typography
} from '@material-ui/core';
import { makeStyles } from '@material-ui/core/styles';
import logo from '../assets/images/logo.png'

const useStyles = makeStyles((theme) => ({
  typography: {
    padding: 20
  },
  container: {
    marginTop: 80,
    marginBottom: 80,
  }
}));

export default function Header() {

  const classes = useStyles();

  return (

      <Grid container xs={12}
        justify="center"
        alignItems="center" 
        className= {classes.container}>

        <Grid xs={2} />

        <Grid xs={2}>
          <img src={logo} alt="logo" />
        </Grid>

        <Grid xs={1} />

        <Grid xs={5}>
          <Typography variant="h6" align="center">
            um compilado de receitas que experimentei ou quero experimentar, guardadas para referência futura
          </Typography>
        </Grid>

        <Grid xs={2} />

      </Grid>

  );
}