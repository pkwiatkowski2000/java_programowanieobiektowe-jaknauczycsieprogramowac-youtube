package pl.rectorapator2.file;

public abstract class AbstractFile implements File {
    protected String name;
    protected int size;

    public AbstractFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
