import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filedetails {
    public static void main(String args[]) throws FileNotFoundException {
        String s;
        Scanner scan = new Scanner(System.in);
        File fl;
        System.out.println("Enter file name : ");
        s = scan.next();
        fl = new File(s + ".txt");
        System.out.println("File Name : " + fl.getName());
        System.out.println("File Length : " + fl.length());
        System.out.println("File path : " + fl.getPath());
        System.out.println("File Hidden ? : " + fl.isHidden());
        System.out.println("File used space : " + fl.getTotalSpace());
        System.out.println("File read permission : " + fl.canRead());
        System.out.println("File write permission : " + fl.canWrite());
        System.out.println("\nContents of the file \n");
        scan = new Scanner(fl);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }
}
