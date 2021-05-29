package cn.edu.nuc.work.work_1;

public class Commodity {
    private int id;
    private String name;
    private String quality;
    private String price;

    public Commodity(int id, String name, String quality, String price) {
        this.id = id;
        this.name = name;
        this.quality = quality;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getQuality() {
        return quality;
    }

    public String getPrice() {
        return price;
    }
}
