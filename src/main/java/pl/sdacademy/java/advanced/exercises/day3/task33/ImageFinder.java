package pl.sdacademy.java.advanced.exercises.day3.task33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class ImageFinder {
    public static List<String> findImages(Path directory) {
        try (Stream<Path> walk = Files.walk(directory)){
            return walk
                    .map(Path::toFile)
                    .filter(f -> f.getName().endsWith(".png") || f.getName().endsWith(".jpg"))
                    .map(File::getName)
                    .toList();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
