public class StringMaslargo {
    //este programa debe encontrar el String mas largo de un array de Strings 
    /*Ejemplo 
     * Ejemplo de entrada: ["apple", "banana", "cherry", "date"]
       Ejemplo de salida: 6 (banana)
     */
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date"};
        String resultado = palabrasMasLarga(strings);
        int llargadaResultat = resultado.length();
        System.out.println("Ejemplo de salida: " + llargadaResultat + " (" + resultado + ")");
    }
    public static String palabrasMasLarga (String[] palabras) {
        String palabrasMax = "";
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            String palabra =  palabras[i];
            int llargada = palabra.length();
            if (llargada > contador){
                contador = llargada; 
                palabrasMax = palabra;
            }
        }
        return palabrasMax;
    }
}
