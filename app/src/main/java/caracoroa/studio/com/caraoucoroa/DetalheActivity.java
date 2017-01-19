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
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends Activity {


    private ImageView imagem;
    private ImageView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imagem = (ImageView) findViewById(R.id.moedaId);
        voltar = (ImageView) findViewById(R.id.voltaId);
        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            String opcaoEscolhida = extra.getString("opcao");
            if (opcaoEscolhida.equals("cara")) {

                //imagem cara
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));

            } else {
                //imagem coroa
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));

            }
        }
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetalheActivity.this, MainActivity.class));
            }
        });


    }
}
