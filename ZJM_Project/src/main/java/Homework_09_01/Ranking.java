/*===================================================================*/
/*         第九節　配列　        */
/* Date:2021.10.4(月)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　　 問題1　　　　　　*/
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_09_01;

import java.util.Scanner;

public class Ranking
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        /* 学生の数を入力 */
        System.out.print("学生の数を入力:");
        int[] scores = new int[input.nextInt()];
        char[] ranks = new char[scores.length];

        /* 人数分のスコアを入力 */
        System.out.print("学生" + scores.length + "名全員のスコアを入力: ");
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = input.nextInt();
        }

        /* getGrades関数を呼び出し */
        getRank(scores, ranks);

        /* 結果を出力 */
        for (int i = 0; i < scores.length; i++)
        {
            System.out.println("第" + (i+1) + "名の学生のスコアは" + scores[i] + "点、そしてランクは" + ranks[i]);
        }
    }

    public static int max(int[] array)
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void getRank(int[] scores, char[] grades)
    {
        int best = max(scores);
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] >= best - 10)
            {
                grades[i] = 'A';
            }

            else if (scores[i] >= best - 20)
            {
                grades[i] = 'B';
            }

            else if (scores[i] >= best - 30)
            {
                grades[i] = 'C';
            }

            else if (scores[i] >= best - 40)
            {
                grades[i] = 'D';
            }

            else
            {
                grades[i] = 'F';
            }
        }
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/