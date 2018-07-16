package com.example.nixon.recipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SaladCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad_category);
        ArrayAdapter<Salad> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Salad.salads);
        ListView saladList = findViewById(R.id.salad_list);
        saladList.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SaladCategoryActivity.this, SaladActivity.class);
                intent.putExtra(SaladActivity.EXTRA_ID, i);
                startActivity(intent);
            }
        };
        saladList.setOnItemClickListener(itemClickListener);
    }
}
