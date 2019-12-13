package id.ac.upnjatim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        Button btn_quiz_tulisan = findViewById(R.id.btn_quiz_tulisan);
        btn_quiz_tulisan.setOnClickListener(this);

        Button btn_quiz_gambar = findViewById(R.id.btn_quiz_gambar);
        btn_quiz_gambar.setOnClickListener(this);

        Button btn_about = findViewById(R.id.btn_about);
        btn_about.setOnClickListener(this);

        Button btn_exit = findViewById(R.id.btn_exit);
        btn_exit.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_quiz_tulisan:
                Intent moveIntent1 = new Intent(MainActivity.this, KuisActivity.class);
                startActivity(moveIntent1);
                break;

            case R.id.btn_quiz_gambar:
                Intent moveIntent3 = new Intent(MainActivity.this, quiz_gambar.class);
                startActivity(moveIntent3);
                break;

            case R.id.btn_about:
                Intent moveIntent2 = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(moveIntent2);
                break;

            case R.id.btn_exit:
                moveTaskToBack(true);
                finish();
                System.exit(0);
                break;
        }
    }
}
