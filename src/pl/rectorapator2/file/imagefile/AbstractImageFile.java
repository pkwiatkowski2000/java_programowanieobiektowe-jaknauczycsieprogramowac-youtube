package pl.rectorapator2.file.imagefile;

import pl.rectorapator2.file.AbstractFile;
import pl.rectorapator2.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
