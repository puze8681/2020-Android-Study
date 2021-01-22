package kr.puze.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btnC;
    Button btnMC;
    Button btnMR;
    Button btnMPlus;
    Button btnPlusMinus;
    Button btnPercent;
    Button btnDivision;
    Button btnMultiply;
    Button btnMinus;
    Button btnPlus;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn0;
    Button btnDot;
    Button btnEqual;
    Button btnX;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnC = (Button) findViewById(R.id.btnC);
        btnMC = (Button) findViewById(R.id.btnMC);
        btnMR = (Button) findViewById(R.id.btnMR);
        btnMPlus = (Button) findViewById(R.id.btnM);
        btnPlusMinus = (Button) findViewById(R.id.btnPlusMinus);
        btnPercent = (Button) findViewById(R.id.btnPercent);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnX = (Button) findViewById(R.id.btnX);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnPlus = (Button) findViewById(R.id.btnPlus);

        btn0.setOnClickListener(view -> {});
        btn1.setOnClickListener(view -> {});
        btn2.setOnClickListener(view -> {});
        btn3.setOnClickListener(view -> {});
        btn4.setOnClickListener(view -> {});
        btn5.setOnClickListener(view -> {});
        btn6.setOnClickListener(view -> {});
        btn7.setOnClickListener(view -> {});
        btn8.setOnClickListener(view -> {});
        btn9.setOnClickListener(view -> {});

        btnC.setOnClickListener(view -> {});
        btnMC.setOnClickListener(view -> {});
        btnMR.setOnClickListener(view -> {});
        btnMPlus.setOnClickListener(view -> {});
        btnX.setOnClickListener(view -> {});
        btnPlusMinus.setOnClickListener(view -> {});
        btnPercent.setOnClickListener(view -> {});
        btnDivision.setOnClickListener(view -> {});
        btnMultiply.setOnClickListener(view -> {});
        btnPlus.setOnClickListener(view -> {});
        btnMinus.setOnClickListener(view -> {});
        btnEqual.setOnClickListener(view -> {});
        btnDot.setOnClickListener(view -> {});
    }
}