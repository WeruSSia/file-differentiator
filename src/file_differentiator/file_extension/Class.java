package file_differentiator.file_extension;

import java.util.HashSet;

public class Class extends FileExtension {
    public Class() {
        super("class", new HashSet<String>() {{
            add("CAFEBABE");
        }});
    }
}
