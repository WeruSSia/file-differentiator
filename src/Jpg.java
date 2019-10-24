import java.util.HashSet;
import java.util.Set;

public class Jpg implements FileExtension {
    @Override
    public String getName() {
        return "jpg";
    }

    @Override
    public Set<String> getMagicNumbers() {
        return new HashSet<String>() {{
            add("FFD8FFDB");
            add("FFD8FFE000104A4649460001");
            add("FFD8FFEE");
            add("FFD8FFE1");
        }};
    }
}
