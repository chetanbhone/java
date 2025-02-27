
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Java45 {

    public static void main(String[] args) {
        Path path = Path.of("input.txt");
        String content = "CHETAN IS HERE";

        writeFile(path, content);

        try {
            readFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(Path path, String s) {
        try {
            Files.write(path, s.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);
        for (String str : lines) {
            System.out.println(str);
        }

    }

}
