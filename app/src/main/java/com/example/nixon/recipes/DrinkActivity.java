package com.example.nixon.recipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        int id = (int) getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[id];

        TextView name = findViewById(R.id.drink_name);
        name.setText(drink.getName());

        TextView description = findViewById(R.id.drink_description);
        description.setText(drink.getDescription());
        description.setMovementMethod(new ScrollingMovementMethod());

        ImageView photo = findViewById(R.id.drink_photo);
        photo.setImageResource(drink.getImageResourseId());
        photo.setContentDescription(drink.getName());
    }
}
