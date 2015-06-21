package net.stevemccann.androidportfolio;

import android.content.Context;
import android.support.annotation.StringDef;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

    public void buttonClicked(View view){

        // handling events per code from http://stackoverflow.com/questions/6372104/best-practice-for-defining-button-events-in-android
        Context context = getApplicationContext();

        switch(view.getId()) {
            case R.id.spotifyapp:
                showToast(context.getString(R.string.spotifyapp_toastmsg));
                break;
            case R.id.scoresapp:
                showToast(context.getString(R.string.scoresapp_toastmsg));
                break;
            case R.id.libraryapp:
                showToast(context.getString(R.string.libraryapp_toastmsg));
                break;
            case R.id.buildbiggerapp:
                showToast(context.getString(R.string.buildbiggerapp_toastmsg));
                break;
            case R.id.xyzreaderapp:
                showToast(context.getString(R.string.xyzreaderapp_toastmsg));
                break;
            case R.id.capstoneapp:
                showToast(context.getString(R.string.capstoneapp_toastmsg));
                break;
        }



    }

    private void showToast(String toastText){
        Context context = getApplicationContext();
        CharSequence text = toastText;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
