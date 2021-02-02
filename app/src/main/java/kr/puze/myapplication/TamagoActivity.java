package kr.puze.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TamagoActivity extends AppCompatActivity {

    private ImageView egg;
    private TextView text;
    public int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamago);

        egg = (ImageView)findViewById(R.id.egg);
        text = (TextView)findViewById(R.id.text);

        egg.setOnClickListener(v -> {
            num++;
            if(num == 100){
                Toast.makeText(getApplicationContext(), "YEAH!", Toast.LENGTH_SHORT).show();
                text.setText("빠밤!");
            } else{
                text.setText(String.valueOf(num));
            }
        });
    }
}