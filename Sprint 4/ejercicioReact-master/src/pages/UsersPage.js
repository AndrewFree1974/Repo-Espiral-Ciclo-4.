import { Component } from "react";
import { UserService } from "../service/UserService";
import { DataTable } from 'primereact/datatable';
import { Column } from "primereact/column";
import {Panel} from 'primereact/panel';
import {Menubar} from 'primereact/menubar';
import {Dialog} from 'primereact/dialog';
import {InputText} from 'primereact/inputtext';
import {Button} from 'primereact/button';
import { Toast } from 'primereact/toast';


import 'primereact/resources/themes/nova/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';



export default class UsersPage extends Component {
    constructor(){
        super();
        this.state = {
          visible : false,
          usuario: {
            id: null,
            nombre: null,
            apellido: null,
            correo: null,
            numIdentificacion: null,
            contraseña : null
          },
          selectedUsuario : {
    
          }
        };
        this.items = [
          {
            label : 'Nuevo',
            icon  : 'pi pi-fw pi-plus',
            command : () => {this.showSaveDialog()}
          },
          {
            label : 'Editar',
            icon  : 'pi pi-fw pi-pencil',
            command : () => {this.showEditDialog()}
          },
          {
            label : 'Eliminar',
            icon  : 'pi pi-fw pi-trash',
            command : () => {this.delete()}
          }
        ];
        this.UserService = new UserService();
        this.save = this.save.bind(this);
        this.delete = this.delete.bind(this);
        this.footer = (
          <div>
            <Button label="Guardar" icon="pi pi-check" onClick={this.save} />
          </div>
        );
      }
    
      componentDidMount(){
        this.UserService.getAll().then(data => this.setState({usuarios: data}))
      }
    
      save() {
        this.UserService.save(this.state.usuario).then(data => {
          this.setState({
            visible : false,
            usuario: {
              nombre: null,
              apellido: null,
              telefono: null,
              correo: null,
              numIdentificacion: null,
              contraseña : null
            }
          });
          this.toast.show({severity: 'success', summary: 'Atención!', detail: 'Se guardó el registro correctamente.'});
          this.UserService.getAll().then(data => this.setState({usuarios: data}))
        })
      }
    
      delete() {
        if(window.confirm("¿Realmente desea eliminar el registro?")) {
          this.UserService.delete(this.state.selectedUsuario.id).then(data => {
            this.toast.show({severity: 'success', summary: 'Atención!', detail: 'Se eliminó el registro correctamente.'});
            this.UserService.getAll().then(data => this.setState({usuarios: data}));
          });
        }
      }
    
      render(){
        return (
          <div style={{width:'80%', margin: '0 auto', marginTop: '20px'}}>
            <Menubar model={this.items}/>
            <br/>
            <Panel header="React CRUD App">
                <DataTable value={this.state.usuarios} paginator={true} rows="4" selectionMode="single" selection={this.state.selectedUsuario} onSelectionChange={e => this.setState({selectedUsuario: e.value})}>
                  <Column field="nombre" header="Nombre"></Column>
                  <Column field="apellido" header="Apellido"></Column>
                  <Column field="telefono" header="Telefono"></Column>
                  <Column field="correo" header="Correo"></Column>
                  <Column field="numIdentificacion" header="Identificacion"></Column>
                  <Column field="contraseña" header="Contraseña"></Column>
                </DataTable>
            </Panel>
            <Dialog header="Crear usuario" visible={this.state.visible} style={{width: '400px'}} footer={this.footer} modal={true} onHide={() => this.setState({visible: false})}>
                <form id="usuario-form">
                  <span className="p-float-label">
                    <InputText value={this.state.usuario.nombre} style={{width : '100%'}} id="nombre" onChange={(e) => {
                        let val = e.target.value;
                        this.setState(prevState => {
                            let usuario = Object.assign({}, prevState.usuario);
                            usuario.nombre = val;
    
                            return { usuario };
                        })}
                      } />
                    <label htmlFor="nombre">Nombre</label>
                  </span>
                  <br/>
                  <span className="p-float-label">
                    <InputText value={this.state.usuario.apellido} style={{width : '100%'}} id="apellido" onChange={(e) => {
                        let val = e.target.value;
                        this.setState(prevState => {
                            let usuario = Object.assign({}, prevState.usuario);
                            usuario.apellido = val
    
                            return { usuario };
                        })}
                      } />
                    <label htmlFor="apellido">Apellido</label>
                  </span>
                  <br/>
                  <span className="p-float-label">
                    <InputText value={this.state.usuario.telefono} style={{width : '100%'}} id="telefono" onChange={(e) => {
                        let val = e.target.value;
                        this.setState(prevState => {
                            let usuario = Object.assign({}, prevState.usuario);
                            usuario.telefono = val
    
                            return { usuario };
                        })}
                      } />
                    <label htmlFor="telefono">Telefono</label>
                  </span>
                  <br/>
                  <span className="p-float-label">
                    <InputText value={this.state.usuario.correo} style={{width : '100%'}} id="correo" onChange={(e) => {
                        let val = e.target.value;
                        this.setState(prevState => {
                            let usuario = Object.assign({}, prevState.usuario);
                            usuario.correo = val
    
                            return { usuario };
                        })}
                      } />
                    <label htmlFor="correo">Correo</label>
                  </span>
                  <br/>
                  <span className="p-float-label">
                    <InputText value={this.state.usuario.numIdentificacion} style={{width : '100%'}} id="numIdentificacion" onChange={(e) => {
                        let val = e.target.value;
                        this.setState(prevState => {
                            let usuario = Object.assign({}, prevState.usuario);
                            usuario.numIdentificacion = val
    
                            return { usuario };
                        })}
                      } />
                    <label htmlFor="identidad">Identidad</label>
                  </span>
                  <br/>
                  <span className="p-float-label">
                    <InputText value={this.state.usuario.contraseña} type="password" style={{width : '100%'}} id="contraseña" onChange={(e) => {
                        let val = e.target.value;
                        this.setState(prevState => {
                            let usuario = Object.assign({}, prevState.usuario);
                            usuario.contraseña = val;
    
                            return { usuario };
                        })}
                      } />
                    <label htmlFor="contraseña">Contraseña</label>
                  </span>
                  <br/>
                </form>
            </Dialog>
            <Toast ref={(el) => this.toast = el} />
          </div>
        );
      }
    
      showSaveDialog(){
        this.setState({
          visible : true,
          usuario : {
            nombre: null,
            telefono: null,
            apellido: null,
            correo: null,
            numIdentificacion: null,
            contraseña : null
          }
        });
        document.getElementById('libro-form');
      }
    
      showEditDialog() {
        this.setState({
          visible : true,
          usuario : {
            id: this.state.selectedUsuario.id,
            nombre: this.state.selectedUsuario.nombre,
            apellido: this.state.selectedUsuario.apellido,
            telefono: this.state.selectedUsuario.telefono,
            correo: this.state.selectedUsuario.correo,
            numIdentificacion: this.state.selectedUsuario.numIdentificacion,
            contraseña : this.state.selectedUsuario.contraseña
          }
        })
      }
    }