import java.util.Scanner;

public class aFizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        if(num % 5 == 0  ){
            if(num % 3 ==0)
            System.out.println("FizzBuzz");
            else System.out.println("Fizz");
        }
        else if(num % 3 ==0) System.out.println("Buzz");
        else System.out.println(num);

    }

}