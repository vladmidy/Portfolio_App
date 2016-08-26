package com.ciscoedge.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage(View view){

        Button btnPopularMovies = (Button) findViewById(R.id.button7);
        Button btnStockHawk = (Button) findViewById(R.id.button2);
        Button btnBuiltItBetter = (Button) findViewById(R.id.button);
        Button btnMakeYourAppMaterial = (Button) findViewById(R.id.button6);
        Button btnGoUbiquitous = (Button) findViewById(R.id.button5);
        Button btnCapstone = (Button) findViewById(R.id.button4);

        Toast toast= null;

        if(btnPopularMovies.isPressed()) toast = Toast.makeText(getApplicationContext(), "This button will launch my " + btnPopularMovies.getText().toString().toLowerCase() + " app!" , Toast.LENGTH_SHORT);
        else if(btnStockHawk.isPressed()) toast = Toast.makeText(getApplicationContext(), "This button will launch my " + btnStockHawk.getText().toString().toLowerCase() + " app!", Toast.LENGTH_SHORT);
        else if(btnBuiltItBetter.isPressed()) toast = Toast.makeText(getApplicationContext(), "This button will launch my " + btnBuiltItBetter.getText().toString().toLowerCase() + " app!", Toast.LENGTH_SHORT);
        else if(btnMakeYourAppMaterial.isPressed()) toast = Toast.makeText(getApplicationContext(), "This button will launch my " + btnMakeYourAppMaterial.getText().toString().toLowerCase() + " app!", Toast.LENGTH_SHORT);
        else if(btnGoUbiquitous.isPressed()) toast = Toast.makeText(getApplicationContext(), "This button will launch my " + btnGoUbiquitous.getText().toString().toLowerCase() + " app!", Toast.LENGTH_SHORT);
        else if(btnCapstone.isPressed()) toast = Toast.makeText(getApplicationContext(), "This button will launch my " + btnCapstone.getText().toString().toLowerCase() + " app!", Toast.LENGTH_SHORT);

        if(toast != null) {
            toast.show();
        }
    }
}
