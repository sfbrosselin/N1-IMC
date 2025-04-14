package br.fecap.ads.calculadoraimc.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import br.fecap.ads.calculadoraimc.R;

public class MainActivity extends AppCompatActivity {
    private Button mainAction;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        mainAction = findViewById(R.id.btnMainActivity);
        mainAction.setOnClickListener(view -> {
            goToCalc();
        });

    }

    private void goToCalc(){
        Intent intent = new Intent(this, CalculoIMCActivity.class);
        startActivity(intent);
        finish();
    }

}
