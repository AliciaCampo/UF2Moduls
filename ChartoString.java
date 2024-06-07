public class ChartoString {
    public static void main(String[] args) {
        char [] array =  {'A','l','i','c','i','a'};
        String resultado = charToString(array);
        System.out.println(resultado);
        
    }
    public static String charToString (char [] array){
        String string =  "";
        for (int i = 0; i< array.length; i++){
            string += array[i];
        }
        return string;
    }
    
}
