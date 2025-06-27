import java.io.FileWriter;
import java.io.IOException;

public class LoggerUtil {
    public static void log(String message) {
        System.out.println(message);
        try (FileWriter writer = new FileWriter("logs/sentinel-log.csv", true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to log file.");
        }
    }
}
