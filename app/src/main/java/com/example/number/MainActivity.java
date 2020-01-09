package com.example.number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btnclear;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn10 = (Button)findViewById(R.id.btn10);
        btn11 = (Button)findViewById(R.id.btn11);
        btnclear = (Button)findViewById(R.id.btnclear);

        btn0.setOnClickListener(btnListener);
        btn1.setOnClickListener(btnListener);
        btn2.setOnClickListener(btnListener);
        btn3.setOnClickListener(btnListener);
        btn4.setOnClickListener(btnListener);
        btn5.setOnClickListener(btnListener);
        btn6.setOnClickListener(btnListener);
        btn7.setOnClickListener(btnListener);
        btn8.setOnClickListener(btnListener);
        btn9.setOnClickListener(btnListener);
        btn10.setOnClickListener(btnListener);
        btn11.setOnClickListener(btnListener);
        btnclear.setOnClickListener(btnListener);
    }
    private  Button.OnClickListener btnListener = new Button.OnClickListener(){

        @Override
        public void onClick(View view) {
            String s = tv.getText().toString();
            switch (view.getId()){
                case R.id.btn0:{
                    tv.setText(s+"0");
                    break;
                }
                case R.id.btn1:{
                    tv.setText(s+"1");
                    break;
                }
                case R.id.btn2:{
                    tv.setText(s+"2");
                    break;
                }
                case R.id.btn3:{
                    tv.setText(s+"3");
                    break;
                }
                case R.id.btn4:{
                    tv.setText(s+"4");
                    break;
                }
                case R.id.btn5:{
                    tv.setText(s+"5");
                    break;
                }
                case R.id.btn6:{
                    tv.setText(s+"6");
                    break;
                }
                case R.id.btn7:{
                    tv.setText(s+"7");
                    break;
                }
                case R.id.btn8:{
                    tv.setText(s+"8");
                    break;
                }
                case R.id.btn9:{
                    tv.setText(s+"9");
                    break;
                }
                case R.id.btn10:{
                    tv.setText(s+"*");
                    break;
                }
                case R.id.btn11:{
                    tv.setText(s+"#");
                    break;
                }
                case R.id.btnclear:{
                    tv.setText("");
                    break;
                }
            }
        }
    };
}
