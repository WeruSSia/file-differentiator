package file_differentiator.file_extension;

import java.util.HashSet;

public class Exe extends FileExtension {
    public Exe() {
        super("exe", new HashSet<String>() {{
            add("4D5A");
        }});
    }
}
