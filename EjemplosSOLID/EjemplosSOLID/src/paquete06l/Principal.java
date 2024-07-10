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
        Banco banco = new Banco();
        banco.establecerNombre("ASOCIADOS");
        TarjetaCredito tarjeta = new TarjetaCredito(1120329,"Mastercard",banco);
        MayorEdad representante = new MayorEdad("José", tarjeta);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta: %d - Banco: %s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero(),
                tarjeta.obtenerBanco().obtenerNombre());
        
    }
}
