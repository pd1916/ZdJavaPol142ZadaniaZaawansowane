package pl.sdacademy.java.advanced.exercises.day3.task32;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task32 {
    private static final String DIRECTORY_PATH = "src/main/java/pl/sdacademy/java/advanced/exercises/day3/task32";
    private static final String FILE_NAME = "task32.txt";

    public static void main(String[] args) {
        Path dirPath = Path.of(DIRECTORY_PATH);
        Path inputFile = dirPath.resolve(FILE_NAME);

        List<Car> cars = List.of(
                new Car("Volvo", 300_000, true),
                new Car("BMW", 150_000, false)
        );
        boolean result = save(inputFile.toFile(), cars);
        System.out.println("Result: " + result);
        List<Car> outputFileContent = load(inputFile.toFile());
        System.out.println(outputFileContent);

    }

    private static boolean save(File inputFile, List<Car> content) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(inputFile))){
            oos.writeObject(content);
            return true;
        } catch(IOException e) {
            System.out.println("Log: " + e);
            return false;
        }
    }

    private static List<Car> load(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            return (List<Car>) ois.readObject();
        } catch(IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
