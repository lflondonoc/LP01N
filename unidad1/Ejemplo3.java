public class Ejemplo3 {

    //Constantes
    public static final double IVA= 0.19;

    static void main() {

        int precioProducto= 10000;

        double precioFinal= precioProducto+(precioProducto*IVA);
        System.out.println("El precio final del producto es: "+(int)precioFinal);

    }
}
