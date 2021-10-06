/*===================================================================*/
/*            第四節　選択　          */
/* Date:2021.10.2(土)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　     　問題5：　　　 　　　　*/
/*               回文              */
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_04_05;

/* 指定した型の値を読み込むには外部のライブラリをインポートする必要がある */
/*            import宣言：import パッケージ名.クラス名             */
import java.util.Scanner;

/* "Palindrome"クラスを作成 */
public class Palindrome
{
    public static void main(String[] args)
    {
        /* 　　　オブジェクト生成 　　 */
        Scanner input = new Scanner(System.in);

        /* 3桁の数字を入力 */
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        /* 第一桁と第三桁は一致するかを検証 */
        /* 第一桁の数字を取り出す */
        int number_1 = number / 100;

        /* 第三桁の数字を取り出す */
        int i = number % 100;
        int number_3 = i % 10;

        /* 結果を出力 */
        System.out.println(number + ((number_1 == number_3) ? " is a " : " is not a ") + "palindrome");
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/