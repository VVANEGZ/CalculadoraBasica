import java.util.Scanner;

public class App {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            procesarOperacion();
        } finally {
            teclado.close();
        }
    }
    
    public static void procesarOperacion() {
        String respuesta = pedirOperacion();
        String[] expresiones = respuesta.trim().split(" ");
        
        if(expresiones.length != 3){
            System.out.println("Error: debes ingresar exactamente 2 números y 1 operador (Ej: 5 + 6)");
            return;
        }
        
        try {
            String operador = expresiones[1];
            
            if(!"+-*/".contains(operador)){
                System.out.println("Error: el operador no es válido");
                return;
            }
            
            double numeroUno = Double.parseDouble(expresiones[0]);
            double numeroDos = Double.parseDouble(expresiones[2]);
            double resultado = OperacionesBasicas.operacion(operador, numeroUno, numeroDos);
            System.out.println("El resultado es: " + resultado);
            
        } catch(NumberFormatException e){
            System.out.println("Error: los números no son válidos");
        } catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static String pedirOperacion() {
        System.out.println("Ingresa la operación completa (Ej: 5 + 6): ");
        return teclado.nextLine();
    }
}
