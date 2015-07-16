package com.example.android.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Piotr on 2015-07-16.
 */
public class CategoryScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_screen_layout);

        Intent parentActivityIntent = getIntent();

        String screenName = parentActivityIntent.getExtras().getString("ScreenName");
        Toast.makeText(this, screenName, Toast.LENGTH_SHORT).show();

        String[] EventNames = {"Event Name 1", "Event Name 2", "Event Name 3", "Event Name 4", "Event Name 5", "Event Name 6", "Event Name 7"
                , "Event Name 8", "Event Name 9", "Event Name 10"};

        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, EventNames);

        ListView list_view = (ListView) findViewById(R.id.ListView_ID);

        list_view.setAdapter(listAdapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String choosedEvent = "Choosed event is: " + String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(CategoryScreen.this, choosedEvent, Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * ************************************************************************************************************************
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}
