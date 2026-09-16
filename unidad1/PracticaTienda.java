public class PracticaTienda {
    static void main() {
        String producto1= Repositorio.ingresarTexto("Ingrese el nombre del primer producto: ");
        double precio1= Repositorio.ingresarDecimal("Ingrese el precio del primer producto: ");
        String producto2= Repositorio.ingresarTexto("Ingrese el nombre del segundo producto: ");
        double precio2= Repositorio.ingresarDecimal("Ingrese el precio del segundo producto: ");
        double producto1IVa= calcularIVAProducto(precio1);
        double producto2IVA= calcularIVAProducto(precio2);
        double total= calcularTotal(producto1IVa, producto2IVA);
        Repositorio.mostrarMensaje("El valor del producto "+producto1+" es: "+(int)precio1+
                ", el valor del producto "+producto2+" es: "+(int)precio2+".Por tanto, el valor a pagar de los dos productos con el iva del 19% es:  "+(int)total);

    }
    public static double calcularIVAProducto(double precio){
        double precioProductoIVA= precio+(precio*0.19);
        return precioProductoIVA;
    }
    public static double calcularTotal (double producto1Iva, double producto2Iva){
        double total= producto1Iva +producto2Iva;
        return total;
    }
}
