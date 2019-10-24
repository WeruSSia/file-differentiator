import java.util.HashSet;
import java.util.Set;

public class Gif implements FileExtension {
    @Override
    public String getName() {
        return "gif";
    }

    @Override
    public Set<String> getMagicNumbers() {
        return new HashSet<String>() {{
            add("474946383761");
            add("474946383961");
        }};
    }
}
