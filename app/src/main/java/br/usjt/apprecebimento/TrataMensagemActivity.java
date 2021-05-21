package br.usjt.apprecebimento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class TrataMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trata_mensagem);

        Intent intent = getIntent();

        String mensagemRecebida = intent.getStringExtra(Intent.EXTRA_TEXT);

        Toast.makeText(this,"Mensagem recebida: "+mensagemRecebida,Toast.LENGTH_LONG).show();
    }
}