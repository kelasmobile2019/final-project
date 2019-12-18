package android.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class activity_third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ImageView singer = findViewById(R.id.singer);
        AnimationDrawable animationDrawable = (AnimationDrawable)singer.getDrawable();
        animationDrawable.start();

    }
}
