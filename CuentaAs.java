public class CuentaAs {
    public static void main(String[] args) {
        String [] nombres = {"Alicia","Judith","Maria","Gisela","Keyla","Lucia"};
        int resultado = cuentaAs(nombres);
        System.out.println("Hay " + resultado + " 'a'");       
    }
    public static int cuentaAs(String [] nombres){
        int contador = 0;
        for (int i = 0; i < nombres.length ; i++){
            String nombreAct = nombres[i].toLowerCase();
            for (int j = 0 ; j < nombreAct.length(); j++){
                char nombreChar = nombreAct.charAt(j);
            if (nombreChar == 'a'){
                contador ++;
            }
            }
        }
        return contador ;
    }

}