package calculator;

import java.util.HashMap;
import java.util.Map;


class Converter {
    public static String arabicToRoman(int a) {

        int aa = a;

        if (a < 0) a = a * (-1);

        String g = "";

        while (a / 100 > 0) {
            g = g + "C";
            a = a - 100;
        }
        while (a / 90 > 0) {
            g = g + "XC";
            a = a - 90;
        }
        while (a / 50 > 0) {
            g = g + "L";
            a = a - 50;
        }
        while (a / 40 > 0) {
            g = g + "XL";
            a = a - 40;
        }
        while (a / 10 > 0) {
            g = g + "X";
            a = a - 10;
        }
        while (a / 9 > 0) {
            g = g + "IX";
            a = a - 9;
        }
        while (a / 5 > 0) {
            g = g + "V";
            a = a - 5;
        }
        while (a / 4 > 0) {
            g = g + "IV";
            a = a - 4;
        }
        while (a  > 0) {
            g = g + "I";
            a = a - 1;
        }

        if (aa < 0) {
            g = "-" + g;
        }
        if (aa == 0) g = "0";

        return g;

    }

    public static int romanToArabic(String a){
        Map<String, Integer> joja = new HashMap<String, Integer>();
        joja.put("I", 1);
        joja.put("II", 2);
        joja.put("III", 3);
        joja.put("IV", 4);
        joja.put("V", 5);
        joja.put("VI", 6);
        joja.put("VII", 7);
        joja.put("VIII", 8);
        joja.put("IX", 9);
        joja.put("X", 10);

        int b = joja.get(a);

        return b;
    }


}





