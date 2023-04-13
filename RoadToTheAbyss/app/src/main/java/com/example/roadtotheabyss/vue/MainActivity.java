package com.example.roadtotheabyss.vue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.roadtotheabyss.R;
import com.example.roadtotheabyss.vue.histoire.MenuHistoireActivity;
import com.example.roadtotheabyss.vue.partieRapide.PartieRapideActivity;
import com.example.roadtotheabyss.vue.regles.MenuReglesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ecouteMenu((Button) findViewById(R.id.bHistoire), MenuHistoireActivity.class);
        ecouteMenu((Button) findViewById(R.id.bPartieRapide), PartieRapideActivity.class);
        ecouteMenu((Button) findViewById(R.id.bRegles), MenuReglesActivity.class);
    }

    private void ecouteMenu(Button btn, final Class classe) {
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, classe);
                startActivity(intent);
            }
        });
    }
}