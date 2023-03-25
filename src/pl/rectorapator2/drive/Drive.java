package pl.rectorapator2.drive;

import pl.rectorapator2.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
