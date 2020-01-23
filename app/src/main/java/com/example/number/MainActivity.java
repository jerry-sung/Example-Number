package com.example.number;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btnclear,btnend;
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
        btnend = (Button)findViewById(R.id.btnend);

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
        btnend.setOnClickListener(btnListener);
    }
    private  Button.OnClickListener btnListener = new Button.OnClickListener(){

        @Override
        public void onClick(View view) {
            String s = tv.getText().toString();
            switch (view.getId()){
                case R.id.btn0:{
                    tv.setText(s+"0");
                    Toast toast=Toast.makeText(MainActivity.this,"0",Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                }
                case R.id.btn1:{
                    tv.setText(s+"1");
                    Toast toast=Toast.makeText(MainActivity.this,"1",Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                }
                case R.id.btn2:{
                    tv.setText(s+"2");
                    Toast toast=Toast.makeText(MainActivity.this,"2",Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                }
                case R.id.btn3:{
                    tv.setText(s+"3");
                    Toast toast=Toast.makeText(MainActivity.this,"3",Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                }
                case R.id.btn4:{
                    tv.setText(s+"4");
                    Toast toast=Toast.makeText(MainActivity.this,"4",Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                }
                case R.id.btn5:{
                    tv.setText(s+"5");
                    Toast toast=Toast.makeText(MainActivity.this,"5",Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                }
                case R.id.btn6:{
                    tv.setText(s+"6");
                    Toast toast=Toast.makeText(MainActivity.this,"6",Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                }
                case R.id.btn7:{
                    tv.setText(s+"7");
                    Toast toast=Toast.makeText(MainActivity.this,"7",Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                }
                case R.id.btn8:{
                    tv.setText(s+"8");
                    Toast toast=Toast.makeText(MainActivity.this,"8",Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                }
                case R.id.btn9:{
                    tv.setText(s+"9");
                    Toast toast=Toast.makeText(MainActivity.this,"9",Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                }
                case R.id.btn10:{
                    tv.setText(s+"*");
                    Toast toast=Toast.makeText(MainActivity.this,"*",Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                }
                case R.id.btn11:{
                    tv.setText(s+"#");
                    Toast toast=Toast.makeText(MainActivity.this,"#",Toast.LENGTH_SHORT);
                    break;
                }
                case R.id.btnclear:{
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("確認視窗")
                            .setMessage("確認清除嗎？")
                            .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    tv.setText("");
                                }
                            })
                            .show();
                    break;
                }
                case R.id.btnend:{
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("確認視窗")
                            .setMessage("確定要結束")
                            .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    finish();
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();
                }
            }
        }
    };
}
