package pl.rectorapator2.file;

public interface File {
    String getName();
    int getSize();
    FileType getType();

    default int getVersion() {
        return 1;
    }
}
