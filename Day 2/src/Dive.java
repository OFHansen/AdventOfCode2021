import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dive {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("src/input.txt");

        System.out.println("Puzzle 1:");
        System.out.println(multiplicationTotal(input));

        System.out.println("Puzzle 2:");
        System.out.println(diveAim(input));
    }

    public static int multiplicationTotal(File input) throws FileNotFoundException {
        int vMovement = 0;
        int hMovement = 0;

        Scanner s = new Scanner(input);
        while (s.hasNextLine())
            switch (s.next()) {
                case "forward":
                    hMovement += s.nextInt();
                    break;
                case "down":
                    vMovement += s.nextInt();
                    break;
                case "up":
                    vMovement -= s.nextInt();
                    break;
            }

        int result = vMovement * hMovement;

        return result;
    }

    public static int diveAim(File input) throws FileNotFoundException {
        int vertical = 0;
        int horizontal = 0;
        int aim = 0;


        Scanner s = new Scanner(input);
        while (s.hasNextLine()) {
            switch (s.next()) {
                case "forward":
                    int forwardTemp = s.nextInt();
                    horizontal += forwardTemp;
                    vertical += forwardTemp * aim;
                    break;
                case "down":
                    aim += s.nextInt();
                    break;
                case "up":
                    aim -= s.nextInt();
                    break;
            }
        }

        s.close();

        return horizontal * vertical;
    }

}

