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
package Homework_09_08;

import java.util.Scanner;

public class Maths
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("文字列を入力:");
        String string = input.nextLine();

        System.out.println(sort(string));
    }

    public static char[] sort(String s)
    {
        char[] str = new char[s.length()];

        for (int i = 0; i < str.length; i++)
        {
            str[i] = s.charAt(i);
        }

        for (int i = 0; i < str.length - 1; i++)
        {
            char min = str[i];
            int min_Index = i;

            for (int j = i + 1; j < str.length; j++)
            {
                if (min > str[j])
                {
                    min = str[j];
                    min_Index = j;
                }
            }
            if (min_Index != i)
            {
                str[min_Index] = str[i];
                str[i] = min;
            }
        }
        return str;
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/