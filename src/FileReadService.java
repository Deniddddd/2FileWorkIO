import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {
    public String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(FileConstants.BASE_URL + fileName + ".txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                content.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Помилка при читанні з файлу: " + e.getMessage());
        }
        return content.toString();
    }
}
