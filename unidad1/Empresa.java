public class Empresa {

    public static final double PORCENTAJE1= 0.10;
    public static final double PORCENTAJE2= 0.05;
    public static final double TOPE_SALARIO= 2500000;

    static void main() {
        double salario= Repositorio.ingresarDecimal("Ingrese su salario: ");
        double salarioAumento= calcularAumento(salario);
        double bonificacion= calcularBonificacion(salarioAumento);
        String mensaje= determinarBonificacion(salarioAumento, bonificacion);
        Repositorio.mostrarMensaje(mensaje);
    }
    public static double calcularAumento(double salario){
        double salarioAumento= salario+(salario*PORCENTAJE1);
        return salarioAumento;
    }

    public static double calcularBonificacion(double salarioAumento){
        double bonificacion=0;
        if(salarioAumento>TOPE_SALARIO){
            bonificacion = salarioAumento + (salarioAumento*PORCENTAJE1);
        }else{
            bonificacion = salarioAumento + (salarioAumento*PORCENTAJE2);
        }
        return bonificacion;
    }

    public static String determinarBonificacion(double salarioAumento, double bonificacion){
        String mensaje="El salario con el aumento del "+PORCENTAJE1+"% es de "+salarioAumento+", por tanto la bonificación es de ";
        if(salarioAumento>TOPE_SALARIO){
            mensaje += PORCENTAJE1+"% y sería "+bonificacion+ " pesos.";
        }else{
            mensaje += PORCENTAJE2+"% y sería "+bonificacion+ " pesos.";
        }
        return mensaje;
    }
}
