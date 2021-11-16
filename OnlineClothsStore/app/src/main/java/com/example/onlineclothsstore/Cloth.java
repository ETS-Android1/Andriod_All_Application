package com.example.onlineclothsstore;

public class Cloth {
     String name;
     String dsc;
     int id;

  public static Cloth[]cloths={
          new Cloth("Lungi ","The lungi is a type of sarong that originated in the Indian subcontinent, it is a traditional skirt-like lower garment wrapped around the waist, usually below the belly. Apart from India," +
            " lungis are also worn in Sri Lanka, Bangladesh, Pakistan& Nepal.",R.drawable.lungi),
          new Cloth("Sari","A sari, saree or shari is a women's garment from the Indian subcontinent that consists of an unstitched drape varying from 4.5 to 9 metres in length and 600 to 1,200 millimetres in breadth that is typically wrapped around the waist, with one end draped over the shoulder," +
                " baring a portion of the midriff. ",R.drawable.sari),
          new Cloth("Gamucha","A gamucha is a traditional thin, coarse cotton towel, often with a checked design, found in India, Bangladesh, as well as various parts of South and Southeast Asia; it is used to dry the body after bathing or wiping sweat." +
                  " It is often just worn on one side of the shoulder.",R.drawable.gamcha)

    };
//    public static Drink[] drinks = {
//
//            new Drink("Latte", "A coupe expresso shots with steamed milk   ", R.drawable.latte),
//            new Drink("Cappuccino", "Hot milk and steamed milk foam ", R.drawable.cappuccino),
//            new Drink("Filter", "Heights quality beans roasted and brewed fresh ", R.drawable.filter)
//    };



    public Cloth(String name, String dsc, int id) {
        this.name = name;
        this.dsc = dsc;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }
}
