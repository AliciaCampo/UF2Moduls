//este es un programa para practicar las funciones 
public class Funciones {
    public static int comptaAs (String text){ //modulo 
        int comptador = 0 ;  //inicializamos la variable comptador
        for (int i = 0 ; i < text.length(); i ++){ //recorre todo el String
            if (text.charAt(i ) == 'a'){//si una letra es igual a a 
                comptador += 1;//incrementa +1 por cada a encontrada
            }     
        }
        return  comptador; //devovolvemos cuantas as hay en el texto 
    }


}