public class OperacionesBasicas {
    public static double operacion(String operador, double numeroUno, double numeroDos){
         switch (operador) {
            case "+":
                return sumar(numeroUno, numeroDos);
                
            case "-":
                return restar(numeroUno, numeroDos);
                
            case "*":
                return multiplicar(numeroUno, numeroDos);
                
            case "/": 
                return dividir(numeroUno, numeroDos); 
                       
            default:
                throw new IllegalArgumentException("Operador no valido.");
        }
    }
    
    public static double sumar(double numeroUno, double numeroDos){
        return numeroUno + numeroDos;
    }
    public static double restar(double numeroUno, double numeroDos){
        return numeroUno - numeroDos;
    }
    public static double multiplicar(double numeroUno, double numeroDos){
        return numeroUno * numeroDos;
    }
    public static double dividir(double numeroUno, double numeroDos){
        if(numeroDos==0){
            throw new ArithmeticException("No se puede dividir entre 0");
        } else {
            return numeroUno / numeroDos;
        }
    }
    
}
