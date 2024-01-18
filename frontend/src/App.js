import logo from './logo.svg';
import { BrowserRouter as Router} from "react-router-dom";
import './App.css';
import RoutePath from './routes/RoutePath';

function App() {
  return (
    <Router>
      <div>
        <RoutePath></RoutePath>
      </div>
    </Router>
  );
}

export default App;
