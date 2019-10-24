package file_differentiator.file_extension;

import java.util.Set;

public abstract class FileExtension {
    private final String name;
    private final Set<String> magicNumbers;

    FileExtension(String name, Set<String> magicNumbers) {
        this.name = name;
        this.magicNumbers = magicNumbers;
    }

    public String getName() {
        return name;
    }

    public boolean doesFileContentMatchExtension(String fileContent) {
        for (String magicNumber : magicNumbers) {
            String fileHeader;
            try {
                fileHeader = fileContent.substring(0, magicNumber.length());
            } catch (IndexOutOfBoundsException e) {
                fileHeader = fileContent;
            }
            if (fileHeader.equals(magicNumber)) {
                return true;
            }
        }
        return false;
    }
}
