package file_differentiator.file_extension;

import java.util.HashSet;

public class Rar extends FileExtension {
    public Rar() {
        super("rar", new HashSet<String>() {{
            add("526172211A0700");
            add("526172211A070100");
        }});
    }
}
