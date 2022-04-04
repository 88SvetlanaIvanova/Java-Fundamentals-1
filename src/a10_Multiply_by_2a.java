import java.util.Scanner;

public class a10_Multiply_by_2a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        while (number>=0){

                System.out.printf("Result: %.2f%n",number*2);

            number = Double.parseDouble(scan.nextLine());
        }
        if(number<0){
            System.out.println("Negative number!");
        }
    }
}
