import axios from 'axios';

export class LibroService {
    baseUrl = "http://localhost:8080/libro/";

    getAll(){
        return axios.get(this.baseUrl + "all").then(res => res.data);
    }

    save(libro) {
        return axios.post(this.baseUrl + "guardar", libro).then(res => res.data);
    }

    delete(id) {
        return axios.delete(this.baseUrl + "eliminar/"+id).then(res => { console.log(res.data) });
    }
}