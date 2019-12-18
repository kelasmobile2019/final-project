package com.example.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton androidImageButton3;
    private ImageButton androidImageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidImageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        androidImageButton2 = (ImageButton) findViewById(R.id.imageButton2);

        androidImageButton3.setOnClickListener(new View.OnClickListener()
        {
           public void onClick(View v){
               openLogin();
           }
        });
        androidImageButton2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                openRegistrasi();
            }
        });
    }

    public void openLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void openRegistrasi() {
        Intent intent = new Intent(this, Registrasi.class);
        startActivity(intent);
    }

}
