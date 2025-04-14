package br.fecap.ads.calculadoraimc.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import br.fecap.ads.calculadoraimc.R;
import br.fecap.ads.calculadoraimc.utils.CloseFunction;

public class Obesidade2Activity extends AppCompatActivity {

    private Button closeBtn;
    private CloseFunction closeFunction;

    private TextView txtPeso, txtAltura, txtImc, txtClassificacao;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obesidade_2_activity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.obesidade2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        setInformacao();

        closeBtn = findViewById(R.id.button);
        CloseFunction.close(this, closeBtn);

    }

    public void setInformacao(){
        Intent intent = getIntent();
        String peso = intent.getStringExtra(CalculoIMCActivity.extra_peso);
        String altura = intent.getStringExtra(CalculoIMCActivity.extra_altura);
        String imc = intent.getStringExtra(CalculoIMCActivity.extra_imc);
        String classificacao = intent.getStringExtra(CalculoIMCActivity.extra_classificacao);

        txtPeso = findViewById(R.id.pesoNA);
        txtAltura = findViewById(R.id.alturaNA);
        txtImc = findViewById(R.id.imcNA);
        txtClassificacao = findViewById(R.id.classificacao);

        txtClassificacao.setText(classificacao);
        txtPeso.setText("Peso: " + peso + "kg");
        txtAltura.setText("Altura: " + altura + "m");
        txtImc.setText("IMC: " + imc + "kg/m²");
    }


}
