package kr.puze.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTitle = findViewById(R.id.text_title_main);

        //textTitle 이 클릭했을때 어떤 동작을 하는지 알려줄려면 그 동작이 들어간 리스너를 textTitle 에게 전달해야함
        //전달하는 방법 -> setOnClickListener -> 그렇기 때문에 이 친구한테 인자로 View.OnClickListener() 인터페이스를 줘야함
        //View.OnClickListener() 이라는 인터페이스는 onClick 이라는 메소드를 반드시 오버라이드 시켜야함
        //onClick 메소드 안에 실제로 클릭 시 동작될 기능을 작성하면 됨

        //Type 1
        View.OnClickListener textTitleListener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("LOGTAG", view.toString());
            }
        };

        textTitle.setOnClickListener(textTitleListener);

        //Type 2
        textTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "토스트 입니당", Toast.LENGTH_LONG).show();
                Log.d("LOGTAG", view.toString());
            }
        });
    }
}