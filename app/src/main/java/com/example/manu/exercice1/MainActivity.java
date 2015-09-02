package com.example.manu.exercice1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public int mcouleur = Color.RED;
    public void button1click(View view)
    {
        ToggleButton tog1 = (ToggleButton) findViewById(R.id.toggleButton);
        TextView couleurPanel = (TextView) findViewById(R.id.zone_couleur);
        if(tog1.isChecked())
        {
            mcouleur = mcouleur | 0x00FF0000;
        }
        else {
            mcouleur = mcouleur & 0xFF00FFFF;
        }
        couleurPanel.setBackgroundColor(mcouleur);
    }

    public void button2click(View view)
    {
        ToggleButton tog2 = (ToggleButton) findViewById(R.id.toggleButton2);
        TextView couleurPanel = (TextView) findViewById(R.id.zone_couleur);
        if(tog2.isChecked())
        {
            mcouleur = mcouleur | 0x0000FF00;
        }
        else
        {
            mcouleur = mcouleur & 0xFFFF00FF;
        }
        couleurPanel.setBackgroundColor(mcouleur);
    }

    public void button3click(View view)
    {
        ToggleButton tog3 = (ToggleButton) findViewById(R.id.toggleButton3);
        TextView couleurPanel = (TextView) findViewById(R.id.zone_couleur);
        if(tog3.isChecked())
        {
            mcouleur = mcouleur | 0x000000FF;
        }
        else
        {
            mcouleur = mcouleur & 0xFFFFFF00;
        }
        couleurPanel.setBackgroundColor(mcouleur);
    }

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
}
