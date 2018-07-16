package com.example.nixon.recipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);
        ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Food.foods);
        ListView foodList = findViewById(R.id.food_list);
        foodList.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(FoodCategoryActivity.this, FoodActivity.class);
                intent.putExtra(FoodActivity.EXTRA_ID, i);
                startActivity(intent);
            }
        };
        foodList.setOnItemClickListener(itemClickListener);
    }
}
