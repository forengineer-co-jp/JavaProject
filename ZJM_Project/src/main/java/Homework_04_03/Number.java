/*===================================================================*/
/*            第四節　選択　          */
/* Date:2021.10.2(土)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　     　問題3：　　　 　　　　*/
/*            順番(昇順)            */
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_04_03;

/* 指定した型の値を読み込むには外部のライブラリをインポートする必要がある */
/*            import宣言：import パッケージ名.クラス名             */
import java.util.Scanner;

/* "Number"クラスを作成 */
public class Number
{
    public static void main(String[] args)
    {
        /* 　　　オブジェクト生成 　　 */
        Scanner input = new Scanner(System.in);

        /* 三つの数字を入力 */
        System.out.print("三つの数字を入力: ");
        int number_1 = input.nextInt();
        int number_2 = input.nextInt();
        int number_3 = input.nextInt();

        /* 比較運算 */
        int i;

        /* 順番を切替 */
        if (number_2 < number_1 || number_3 < number_1)
        {
            if (number_2 < number_1)
            {
                i = number_1;
                number_1 = number_2;
                number_2 = i;
            }
            if (number_3 < number_1)
            {
                i = number_1;
                number_1 = number_3;
                number_3 = i;
            }
        }


        if (number_3 < number_2)
        {
            i = number_2;
            number_2 = number_3;
            number_3 = i;
        }

        /* 結果を出力 */
        System.out.println(number_1 + " " + number_2 + " " + number_3);
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/