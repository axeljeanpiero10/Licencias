package proyecto.licencias.de.funcionamiento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class GestorArchivos {

    public void importarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
         fileChooser.setDialogTitle("seleccione el archivo a importar");
        int seleccion = fileChooser.showOpenDialog(null);
        File archivoSeleccionado = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            archivoSeleccionado = fileChooser.getSelectedFile();
        }
        try {
            String texto;
            ListaEnlazada listaEnlazada = ListaEnlazada.getMain();
            if (archivoSeleccionado != null) {
                FileReader fichero = new FileReader(archivoSeleccionado);
                BufferedReader leer = new BufferedReader(fichero);
                while ((texto = leer.readLine()) != null) {
                    if (texto.startsWith("RUC_ESTAB")) {
                        continue;
                    }
                    String[] registro = texto.split(",");
                    if (registro.length == 4) {
                        LicenciaDeFuncionamiento licencia = new LicenciaDeFuncionamiento(
                                registro[0], registro[1], registro[2], registro[3]
                        );
                        listaEnlazada.insertarFinal(licencia);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR " + e);
        }
    }

    public void exportarArchivo(Nodo cabeza) throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setDialogTitle("seleccione la ruta y el nombre del archivo .csv");
        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoGuardar = fileChooser.getSelectedFile();
            try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(archivoGuardar.getAbsolutePath()))) {
                csvWriter.write("RUC_ESTAB,GIRO_ACTIVIDAD,AREA_ESTAB,TIPO_LICENCIA");
                csvWriter.newLine();
                Nodo nodoActual = cabeza;
                while (nodoActual != null) {
                    LicenciaDeFuncionamiento licencia = nodoActual.licencia;
                    csvWriter.write(licencia.ruc + "," + licencia.giroActividad + "," + licencia.areaEstable + "," + licencia.tipoLicencia);
                    csvWriter.newLine();
                    nodoActual = nodoActual.siguiente;
                }
            }
        }

    }

}
