import java.util.Scanner;

public class CalculadoraReutilizacion {
    static void main() {
        mostrarMenuCalculadora();
    }
    public static void mostrarMenuCalculadora(){
        int opcion=0;
        int num1=0;
        int num2=0;

        do{
            Repositorio.mostrarMensaje("===CALCULADORA===");
            Repositorio.mostrarMensaje("1.Sumar números. ");
            Repositorio.mostrarMensaje("2.Restar números. ");
            Repositorio.mostrarMensaje("3.Multiplicar números. ");
            Repositorio.mostrarMensaje("4.Dividir números. ");
            Repositorio.mostrarMensaje("5.Salir del programa. ");

            opcion= Repositorio.ingresarEntero("Elija una opción: ");

            if(opcion>=1 & opcion<=4){
                num1= Repositorio.ingresarEntero("Ingrese el primer número: ");
                num2= Repositorio.ingresarEntero("Ingrese el segundo número: ");

            }

            switch (opcion){
                case 1:
                    int suma= num1+num2;
                    Repositorio.mostrarMensaje("La suma de "+num1+" + "+num2+" = "+suma);
                    break;
                case 2:
                    int resta= num1-num2;
                    Repositorio.mostrarMensaje("La resta de "+num1+" - "+num2+" = "+resta);
                    break;
                case 3:
                    int multiplicacion= num1*num2;
                    Repositorio.mostrarMensaje("La multiplicación de "+num1+" * "+num2+" = "+multiplicacion);
                    break;
                case 4:
                    if(num2<=0){
                        Repositorio.mostrarMensaje("Error, división no válida.");
                    }else{
                        int division= num1/num2;
                        Repositorio.mostrarMensaje("La división de "+num1+" / "+num2+" = "+division);
                    }
                    break;
                case 5:
                    Repositorio.mostrarMensaje("Saliendo del programa.....");
                    break;
                default:
                    Repositorio.mostrarMensaje("Opción no válida.....");
            }
        }while(opcion!=5);
    }
}
