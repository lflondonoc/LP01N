public class RetroalimentacionParcial {

    public static final int LITROS=100;

    static void main() {
        double litros= Repositorio.ingresarDecimal("Ingrese la cantidad de litros consumidos: ");
        int numeroPersonas= Repositorio.ingresarEntero("Ingrese el número de personas de la vivienda: ");
        double promedio= calcularPromedio(litros, numeroPersonas);
        String mensaje= determinarPromedio(promedio);
        Repositorio.mostrarMensaje(mensaje);
    }

    public static double calcularPromedio (double litros, int numeroPersonas){
        double promedio= litros / numeroPersonas;
        return promedio;
    }
    public static String determinarPromedio(double promedio){
        String mensaje="";
        if(promedio <= LITROS){
            mensaje= "consumo adecuado";
        }else{
            mensaje = "consumo elevado";
        }
        return  mensaje;
    }
}
