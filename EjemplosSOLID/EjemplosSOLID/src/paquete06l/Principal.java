/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TarjetaCredito tarjeta = new TarjetaCredito(1120329,"Mastercard");
        MayorEdad representante = new MayorEdad("José", tarjeta);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta: %d\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero());
        
    }
}
