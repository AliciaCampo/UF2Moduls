public class CuentaAs {
    public static void main(String[] args) {
        String [] nombres = {"Alicia","Judith","Maria","Gisela","Keyla","Lucia"};
        int resultado = cuentaAs(nombres);
        System.out.println("Hay " + resultado + " 'a'");
        
    }
    public static int cuentaAs(String [] nombres){
        int contador = 0;
        for (int i = 0; i < nombres.length ; i++){
            String nombreAct = nombres[i];
            nombreAct.toLowerCase();
            if (nombreAct.contains("a")){
                contador +=1;
            }
        }
        return contador ;
    }

}