package file_differentiator.file_extension;

import java.util.HashSet;

public class Jpg extends FileExtension {

    public Jpg() {
        super("jpg", new HashSet<String>() {{
            add("FFD8FFDB");
            add("FFD8FFE000104A4649460001");
            add("FFD8FFEE");
            add("FFD8FFE1");
        }});
    }
}
