import React, { Component } from 'react';
import Items from './components/items';
import './App.css';

class App extends Component {

  state = {
    items: []
  }

  componentDidMount() {
    fetch('http://localhost:8080/items')
    .then(res => res.json())
    .then((data) => {
      this.setState({ items: data })
      console.log(data)
    })
    .catch(console.log)
  }

  render() {
    return (

      <Items items={this.state.items} />

    );
  }
}

export default App;
