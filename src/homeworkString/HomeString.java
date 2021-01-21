package homeworkString;

import java.util.Locale;

public class HomeString {


    public static void main(String[] args) {
        meString ("I like Java!!!");
    }
    public static void meString (String stroka){
//a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
        System.out.println(stroka);
//б) Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println(stroka.charAt(stroka.length()-1));
//в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        System.out.println(stroka.endsWith("!!!"));
//г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(stroka.startsWith("I like"));
//д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(stroka.contains("Java"));
//e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println(stroka.indexOf("Java"));
//ж) Заменить все символы “а” на “о”.
        System.out.println(stroka.replace("a","o"));
//з) Преобразуйте строку к верхнему регистру.
        System.out.println(stroka.toUpperCase(Locale.ROOT));
//и) Преобразуйте строку к нижнему регистру.
        System.out.println(stroka.toLowerCase(Locale.ROOT));
//к) Вырезать строку Java c помощью метода String.substring().
        System.out.println(stroka.substring(stroka.indexOf("Java"),stroka.indexOf("Java") + 4));

    }
}
