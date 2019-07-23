package ObserverApp;

import java.util.*;

abstract class Observado{

    protected ArrayList<IObservador> observadores;

    public Observado(){
        observadores = new ArrayList<IObservador>();
    }
    abstract void notificar();
    
    public void agregarObservador(IObservador observador){
        this.observadores.add(observador);
    }
} 
