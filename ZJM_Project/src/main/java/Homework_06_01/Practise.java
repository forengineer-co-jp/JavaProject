/*===================================================================*/
/*         第六節　文字と文字列　       */
/* Date:2021.10.4(月)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　     　問題1：　　　 　　　　*/
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_06_01;

public class Practise
{

    public static void main(String[] args)
    {
        String s1 = "Welcome";
        String s2 = "welcome";

        /* a */
        boolean isEqual = s1.equals(s2);

        /* b */
        boolean isEqual1 = s1.equalsIgnoreCase(s2);

        /* c */
        int x1 = s1.compareTo(s2);

        /* d */
        int x2 = s1.compareToIgnoreCase(s2);

        /* e */
        boolean b1 = s1.startsWith("AAA");

        /* f */
        boolean b2 = s1.endsWith("AAA");

        /* g */
        int x3 = s1.length();

        /* h */
        char x4 = s1.charAt(0);

        /* i */
        String s3 = s1 + s2;

        /* j */
        s1.substring(1);

        /* k */
        s1.substring(1, 5);

        /* l */
        String s4 = s1.toLowerCase();

        /* m */
        String s5 = s1.toUpperCase();

        /* n */
        String s6 = s1.trim();

        /* o */
        int x5 = s1.indexOf('e');

        /* p */
        int x6 = s1.indexOf("abc");

    }
}

/*===================================================================*/
/* END */
/*===================================================================*/