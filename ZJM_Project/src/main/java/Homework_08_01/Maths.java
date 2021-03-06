/*===================================================================*/
/*         第八節　方法　        */
/* Date:2021.10.4(月)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　　 問題1　　　　　　*/
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_08_01;

public class Maths {

    public static void main(String[] args)
    {

        /* 定義 */
        final int NUMBER_OF_PENTAGONALS = 100; // Display the first 100 pentagonals
        final int NUMBER_PER_LINE = 10; // Display 10 number per line

        /* 結果を出力 */
        System.out.println("百の五角数を毎行で10個を表示: ");
        for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++)
        {
            if (i % NUMBER_PER_LINE == 0)
            {
                System.out.printf("%10d\n", getnumber(i));
            }
            else
            {
                System.out.printf("%10d", getnumber(i));
            }
        }
    }

    public static int getnumber(int n)
    {
        return (n * (3 * n - 1)) / 2;
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/