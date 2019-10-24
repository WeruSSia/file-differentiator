package file_differentiator.file_extension;

import java.util.HashSet;

public class Bmp extends FileExtension {
    public Bmp() {
        super("bmp", new HashSet<String>() {{
            add("424D");
        }});
    }
}
