import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class characterstream {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("InputFile.txt");
            writer = new FileWriter("OutputFile.txt");

            int temp;

            while ((temp = reader.read()) != -1) {
                writer.write(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}