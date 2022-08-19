package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView T1 = findViewById(R.id.T1);
        TextView T2 = findViewById(R.id.T2);
        EditText nametxt = findViewById(R.id.PT1);
        EditText agetxt = findViewById(R.id.PT2);
        ImageView IMG1 = findViewById(R.id.IMG1);
        CardView C1 = findViewById(R.id.C1);
        CardView C2 = findViewById(R.id.C4);
        Button B1 = findViewById(R.id.B1);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(agetxt.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "تأكد من ملئ الفراغات", Toast.LENGTH_SHORT).show();
                }
                else if(nametxt.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "تأكد من ملئ الفراغات", Toast.LENGTH_SHORT).show();
                }

                else{

                    String clintname = nametxt.getText().toString();
                    int clintage = Integer.parseInt(agetxt.getText().toString());
                    Intent androidstan = new Intent(MainActivity.this, Main2.class );


                    androidstan.putExtra("name", clintname);
                    androidstan.putExtra("age", clintage);
                    startActivity(androidstan);
                }

            }
        });

    }
}