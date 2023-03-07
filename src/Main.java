import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateGrade(77));
        System.out.println(fizzbuzz(5));
        System.out.println(frontback("veryveryverylongword"));
        System.out.println(twoAsOne(3,1,4));
        System.out.println(endUp("gg"));
    }
    // Question 1 - calculateGrade
public static char calculateGrade(int a) {
    if (a >= 90 && a <= 100) {
        return 'A';
    }
    else if (a >= 80 && a <= 89) {
        return 'B';
    }
    else if (a >= 70 && a <= 79) {
        return 'C';
    }
    else if (a >= 60 && a <= 69) {
        return 'D';
    }
    else if (a >= 50 && a <= 59) {
        return 'E';
    }
    else {
        return 'F';
    }
}
    // Question 2 - fizzBuzz
public static String fizzbuzz(int a) {
    if (a % 5 != 0 && a % 3 == 0) {
        return "fizz";
    }
    else if (a % 5 == 0 && a % 3 != 0) {
        return "buzz";
    }
    else if (a % 5 == 0 && a % 3 == 0) {
        return "fizzbuzz";
    }
    else {
        return "unlucky";
    }
}
    // Question 3 - frontBack
public static String frontback(String word) {
    if (word.length() < 2) {
        return word;
    }
    else {
        return word.substring(0, 2) + word + word.substring(0,2);
    }
}
    // Question 4 - twoAsOne
public static boolean twoAsOne(int a, int b, int c) {
    return a + b == c || b + c == a || a + c == b;
}
    // Question 5 - endUp
public static String endUp(String word) {
    if (word.length() < 3 ) {
        return word.toUpperCase();
    }
    else {
        String one = word.substring(0, word.length() - 3);
        String two = word.substring(word.length() - 3, word.length());
        return one + two.toUpperCase();
    }
}
}
