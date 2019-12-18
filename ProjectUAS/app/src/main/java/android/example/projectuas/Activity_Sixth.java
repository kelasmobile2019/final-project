package android.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class Activity_Sixth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__sixth);

        ImageView rwb = findViewById(R.id.rwb);
        AnimationDrawable animationDrawable = (AnimationDrawable)rwb.getDrawable();
        animationDrawable.start();


    }
}
