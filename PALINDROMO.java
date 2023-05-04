/* @author:IAN ALEJANDRO CORREA LÓPEZ
 * @mail: icorrealopez102@gmail.com 
 * PRACTICA: PALINDROMO 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Pal = "ORO";
        int inc = 0;
        int des = Pal.length()-1;
        boolean bError = false;
        while ((inc<des) && (!bError)){

            if (Pal.charAt(inc)==Pal.charAt(des)){
                inc++;
                des--;
            } else {
                bError = true;
            }
        }
        if (!bError)
            System.out.println(Pal + " es un PALINDROMO");
        else
            System.out.println(Pal + " NO es un palindromo");
    }
}