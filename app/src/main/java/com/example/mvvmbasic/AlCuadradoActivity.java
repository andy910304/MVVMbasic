package com.example.mvvmbasic;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AlCuadradoActivity extends AppCompatActivity {

    private EditText etAlCuadrado;
    private Button btAlCuadrado;
    private TextView tvAlCuadrado;

    private AlCuadradoViewModel alCuadradoViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcuadrado);
        configView();
    }

    private void configView(){
        alCuadradoViewModel = new ViewModelProvider(this).get(AlCuadradoViewModel.class);
        tvAlCuadrado = findViewById(R.id.tvAlCuadrado);
        etAlCuadrado = findViewById(R.id.edAlCuadrado);
        btAlCuadrado = findViewById(R.id.btCalcular);
        btAlCuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alCuadradoViewModel.alCuadrado(etAlCuadrado.getText().toString());
            }
        });

        final Observer<String> listObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable String resultado) {
                tvAlCuadrado.setText(resultado);
            }
        };

        alCuadradoViewModel.getAlCuadrado().observe(this, listObserver);
    }
}