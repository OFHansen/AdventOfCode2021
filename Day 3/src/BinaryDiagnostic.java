import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BinaryDiagnostic {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> input = new ArrayList<String>();
        Scanner s = new Scanner(new File("src/input.txt"));
        while (s.hasNext()) {
            input.add(s.next());
        }
        s.close();

    }

    public static int powerConsumption (ArrayList<String> input) {
        int gamma = 0;
        int epsilon = 0;
        int column1 = 0;


        for (int i = 0; i < 12; i++){

        }


        return gamma * epsilon;
    }
}
