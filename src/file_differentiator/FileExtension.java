package file_differentiator;

import java.util.Set;

public class FileExtension {
    private final String name;
    private final Set<String> magicNumbers;

    FileExtension(String name, Set<String> magicNumbers) {
        this.name = name;
        this.magicNumbers = magicNumbers;
    }

    public String getName(){
        return name;
    }

    public boolean containsMagicNumber(String magicNumber){
        return magicNumbers.contains(magicNumber);
    }
}
