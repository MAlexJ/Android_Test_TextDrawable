package com.example.alex.android_test_textdrawable;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.amulyakhare.textdrawable.TextDrawable;


public class MainActivity extends ActionBarActivity {
    private ImageView imageView_1;
    private ImageView imageView_2;
    private ImageView imageView_3;
    private ImageView imageView_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //https://github.com/amulyakhare/TextDrawable

        // 1. Create simple tile:
        imageView_1 = (ImageView) findViewById(R.id.ivActivityMain_1);
        TextDrawable drawable_1 = TextDrawable.builder().buildRect("A", Color.RED);
        imageView_1.setImageDrawable(drawable_1);

        // 2. Create rounded corner or circular tiles:
        imageView_2 = (ImageView) findViewById(R.id.ivActivityMain_2);
        TextDrawable drawable_2 = TextDrawable.builder().buildRound("B", Color.parseColor("#00BCD4"));
        imageView_2.setImageDrawable(drawable_2);

        // 2. Create rounded corner or circular tiles:
        imageView_3 = (ImageView) findViewById(R.id.ivActivityMain_3);
        TextDrawable drawable_3 = TextDrawable.builder().buildRoundRect("F", Color.parseColor("#ffeb3b"), 20);
        imageView_3.setImageDrawable(drawable_3);

        //Add border
        imageView_4 = (ImageView) findViewById(R.id.ivActivityMain_4);
        TextDrawable drawable_4 = TextDrawable.builder()
                .beginConfig()
                .withBorder(4) /* thickness in px */
                .endConfig().buildRoundRect("D", Color.parseColor("#9c27b0"), 20);
        imageView_4.setImageDrawable(drawable_4);



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
}
