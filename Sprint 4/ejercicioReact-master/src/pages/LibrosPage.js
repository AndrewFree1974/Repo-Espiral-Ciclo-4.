import { Component } from "react";
import { LibroService } from "../service/LibroService";
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



export default class LibrosPage extends Component {
    constructor(){
        super();
        this.state = {
          visible : false,
          libro: {
            id: null,
            isbn: null,
            nombre: null,
            autor: null,
            precio: null,
            cantidad : null
          },
          selectedLibro : {
    
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
        this.libroService = new LibroService();
        this.save = this.save.bind(this);
        this.delete = this.delete.bind(this);
        this.footer = (
          <div>
            <Button label="Guardar" icon="pi pi-check" onClick={this.save} />
          </div>
        );
      }
    
      componentDidMount(){
        this.libroService.getAll().then(data => this.setState({libros: data}))
      }
    
      save() {
        this.libroService.save(this.state.libro).then(data => {
          this.setState({
            visible : false,
            libro: {
              id: null,
              isbn: null,
              nombre: null,
              autor: null,
              precio: null,
              cantidad : null
            }
          });
          this.toast.show({severity: 'success', summary: 'Atención!', detail: 'Se guardó el registro correctamente.'});
          this.libroService.getAll().then(data => this.setState({libros: data}))
        })
      }
    
      delete() {
        if(window.confirm("¿Realmente desea eliminar el registro?")) {
          this.libroService.delete(this.state.selectedLibro.id).then(data => {
            this.toast.show({severity: 'success', summary: 'Atención!', detail: 'Se eliminó el registro correctamente.'});
            this.libroService.getAll().then(data => this.setState({libros: data}));
          });
        }
      }
    
      render(){
        return (
          <div style={{width:'80%', margin: '0 auto', marginTop: '20px'}}>
            <Menubar model={this.items}/>
            <br/>
            <Panel header="React CRUD App">
                <DataTable value={this.state.libros} paginator={true} rows="4" selectionMode="single" selection={this.state.selectedLibro} onSelectionChange={e => this.setState({selectedLibro: e.value})}>
                  <Column field="isbn" header="ISBN"></Column>
                  <Column field="nombre" header="Nombre"></Column>
                  <Column field="autor" header="Autor"></Column>
                  <Column field="precio" header="Precio"></Column>
                  <Column field="cantidad" header="Cantidad"></Column>
                </DataTable>
            </Panel>
            <Dialog header="Crear libro" visible={this.state.visible} style={{width: '400px'}} footer={this.footer} modal={true} onHide={() => this.setState({visible: false})}>
                <form id="libro-form">
                <span className="p-float-label">
                    <InputText value={this.state.libro.isbn} style={{width : '100%'}} id="isbn" onChange={(e) => {
                        let val = e.target.value;
                        this.setState(prevState => {
                            let libro = Object.assign({}, prevState.libro);
                            libro.isbn = val;
    
                            return { libro };
                        })}
                      } />
                    <label htmlFor="isbn">Isbn</label>
                  </span>
                  <br/>
                  <span className="p-float-label">
                    <InputText value={this.state.libro.nombre} style={{width : '100%'}} id="nombre" onChange={(e) => {
                        let val = e.target.value;
                        this.setState(prevState => {
                            let libro = Object.assign({}, prevState.libro);
                            libro.nombre = val;
    
                            return { libro };
                        })}
                      } />
                    <label htmlFor="nombre">Nombre</label>
                  </span>
                  <br/>
                  <span className="p-float-label">
                    <InputText value={this.state.libro.autor} style={{width : '100%'}} id="autor" onChange={(e) => {
                        let val = e.target.value;
                        this.setState(prevState => {
                            let libro = Object.assign({}, prevState.libro);
                            libro.autor = val
    
                            return { libro };
                        })}
                      } />
                    <label htmlFor="autor">Autor</label>
                  </span>
                  <br/>
                  <span className="p-float-label">
                    <InputText value={this.state.libro.precio} style={{width : '100%'}} id="precio" onChange={(e) => {
                        let val = e.target.value;
                        this.setState(prevState => {
                            let libro = Object.assign({}, prevState.libro);
                            libro.precio = val
    
                            return { libro };
                        })}
                      } />
                    <label htmlFor="precio">Precio</label>
                  </span>
                  <br/>
                  <span className="p-float-label">
                    <InputText value={this.state.libro.cantidad} style={{width : '100%'}} id="cantidad" onChange={(e) => {
                        let val = e.target.value;
                        this.setState(prevState => {
                            let libro = Object.assign({}, prevState.libro);
                            libro.cantidad = val
    
                            return { libro };
                        })}
                      } />
                    <label htmlFor="cantidad">cantidad</label>
                  </span>
                </form>
            </Dialog>
            <Toast ref={(el) => this.toast = el} />
          </div>
        );
      }
    
      showSaveDialog(){
        this.setState({
          visible : true,
          libro : {
            id: null,
            isbn: null,
            nombre: null,
            autor: null,
            precio: null,
            cantidad : null
          }
        });
        document.getElementById('libro-form');
      }
    
      showEditDialog() {
        this.setState({
          visible : true,
          libro : {
            id: this.state.selectedLibro.id,
            isbn: this.state.selectedLibro.isnb,
            nombre: this.state.selectedLibro.nombre,
            autor: this.state.selectedLibro.autor,
            precio: this.state.selectedLibro.precio,
            cantidad : this.state.selectedLibro.cantidad
          }
        })
      }
    }
