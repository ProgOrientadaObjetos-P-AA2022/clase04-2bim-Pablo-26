
package paquete04;

import paquete02.Automovil;

public class AutomovilDiesel extends Automovil{
    
    double numLitros;
    double costoLitros;
    double descLitros;
    
    public void establecerNumLitros(double numLt){
        numLitros = numLt;
    }
    
    public void establecerCostoLitro(double costo){
        costoLitros = costo;
    }
    
    public void establecerDescuento(double desc){
        descLitros = desc;
    }
    
    @Override
    public void calcularValorCancelar(){
        descLitros = (descLitros / 100) * numLitros;
        numLitros = numLitros - descLitros;
        valorCancelar = (numLitros * costoLitros);
    }
    
    
    public double obtenerNumLitros(){
        return numLitros;
    }
    
    public double obtenerCostoLitro(){
        return costoLitros;
    }
    
    public double obtenerDescuentoLitros(){
        return descLitros;
    }
    
    @Override
    public String toString() {
        String cadena = String.format(super.toString());
        cadena = String.format("Automovil a Diesel\n"
                + "%s"
                + "Numero de Litros:%.2f\n"
                + "Costo por Litro:%.2f\n"
                + "Descuento: %.2f \n"
                + "Valor a Cancelar: %.2f\n", cadena,
                numLitros, costoLitros, descLitros, valorCancelar);
        return cadena;
    }   
}
