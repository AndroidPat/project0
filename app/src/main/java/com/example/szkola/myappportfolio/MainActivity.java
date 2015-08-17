package com.example.szkola.myappportfolio;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**no settings menu used at this point*/
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    public void showToast(View v){
        //Stop any previous toasts
        if(mAppToast !=null){
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(this,"Clicking this button will lunch "+((Button)v).getText().toString(),Toast.LENGTH_SHORT);
        mAppToast.show();
    }


    public void lunchApps(View v){

        switch(v.getId()){
            case R.id.btnSpStreamer:
                showToast(v);
                break;
            case R.id.btnScores:
                showToast(v);
                break;
            case R.id.btnLibrary:
                showToast(v);
                break;
            case R.id.btnBuildItBigger:
                showToast(v);
                break;
            case R.id.btnXYZ:
                showToast(v);
                break;
            case R.id.btnCapstone:
                showToast(v);
                break;
        }
    }
}
