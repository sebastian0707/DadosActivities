package com.example.passandodadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textnome, textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textnome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");

        Usuario usuario = (Usuario) dados.getSerializable("objeto");

        textnome.setText(usuario.getEmail());
        textIdade.setText(String.valueOf(idade));
    }
}