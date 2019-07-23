package app;

class Proveedor implements IObservador {
    String nombre;

    public Proveedor(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void update(Producto producto) {
        if(producto.getCantidad() == 0)
            System.out.println("Proveedor "+ this.nombre + " Envie " + producto.getNombre());
    }
}