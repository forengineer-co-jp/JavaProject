/*===================================================================*/
/*         第六節　文字と文字列　       */
/* Date:2021.10.4(月)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　  問題2：ランダム文字　　　　　*/
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_06_02;

public class Random_Word
{
    public static void main(String[] args)
    {
        char w = (char)(Math.random() * 26 + 'A');
        System.out.println(w);
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/