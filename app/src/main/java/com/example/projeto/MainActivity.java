package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    TextView txtContador;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtContador = findViewById(R.id.cont);
    }
    public void zeraContador(View view) {
        num = 0;
        setaValor();
    }

    public void somarUm(View view) {
        num++;
        setaValor();

    }

    public void subtraiUm(View view) {
        num = num - 1;
        setaValor();
    }



    private void setaValor() {
        txtContador.setText(Integer.toString(num));
    }
}