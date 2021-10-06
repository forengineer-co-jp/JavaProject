/*===================================================================*/
/*         第七節　Javaループ　        */
/* Date:2021.10.4(月)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　　 問題6：最高得点　　　　　　*/
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_07_06;

import java.util.Scanner;

public class HighScores
{
    public static void main(String[] args)
    {
        /* オブジェクト生成 */
        Scanner input = new Scanner(System.in);

        String highscorename = "";
        int highscore = 0;

        System.out.println("学生の人数を入力:");
        int StudentNum = input.nextInt();

        /* 成績登録 */
        for (int i =0; i < StudentNum; i++)
        {
            System.out.printf("第%d人目学生の名前を入力: ",i+1);
            String name = input.next();

            System.out.printf("\nこの学生の点数を入力: ");
            int score = input.nextInt();

            if (score > highscore)
            {
                highscore = score;
                highscorename = name;
            }
        }

        /* 結果を出力 */
        System.out.printf("%sは最高点数%dである\n",highscorename,highscore);
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/