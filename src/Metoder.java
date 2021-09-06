import java.sql.Array;

public class Metoder {
    static String toRoman(int k){


        StringBuilder romedigits = new StringBuilder();
        while(k >= 1000){
            k = k-1000;
            romedigits.append("M");
        }
        while(k >= 500 && k < 1000){
            k = k-500;
            romedigits.append("D");
        }
        while(k >= 100 && k < 500){
            k = k-100;
            romedigits.append("C");
        }
        while(k >= 50 && k < 100){
            k = k-50;
            romedigits.append("L");
        }
        while(k >= 10){
            k = k-10;
            romedigits.append("X");
        }
        if(k==9){
            romedigits.append("IX");
            k = k-9;
        }
        if(k >=5){
            k = k-5;
            romedigits.append("V");
        }
        if(k==4){
            romedigits.append("IV");
            k = k-4;
        }
        for(int i = 0; i < k; i++){
            romedigits.append("I");
        }

        /*if(k >= 5 && k < 9){
            romedigits ="V";
            for(int i = 5; i < k; i++){
                romedigits += "I";
            }
        }
       else if(k == 4){
            romedigits = "IV";
        }else if(k == 9){
            romedigits = "IX";
        }else if(k == 10){
        romedigits = "X";
    }
        else{
            for (int i = 0; i < k; i++) {
                romedigits += "I";
            }
        }*/
        return romedigits.toString();
    }



}