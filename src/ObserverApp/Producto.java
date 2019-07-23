package ObserverApp;

import java.util.ArrayList;

class Producto extends Observado{
    private String nombre; 
    private int cantidad;
    
    public Producto(String nombre, int cantidad){
        super();
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void setCantidadStock(int cantidad){
        this.cantidad = cantidad;
        notificar();
    }
    
    @Override
    void notificar() {
        for(IObservador ob : observadores){
            ob.update(this);
        }
    }   

    public String getNombre(){
        return nombre;
    }

    public int getCantidad(){
        return cantidad;
    } 
     
}
