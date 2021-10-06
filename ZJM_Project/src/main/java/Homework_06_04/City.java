/*===================================================================*/
/*         第六節　文字と文字列　       */
/* Date:2021.10.4(月)　回答者：張 家銘 */
/*===================================================================*/

/*===================================================================*/
/* 　　　　 問題4：街の順番(降順)　　　　*/
/*===================================================================*/

/*===================================================================*/
/* START */
/*===================================================================*/
package Homework_06_04;

import java.util.Scanner;

public class City
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first city:");
        String city_1 = input.nextLine();

        System.out.println("Enter the second city:");
        String city_2 = input.nextLine();

        System.out.println("Enter the third city:");
        String city_3 = input.nextLine();

        String s;
        if ((city_2.compareTo(city_1) < 0) && (city_2.compareTo(city_3) < 0))
        {
            s = city_1;
            city_1 = city_2;
            city_2 = s;
        }
        else if ((city_3.compareTo(city_1) < 0) && (city_3.compareTo(city_2) < 0))
        {
            s = city_1;
            city_1 = city_3;
            city_3 = s;

        }
        if (city_3.compareTo(city_2) < 0)
        {
            s = city_2;
            city_2 = city_3;
            city_3 = s;
        }

        System.out.println("The three cities in alphabetical order are " + city_1 + " " + city_2 + " " + city_3);
    }
}

/*===================================================================*/
/* END */
/*===================================================================*/
