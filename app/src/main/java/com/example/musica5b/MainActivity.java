package com.example.musica5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnInserisci;
    EditText txtInserisci;
    GestoreBrani gb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInserisci = findViewById(R.id.btnInserisci);
        txtInserisci = findViewById(R.id.txtInserisci);

        gb = new GestoreBrani();

        btnInserisci.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gb.addBrano();
                    }
                }
        );
    }
}