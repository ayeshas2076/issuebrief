import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        String issue = Files.readString(Path.of("issue.txt"));

        System.out.println("=== Original Issue ===");
        System.out.println(issue);
    }
}
