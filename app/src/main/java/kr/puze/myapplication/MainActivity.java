package kr.puze.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    enum Operation{
        MINUS, PLUS, MULTIPLE, DIVIDE
    }

    int num1;
    int num2;
    Operation operation;
    boolean isOperated = false;

    //코드에서 사용할 뷰 선언

    TextView text_result_main;
    TextView button_c_main;
    TextView button_pm_main;
    TextView button_hundred_main;
    TextView button_divide_main;
    TextView button_multiple_main;
    TextView button_minus_main;
    TextView button_add_main;
    TextView button_dot_main;
    TextView button_result_main;
    TextView button_0_main;
    TextView button_1_main;
    TextView button_2_main;
    TextView button_3_main;
    TextView button_4_main;
    TextView button_5_main;
    TextView button_6_main;
    TextView button_7_main;
    TextView button_8_main;
    TextView button_9_main;
    ImageView button_backspace_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //코드에서 사용할 뷰와 xml 의 레이아웃 아이디를 연결
        text_result_main = (TextView)findViewById(R.id.text_result_main);
        button_c_main = (TextView)findViewById(R.id.button_c_main);
        button_pm_main = (TextView)findViewById(R.id.button_pm_main);
        button_hundred_main = (TextView)findViewById(R.id.button_hundred_main);
        button_divide_main = (TextView)findViewById(R.id.button_divide_main);
        button_multiple_main = (TextView)findViewById(R.id.button_multiple_main);
        button_minus_main = (TextView)findViewById(R.id.button_minus_main);
        button_add_main = (TextView)findViewById(R.id.button_add_main);
        button_dot_main = (TextView)findViewById(R.id.button_dot_main);
        button_result_main = (TextView)findViewById(R.id.button_result_main);
        button_0_main = (TextView)findViewById(R.id.button_0_main);
        button_1_main = (TextView)findViewById(R.id.button_1_main);
        button_2_main = (TextView)findViewById(R.id.button_2_main);
        button_3_main = (TextView)findViewById(R.id.button_3_main);
        button_4_main = (TextView)findViewById(R.id.button_4_main);
        button_5_main = (TextView)findViewById(R.id.button_5_main);
        button_6_main = (TextView)findViewById(R.id.button_6_main);
        button_7_main = (TextView)findViewById(R.id.button_7_main);
        button_8_main = (TextView)findViewById(R.id.button_8_main);
        button_9_main = (TextView)findViewById(R.id.button_9_main);
        button_backspace_main = (ImageView)findViewById(R.id.button_backspace_main);

        //코드에서 사용할 뷰에 setOnClickListener 을 통해 리스너 등록
        button_0_main.setOnClickListener(view -> { numButton(0); });
        button_1_main.setOnClickListener(view -> { numButton(1); });
        button_2_main.setOnClickListener(view -> { numButton(2); });
        button_3_main.setOnClickListener(view -> { numButton(3); });
        button_4_main.setOnClickListener(view -> { numButton(4); });
        button_5_main.setOnClickListener(view -> { numButton(5); });
        button_6_main.setOnClickListener(view -> { numButton(6); });
        button_7_main.setOnClickListener(view -> { numButton(7); });
        button_8_main.setOnClickListener(view -> { numButton(8); });
        button_9_main.setOnClickListener(view -> { numButton(9); });

        button_c_main.setOnClickListener(view -> {
            //숫자가 0으로 초기화 된다
        });
        button_pm_main.setOnClickListener(view -> {});
        button_hundred_main.setOnClickListener(view -> {});
        button_dot_main.setOnClickListener(view -> {});
        button_backspace_main.setOnClickListener(view -> { });
        button_divide_main.setOnClickListener(view -> { operateButton(Operation.DIVIDE); });
        button_multiple_main.setOnClickListener(view -> { operateButton(Operation.MULTIPLE); });
        button_minus_main.setOnClickListener(view -> {  operateButton(Operation.MINUS); });
        button_add_main.setOnClickListener(view -> { operateButton(Operation.PLUS); });
        button_result_main.setOnClickListener(view -> { result(); });
    }

    private void numButton(int num){
        if(isOperated){
            text_result_main.setText(String.valueOf(num));
        }else{
            String result = text_result_main.getText().toString();
            result += String.valueOf(num);
            text_result_main.setText(result);
        }
        isOperated = false;
    }

    private void operateButton(Operation operate){
        operation = operate;
        isOperated = true;
    }

    private void result(){
        switch (operation){
            case PLUS:
                num1 += num2;
                text_result_main.setText(String.valueOf(num1));
                break;
            case MINUS:
                num1 -= num2;
                text_result_main.setText(String.valueOf(num1));
                break;
            case MULTIPLE:
                num1 *= num2;
                text_result_main.setText(String.valueOf(num1));
                break;
            case DIVIDE:
                num1 /= num2;
                text_result_main.setText(String.valueOf(num1));
                break;
        }
    }
}