public class RetroalimentacionParcialPunto2 {

    public static final double PRECIO_MENOR=35000, PRECIO_MAYOR=50000, DESCUENTO=0.10;
    public static final int PESO=10;

    static void main() {
        double peso= Repositorio.ingresarDecimal("Ingrese el peso de la mascota: ");
        double valorFinal= calcularValorFinal(peso);
        Repositorio.mostrarMensaje("El peso de la mascota es "+peso+", por lo tanto, el valor a pagar es de: "+valorFinal);

    }
    public static double calcularValorFinal(double peso){
        double valorServicio=0;
        double valorFinal=0;
        if(peso <= PESO){
            valorServicio= peso*PRECIO_MENOR;
            valorFinal= valorServicio - (valorServicio*DESCUENTO);
        }else{
            valorServicio= peso*PRECIO_MAYOR;
            valorFinal= valorServicio;
        }
        return valorFinal;
    }
}
