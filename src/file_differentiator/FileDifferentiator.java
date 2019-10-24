package file_differentiator;

import file_differentiator.file_extension.FileExtension;
import file_differentiator.file_extension.Gif;
import file_differentiator.file_extension.Jpg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class FileDifferentiator {

    private Set<FileExtension> handledExtensions;

    public FileDifferentiator() {
        handledExtensions = new HashSet<FileExtension>() {{
            add(new Jpg());
            add(new Gif());
        }};
    }

    public void differentiate(String filename) {
        byte[] fileContentAsByteArray = readFile(filename);
        String fileContentAsString;
        if (fileContentAsByteArray != null) {
            fileContentAsString = convertByteArrayToHexString(fileContentAsByteArray);
        }
        String inputFileExtension = getFileExtension(filename);
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

    private String getFileExtension(String filename) {
        return filename.substring(filename.lastIndexOf(".") + 1).toLowerCase();
    }

    private boolean isExtensionHandled(String inputFileExtension) {
        return handledExtensions.contains(inputFileExtension);
    }
}
