package ObserverApp;

class Observador implements IObservador {
    public void update(Producto producto) {
        System.out.println("El stock fue modificado a " + producto.getCantidad());
    }
}