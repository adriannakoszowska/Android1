package com.example.adriannakoszowska.android1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // wczytanie obiektów
        TextView poprzednie=(TextView)findViewById(R.id.poprzednie);
        TextView dzialanie=(TextView)findViewById(R.id.dzialanie);
        // ustawienie tekstu na obiektach
        poprzednie.setText("");
        dzialanie.setText("");
    }

    public void buttonNumeric(View view) {
        int value=0;
        TextView dzialanie=(TextView)findViewById(R.id.dzialanie);

        switch (view.getId()) {
            case R.id.button0:
                value = 0;
                break;
            case R.id.button1:
                value = 1;
                break;
            case R.id.button2:
                value = 2;
                break;
            case R.id.button3:
                value = 3;
                break;
            case R.id.button4:
                value = 4;
                break;
            case R.id.button5:
                value = 5;
                break;
            case R.id.button6:
                value = 6;
                break;
            case R.id.button7:
                value = 7;
                break;
            case R.id.button8:
                value = 8;
                break;
            case R.id.button9:
                value = 9;
                break;
        }
        dzialanie.setText(dzialanie.getText() + "" + value);

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
