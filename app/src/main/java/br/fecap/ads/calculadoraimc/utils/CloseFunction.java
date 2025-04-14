package br.fecap.ads.calculadoraimc.utils;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

import br.fecap.ads.calculadoraimc.ui.MainActivity;

public class CloseFunction {

    public static void close(Activity activity, Button button){
        button.setOnClickListener(view -> {
            Intent intent = new Intent(activity, MainActivity.class);
            activity.startActivity(intent);
            activity.finish();
        });
    }

}
