import { Switch, Route } from 'react-router-dom'
import roles from '../helpers/roles'
import routes from '../helpers/routes'
import AccountPage from '../pages/accountPage'
import UsersPage from '../pages/admin/UsersPage'
import HomePage from '../pages/HomePage'
import LibroPage from '../pages/LibroPage'
import LibrosPage from '../pages/LibrosPage'
import LoginPage from '../pages/LoginPage'
import NotFoundPage from '../pages/NotFoundPage'
import RegisterPage from '../pages/RegisterPage'
import PrivateRoute from './PrivateRoute'
import PublicRoute from './PublicRoute'

export default function AppRouter() {
    return (
                <Switch>
                    <PublicRoute exact path={routes.home } component={HomePage} />
                    <PublicRoute exact path={routes.login} component={LoginPage} />
                    <PublicRoute exact path={routes.register} component={RegisterPage} />
                    <PrivateRoute exact path={routes.account} component={AccountPage} />
                    <Route exact path={routes.libros} component={LibrosPage} />
                    <Route exact path={routes.libro()} component={LibroPage} />
                    <PrivateRoute hasRole={roles.admin} exact path={routes.admin.users} component={UsersPage} />

                    <Route path="*" component={NotFoundPage} />
                </Switch>
    )
}
