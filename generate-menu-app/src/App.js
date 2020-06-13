import React from 'react';
import './App.css'
import { BrowserRouter as Router } from 'react-router-dom';
import AppRouter from './routes/AppRouter'
import Navbar from './components/Navbar'

function App() {

  return (
    <div className="app">
      <Router>
        <Navbar />
        <AppRouter />
      </Router>
    </div>
  );
}

export default App;