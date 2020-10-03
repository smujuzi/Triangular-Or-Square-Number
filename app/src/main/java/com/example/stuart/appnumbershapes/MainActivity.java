package com.example.stuart.appnumbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity {



    public void makeToast(String string)
    {
        Toast.makeText(MainActivity.this, string , Toast.LENGTH_SHORT).show();

    }

    public void click(View view)
    {


        EditText response = (EditText) findViewById(R.id.response);



        String p = response.getText().toString();

        if(p.isEmpty())
        {
            makeToast("Please enter a value");
        }


        int value = Integer.parseInt(p);

        Number input = new Number(value);
        makeToast(input.Square());
        makeToast(input.Triangular());
        makeToast("Try again!");




    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
