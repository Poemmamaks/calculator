package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String phrase = reader.readLine();
        String p[] = phrase.split(" ");

        try{
        int s = summm(Integer.parseInt(p[0]), p[1], Integer.parseInt(p[2]));
            System.out.println(s);
        }
        catch (Exception e){
            int s = summm(Converter.romanToArabic(p[0]), p[1], Converter.romanToArabic(p[2]) );
            System.out.println(Converter.arabicToRoman(s));

        }
        }


    static int summm(int a, String o, int b){
        int g = 0;
        if (o.equals("+")){g = a + b;}
        if (o.equals("-")){g = a - b;}
        if (o.equals("*")){g = a * b;}
        if (o.equals("/")){g = a / b;}

        return g;


    }
}



