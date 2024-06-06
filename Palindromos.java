public class Palindromos {
    //recibe un array String y devuelve un array de String  de palindromos
    //deberia salir ["racecar", "level"]
    public static void main(String[] args) {
        String [] strings = {"racecar", "apple", "level", "banana"};
        String [] palindromos = soloPalindromos(strings);
        System.out.println("Palbras originales : ");
        for (String string :strings) {
            System.out.print(string + " | ");
        }
        System.out.println("");
        System.out.println("Palbras que son palindromos : ");
        for (String string : palindromos) {
            if (string == null){
                continue ;
            }
            System.out.print(string + " | ");
        }
        System.out.println("");
    }
    public static String [] soloPalindromos (String [] strings){ 
        String [] palindromos = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String normal = strings[i];
            String invertida = "";
            for (int j = 0; j < normal.length(); j++) {
                invertida = normal.charAt(j) + invertida;
            }
            if (normal.equals(invertida)) {
                palindromos[i] = normal;
            }
        }
        return palindromos;
    }
    
}
