/*===================================================================*/
/*         第八節　方法　        */
/* Date:2021.10.4(月)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　　 問題5　　　　　　*/
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_08_05;

import java.util.Scanner;

public class Maths
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        /* 三つの数字を入力 */
        System.out.print("数字を入力:");
        double num_1 = input.nextDouble();
        double num_2 = input.nextDouble();
        double num_3 = input.nextDouble();

        /* displaySortedNumbers関数を呼び出し */
        displaySortedNumbers(num_1, num_2, num_3);
    }

    public static void displaySortedNumbers(double num_1, double num_2, double num_3)
    {
        double temp;

        if (num_2 < num_1 && num_2 < num_3)
        {
            temp = num_1;
            num_1 = num_2;
            num_2 = temp;
        } else if (num_3 < num_1 && num_3 < num_2)
        {
            temp = num_1;
            num_1 = num_3;
            num_3 = temp;
        }
        if (num_3 < num_2)
        {
            temp = num_2;
            num_2 = num_3;
            num_3 = temp;
        }

        /* 結果を出力 */
        System.out.println(num_1 + " " + num_2 + " " + num_3);
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/