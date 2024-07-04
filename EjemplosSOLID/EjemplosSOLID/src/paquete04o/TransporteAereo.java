/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author KevinR
 */
public class TransporteAereo extends Transporte {

    private String aeroLinea;

    public void establecerAeroLinea(String a) {
        aeroLinea = a;
    }

    public String obtenerAeroLinea() {
        return aeroLinea;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 15 * 4.00;
    }

}
