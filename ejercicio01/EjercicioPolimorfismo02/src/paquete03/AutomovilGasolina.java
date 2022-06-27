
package paquete03;

import paquete02.Automovil;

public class AutomovilGasolina extends Automovil{
    
    double numGalones;
    double costoGalon;
    double iva;
    
    public void establecerNumGalones(double numG){
        numGalones = numG;
    }
    
    public void establcerCostoGalon(double costo){
        costoGalon = costo;
    }
    
    public void calcularIVA(){
        iva = (numGalones * costoGalon) * 0.10;
    }
    
    @Override
    public void calcularValorCancelar(){
        valorCancelar = (numGalones * costoGalon) + iva;
    }
    
    
    public double obtenerNumGalones(){
        return numGalones;
    }
    
    public double obtenerCostoGalon(){
        return costoGalon;
    }
    
    public double obtenerIVA(){
        return iva;
    }
    
    @Override
    public String toString() {
        String cadena = String.format(super.toString());
        cadena = String.format("Automovil a Gasolina\n"
                + "%s"
                + "Numero de Galones:%.2f\n"
                + "Costo por Galon:%.2f\n"
                + "IVA: %.2f\n"
                + "Valor a Cancelar: %.2f\n", cadena,
                numGalones, costoGalon, iva, valorCancelar);
        return cadena;
    }   
}
