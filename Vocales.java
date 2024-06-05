public class Vocales {
    //este programa debe leer un array de String y mostrar de cada nombre  cuantas vocales tiene 
    /*Ejemplo Alicia tiene 4 vocales
     *        Judith tiene 2 vocales 
     */
    public static void main(String[] args) {
        String[] nombres = {"Alicia", "Maria","Judith","Gisela","Aurelio","Afrodisia"};
        int[] totalVocals =   contaVocals(nombres);
        for (int i = 0; i < totalVocals.length; i++) {
            System.out.println(nombres[i] + " tiene " + totalVocals[i] + " vocales");
        }
    }
    public static int[] contaVocals(String[] nombres) {
        int[] totalVocals =  new int[nombres.length];
        int totalVocalsEnParaula = 0;
        for (int i = 0; i < nombres.length; i++) {
            String nom = nombres[i].toLowerCase();
            for (int j = 0; j < nom.length(); j++){
                char lletra = nom.charAt(j);
                if (lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' || lletra == 'u'){
                    totalVocalsEnParaula++;
                }
            }
            totalVocals[i] = totalVocalsEnParaula;
            totalVocalsEnParaula = 0;
        }    
        return totalVocals;
    }
}
