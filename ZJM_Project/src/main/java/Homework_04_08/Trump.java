/*===================================================================*/
/*            第四節　選択　          */
/* Date:2021.10.2(土)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　     　問題8：　　　 　　　　*/
/*             トランプ              */
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_04_08;

/* "FingerGuessing"クラスを作成 */
public class Trump
{
    public static void main(String[] args)
    {
        /* 数字をランダムで生成(2から9) */
        int number = (int)((Math.random() * 13) + 1);

        /* 種類をランダムで生成 */
        int kinds = (int)(Math.random() * 4);

        /* 結果を出力 */
        System.out.print("The card you picked is ");
        switch(number)
        {
            case 1: System.out.print("Ace"); break;
            case 2: System.out.print(number); break;
            case 3: System.out.print(number); break;
            case 4: System.out.print(number); break;
            case 5: System.out.print(number); break;
            case 6: System.out.print(number); break;
            case 7: System.out.print(number); break;
            case 8: System.out.print(number); break;
            case 9: System.out.print(number); break;
            case 10: System.out.print(number); break;
            case 11: System.out.print("Jack"); break;
            case 12: System.out.print("Queen"); break;
            case 13: System.out.print("King");
        }

        System.out.print(" of ");

        switch (kinds)
        {
            case 0: System.out.println("Clubs"); break;
            case 1: System.out.println("Diamonds"); break;
            case 2: System.out.println("Hearts"); break;
            case 3: System.out.println("Spades");
        }
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/