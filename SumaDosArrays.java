public class SumaDosArrays {
    //suma dos arrays 
    public static void main(String[] args) {
        int [] arrayPrimer = {1,2,3,4,5};
        int [] arraySegon = {6,7,8,9,10};
        int [] resultado = sumaArrays(arrayPrimer, arraySegon);
        for (int i : resultado) {
            System.out.print(i + " | ");
        }

    }
    public  static int [] sumaArrays (int [] arrayPrimer , int [] arraySegon){
        int tamaño = 0;
        int indice = 0;
        for (int i = 0 ; i < arrayPrimer.length ; i++){
            tamaño += 1;
        }
        for (int i = 0 ; i < arraySegon.length ; i++){
            tamaño += 1;
        }
        int [] arrayFinal = new int [tamaño];
        for (int i = 0 ; i < arrayPrimer.length ;  i++){
           arrayFinal[indice++] =arrayPrimer[i];
        }
        for (int i = 0 ; i < arraySegon.length ;  i++){
            arrayFinal[indice++] =arraySegon[i];
         }
        return arrayFinal;
    }
}
