package com.example.nixon.recipes;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
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

        TextView foodName = findViewById(R.id.salad_name);
        foodName.setText(salad.getName());

        TextView description = findViewById(R.id.salad_description);
        description.setText(salad.getDescription());
        description.setMovementMethod(new ScrollingMovementMethod());

        ImageView foodPhoto = findViewById(R.id.salad_photo);
        foodPhoto.setImageResource(salad.getImageResourseId());
        foodPhoto.setContentDescription(salad.getName());
    }
}
