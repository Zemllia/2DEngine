package Engine.Core;

public class GameObject {
    protected String name = "";
    protected String tag = "";
    protected String imagePath = "";

    protected Position position;

    public GameObject(String name, String tag, String imagePath, Position position) {
        this.name = name;
        this.tag = tag;
        this.imagePath = imagePath;
        this.position = position;
    }
}
