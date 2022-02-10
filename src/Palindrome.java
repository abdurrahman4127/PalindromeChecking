import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int rem, rev = 0, mainNum;
        mainNum = n; // copying n

        while(n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if(mainNum == rev)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
