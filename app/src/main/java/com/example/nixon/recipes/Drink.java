package com.example.nixon.recipes;

public class Drink {
    private String name;
    private String description;
    private int imageResourseId;

    private Drink(String name, String description, int imageResourseId) {
        this.name = name;
        this.description = description;
        this.imageResourseId = imageResourseId;
    }

    public static final Drink[] drinks = {
            new Drink(MyApplication.getAppContext().getString(R.string.limonade), MyApplication.getAppContext().getString(R.string.limonade_desc), R.drawable.limonade),
            new Drink(MyApplication.getAppContext().getString(R.string.choko), MyApplication.getAppContext().getString(R.string.choko_desc), R.drawable.hot_choko),
            new Drink(MyApplication.getAppContext().getString(R.string.fruit), MyApplication.getAppContext().getString(R.string.fruit_desc), R.drawable.fruit)
    };

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

    public int getImageResourseId() {
        return imageResourseId;
    }

    public void setImageResourseId(int imageResourseId) {
        this.imageResourseId = imageResourseId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
