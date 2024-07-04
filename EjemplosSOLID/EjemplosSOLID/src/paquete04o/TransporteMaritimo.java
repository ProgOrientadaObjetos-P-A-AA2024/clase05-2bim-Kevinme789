/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author KevinR
 */
public class TransporteMaritimo extends Transporte {

    private String cooperativaMaritima;

    public String obtenerCooperativaMaritima() {
        return cooperativaMaritima;
    }

    public void establecerCooperativaMaritima(String c) {
        cooperativaMaritima = c;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 65.00*2;
    }

}
