import java.io.File;
import java.time.LocalDateTime;

public class FileWatcher {
    public static void monitorSensitiveFiles() {
        String[] sensitiveFiles = {
            System.getProperty("user.home") + "/Documents/important.txt",
            System.getProperty("user.home") + "/Desktop/confidential.txt"
        };

        for (String filePath : sensitiveFiles) {
            File file = new File(filePath);
            if (file.exists() && file.canRead()) {
                LoggerUtil.log("ALERT: Sensitive file accessed - " + filePath + " at " + LocalDateTime.now());
            }
        }
    }
}
