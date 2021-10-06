/*===================================================================*/
/*            第四節　選択　          */
/* Date:2021.10.2(土)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　     　問題2：　　　 　　　　*/
/*              月表示              */
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_04_02;

/* 指定した型の値を読み込むには外部のライブラリをインポートする必要がある */
/*            import宣言：import パッケージ名.クラス名             */
import java.util.Scanner;

/* "Week_Keisan"クラスを作成 */
public class Week_Keisan
{
    public static void main(String[] args)
    {
        /* 　　　オブジェクト生成 　　 */
        Scanner input = new Scanner(System.in);

        /* 今日の日付を入力(day):0は日曜日,1は月曜日,2は火曜日...... */
        System.out.print("Enter today’s day: ");
        int day = input.nextInt();

        /* 今日から何日を経過したかを入力(day):0,1,2...... */
        System.out.print("Enter the number of days elapsed since today: ");
        int daysfuture = input.nextInt();

        /* 将来の日付(future)変数を宣言 */
        /* 七つのパタンだから"%7" */
        int future = (day + daysfuture) % 7;

        /*-----------------------------------------------------------*/
        /* 結果を出力 */
        System.out.print("Today is ");
        switch (day)
        {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
        }

        System.out.print(" and the future day is ");
        switch (future)
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
        }
        /*-----------------------------------------------------------*/
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/