public class Metoder {
    static String toRoman(int k){
        String romedigits = "";
        if(k >= 5 && k < 9){
            romedigits ="V";
            for(int i = 5; i < k; i++){
                romedigits += "I";
            }
        }
        else if(k == 4){
            romedigits = "IV";
        }else if(k == 9){
            romedigits = "IX";
        }else{
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