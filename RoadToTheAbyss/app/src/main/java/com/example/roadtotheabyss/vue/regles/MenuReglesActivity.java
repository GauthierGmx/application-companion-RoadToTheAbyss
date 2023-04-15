package com.example.roadtotheabyss.vue.regles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.example.roadtotheabyss.R;
import com.example.roadtotheabyss.vue.MainActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuReglesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_regles);
        ecouteMenu((Button) findViewById(R.id.bCartes), ReglesCartesActivity.class);
        ecouteMenu((Button) findViewById(R.id.bVehicule), ReglesVehiculeActivity.class);
    }

    private void ecouteMenu(Button btn, final Class classe) {
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (MenuReglesActivity.this, classe);
                startActivity(intent);
            }
        });
    }
}