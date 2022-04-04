import java.io.OutputStream;
import java.util.Scanner;

public class a0704TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numGroups = Integer.parseInt(scanner.nextLine());
        int musala5 = 0;
        int montblan6_12 =0;
        int kilimanjaro13_25 =0;
        int k2_26_40 =0;
        int everest41 =0;
        double allFellas =0;
        for (int i = 0; i <numGroups ; i++) {
            int groupSize = Integer.parseInt(scanner.nextLine());
            allFellas+=groupSize;
            if(groupSize <= 5) musala5+=groupSize;
            else if(groupSize >=6 && groupSize <= 12) montblan6_12 += groupSize;
            else if(groupSize >=13 && groupSize <= 25) kilimanjaro13_25 += groupSize;
            else if(groupSize >=26 && groupSize <= 40) k2_26_40 += groupSize;
            else if(groupSize >= 41) everest41 += groupSize;
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n",musala5/allFellas*100,montblan6_12/allFellas*100, kilimanjaro13_25/allFellas*100,
                k2_26_40/allFellas*100, everest41/allFellas*100);
    }
}
