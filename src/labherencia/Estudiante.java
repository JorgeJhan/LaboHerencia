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
public class Estudiante extends Persona {

    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;

    public Estudiante() {
    }

    public Estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }


    public double calcularPromedio(int numero) {
        double suma = 0.0;
        for (int i = 1; i <= numero; i++) {
            suma = leerDatoTipoReal("Ingrese la nota" + i + " del Estudiante: ");
            promedioNotas += suma;
        }
        // ya 
        setPromedioNotas(promedioNotas / numero);
        return getPromedioNotas();
    }

    public double leerNotasEstudiante(String mensaje) {
        double valor = 0.0;
        valor
                = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje));
        return (valor);

    }

    public Estudiante ingresarDatosEstudiante() {
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        int numeroMaterias = 0;
        String carnet = "";

        nombre = leerDatoTipoCadena("Ingrese el nombre del Estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del Estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del Estudiante: ");
        peso = leerDatoTipoReal("Ingrese el peso del Estudiante: ");
        carnet = leerDatoTipoCadena("ingrese el carnet del estudiante : ");

        numeroMaterias = leerDatoTipoEntero("Ingrese el número de materias que esta cursando: ");

        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);

        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setCarnet(carnet);

        nuevoEstudiante.setNumeroMaterias(numeroMaterias);
        return (nuevoEstudiante);

    }

    public void imprimirReporteNotasEstudiante() {
        imprimirDatosPersona();
        JOptionPane.showInputDialog(" el n° del carnet es : " + carnet);

        JOptionPane.showInputDialog("el estudiante esta cursando " + numeroMaterias + " materias ");
        calcularPromedio(getNumeroMaterias());
        JOptionPane.showInputDialog("el promedio de las notas del estudiantes es : " + promedioNotas);

    }

}
