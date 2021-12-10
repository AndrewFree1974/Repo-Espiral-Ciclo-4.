import { Navbar, Nav, NavDropdown } from 'react-bootstrap';
import { NavLink } from 'react-router-dom';
import useAuth from '../auth/useAuth';
import routes from '../helpers/routes';


export default function Navigation() {

    const {logout} = useAuth();

    return (
        <Navbar collapseOnSelect expand="lg" variant="dark" bg="dark" className="container">
            <Navbar.Brand as={NavLink} to={routes.home}>Sprint4</Navbar.Brand>
            <Navbar.Toggle aria-controls="responsive-navbar-nav"/>
            <Navbar.Collapse id="responsive-navbar-nav">
                <Nav className="me-auto">
                    <Nav.Link as={NavLink} to={routes.libros}>Libros</Nav.Link>
                    <Nav.Link as={NavLink} to={routes.admin.users}>Usuarios</Nav.Link>
                </Nav>
                <Nav>
                    <Nav.Link as={NavLink} to={routes.login}>Iniciar sesión</Nav.Link>
                    <Nav.Link as={NavLink} to={routes.register}>Registrarse</Nav.Link>
                    <Nav.Link as={NavLink} to={routes.account}>Mi cuenta</Nav.Link>
                    <Nav.Link to={routes.account} onClick={logout}>Cerrar Sesión</Nav.Link>
                </Nav>
            </Navbar.Collapse>
        </Navbar>
    )
}
