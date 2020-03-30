/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labherencia;

import javax.swing.JOptionPane;

/**
 *
 * @author jhanc
 */
public class SistemaInformacion {

    public SistemaInformacion() {
    }

    public static void main(String[] args) {
        int opcion = 0;
        Persona sistemaInformacion = new Persona();

        try {
            do {
                opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opción 1 para empleado, ingrese la opcion 2 para estudiante y 3 para salir: ");
                if (opcion == 1) {
                    JOptionPane.showMessageDialog(null, "Procesando datos del empleado");
                    Empleado manejadorEmpleado = new Empleado();
//Leemos los datos
                    manejadorEmpleado = manejadorEmpleado.ingresarDatosEmpleado();
//Mostramos el reporte de datos
                    manejadorEmpleado.imprimirReporteEstadoEmpleado();

                } else if (opcion == 2) {
                    JOptionPane.showMessageDialog(null, "Ingresando a Estudantes ");
                    Estudiante manejadorEstudiante = new Estudiante();
                    manejadorEstudiante = manejadorEstudiante.ingresarDatosEstudiante();
                    manejadorEstudiante.imprimirReporteNotasEstudiante();
                    
                } else if (opcion == 3) {
                    JOptionPane.showMessageDialog(null, "Saliendo del Sistema");
                    break;
                }

                {
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                }

            } while (opcion <= 1 || opcion >= 3);//fin del do while
        } catch (Exception errorMain) {
            JOptionPane.showMessageDialog(null, "Error en la digitación: ");
            errorMain.printStackTrace();

        }

    }

}
