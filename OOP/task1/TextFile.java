import java.io.FileNotFoundException;
import java.util.StringJoiner;

public class TextFile extends File {

    private String content;
    private TypeTextFile typeTextFile;

    private TextFile(String name, Directory directory) {
        if (checkName(name)) {
            this.name = name;
            content = "";
            isExist = true;
            isEmpty = true;
        }
    }

    public static TextFile create(String fullName, Directory directory) {
        TextFile textFile = new TextFile(fullName, directory);
        directory.addFile(textFile);
        return textFile;
    }

    @Override
    public boolean rename(String newFullName) {
        if (isExist && checkName(newFullName)) {
            name = newFullName;
            return true;
        }
        System.out.printf("'%s' isn't correct\n", newFullName);
        return false;
    }

    public void add(String string) {
        content += string;
        isEmpty = false;
    }

    @Override
    public void show() throws FileNotFoundException {
        if (directory == null) {
            throw new FileNotFoundException();
        } else if (directory.getFiles().contains(this)) {
            System.out.println(content);
        } else if (!isExist) {
            System.out.println("File isn't exist");
        } else {
            System.out.println("File is empty");
        }
    }

    private boolean checkName(String newName) {
        String[] strTemp = newName.split("\\.");
        if (strTemp.length == 2) {
            for (TypeTextFile t : TypeTextFile.values()) {
                if (t.toString().equalsIgnoreCase(strTemp[1])) {
                    typeTextFile = t;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return new StringJoiner("")
                .add("file = '" + name + "'")
                .toString();
    }
}
