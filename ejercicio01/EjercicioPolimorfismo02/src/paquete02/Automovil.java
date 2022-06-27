
package paquete02;

public abstract class Automovil {
    
    protected String nombre;
    protected String placa;
    protected double valorCancelar;
    
    public void establecerNombre(String nom){
        nombre = nom;
    }
    
    public void establecerPlaca(String pl){
        placa = pl;
    }
    
    public abstract void calcularValorCancelar();
    
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenernPlaca(){
        return placa;
    }
    
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Nombre del propietario: %s\n"
                + "Placa del auto: %s\n",
                nombre, placa);
        return cadena;
    }
}
