package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but=(Button)findViewById(R.id.button);

        but.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                EditText rangetxt=(EditText)findViewById(R.id.editTextTextPersonName);
                TextView result=(TextView)findViewById(R.id.textView);
                int range=Integer.parseInt(rangetxt.getText().toString());
                Random random=new Random();
                int randomNumber=random.nextInt(range-0)+0;
                result.setText(randomNumber+"");
            }

        });

    }

}
