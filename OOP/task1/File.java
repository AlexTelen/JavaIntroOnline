import java.io.FileNotFoundException;

abstract class File {
    protected String name;
    protected Directory directory;
    protected boolean isExist;
    protected boolean isEmpty;


    protected File() {
    }

    abstract boolean rename(String newFullName);

    protected boolean add() {
        return directory.addFile(this);
    }

    abstract void show() throws FileNotFoundException;
}
