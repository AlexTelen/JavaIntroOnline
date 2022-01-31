import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Directory {
    private List<File> files;
    private String strPath;
    private static final String CHECK_PATH = "([a-zA-Z]{1})[(:\\\\){1}([0-9a-zA-Zа-яА-Я_ [^+\\.\\,\\*\\\\\\/]]*)(\\\\*)]*\\z";
    private Pattern pattern = Pattern.compile(CHECK_PATH);

    public Directory(String strPath) {
        setStrPath(strPath);
        files = new ArrayList<>();
    }

    public String getStrPath() {
        return strPath;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setStrPath(String strPath) {
        if (isDirectory(strPath)) {
            this.strPath = strPath;
        } else {
            System.out.println("Directory is't correct. Please set directory!");
        }
        this.strPath = strPath;
    }

    public boolean addFile(File file) {
        if (!files.contains(file)) {
            files.add(file);
            file.directory = this;
            return true;
        }
        return false;
    }

    public boolean deleteFile(File file) {
        if (files.contains(file)) {
            files.remove(file);
            file.isExist = false;
            file.directory = null;
            return true;
        }
        return false;
    }

    private boolean isDirectory(String str) {
        return pattern.matcher(str).matches();
    }
}
