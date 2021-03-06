const routes = {
    home: '/',
    login: '/login',
    register: '/register',
    account: '/account',
    libros: '/libros',
    libro: (libroId) => (libroId ? `/libros/:${libroId}` : '/libro/:libroId'),
    /* admin: {
        users: '/admin/users'
    } */
    users: '/users'
};

export default routes;