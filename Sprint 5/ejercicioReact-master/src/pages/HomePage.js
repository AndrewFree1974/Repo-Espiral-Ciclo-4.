import { Container, Row, Col, Button } from 'react-bootstrap';
import routes from '../helpers/routes';
import { Link } from 'react-router-dom'

export default function HomePage() {
	return (
		<Container>
			<Row className="mt-5">
				<Col xs={{ span: 12}} md={{ span: 6 }} className="mb-5">
					<h2>Bienvenid@ a la mejor y más espectacular tienda de libros</h2>
					<p>¡Aquí podrás comprar y alquilar los mejores libros!</p>
					<p>Pasa y busca, posiblemente encontrarás eso que tanto has buscado</p>
					<div>
						<Link to={routes.login}>Ingresa</Link> o <Button as={Link} to={routes.register}
                        className="ml-1"
                        >Crea una cuenta</Button>
					</div>
				</Col>
                <Col>
                    <img
                        className="img-fluid"
                        src="/img/Library_Freepik.jpg"
                        alt="gestor-de-tareas"
                    />
    				<p>¡Mundos impresionantes te esperan!</p>
                </Col>
			</Row>
		</Container>
	);
}