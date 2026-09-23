public class AreaHabitacion {

    public static final int ESPACIO_MAXIMO= 20;

    static void main() {
        double ancho= Repositorio.ingresarDecimal("Ingrese el ancho: ");
        double largo= Repositorio.ingresarDecimal("Ingrese el largo: ");
        double area= calcularArea(ancho, largo);
        String mensaje= verificarEspacio(area);
        Repositorio.mostrarMensaje(mensaje);

    }
    public static double calcularArea (double ancho, double largo){
        double area= ancho*largo;
        return area;
    }

    public static String verificarEspacio (double area){
        String mensaje= "El área de la habitación es de "+area+". Por lo tanto: ";
        if(area > ESPACIO_MAXIMO){
            mensaje += "tiene suficiente espacio";
        }else{
            mensaje += "no tiene suficiente espacio";
        }
        return mensaje;
    }


}
