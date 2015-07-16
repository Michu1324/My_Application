package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

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

    public void onOthersClick(View view) {
        Intent OthersScreenIntent = new Intent(this, CategoryScreen.class);
        //final int result = 1;

        OthersScreenIntent.putExtra("ScreenName", "Others");
        startActivity(OthersScreenIntent);
    }

    public void onMeetUpsClick(View view) {
        Intent MeetUpsScreenIntent = new Intent(this, CategoryScreen.class);
       // final int result = 1;

        MeetUpsScreenIntent.putExtra("ScreenName", "MeetUps");
        startActivity(MeetUpsScreenIntent);
    }

    public void onNightLiveClick(View view) {
        Intent NightLiveScreenIntent = new Intent(this, CategoryScreen.class);
        //final int result = 1;

        NightLiveScreenIntent.putExtra("ScreenName", "NightLive");
        startActivity(NightLiveScreenIntent);
    }

    public void onConcertsClick(View view) {
        Intent ConcertsScreenIntent = new Intent(this, CategoryScreen.class);
        //final int result = 1;

        ConcertsScreenIntent.putExtra("ScreenName", "Concerts");
        startActivity(ConcertsScreenIntent);
    }
}
