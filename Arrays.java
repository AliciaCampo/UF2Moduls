public class Arrays {
    public static void main(String[] args) {
        System.out.println("Empezamos probanco el modulo toCharArray");
        String palabra = "Hola";
        char[] caracteres = toCharArray(palabra);
        for (char c : caracteres) {
            System.out.print(c + " ");
        }
        System.out.println("");
        System.out.println("Ahora vamos con el Suma enters , debe sumar los enteros de un array de Strings y devolver un array de int ");
        String [] numerosStrings = new String[]{"dos","4","10","cero","uno","3","2","1","doce"};
        System.out.println("El valor esperado seria  20  y el codigo da " + sumaEnters(numerosStrings));
        System.out.println("Todo bien , finalizamos subiendo 1 punto a los que tenga las notas entre el 4 y el 9 ");
        int [] notasInciales = new int [] {1,2,3,4,5,6,7,8,9,5,6,7,8,9,0,0,0,1};//ejemplo
        System.out.println("Notas iniciales  :");
        for (int nota : notasInciales){
            System.out.print(nota + "  |  ");
        }
        System.out.println("");
        int [] notasSubidas = pujaNota(notasInciales);
        System.out.println("Notas subidas  :");
        for (int nota : notasSubidas) {
            System.out.print(nota + "  |  ");
        }
        System.out.println("");
    }
    
    public static int [] pujaNota(int [] notas){
        //este modulo debe mirar si las notas son igual a 5 debe subir la nota 1 punto extra 
        int [] notasFinales =  new int [notas.length];
        for (int i = 0; i< notas.length ; i ++){
            if (notas[i] >= 4 && notas[i] <=9){
                notasFinales[i] =  notas[i] + 1;
            }else{
                notasFinales[i] =  notas[i];
            }
        }
        return notasFinales ;
    }
    public static int  sumaEnters(String [] numeros ){
        int  numerosInt = 0;
        for (int i = 0 ; i < numeros.length ; i ++){
            String numero = numeros[i];
            if (esEnter(numero)){
                numerosInt += Integer.parseInt(numero);
            }
        }
        return numerosInt;
    }
    public static char [] toCharArray(String texto){
        char [] textoChar = new char[texto.length()];
        for (int i = 0 ; i < texto.length() ; i ++){
            textoChar[i] = texto.charAt(i);
        }
        return textoChar;
    }
    public  static boolean esEnter (String texto){
        if (texto.isBlank() || texto.isBlank()){
            return false ;
        }
        for (int i  = 0 ; i < texto.length(); i ++){
            if (!Character.isDigit(texto.charAt(i))){
                return false;
            }
        }
        return true;
    }
}