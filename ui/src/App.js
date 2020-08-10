import React from 'react';
import './App.css'
import { BrowserRouter as Router } from 'react-router-dom';
import { makeStyles } from '@material-ui/core/styles';
import Container from'@material-ui/core/Container';
import AppRouter from './routes/AppRouter';
import Header from './components/Header';
import Footer from './components/Footer';

const useStyles = makeStyles((theme) => ({
  main: {
    flex: 1,
    maxWidth: "100%",
    paddingLeft: 0,
    paddingRight: 0,
  }
}));

function App() {

  const classes = useStyles();

  return (
    <Container className={classes.main}>
      <Header />
      <Router>
        <AppRouter />
      </Router>
      <Footer />
    </Container>
  );
}

export default App;