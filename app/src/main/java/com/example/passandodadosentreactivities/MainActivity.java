package com.example.passandodadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextIdade;
    private EditText editTextTelefone;
    private EditText editTextEmail;
    private EditText editTextEndereco;
    private Button buttonSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        editTextTelefone = findViewById(R.id.editTextTelefone);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextEndereco = findViewById(R.id.editTextEndereco);
        buttonSalvar = findViewById(R.id.buttonSalvar);

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario usuario = new Usuario(
                        editTextNome.getText().toString(),
                        editTextIdade.getText().toString(),
                        editTextTelefone.getText().toString(),
                        editTextEmail.getText().toString(),
                        editTextEndereco.getText().toString()
                );

                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("usuario", usuario);
                startActivity(intent);
            }
        });
    }
}