package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView T1 = findViewById(R.id.T3);
        TextView T2 = findViewById(R.id.T4);
        TextView cardname = findViewById(R.id.T5);
        TextView T4 = findViewById(R.id.T6);
        TextView cardage = findViewById(R.id.T7);
        TextView T6 = findViewById(R.id.textView4);
        ImageView IMG2 = findViewById(R.id.IMG2);
        CardView C2 = findViewById(R.id.C2);
        CardView C3 = findViewById(R.id.C3);

        Bundle act1 = getIntent().getExtras();

        String crdname = act1.getString("name");
        cardname.setText(crdname);

        int crdage = act1.getInt("age");
        cardage.setText(String.valueOf(crdage));

    }
}