package lesson37.homeWork37.archive;

import lesson37.homeWork37.archive.dao.ArchiveImpl;
import lesson37.homeWork37.archive.model.Document;
import lesson37.homeWork37.archive.model.Menu;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ArchiveApp {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to archive!");
        ArchiveImpl archive = new ArchiveImpl(100);
        LocalDateTime time = LocalDateTime.now();

        while (true) {
            // print menu
            Menu.printMenu();// статический метод вызывается по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute выполнить
            switch (choice) {
                case  1: {
                    scanner.nextLine();
                    System.out.println("Input numeric folder ID: ");
                    int folderId = scanner.nextInt();
                    System.out.println("Input numeric document ID: ");
                    int documentId = scanner.nextInt();
                    scanner.nextLine(); // переход на новую строку и ожидание ввода moving to a new line and waiting for input
                    System.out.println("Input document title: ");
                    String title = scanner.nextLine();
                    System.out.println("Input document url: ");
                    String url = scanner.nextLine();
                    LocalDateTime currTime = LocalDateTime.now();
                    Document document = new Document(folderId, documentId, title, url, currTime);
                    archive.addDocument(document);
                    break;
                }
                case 2: {
                    System.out.println("List of documents in archive: ");
                    archive.viewArchive();
                    break;
                }
                case 3: {
                    System.out.println("<=============================>");
                    System.out.println("Quantity of documents in archive: ");
                    System.out.println(archive.size());
                    System.out.println("<=============================>");
                    break;
                }
                case 4:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}
