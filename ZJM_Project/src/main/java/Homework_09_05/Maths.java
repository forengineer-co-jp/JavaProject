/*===================================================================*/
/*         第九節　配列　        */
/* Date:2021.10.4(月)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　　 問題5　　　　　　*/
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_09_05;

import java.util.Scanner;

public class Maths
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[5];

        System.out.print("五つの数字を入力:");

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextDouble();
        }

        System.out.println("最小数字は:" + min(numbers));
    }

    public static double min(double[] array)
    {
        double n = array[0];

        for (double i : array)
        {
            if (i < n)
            {
                n = i;
            }
        }
        return n;
    }
}