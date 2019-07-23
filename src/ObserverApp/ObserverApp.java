package ObserverApp;

public class ObserverApp {
    public static void main(String[] args) throws Exception {
        Producto leche = new Producto("Leche", 12); // Observado

        Stock stock = new Stock(); // Observador
        JefeBodega hulk = new JefeBodega("Hulk"); // Observador
        JefeBodega ironman = new JefeBodega("Iron man"); // Observador
        Proveedor thanos = new Proveedor("Thanos"); // Observador

        leche.agregarObservador(ironman);
        leche.agregarObservador(hulk);
        leche.agregarObservador(thanos);
        leche.agregarObservador(stock);
        
        leche.setCantidadStock(0);
    }
}
