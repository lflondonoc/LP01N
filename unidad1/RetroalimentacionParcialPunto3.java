public class RetroalimentacionParcialPunto3 {
    static void main() {

    }

    public static double calcularConsumo (double distancia, double cantidadCombustible){
        double consumo= distancia/cantidadCombustible;
        return consumo;
    }

    public static String determinarClasificacion (double consumo){
        String mensaje="";
        if(consumo>=15){
            mensaje = "Consumo eficiente";
        }else{
            mensaje= "COnsumo alto";
        }
        return mensaje;
    }

}
