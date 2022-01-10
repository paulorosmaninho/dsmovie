import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Listing from 'pages/Listing';
import Form from 'pages/Form';
import Navbar from "components/Navbar";

function App() {
  return (
    <BrowserRouter>
      <Navbar /> {/* O componente Navbar está fora da tag <Routes>, para ser exibido em todas as páginas */}
      <Routes>
        <Route path="/" element={<Listing />} /> {/*Abre a página Listing na home*/}
        <Route path="/form"> 
          <Route path=":movieId" element={<Form />} /> {/* Abre a página Form na URI /form/<id do filme>*/}
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;