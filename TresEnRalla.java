public class TresEnRalla {
    //declaración del tablero HOOOLAAAA ALICIAAAA
    public static void main(String[] args) {
        char[][] tablero = new char[3][3]; 
        tablero[0][0] = '*';
        tablero[0][1] = '*';
        tablero[0][2] = 'X';
        tablero[1][0] = 'O';
        tablero[1][1] = 'X';
        tablero[1][2] = 'O';
        tablero[2][0] = 'X';
        tablero[2][1] = 'O';
        tablero[2][2] = 'X';

        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero.length; columna++) {
                System.out.print(tablero[fila][columna]);
            }
            System.out.println();
        } 
    }
}