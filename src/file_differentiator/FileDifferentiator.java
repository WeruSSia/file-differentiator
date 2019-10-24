package file_differentiator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDifferentiator {

    public FileDifferentiator() {

    }

    public void differentiate(String filename) {
        byte[] fileContentAsByteArray = readFile(filename);
        String fileContent;
        if (fileContentAsByteArray != null) {
            fileContent = convertByteArrayToHexString(fileContentAsByteArray);
        }
    }

    private byte[] readFile(String filename) {
        try {
            return Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private String convertByteArrayToHexString(byte[] data) {
        StringBuilder stringHex = new StringBuilder();
        for (byte b : data) {
            stringHex.append(String.format("%02X", b));
        }
        return stringHex.toString();
    }
}
