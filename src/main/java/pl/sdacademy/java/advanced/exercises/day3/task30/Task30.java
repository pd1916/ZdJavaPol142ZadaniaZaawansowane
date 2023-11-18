package pl.sdacademy.java.advanced.exercises.day3.task30;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task30 {
    private static final String DIRECTORY_PATH = "src/main/java/pl/sdacademy/java/advanced/exercises/day3/task30";
    private static final String INPUT_FILE_NAME = "zadania.nowe.csv";

    public static void main(String[] args) throws IOException {
        /*
         1. getFileContent
         2. reverseFileContent
         3. reverseFileName
         4. saveFile
         */
        Path dirPath = Path.of(DIRECTORY_PATH);
        Path inputFile = dirPath.resolve(INPUT_FILE_NAME);
        if(!inputFile.toFile().exists()) {
            System.out.println("Plik nie istnieje!");
            return;
        }
        List<String> content = getFileContent(inputFile);
        System.out.println("input: " + content);
        List<String> reversedContent = reverseFileContent(content);
        System.out.println("reversedContent: " + reversedContent);
        Path outputFile = reverseFileName(inputFile);
        System.out.println("outputFile: " + outputFile.toFile().getName());
        boolean result = saveFile(outputFile, reversedContent);
        System.out.println("Result: " + result);
    }

    private static List<String> getFileContent(Path inputFile) throws IOException {
        return Files.readAllLines(inputFile, StandardCharsets.UTF_8);
    }

    private static List<String> reverseFileContent(List<String> content) {
        return content.stream()
                .map(element -> new StringBuilder(element).reverse().toString())
                .toList();
    }

    private static Path reverseFileName(Path inputFile) {
        String fileName = inputFile.toFile().getName();
        /*
        fileName = "zadania.nowe.csv"
        fileExtension = ".txt" / "txt"
        name = "zadania.nowe.csv"
         */
        String fileExtension = "";
        int index = fileName.lastIndexOf(".");
        if(index > 0) { // oznacza to że mamy kropkę
            fileExtension = fileName.substring(index);
            fileName = fileName.substring(0, index);
        }
        String outputFileName = new StringBuilder(fileName)
                .reverse()
                .append(fileExtension)
                .toString();
        return inputFile.getParent().resolve(outputFileName);
    }

    private static boolean saveFile(Path outputFile, List<String> content) {
        try {
            Files.write(outputFile, content, StandardCharsets.UTF_8);
            return true;
        } catch(IOException e) {
            System.out.println("Log: " + e);
            return false;
        }
    }
}
