1 请声明各种类型的变量，并且不赋初始值。
        输出各个类型的变量，来看下他们的默认初始值
        例如
        int i;
        System.out.println(i);

        倫理型：
        boolean flag;(false)
        整数型：
        int i;(0)
        byte j;(0)
        short k;(0)
        long l;(0)

        浮動小数点型：
        float i;(0.0)
        double i;(0.0)

        文字型：
        char i;(" ")

        配列型：
        int[0] = 1;




        2 变量的域 （此题取消）

        3 整数3除以整数2等于？
        1

        4 整数3除以浮点型类型的2 等于？
        1.5




        5 请声明一个常量，并对其赋值
final double PI = 3.1415927;

        6 分别写出以下几种命名来体现命名规则，具体名字不限(要有3个英文单词链接)
        /* 6-1  类 Class BaseUserSurvice		*/

        /* 6-2  方法 public void addSurviceAchievement()	*/
        /* 6-3  变量 int putTheBear			*/
        /* 6-4  常量 final int DAMAGE_PER_SECOND		*/

        7 分别声明值是2的float型，double型，long型
/*
       float i = 2.0f;
       double j = 2.0d;
       long k = 2L;


*/

        8 声明变量x,y,z 并且分别赋值，输出，x加y的的结果再乘以z
/*
int x,y,z;
int i =  ( x + y ) * z;
System.out.println("(x + y) * z" + i);
*/

        9 请写一段代码来阐述前置加，后置加的区别 (++i,i++的区别)
        /* int i = 1;
        int j = i++;
        int k1= j + i++;
        System.out.println(j + " " + i + " " + 1);


        int i = 1;
        int j = ++i;
        int k = j + ++i;
        System.out.println(j2 + " " + i2 + " " + k2); */

        10 解释 int x = 5/2.0

        10-1为什么以上有编译错误, （原因文字写出来就行）
        /* 浮動小数点型では、直接値を指定することができない */

        10-2解释什么情况需要显示的转型，什么时候发生自动转型，（原因文字写出来就行）
　　　　　/* 大きい値の型が小さい値の型に直接値指定するとcastが必要 */
        /* 小さい値の型が大きい値の型に値を付けると、自動的にcast */
        10-3 写出两个例子，自动转型和显示转型
        /* int i = (int) 5/ 2/0; */
        /* double n = 4; */
        /* System.out println(i * n); */


