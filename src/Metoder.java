public class Metoder {
    static String toRoman(int k){
        String romedigits = "";
        if(k == 5){
            romedigits ="V";
        }
        if(k == 4){
            romedigits = "IV";
        }else {
            for (int i = 0; i < k; i++) {
                romedigits += "I";
            }
        }
        return romedigits;
    }

        /* if (i == 2){
            romedigits = "II";

        }else if(i == 1){
            romedigits = "I";

        }else if (i == 3){
            romedigits = "III";

        }
        return romedigits;
        } */

}