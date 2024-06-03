public class EjerciciosArray1 {
    public static void main(String[] args) {
        int[] numeros = {3, 4, 9, 2, 8, 9, 5};
        int elementoABuscar = 5;
        int indice = encontrarElemento(numeros, elementoABuscar);
        if (indice != -1) {
            System.out.println("El elemento " + elementoABuscar + " se encuentra en el índice: " + indice);
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en el array.");
        }
    }
    public  static int encontrarElemento(int [] numeros , int elementoABuscar){
        int posicion  =  0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == elementoABuscar){
                posicion =  i;
            }
        }
        return posicion;
    }
}
