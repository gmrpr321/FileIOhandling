import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineNumber {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.println("Enter file name");
        s = scan.next();
        scan = new Scanner(new File(s + ".txt"));
        int count = 0;
        while (scan.hasNextLine()) {
            System.out.println(++count + " . " + scan.nextLine());
        }
    }
}