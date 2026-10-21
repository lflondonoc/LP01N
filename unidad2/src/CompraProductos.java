public class CompraProductos {
    static void main() {
        String mensaje= mostrarCompra();
        Repositorio.mostrarMensaje(mensaje);
    }

    public static String mostrarCompra() {
        String mensaje="";

        double totalCompra = 0;
        int cantidadProductos=0;
        int mayor=0;

        for (int i = 1; i <= 5; i++) {
            double precio = Repositorio.ingresarDecimal("Ingrese el precio " + i + ": ");
            totalCompra= totalCompra + precio;

            if(precio > 10000){
                cantidadProductos+=1;
            }
            if(precio > mayor){
                mayor= (int)precio;
            }
        }
        mensaje+= "El total de la compra es de $"+(int)totalCompra+", la cantidad de productos que cuestan más de $10.000 son: "+cantidadProductos+ " y el producto más caro es: "+mayor;
        return mensaje;
    }

}
