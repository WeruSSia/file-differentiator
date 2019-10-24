package file_differentiator.file_extension;

import java.util.HashSet;

public class Png extends FileExtension {
    public Png() {
        super("png", new HashSet<String>() {{
            add("89504E470D0A1A0A");
        }});
    }
}
