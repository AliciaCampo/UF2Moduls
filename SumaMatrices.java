public class SumaMatrices {
    /*Ejercicio 1: Suma de dos matrices
Descripción: Escribe un programa en Java que sume dos matrices de las mismas dimensiones.

Objetivo:

Pedir al usuario que introduzca las dimensiones de las matrices.
Pedir al usuario que introduzca los elementos de ambas matrices.
Calcular la suma de las dos matrices. HOLAAAAAAAAA ALICIIIIIIIIIIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA Holaaaa Mariaaaaaaaaaaaa👋👋👋 
Imprimir la matriz resultante. */
    public static void main(String[] args) {
        System.out.print("Introduce el numero de filas : ");
        int filas = Integer.parseInt(Entrada.readLine());
        System.out.print("Introduce el numero de columnas : ");
        int columnas = Integer.parseInt(Entrada.readLine());
        int [][] matriz1 =  new int [filas][columnas];
        int [][] matriz2 =  new int [filas][columnas];
        int [][] suma =  new int [filas][columnas];
        System.out.println("Introduce los elementos de la  primera matriz");
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                matriz1[f][c] = Integer.parseInt(Entrada.readLine());
            }
        }
        System.out.println("Introduce los elementos de la  segunda matriz");
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++){
                matriz2[f][c] = Integer.parseInt(Entrada.readLine());
            }
        }
        //sumar las matrices 
        for (int f = 0; f < filas ; f++){
            for (int c = 0 ; c < columnas ; c++){
                suma[f][c] = matriz1[f][c] + matriz2[f][c];
            }
        }
        System.out.println("El resultado es : ");
        for(int f = 0; f < filas; f++) {
            for(int c = 0; c< columnas; c++) {
                System.out.print(suma[f][c]+ " ");
            }
            System.out.println();
        }
        System.out.println("");
    } 
}
