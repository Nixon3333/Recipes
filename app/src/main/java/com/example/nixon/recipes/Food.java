package com.example.nixon.recipes;

public class Food {
    private String name;
    private String description;
    private int imageResourseId;

    private Food(String name, String description, int imageResourseId) {
        this.name = name;
        this.description = description;
        this.imageResourseId = imageResourseId;
    }

    public final static Food[] foods = {
            new Food(MyApplication.getAppContext().getString(R.string.soup), MyApplication.getAppContext().getString(R.string.soup_desc), R.drawable.soup),
            new Food(MyApplication.getAppContext().getString(R.string.potato), MyApplication.getAppContext().getString(R.string.potato_desc), R.drawable.potato),
            new Food(MyApplication.getAppContext().getString(R.string.zucchini), MyApplication.getAppContext().getString(R.string.zucchini_desc), R.drawable.zucchini)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourseId() {
        return imageResourseId;
    }

    @Override
    public String toString() {
        return getName();
    }
}
