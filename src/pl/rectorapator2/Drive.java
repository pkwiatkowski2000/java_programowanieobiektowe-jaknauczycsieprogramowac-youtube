package pl.rectorapator2;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
