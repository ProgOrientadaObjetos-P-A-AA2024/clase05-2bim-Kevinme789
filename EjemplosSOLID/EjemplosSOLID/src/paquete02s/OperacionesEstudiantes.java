/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02s;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;
    // Una Persona, tiene un atributo ciudad de tipo Ciudad
    // Una Ciudad, tiene un atributo nombre de tipo String

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    public void establecerEdadMaxima() {
        int num = 0;
        for (Persona e : estudiantes) {
            if (num == 0) {
                num = e.obtenerEdad();
            }
            if (num < e.obtenerEdad()) {
                num = e.obtenerEdad();

            }
        }
        edadmaxima = num;
    }

    public void establecerEdadMinima() {
        int num = 0;
        for (Persona e : estudiantes) {
            if (num == 0) {
                num = e.obtenerEdad();
            }
            if (num > e.obtenerEdad()) {
                num = e.obtenerEdad();

            }
        }
        edadminima = num;
    }

    public int obtenerEdadMinima() {
        return edadminima;
    }

    public int obtenerEdadMaxima() {
        return edadmaxima;
    }

    public void establecerListaCiudades() {
        String cadena = "Lista de Ciudades:\n";
        for (Persona e : estudiantes) {
            cadena = String.format("%s%s\n", cadena, 
                    e.obtenerCiudad().obtenerNombre());
        }
        listaCiudadesEstudiantes = cadena;

    }

    public String obtenerListaCiudades() {
        return listaCiudadesEstudiantes;
    }

    @Override
    public String toString() {
        String cadena = "Personas:\n";
        for (Persona e : estudiantes) {
            cadena = String.format("%sNombre: %s\nEdad: %d\n", cadena,
                    e.obtenerNombre(),e.obtenerEdad());
        }
        cadena = String.format("%s%s\nEdad Minima: %d\nEdad Maxima:"
                + " %d\nPromedio de Edades: %.2f ",cadena,
                listaCiudadesEstudiantes,edadminima,edadmaxima,promedioEdades);
        return cadena;

    }

}
