public class PromedioNotas {

    public static final double NOTA_MAXIMA=4.5, NOTA_MINIMA=3.0;

    static void main() {
        double nota1= Repositorio.ingresarDecimal("Ingrese la nota 1: ");
        double nota2= Repositorio.ingresarDecimal("Ingrese la nota 2: ");
        double nota3= Repositorio.ingresarDecimal("Ingrese la nota 3: ");
        double promedio= calcularPromedio(nota1, nota2, nota3);
        String desempenio= verificarDesempenio(promedio);
        Repositorio.mostrarMensaje(desempenio);

    }
    public static double calcularPromedio (double nota1, double nota2, double nota3){
        double promedio= (nota1+nota2+nota3)/3;
        return promedio;
    }
    public static String verificarDesempenio (double promedio){
        String desempenio= "Su promedio de notas es: "+promedio+" Por tanto, su desempeño es: ";
        if(promedio>=NOTA_MAXIMA){
            desempenio += "Excelente.";
        }else if (promedio >=NOTA_MINIMA){
            desempenio += "Satisfactorio";
        }else{
            desempenio += "Insuficiente";
        }
        return desempenio;
    }
}
