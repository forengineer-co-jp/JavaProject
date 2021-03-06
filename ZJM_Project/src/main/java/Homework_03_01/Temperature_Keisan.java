/*===================================================================*/
/* 第三節　Javaプログラミングの基礎　*/
/* Date:2021.10.2(土)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　　 問題1：　　　　　　　*/
/*   摂氏(℃)から華氏(℉)へ換算   */
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_03_01;

/* 指定した型の値を読み込むには外部のライブラリをインポートする必要がある */
/*            import宣言：import パッケージ名.クラス名             */
import java.util.Scanner;

/* "Temperature_Keisan"クラスを作成 */
public class Temperature_Keisan
{
    public static void main(String[] args)
    {
        /* 　　　オブジェクト生成 　　　*/
        Scanner input = new Scanner(System.in);

        /*      摂氏(℃)を入力       */
        System.out.print("Enter a degree in Celsius: ");

        /* 摂氏(℃)の変数celsiusを宣言(第一回の入力値) */
        double celsius = input.nextDouble();

        /* 華氏(℉)の変数fahrenheitを宣言 */
        /*   摂氏(℃)から華氏(℉)へ換算   */
        /* 　　　　 F=9/5C+32          */
        double fahrenheit = 9.0 / 5 * celsius + 32;

        /* 結果を出力 */
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/