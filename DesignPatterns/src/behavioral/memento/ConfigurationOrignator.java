package behavioral.memento;

public class ConfigurationOrignator {
    int height;
    int width;
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationOrignator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(this.height,this.width);
    }
    public void restoreMemento(ConfigurationMemento mementoToBeRestored){
        this.height=mementoToBeRestored.height;
        this.width=mementoToBeRestored.width;
    }
}
