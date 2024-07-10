/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author KevinR
 */
public class TarjetaCredito {

    private String nombre;
    private int numero;

    public TarjetaCredito(int num, String n) {
        numero = num;
        nombre = n;
    }

    public void establecerNumero(int num) {
        numero = num;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumero() {
        return numero;
    }
}
