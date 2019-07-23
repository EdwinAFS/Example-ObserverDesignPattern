package ObserverApp;

class Stock implements IObservador {
    
    @Override
    public void update(Producto producto) {
        System.out.println("El stock fue modificado a " + producto.getCantidad());
    }
}
