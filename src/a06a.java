import java.util.Scanner;

public class a06a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        String copyNum = numberOne + "";
        String copyNum2 = numberTwo + "";
       // String num = "";

            char currentDigit = copyNum.charAt(0);
            int digitAsInteger = Integer.parseInt(currentDigit + "");

            char currentDigit2 = copyNum2.charAt(0);
            int digitAsInterger2 = Integer.parseInt(currentDigit2 + "");

        char currentDigit1 = copyNum.charAt(1);
        int digitAsInteger1 = Integer.parseInt(currentDigit1 + "");

        char currentDigit21 = copyNum2.charAt(1);
        int digitAsInterger21 = Integer.parseInt(currentDigit21 + "");

        char currentDigitK = copyNum.charAt(2);
        int digitAsIntegerK= Integer.parseInt(currentDigitK + "");

        char currentDigit222 = copyNum2.charAt(2);
        int digitAsInterger222 = Integer.parseInt(currentDigit222 + "");

        char currentDigitL = copyNum.charAt(3);
        int digitAsIntegerL= Integer.parseInt(currentDigitL + "");

        char currentDigit3 = copyNum2.charAt(3);
        int digitAsInterger3 = Integer.parseInt(currentDigit3 + "");


        for (int i = digitAsInteger; i <=digitAsInterger2 ; i++) {
            if (i%2 ==0)continue;

            for (int j = digitAsInteger1; j <= digitAsInterger21 ; j++) {
               if (j %2 == 0)continue;

                for (int k = digitAsIntegerK; k <=digitAsInterger222 ; k++) {
                    if(k%2 ==0)continue;

                    for (int l = digitAsIntegerL; l <=digitAsInterger3 ; l++) {
                        if(l%2 ==0)continue;

                        System.out.print(String.format("%d%d%d%d ", i,j,k,l));

                    }
                }
            }

        }








        }


}

