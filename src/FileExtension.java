import java.util.Set;

public abstract class FileExtension {
    private final String name;
    private final Set<String> magicNumbers;

    protected FileExtension(String name, Set<String> magicNumbers) {
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
