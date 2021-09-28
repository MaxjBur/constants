import java.util.Scanner;

public class secondClass {

public static void second(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose a number and I will tell you if it is odd or even");
    int numb = scanner.nextInt();
    if ((numb % 2) == 0) {
        System.out.println("Number is even");
    } else {
        System.out.println("Number is odd");
    }
    System.out.println("Choose a second number");
    int numb2 = scanner.nextInt();
    System.out.print("Your first number divided by your second number is "+numb/numb2);
    System.out.println(" with a remainder of " +numb%numb2);
    System.out.println("Choose a third number");
    int numb3 = scanner.nextInt();
    System.out.println("Choose a fourth number");
    int numb4 = scanner.nextInt();
    System.out.println("Choose a fifth number");
    int numb5 = scanner.nextInt();
    int total=(numb+numb2+numb3+numb4+numb5);
    System.out.println("your total is "+total);
    int average = (total/5);
    System.out.println("your average is "+average);
}
}
