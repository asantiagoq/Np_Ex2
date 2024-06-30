package com.example.exam_p2;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ArrowView arrowView;
    private Button buttonReiniciar, buttonAvanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrowView = findViewById(R.id.arrowView);
        buttonReiniciar = findViewById(R.id.buttonReiniciar);
        buttonAvanzar = findViewById(R.id.buttonAvanzar);

        buttonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrowView.resetArrowCount();
            }
        });

        buttonAvanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrowView.incrementArrowCount();
            }
        });
    }
}
