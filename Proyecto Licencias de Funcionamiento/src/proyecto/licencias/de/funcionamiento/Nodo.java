
package proyecto.licencias.de.funcionamiento;

public class Nodo {
    
    LicenciaDeFuncionamiento licencia;
    Nodo siguiente;

    public Nodo(LicenciaDeFuncionamiento licencia) {
        this.licencia = licencia;
        this.siguiente = null;
    }

    public Nodo() {
    }

    public LicenciaDeFuncionamiento getLicencia() {
        return licencia;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setLicencia(LicenciaDeFuncionamiento licencia) {
        this.licencia = licencia;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
