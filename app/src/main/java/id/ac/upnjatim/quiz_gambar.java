package id.ac.upnjatim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class quiz_gambar extends AppCompatActivity {

    ImageView gambar_quiz1;
    EditText editText_jawab;
    Button button_cek;

    String jawaban_benar;
    Integer nilai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_gambar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("QuiZ Gambar - 1");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        setInitalisasi();
        onClickJos();
    }

    private void setInitalisasi() {
        //gambar_quiz1 = (ImageView)findViewById(R.id.box_kotak_1);
        editText_jawab = (EditText)findViewById(R.id.jawab_gambar);
        button_cek = (Button)findViewById(R.id.buttonCek);
        jawaban_benar = "MACHINE LEARNING";
    }

    private void onClickJos(){
        nilai = 0;

        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText_jawab.getText().toString().equals(jawaban_benar)){
                    Toast.makeText(quiz_gambar.this,"Yaaaaa Benar!!!",Toast.LENGTH_SHORT).show();

                    nilai = nilai + 1;

                    Intent move_kuis_1 = new Intent(quiz_gambar.this, quiz_gmbr_1.class);
                    startActivity(move_kuis_1);
                }
                else {
                    Toast.makeText(quiz_gambar.this,"Yaaaaa Salah!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



}
