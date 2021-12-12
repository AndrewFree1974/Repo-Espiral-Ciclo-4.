import axios from 'axios';

export class UserService {
    baseUrl = "http://localhost:8080/usuario/";

    getAll(){
        return axios.get(this.baseUrl + "all").then(res => res.data);
    }

    save(usuario) {
        return axios.post(this.baseUrl + "guardar", usuario).then(res => res.data);
    }

    delete(id) {
        return axios.delete(this.baseUrl + "eliminar/"+id).then(res => { console.log(res.data) });
    }
}