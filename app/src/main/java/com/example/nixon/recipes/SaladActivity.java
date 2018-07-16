package com.example.nixon.recipes;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SaladActivity extends Activity {

    public final static String EXTRA_ID = "saladId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad);
        int id = (int) getIntent().getExtras().get(EXTRA_ID);
        Salad salad = Salad.salads[id];

        TextView foodName = findViewById(R.id.food_name);
        foodName.setText(salad.getName());

        TextView foodDescription = findViewById(R.id.food_description);
        foodDescription.setText(salad.getDescription());

        ImageView foodPhoto = findViewById(R.id.food_photo);
        foodPhoto.setImageResource(salad.getImageResourseId());
        foodPhoto.setContentDescription(salad.getName());
    }
}
