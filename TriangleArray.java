public class TriangleArray {
    public static void main(String[] args) {
        char[][] triangulo = {
            {'*'},
            {'*', '*'},
            {'*', '*', '*'},
            {'*', '*', '*', '*'},
            {'*', '*', '*', '*', '*'}
        };
        for (int i = 0 ; i < triangulo.length; i ++){
            for (int j = 0 ; j <= i; j++){
                System.out.print(triangulo[i][j]);
            }
            System.out.println();
        }
    }
    
}
