package file_differentiator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDifferentiator {

    public FileDifferentiator() {

    }

    public void differentiate(String filename) {
        byte[] fileContentAsByteArray = readFile(filename);
    }

    private byte[] readFile(String filename) {
        try {
            return Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
