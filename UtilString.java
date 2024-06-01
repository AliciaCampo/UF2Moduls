//programa amb les utilitats de String cridats en altres programes en el mateix directori
public class UtilString {
    public static boolean esVocal(char caracter) {
    return "àèéíïòóúiüÀÈÉÍÏÒÓÚIÜaAeEOoUu".contains(Character.toString(caracter));
  }
  public static boolean esVocalOFinal(String resposta) {
    char primerChar = resposta.charAt(0);
    char ultimoChar = resposta.charAt(resposta.length() - 1);
    return esVocal(primerChar) || esVocal(ultimoChar);
  }
  public static String nomesLletres(String text) {
    String lletres = "";
    for (int i = 0; i < text.length(); i++) {
      char lletra = text.charAt(i);
      if (Character.isLetter(lletra)) {
        lletres += lletra;
      }
    }
    return lletres;
  }
  public static String lletresSeparades(String lletres) {
    StringBuilder lletresSeparades = new StringBuilder();
    for (int i = 0; i < lletres.length(); i++) {
      lletresSeparades.append(lletres.charAt(i));
      if (i < lletres.length() - 1) {
        lletresSeparades.append(", ");
      } else {
        //lletresSeparades.append(" ");
      }
    }
    return lletresSeparades.toString();
  }
  public static String intervalString(String text, int ini, int fi) {
    if (ini < 0) {
        ini = 0;
    }
    if (ini >= text.length()) {
        ini = text.length() - 1;
    }
    if (fi < 0) {
        fi = 0;
    }
    if (fi >= text.length()) {
        fi = text.length() - 1;
    }
    
    StringBuilder result = new StringBuilder();
    
    if (ini < fi) {
        for (int i = ini; i <= fi; i++) {
            result.append(text.charAt(i));
        }
    } else {
        for (int i = ini; i >= fi; i--) {
            result.append(text.charAt(i));
        }
    }
    return result.toString();
}
    public static int aEnter(String text, boolean estricto) {
        if (text.isEmpty()) {
            return 0;
        }
        if (estricto) {
            return Integer.parseInt(text);
        } else {
            for (int i = 0; i < text.length(); i++) {
                if (!Character.isDigit(text.charAt(i))) {
                    return 0;
                }
            }
            return Integer.parseInt(text);

        }
    }
    
    public static String cadenaContinua(String text, int longitud) {
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            cadena.append(text.charAt(i % text.length()));
        }
        return cadena.toString();
   }
   // retorna cert quan subtext està inclòs extrictament dins de text
   public static boolean esSubstring(String text, String subtext, boolean extricte){
    if (text.isEmpty()){
        return false;
    }
    if(!extricte){
        return true;
    }
    if (extricte) {
        return text.contains(subtext);
  } else {
        return subtext.contains(text);
  }
   }
   // equival a esSubstring(text, subtext, true)
   public static boolean esSubstring(String text, String subtext){
    if (text.contains(subtext)){
        return true;
    }else{
        return false;
    }
   
   }
   //codi per implementar en el 32_31
   // retorna cert quan text comença amb prefix, considerant si ha de ser o no extricte
    public static boolean esPrefix(String text, String prefix, boolean extricte) {
        if (extricte) {
            return text.startsWith(prefix);
        } else {
            if (prefix.length() > text.length()) {
                return false;
            }
            for (int i = 0; i < prefix.length(); i++) {
                if (text.charAt(i) != prefix.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
}


    public static boolean esPrefix(String text, String prefix) {
        return esPrefix(text, prefix, true);
    }
    public static boolean esSufix(String text, String sufix, boolean extricte) {
        if (extricte) {
            return text.endsWith(sufix);
        } else {
            if (sufix.length() > text.length()) {
                return false;
            }
            int textLength = text.length();
            int sufixLength = sufix.length();
            for (int i = 0; i < sufixLength; i++) {
                if (text.charAt(textLength - sufixLength + i) != sufix.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
}

    public static boolean esSufix(String text, String sufix) {
        return esSufix(text, sufix, true);
    }
    //codigo implementado en el 32_32
    public static int quants(String text, String subtext, boolean extricte) {
        if (text.isEmpty() || subtext.isEmpty()) {
            return 0;
        }
        int contador = 0;
        int textLength = text.length();
        int subtextLength = subtext.length();
        for (int i = 0; i <= textLength - subtextLength; i++) {
            if (coincidencia(text, subtext, i, extricte)) {
                contador++;
            }
        }
        return contador;
    }
    public static boolean coincidencia(String text, String subtext, int start, boolean extricte) {
        int subtextLength = subtext.length();
        for (int i = 0; i < subtextLength; i++) {
            char charText = text.charAt(start + i);
            char charSubtext = subtext.charAt(i);

            if (extricte) {
                if (charText != charSubtext) {
                    return false;
                }
            } else {
                if (Character.toLowerCase(charText) != Character.toLowerCase(charSubtext)) {
                    return false;
                }
            }
        }
        return true;
    }
    //codigo para implementar en el 32_41 y otros 
    public static String entreComes(int[] numeros, char separador) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < numeros.length; i++) {
            if (i > 0) {
                resultado.append(separador).append(" ");
            }
            resultado.append(numeros[i]);
        }
        return resultado.toString();
    }
    public static char obtenerSeparador(String entrada) {
        if (entrada.isEmpty()) {
            return ',';
        } else {
            return entrada.charAt(0);
        }
    }
    //codigo para implementar en el 32_43
    public static int quantsEnters(String[] valors) {
    int comptador = 0;
    int index = 0;
    while (index < valors.length) {
        if (esEnter(valors[index])) {
            comptador++;
        }
        index++;
    }
    return comptador;
    }

    public static int[] filtraEnters(String[] valors) {
        int numEnters = quantsEnters(valors);
        int[] enters = new int[numEnters];
        int index = 0;
        int i = 0;
        while (i < valors.length) {
            if (esEnter(valors[i])) {
                enters[index] = Integer.parseInt(valors[i]);
                index++;
            }
            i++;
        }
        return enters;
    }

    public static int sumaEnters(int[] valors) {
        int suma = 0;
        int index = 0;
        while (index < valors.length) {
            suma += valors[index];
            index++;
        }
        return suma;
    }
    public static boolean esEnter(String valor) {
        if (valor.isEmpty()) {
            return false;
        }
        if(valor.startsWith("-") || (valor.startsWith("+"))){
            return true;
        }
        int primeraL = 0;
        if (valor.charAt(0) == '-') {
            if (valor.length() == 1) {
                return false;
            }
            primeraL = 1;
        }
        for (int i = primeraL; i < valor.length(); i++) {
            if (!Character.isDigit(valor.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    //codigo para implementar en el 32_45 y otros
     public static String junta(String[] cadenes, String separador, String darrerSeparador) {
        if (cadenes == null || cadenes.length == 0) {
            return "";
        } else if (cadenes.length == 1) {
            return cadenes[0];
        } else if (cadenes.length == 2) {
            return cadenes[0] + darrerSeparador + cadenes[1];
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < cadenes.length - 2; i++) {
                result.append(cadenes[i]).append(separador);
            }
            result.append(cadenes[cadenes.length - 2]).append(darrerSeparador).append(cadenes[cadenes.length - 1]);
            return result.toString();
        }
    }

    public static String junta(String[] cadenes, String separador) {
        return junta(cadenes, separador, separador);
    }
}