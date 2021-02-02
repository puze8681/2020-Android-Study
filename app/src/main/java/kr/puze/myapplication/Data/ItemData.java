package kr.puze.myapplication.Data;

public class ItemData {
    private String image;
    private String name;
    private String description;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemData(String image, String name, String description) {
        this.image = image;
        this.name = name;
        this.description = description;
    }
}
