import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    public void writeToFile(String fileName, String content) {
        try (FileOutputStream fos = new FileOutputStream(FileConstants.BASE_URL + fileName + ".txt")) {
            fos.write(content.getBytes());
            System.out.println("Файл успішно створено та записано.");
        } catch (IOException e) {
            System.out.println("Помилка при створенні або записі у файл: " + e.getMessage());
        }
    }
}

