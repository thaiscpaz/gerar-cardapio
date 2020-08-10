import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import { Grid, Typography, Link } from '@material-ui/core';
import logo from '../assets/images/logo.png'

const useStyles = makeStyles((theme) => ({
  footer: {
    backgroundColor: '#E36414',
    color: '#FFF',
    width: '100%',
    bottom: 0,
    height: 150,
    marginTop: 150,
  },
  description: {
    paddingRight: 120,
    textAlign: 'right',
    marginTop: 10
  },
  text: {
    marginTop: 30
  }
}));

export default function Footer() {

  const classes = useStyles();

  return (
    <footer className={classes.footer}>
      <Grid container direction="row" justify="space-between" alignItems="center" >
      </Grid>

      <Grid className={classes.text}>
        <Typography className={classes.description}>
          feito por Thaís Paz
        </Typography>

        <Typography className={classes.description}>
          <Link href="https://github.com/thaiscpaz">github</Link>
        </Typography>

        <Typography className={classes.description}>
          fotos retiradas do <Link href="https://www.foodiesfeed.com/">foodiesfeed</Link> ou dos sites das receitas
        </Typography>
      </Grid>
    </footer>
  )
}