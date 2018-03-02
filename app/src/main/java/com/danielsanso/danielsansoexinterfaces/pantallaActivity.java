package com.danielsanso.danielsansoexinterfaces;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class pantallaActivity extends AppCompatActivity {
    private DrawerLayout mDrawerlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerlayout = (DrawerLayout) findViewById(R.id.draw);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawermenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.event) {
            Toast t =Toast.makeText(this,"Alumni",Toast.LENGTH_LONG);
            t.show();
            return true;
        }//menu appbar on touch
        else if(id == R.id.activities){
            Toast t =Toast.makeText(this,"Perfil",Toast.LENGTH_LONG);
            t.show();
            return true;

        }
        else if(id == R.id.pc){
            Toast t =Toast.makeText(this,"pc",Toast.LENGTH_LONG);
            t.show();
            return true;

        }
        else if(id == R.id.book){
            Toast t =Toast.makeText(this,"book",Toast.LENGTH_LONG);
            t.show();
            return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
