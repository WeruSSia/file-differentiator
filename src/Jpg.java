import java.util.HashSet;
import java.util.Set;

public class Jpg extends FileExtension {

    protected Jpg(String name, Set<String> magicNumbers) {
        super("jpg", new HashSet<String>() {{
            add("FFD8FFDB");
            add("FFD8FFE000104A4649460001");
            add("FFD8FFEE");
            add("FFD8FFE1");
        }});
    }
}
