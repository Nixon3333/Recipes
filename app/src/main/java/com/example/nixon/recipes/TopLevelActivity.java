package com.example.nixon.recipes;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                }
                if (i == 1) {
                    Intent intent = new Intent(TopLevelActivity.this, FoodCategoryActivity.class);
                    startActivity(intent);
                }
                if (i == 2) {
                    Intent intent = new Intent(TopLevelActivity.this, SaladCategoryActivity.class);
                    startActivity(intent);
                }

            }
        };

        ListView listView = findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.share_text));
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
                break;
            case R.id.about:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(R.string.about_title)
                        .setMessage(this.getText(R.string.about_text))
                        //.setIcon(R.drawable.ic_android_cat)
                        .setCancelable(false)
                        .setNegativeButton(this.getText(R.string.about_negative_button),
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }




}
