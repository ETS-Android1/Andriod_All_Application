package com.example.nsubucks;
public class Drink {
    private int id;
    private String name;
    private String information;
    private  int price;
    private  int ImgId;
public Drink(){

}

    public  Drink(int id,String name, String information,  int price, int imgId) {
        this.id = id;
        this.name = name;
        this.information = information;
        this.price = price;
        ImgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImgId() {
        return ImgId;
    }

    public void setImgId(int imgId) {
        ImgId = imgId;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", information='" + information + '\'' +
                ", price=" + price +
                ", ImgId=" + ImgId +
                '}';
    }
}
