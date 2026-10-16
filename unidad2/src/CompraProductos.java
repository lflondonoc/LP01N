public class CompraProductos {
    static void main() {
        double totalCompra= calcularTotalCompra();
        Repositorio.mostrarMensaje("El total de la compra es: "+(int)totalCompra);
    }

    public static double calcularTotalCompra() {
        double totalCompra = 0;

        for (int i = 1; i <= 5; i++) {
            double precio = Repositorio.ingresarDecimal("Ingrese el precio " + i + ": ");
            totalCompra= totalCompra + precio;

        }
        return totalCompra;
    }

}
