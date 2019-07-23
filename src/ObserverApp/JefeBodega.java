package ObserverApp;

class JefeBodega implements IObservador {
    String nombre;

    public JefeBodega(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void update(Producto producto) {
        System.out.println("Sr. o Sra. "+ this.nombre +" la cantidad de " + producto.getNombre() + " es " + producto.getCantidad());
    }
}
