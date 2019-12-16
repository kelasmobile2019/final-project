package id.ac.upnjatim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class HasilKuis2 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis2);

        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView hasil1 = (TextView)findViewById(R.id.hasil1);

        hasil.setText("0");
        hasil1.setText("5");

    }

    public void ulangi (View view){
        finish();
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
