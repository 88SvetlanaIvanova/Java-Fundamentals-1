import java.util.Scanner;

public class a01905DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p2 =0;
        int p3 =0;
        int p4 =0;
        for (int i = 0; i <n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
             if(number%4 == 0 && number%3 == 0){
                 p4++ ;
                 p2++;

                 p3++;
             }

             else if(number%3 == 0 && number %2 == 0) {
                 p3++;
                 p2++;
             }else if(number % 4==0){
                 p4++;
                 p2++;
             }
             else if(number%3 == 0)p3++;
             else  if (number%2==0)p2++;




        }
        System.out.printf("%.2f%%%n", p2*100.0/n*1.0);
        System.out.printf("%.2f%%%n", p3*100.0/n*1.0);

        System.out.printf("%.2f%%%n", p4*100.0/n*1.0);

    }
}
