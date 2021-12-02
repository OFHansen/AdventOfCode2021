import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SonarSweep {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> input = new ArrayList<Integer>();
        Scanner s = new Scanner(new File("src/input.txt"));
        while (s.hasNext()) {
            input.add(s.nextInt());
        }
        s.close();

        System.out.println("Puzzle 1:");
        System.out.println(largerMeasurements(input));

        System.out.println("Puzzle 2:");
        System.out.println(threeMeasurementWindow(input));
    }

    public static int largerMeasurements(ArrayList<Integer> input){
        int count = 0;
        int prev = 0;

        for (int i : input) {
            if (i > prev){
                count++;
            }
            prev = i;
        }
        return count-1;
    }

    public static int threeMeasurementWindow(ArrayList<Integer> input) {
        int count = 0;
        int sum = 0;
        int prevSum = 0;

        for (int i = 0; i < input.size(); i++) {
            if (i + 2 == input.size()) {
                break;
            }

            sum = input.get(i) + input.get(i + 1) + input.get(i + 2);
            if (sum > prevSum) {
                count++;
            }

            prevSum = sum;
        }
        return count - 1;
    }
}

