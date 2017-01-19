package caracoroa.studio.com.caraoucoroa;
/*
Aplicativo desenvolvido por Maurício Valentim Rodrigues Borges dia 19/01/2017
estudante de Ciência da computação na Faculdade de Jaguariúna.

DESCRIÇÃO: Simples aplicativo onde randomicamente e utilizando um if para sair o resultado.

Desenvolvido durante o Curso Completo do Desenvolvedor Android - Crie 15 Apps (UDEMY)
*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {


    private ImageView botaoJogar;
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botaoJogar = (ImageView) findViewById(R.id.botaoJogarId);


        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //GERAR NUMERO ALEATORIO
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(2);


                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("opcao", opcao[numeroAleatorio]);

                startActivity(intent);

            }
        });

    }
}
