import Footer from 'components/Footer';
import Header from 'components/Header';
import Menu from 'components/Menu';
import Cardapio from 'pages/Cardapio';
import Inicio from 'pages/Inicio';
import NotFound from 'pages/NotFound';
import Sobre from 'pages/Sobre';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';

export default function AppRouter() {
    return (
        <main className='container'>
            <Router>
                <Menu />
                <Routes>
                    <Route path="/" element={<Header />}>
                        <Route index element={<Inicio />} />
                        <Route path="cardapio" element={<Cardapio />} />
                        <Route path="sobre" element={<Sobre />} />
                    </Route>
                    <Route path="*" element={<NotFound />} />
                </Routes>
                <Footer />
            </Router>
        </main>
    );
}