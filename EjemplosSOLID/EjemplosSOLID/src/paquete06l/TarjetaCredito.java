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
    private Banco banco;

    public TarjetaCredito(int num, String n, Banco b) {
        numero = num;
        nombre = n;
        banco = b;
    }

    public void establecerNumero(int num) {
        numero = num;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerBanco(Banco b) {
        banco = b;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumero() {
        return numero;
    }

    public Banco obtenerBanco() {
        return banco;
    }
}
