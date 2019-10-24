package file_differentiator.file_extension;

import java.util.HashSet;

public class Pdf extends FileExtension {
    public Pdf() {
        super("pdf", new HashSet<String>() {{
            add("255044462d");
        }});
    }
}
