/* 11 请输出如下字符串
 my uncle's dog eats nothing \ . "what a strange dog" */

System.out.println("my uncle's dog eats nothing \ . "what a strange dog"");


/* 有一个字符串"sdflskjdfw2234234l" 判断 字符大写A是否在该字符串中。
不区分大小写，比如字符串"abc"的话，大写B或者小写b都算在"abc"中 */
String words = "sdflskjdfw2234234l";
System.out.println(words.contains("A"));
System.out.println(words.toUpperCase().contains("ABC"));

//13 如何比较两个字符串 用== 可以判断吗，如果不能应该用什么方法，写出正确的比较方法
// ==　で判断不能
System.out.println(word_1.equals(word_2));

// 14 已知字符串"abcd...xyz"，26个字母都包括的一个字符串，键盘输入2个字符，比如第一次输入e ，第二次如数 m，
// 那么请返回 "fghijkl"这样的一个字符串，也就是 2个字母之前的字符串
String words = "abcdefghijklmnopqrstuvwxyz";
Scanner input = new Scanner(System.in);
String word_1 = input.next();
String word_2 = input.next();

String result = words.substring((int)words.indexOf(word_1)+1,(int)words.indexOf(word_2));
System.out.println(result);