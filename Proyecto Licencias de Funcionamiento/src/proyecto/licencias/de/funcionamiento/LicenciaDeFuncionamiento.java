
package proyecto.licencias.de.funcionamiento;

public class LicenciaDeFuncionamiento {

    String ruc;
    String giroActividad;
    String areaEstable;
    String tipoLicencia;
    
    //Metodos set y get
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getGiroActividad() {
        return giroActividad;
    }

    public void setGiroActividad(String giroActividad) {
        this.giroActividad = giroActividad;
    }

    public String getAreaEstable() {
        return areaEstable;
    }

    public void setAreaEstable(String areaEstable) {
        this.areaEstable = areaEstable;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    
    //Constructor
    public LicenciaDeFuncionamiento(String ruc, String giroActividad, String areaEstable, String tipoLicencia) {
		super();
		this.ruc = ruc;
		this.giroActividad = giroActividad;
		this.areaEstable = areaEstable;
		this.tipoLicencia = tipoLicencia;
    }
    public LicenciaDeFuncionamiento() {
		super();
    }

    @Override
    public String toString() {
        return "LicenciaDeFuncionamiento{" + "ruc=" + ruc + ", giroActividad=" + giroActividad + ", areaEstable=" + areaEstable + ", tipoLicencia=" + tipoLicencia + '}';
    }
    
    
}
