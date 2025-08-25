
package proyecto.licencias.de.funcionamiento;

public class Lista_aux {
    
    Nodo cabeza;
    Nodo fin;

    public Lista_aux() {
        this.cabeza = null;
        this.fin = null;
    }
    public void InsertarFinal(LicenciaDeFuncionamiento licencia){
    Nodo nuevoNodo = new Nodo(licencia);
        if (cabeza ==null) {
            cabeza = nuevoNodo;
            fin = nuevoNodo;
        } else {
           fin.siguiente= nuevoNodo;
           fin = nuevoNodo;
        }
    }
    public void VaciarListar(){
    cabeza = null;
    fin = null;    
    }
    
}
