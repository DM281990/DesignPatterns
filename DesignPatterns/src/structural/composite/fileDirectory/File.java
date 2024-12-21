package structural.composite.fileDirectory;

public class File extends Directory{
    public File(String name) {
        super(name);
    }

    public void ls(){
        System.out.println("File Name :"+directoryName);
    }
}
