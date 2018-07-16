package com.example.nixon.recipes;

public class Salad {
    private String name;
    private String description;
    private int imageResourseId;

    private Salad(String name, String description, int imageResourseId) {
        this.name = name;
        this.description = description;
        this.imageResourseId = imageResourseId;
    }

    public static final Salad[] salads = {
            new Salad(MyApplication.getAppContext().getString(R.string.krab), MyApplication.getAppContext().getString(R.string.krab_desc), R.drawable.krab_salat),
            new Salad(MyApplication.getAppContext().getString(R.string.vine), MyApplication.getAppContext().getString(R.string.vine_desc), R.drawable.vinegret)
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
