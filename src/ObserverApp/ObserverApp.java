package ObserverApp;

public class ObserverApp {
    public static void main(String[] args) throws Exception {
        Producto leche = new Producto("Leche", 12);
        Observador observador = new Observador();

        leche.addObservador(observador);

        System.out.println("Cantidad inicial: "+ leche.getCantidad());

        leche.setCantidad(11);
    }
}