package com.example.roadtotheabyss.vue.histoire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.example.roadtotheabyss.R;
import com.example.roadtotheabyss.vue.MainActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuHistoireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_histoire);
        ecouteMenu((Button) findViewById(R.id.bConfirmationHistoire), EnJeuHistoireActivity.class);
    }

    private void ecouteMenu(Button btn, final Class classe) {
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (MenuHistoireActivity.this, classe);
                startActivity(intent);
            }
        });
    }
}