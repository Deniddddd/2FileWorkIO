import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriteService fileWriteService = new FileWriteService();
        FileReadService fileReadService = new FileReadService();

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Створити та записати");
            System.out.println("2. Читати");
            System.out.println("0. Вийти");
            System.out.print("Виберіть опцію: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введіть назву файлу (без розширення): ");
                    String fileNameToWrite = scanner.nextLine();
                    System.out.print("Введіть текстовий контент для запису: ");
                    String contentToWrite = scanner.nextLine();
                    fileWriteService.writeToFile(fileNameToWrite, contentToWrite);
                    break;
                case 2:
                    System.out.print("Введіть назву файлу (без розширення): ");
                    String fileNameToRead = scanner.nextLine();
                    String contentRead = fileReadService.readFromFile(fileNameToRead);
                    System.out.println("Зміст файлу:");
                    System.out.println(contentRead);
                    break;
                case 0:
                    System.out.println("Програма завершує роботу.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }
}
