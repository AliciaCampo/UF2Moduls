public class Recursividad {
    public static void main(String[] args){
        System.out.println("Hola que modulo quieres usar ? (mostraLletres/sumaDigits)");
        String resposta = Entrada.readLine();
        if (resposta.equals("mostraLletres")){
            System.out.println("Text?");
        String text = Entrada.readLine();
        mostraLletres(text);
        System.out.println();   // un salt de línia final
        } else if (resposta.equals("sumaDigits")){
            System.out.println("Text?");
            String text = Entrada.readLine();
            int nombres = sumaDigits(text);
            System.out.println(nombres);
        }else{
            System.out.println("Opcion no valida intentalo de nuevo");
        }
    }

    // mostra només les lletres de text
    public static void mostraLletres(String text) {
        if ( text.length () == 0 ) {      // cas base
            return;
        }
        // hi ha al menys un caràcter. Comptem quantes lletres hi queden
        // considerem el primer caràcter
        char primer = text.charAt(0);
        if (Character.isLetter(primer)) {
            System.out.print(primer);
        }
        // considerem les lletres que conté la resta del text
        String restaText =text.substring(1);  // resta del text
        mostraLletres(restaText);      // crida recursiva
    }
    // funcion recursiva que suma los digitos
     public static int sumaDigits(String text) {
        // cas base
        if (text.isEmpty()) {
            return 0;
        }
        // tracta pas actuals
        char primerChar = text.charAt(0);
        int primerDigit = Character.isDigit(primerChar) ? Character.digit(primerChar, 10) : 0;
        // tracta pas recursiu
        int sumaRestant = sumaDigits(text.substring(1));
        // composa resultat
        return primerDigit + sumaRestant;
    }
    
}
