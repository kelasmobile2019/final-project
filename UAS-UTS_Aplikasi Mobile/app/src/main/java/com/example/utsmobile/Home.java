package com.example.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    private ImageButton androidImageButton1;
    private ImageButton androidImageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        androidImageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        androidImageButton2 = (ImageButton) findViewById(R.id.imageButton2);

        androidImageButton1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                openPrint();
            }
        });
        androidImageButton2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                openProfil();
            }
        });
    }

    public void openPrint() {
        Intent intent = new Intent(this, Print.class);
        startActivity(intent);
    }
    public void openProfil() {
        Intent intent = new Intent(this, Profil.class);
        startActivity(intent);
    }
}
