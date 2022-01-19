package com.astrosia.factorialcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editnum;
    TextView result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editnum  = (EditText) findViewById(R.id.editTextNumber);
        result = (TextView) findViewById(R.id.textView2);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String value= editnum.getText().toString();
                int finalValue=Integer.parseInt(value);
                int r=fact(finalValue);
                result.setText("Factorial Answer="+r);
            }
        });

    }

    int fact(int x)
    {
        int k=1;

        for (int i=1;i<=x;i++)
        {
            k=k*i;
        }

        return k;
    }
    /*public void buttonClick(View v)
    {
        String value= editnum.getText().toString();
        int finalValue=Integer.parseInt(value);
        int r=fact(finalValue);
        result.setText("Factorial Answer="+r);
    }*/

}