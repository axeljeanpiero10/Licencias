
package proyecto.licencias.de.funcionamiento;

public class ListaEnlazada {
    
    private static ListaEnlazada listaMain;
    private Nodo cabeza;
    private Nodo cima;
    
    public static ListaEnlazada getMain() {
        if (listaMain == null) {
            listaMain = new ListaEnlazada();
        }
        return listaMain;
    }

    private ListaEnlazada() {
        this.cabeza = null;
        this.cima = null;
    }
    
    public void insertarFinal(LicenciaDeFuncionamiento licencia){
        Nodo nuevoNodo = new Nodo(licencia);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cima = nuevoNodo;
        } else {
            cima.siguiente=nuevoNodo;
            cima=nuevoNodo;
        }
    }
    
    public void añadirLista(ListaEnlazada otraLista){
        Nodo actual = otraLista.cabeza;
        while (actual != null) {            
            insertarFinal(actual.licencia);
        }
    }
    
    public void recorrer(){
        Nodo actual=cabeza;
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
        } else {
            while (actual != null) {                
                System.out.println(actual.licencia);
                actual = actual.siguiente;
            }
        }
    }
    public Nodo getCabeza() {
        return cabeza;
    }
    
    
    
}
