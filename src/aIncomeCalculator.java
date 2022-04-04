import java.text.NumberFormat;
import java.util.Scanner;

public class aIncomeCalculator {
    public static void main(String[] args) {
        final byte MONTH_IN_YEAR =12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Part of husband's salary: ");
        double partYuliSalary = scanner.nextDouble();

        System.out.println("Other money: ");
        double otherThanSalary = scanner.nextDouble();

        final double expencesYoutube = 17;
        final double expencesBabyFood = 32;
        final double expencesNany = 380;
        final double expencesBabyClothes = 200;
        final double expencesPhoneBill = 21;

       //
       // byte years = scanner.nextByte();
       // int numberOfPayments = years * MONTH_IN_YEAR;
        double totalSalary = salary + partYuliSalary + otherThanSalary;
        double totalExpences = expencesBabyClothes + expencesBabyFood + expencesNany + expencesYoutube + expencesPhoneBill;


        double nettSalary = totalSalary-totalExpences;
        String nettSalaryFormated = NumberFormat.getCurrencyInstance().format(nettSalary);
        System.out.println("Nett salary: " + nettSalaryFormated);
    }
}
