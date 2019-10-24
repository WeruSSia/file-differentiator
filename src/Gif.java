import java.util.HashSet;
import java.util.Set;

public class Gif extends FileExtension {

    protected Gif(String name, Set<String> magicNumbers) {
        super("gif", new HashSet<String>() {{
            add("474946383761");
            add("474946383961");
        }});
    }
}
