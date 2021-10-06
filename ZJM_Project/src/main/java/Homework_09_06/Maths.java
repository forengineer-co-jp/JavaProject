/*===================================================================*/
/*         第九節　配列　        */
/* Date:2021.10.4(月)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　　 問題6　　　　　　*/
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_09_06;

import java.util.Scanner;

public class Maths
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        /* 五つの数字を入力 */
        System.out.print("五つの数字を入力:");
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }

        /* 結果を出力 */
        System.out.println("最大公約数は:" + gcd(numbers));
    }


    public static int gcd(int... numbers)
    {
        int gcd = 1;
        boolean n;

        for (int i = 2; i < min(numbers); i++)
        {
            n = true;
            for (int e : numbers)
            {
                if (e % i != 0)
                {
                    n = false;
                }
            }
            if (n)
            {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int min(int... numbers)
    {
        int min = numbers[0];
        for (int i : numbers)
        {
            if (i < min)
            {
                min = i;
            }
        }
        return min;
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/