/*===================================================================*/
/*            第四節　選択　          */
/* Date:2021.10.2(土)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　     　問題6：　　　 　　　　*/
/*               勝負              */
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_04_06;

/* 指定した型の値を読み込むには外部のライブラリをインポートする必要がある */
/*            import宣言：import パッケージ名.クラス名             */
import java.util.Scanner;

/* "FingerGuessing"クラスを作成 */
public class FingerGuessing
{
    public static void main(String[] args)
    {
        /* 　　　オブジェクト生成 　　 */
        Scanner input = new Scanner(System.in);

        /* パソコンAIの手の姿をランダムで決める */
        int computer = (int)(Math.random() * 3);

        /* 数字で手の姿を決める */
        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();

        System.out.print("The computer is ");
        switch (computer)
        {
            case 0: System.out.print("scissor."); break;
            case 1: System.out.print("rock."); break;
            case 2: System.out.print("paper.");
        }

        System.out.print(" You are ");
        switch (user)
        {
            case 0: System.out.print("scissor"); break;
            case 1: System.out.print("rock"); break;
            case 2: System.out.print("paper ");
        }

        /* 勝負判定 */
        /* ドローの場合 */
        if (computer == user)
        {
            /* 結果を出力 */
            System.out.println(" too. It is a draw");
        }

        /* ドローでない場合 */
        else
        {
            /* 3パタンの場合 */
            boolean win = (user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1);

            /* 結果を出力 */
            if (win)
            {
                System.out.println(". You won");
            }
            else
            {
                System.out.println(". You lose");
            }
        }
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/