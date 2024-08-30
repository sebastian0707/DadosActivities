package com.example.passandodadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textViewNome;
    private TextView textViewIdade;
    private TextView textViewTelefone;
    private TextView textViewEmail;
    private TextView textViewEndereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textViewNome = findViewById(R.id.textViewNome);
        textViewIdade = findViewById(R.id.textViewIdade);
        textViewTelefone = findViewById(R.id.textViewTelefone);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewEndereco = findViewById(R.id.textViewEndereco);

        Bundle dados = getIntent().getExtras();

        Usuario usuario = (Usuario) dados.getSerializable("usuario");

        if (usuario != null) {
            textViewNome.setText("Nome: " + usuario.getNome());
            textViewIdade.setText("Idade: " + usuario.getIdade());
            textViewTelefone.setText("Telefone: " + usuario.getTelefone());
            textViewEmail.setText("E-mail: " + usuario.getEmail());
            textViewEndereco.setText("Endereço: " + usuario.getEndereco());
        }
    }
}