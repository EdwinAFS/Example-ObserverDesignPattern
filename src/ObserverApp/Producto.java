package ObserverApp;

import java.util.ArrayList;

class Producto implements IProducto{
    private ArrayList<IObservador> observadores;
    private String nombre; 
    private int cantidad;
    
    public Producto(String nombre, int cantidad){
        observadores = new ArrayList<>();

        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
        nofiticar();
    }
    
    public void nofiticar(){
        for(IObservador ob : observadores){
            ob.update(this);
        }
    }

     public void addObservador(Observador observador){
         this.observadores.add(observador);
     }

     public int getCantidad(){
         return cantidad;
     }

     public String getNombre(){
        return nombre;
    }
}