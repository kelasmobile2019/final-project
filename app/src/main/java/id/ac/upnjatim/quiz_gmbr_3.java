package id.ac.upnjatim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class quiz_gmbr_3 extends AppCompatActivity {

    ImageView gambar_quiz1;
    EditText editText_jawab;
    Button button_cek;

    String jawaban_benar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_gmbr_3);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("QuiZ Gambar - 4");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        setInitalisasi();
        onClickJos();
    }

    private void setInitalisasi() {
        //gambar_quiz1 = (ImageView)findViewById(R.id.box);
        editText_jawab = (EditText)findViewById(R.id.jawab_gambar);
        button_cek = (Button)findViewById(R.id.buttonCek);
        jawaban_benar = "MOUSE KEYBOARD";
    }

    private void onClickJos(){
        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText_jawab.getText().toString().equals(jawaban_benar)){
                    Toast.makeText(quiz_gmbr_3.this,"Yaa Benar!!!",Toast.LENGTH_SHORT).show();

                    Intent move_kuis_1 = new Intent(quiz_gmbr_3.this, quiz_gmbr_4.class);
                    startActivity(move_kuis_1);
                }
                else {
                    Toast.makeText(quiz_gmbr_3.this,"Yaa Salah!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



}
