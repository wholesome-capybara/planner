import logo from './logo.svg';
import './App.css';
import {Component} from "react";

class App extends Component {
  state = {
    items: []
  };

  async componentDidMount() {
    const response = await fetch('/api/item');
    const body = await response.json();
    this.setState({items: body});
  }

  render() {
    const {items} = this.state;
    return (
        <div className="App">
          <header className="App-header">
            <img src={logo} className="App-logo" alt="logo" />
            <div className="App-intro">
              <h2>To Do</h2>
              {items.map(function(d) {
                return (<li key={d.id}>{d.description}</li>)
              })}
            </div>
          </header>
        </div>
    );
  }
}
export default App;

