package com.example.nixon.recipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends Activity {

    public final static String EXTRA_ID = "foodId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        int id = (int) getIntent().getExtras().get(EXTRA_ID);
        Food food = Food.foods[id];

        TextView foodName = findViewById(R.id.food_name);
        foodName.setText(food.getName());

        TextView foodDescription = findViewById(R.id.food_description);
        foodDescription.setText(food.getDescription());
        foodDescription.setMovementMethod(new ScrollingMovementMethod());

        ImageView foodPhoto = findViewById(R.id.food_photo);
        foodPhoto.setImageResource(food.getImageResourseId());
        foodPhoto.setContentDescription(food.getName());
    }
}
