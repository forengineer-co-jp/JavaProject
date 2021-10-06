/*===================================================================*/
/*         第八節　方法　        */
/* Date:2021.10.4(月)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　　 問題3　　　　　　*/
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_08_03;

import java.util.Scanner;

public class Maths
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("数字を入力:");
        int num = input.nextInt();

        /* 結果を出力 */
        System.out.println(num + "は" + (isPalindrome(num) ? "回文数" : "回文数ではない") );
    }


    public static boolean isPalindrome(int num)
    {
        return num == reverse(num) ? true : false;
    }

    public static int reverse(int num)
    {
        String reverse = "";
        String n = num + "";

        for (int i = n.length() - 1; i >= 0; i--)
        {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/