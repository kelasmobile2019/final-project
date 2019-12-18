package android.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class Activity_fourth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        ImageView gemballa = findViewById(R.id.gemballa);
        AnimationDrawable animationDrawable = (AnimationDrawable)gemballa.getDrawable();
        animationDrawable.start();

    }
}
