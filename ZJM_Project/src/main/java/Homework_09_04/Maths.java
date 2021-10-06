/*===================================================================*/
/*         第九節　配列　        */
/* Date:2021.10.4(月)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　　 問題4　　　　　　*/
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_09_04;

import java.util.Scanner;

public class Maths
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[] values = new double[5];

        System.out.print("5つの数字を入力");
        for (int i = 0; i < values.length; i++)
        {
            values[i] = input.nextDouble();
        }

        System.out.println("平均値は:" + average(values));
    }


    public static int average(int[] array)
    {
        int n = 0;
        for (int i : array)
        {
            n += i;
        }
        return n / array.length;
    }

    public static double average(double[] array)
    {
        double n = 0;
        for (double i : array)
        {
            n += i;
        }
        return n / array.length;
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/