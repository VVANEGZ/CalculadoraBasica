import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la operacion completa (Ej: 5 + 6): ");
        String respuesta = teclado.nextLine();
        String [] expresiones = respuesta.split(" ");
        
        double numeroUno = Double.parseDouble(expresiones[0]);
        double numeroDos = Double.parseDouble(expresiones[2]);
        String operador = expresiones[1];

        double resultado= OperacionesBasicas.operacion(operador, numeroUno, numeroDos);
        System.out.println("El resultado es: " + resultado);
       teclado.close();
        //string.split
        //List<String> lista = Arrays.asList(texto.split(" "));
    }
}
