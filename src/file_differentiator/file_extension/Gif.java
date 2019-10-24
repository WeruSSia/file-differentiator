package file_differentiator.file_extension;

import java.util.HashSet;

public class Gif extends FileExtension {

    public Gif() {
        super("gif", new HashSet<String>() {{
            add("474946383761");
            add("474946383961");
        }});
    }
}
