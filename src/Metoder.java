public class Metoder {
    static String toRoman(int i){
        String romedigits = "null";
        if (i == 2){
            romedigits = "II";

        }else if(i == 1){
            romedigits = "I";

        }else if (i == 3){
            romedigits = "III";

        }
        return romedigits;
        }

}