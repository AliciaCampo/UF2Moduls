public class Potatxie {
    /*QUien es fife, potaxie o coquette
    Chuski: fife
    Eric jejejeje: fife
    Parsero: coquette
    Slucis: potaxie
    Pingüino: potaxie
    Martí: coquette
    Jud: potaxie coquette
    Maria👋: potaxie
    Gisela: potaxie
    */
    public static void main(String[] args) {
        String[] nombres = {"Chuski", "Eric jejejeje", "Parsero", "Slucis", "Pingüino", "Martí","Jud","Maria👋", "Gisela"};
        System.out.println("¿Es un potaxie, fife o coquette?");
        System.out.println("");
        for(String nombre : nombres){
            System.out.print(nombre + "  que es  ?" );
            String respuesta = Entrada.readLine();
            if (respuesta.equals("fife")){
                String [] fifes = fifes(nombre);
            } else if (respuesta.equals("potaxie")) {
                potaxies();
            } else if (respuesta.equals("coquette")) {
                coquettes();
            } else {
                System.out.println("No hay ninguna cosa que se llame asi, pringao");
            }
            
            String [] queEs = classificaPotaxieFife(respuesta);   
        }

    }
    public static String[] classificaPotaxieFife(String[] nombres) {     
        String[] fifes = new String[nombres.length];  
        String[] potaxies = new String[nombres.length];
        String[] coquettes = new String[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            
        }
    }
    public static String [] potaxies (String potaxies)  {
        
    }

    public static String [] fifes (String fifes) {
        
    }
    public static String [] coquettes (String coquettes) {
        
    }

}