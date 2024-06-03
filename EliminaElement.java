//eliminar un  elemento de un array de ints
public class EliminaElement {
    public static void main(String[] args) {
        int [] arrayInicial = {1,2,3,4,5,6,7,8,9,9,9,9,4,5,6};
        int  numeroEliminado = 9;
        int [] arrayfinal = eliminaElemento(arrayInicial, numeroEliminado);
        for (int i : arrayfinal) {
            System.out.print(i + "| ");
        }
    }
    public static int [] eliminaElemento (int [] arrayInicial , int numeroEliminado){
        int [] arrayfinal = new int[arrayInicial.length];
        for (int i = 0 ; i < arrayInicial.length ; i++) {
            if (arrayInicial[i] != 9){
                arrayfinal[i] =  arrayInicial[i];
            }
        }
        return arrayfinal;
    }
    
}
