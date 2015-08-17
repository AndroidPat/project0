package com.example.szkola.myappportfolio;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

    public void lunchApps(View v){
        switch(v.getId()){
            case R.id.btnSpStreamer:
                Toast.makeText(getApplicationContext(), "Clicking this button will lunch the Spotify Streamer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnScores:
                Toast.makeText(getApplicationContext(), "Clicking this button will lunch the Scores App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnLibrary:
                Toast.makeText(getApplicationContext(), "Clicking this button will lunch the Library App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBuildItBigger:
                Toast.makeText(getApplicationContext(), "Clicking this button will lunch the Build It Bigger App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnXYZ:
                Toast.makeText(getApplicationContext(), "Clicking this button will lunch the XYZ Reader App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCapstone:
                Toast.makeText(getApplicationContext(), "Clicking this button will lunch my own app", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
