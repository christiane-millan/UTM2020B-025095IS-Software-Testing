package mx.mixteco.javatest.util;

public class StringUtils {
    public static String repeat(String str, int r) {
        if(r < 0){
            throw new IllegalArgumentException("negative times is not allowed");
        }

        String result = "";
        for (int i = 0; i < r; i++) {
            result += str;
        }
        return result;
    }

    public static boolean isEmpty(String str){
        return false;
    }
    //Probar que un string cualquiera no es vacío "hola"
    //Probar que “” es un string vacío
    //Probar que null también es un string vacío
    //Probar que "    " también es un string vacío
}
