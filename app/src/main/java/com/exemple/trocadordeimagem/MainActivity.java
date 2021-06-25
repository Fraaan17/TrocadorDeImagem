package com.exemple.trocadordeimagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgtroca;
    private Button btnShawn;
    private Button btnRhys;
    private Button btnbunda;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       // coisas basicas ja colocadas pelo andoid studio
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       // ligar os atributos com os IDs dos objetos
       // ao gráfico da interface)ome = findViewById(R.id.nome);
        imgtroca = findViewById(R.id.imgtroca);
        btnShawn = findViewById(R.id.btnShawn);
        btnRhys = findViewById(R.id.btnRhys);
        btnbunda = findViewById(R.id.btnBunda);

        EscutadorBotao eb = new EscutadorBotao();
        btnShawn.setOnClickListener(eb);
        btnRhys.setOnClickListener(eb);
        btnbunda.setOnClickListener(eb);


   }

    private class EscutadorBotao implements View.OnClickListener {
        @Override

        public void onClick(View view) {
            Button b = (Button) view;
            switch (b.getId()){
                case R.id.btnShawn:
                    imgtroca.setImageResource(R.drawable.shawn);
                    break;
                case  R.id.btnRhys:
                    imgtroca.setImageResource(R.drawable.rhys);
                    break;
                case R.id.btnBunda:
                    imgtroca.setImageResource(R.drawable.bunda);
                    break;

            }
        }
    }

}