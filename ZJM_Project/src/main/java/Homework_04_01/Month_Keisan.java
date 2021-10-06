/*===================================================================*/
/*            第四節　選択　          */
/* Date:2021.10.2(土)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　     　問題1：　　　 　　　　*/
/*              月表示              */
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_04_01;

/* "Month_Keisan"クラスを作成 */
public class Month_Keisan
{
    public static void main(String[] args)
    {
        /* 月(month)変数を宣言 */
        /* プログラミングに数値は0から計算される */
        /* "Math.random() * 12"は"0-11"の中にランダムに指定される */
        /* その後"+1"が必要 */
        int month = (int)((Math.random() * 12) + 1);

        /* 月を英語で表示(12個のパータン) */
        switch (month)
        {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December");
        }
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/
