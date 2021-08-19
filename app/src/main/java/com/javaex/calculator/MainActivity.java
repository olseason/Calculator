package com.javaex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtDisplay;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Button btnDiv, btnTimes, btnMinus, btnPlus, btnEqual, btnClear;

    private View.OnClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("javastudy",""+view.getId());

                //현재출력되고 있는 텍스트
                String crtText = txtDisplay.getText().toString();

                switch(view.getId()){

                    case R.id.btn0:
                        Log.d("javastudy","btn0");
                        txtDisplay.setText(crtText + 0);
                        break;

                    case R.id.btn1:
                        Log.d("javastudy","btn1");
                        txtDisplay.setText(crtText + 1);
                        break;

                    case R.id.btn2:
                        Log.d("javastudy","btn2");
                        txtDisplay.setText(crtText + 2);
                        break;

                    case R.id.btn3:
                        Log.d("javastudy","btn3");
                        txtDisplay.setText(crtText + 3);
                        break;

                    case R.id.btn4:
                        Log.d("javastudy","btn4");
                        txtDisplay.setText(crtText + 4);
                        break;

                    case R.id.btn5:
                        Log.d("javastudy","btn5");
                        txtDisplay.setText(crtText + 5);
                        break;

                    case R.id.btn6:
                        Log.d("javastudy","btn6");
                        txtDisplay.setText(crtText + 6);
                        break;

                    case R.id.btn7:
                        Log.d("javastudy","btn7");
                        txtDisplay.setText(crtText + 7);
                        break;

                    case R.id.btn8:
                        Log.d("javastudy","btn8");
                        txtDisplay.setText(crtText + 8);
                        break;

                    case R.id.btn9:
                        Log.d("javastudy","btn9");
                        txtDisplay.setText(crtText + 9);
                        break;

                    case R.id.btnDiv:
                        Log.d("javastudy","btnDiv");
                        txtDisplay.setText(crtText + "÷");
                        break;

                    case R.id.btnTimes:
                        Log.d("javastudy","btnTimes");
                        txtDisplay.setText(crtText + "×");
                        break;

                    case R.id.btnMinus:
                        Log.d("javastudy","btnMinus");
                        txtDisplay.setText(crtText + "-");
                        break;

                    case R.id.btnPlus:
                        Log.d("javastudy","btnPlus");
                        txtDisplay.setText(crtText + "+");
                        break;

                    case R.id.btnEqual:
                        Log.d("javastudy","btnEqual");
                        double result = calculate(crtText);
                        txtDisplay.setText(""+result);
                        break;

                    case R.id.btnClear:
                        Log.d("javastudy","btnClear");
                        txtDisplay.setText("");
                        break;

                    default:
                        Log.d("javastudy","잘못누름");
                        break;

                }

                //txtDisplay.setText(""+view.getId());

            }
        };

        //리스너 적용
        initListener();

    }
    //합계구하기
    private double calculate(String crtText){
        double result = 0.0;

        if(crtText.contains("÷")){
            Log.d("javastudy","÷계산");
            String[] strNums = crtText.split("÷");
            result = Double.parseDouble(strNums[0])/Double.parseDouble(strNums[1]);

        }else if(crtText.contains("×")) {
            Log.d("javastudy","×계산");
            String[] strNums = crtText.split("×");
            result = Double.parseDouble(strNums[0])*Double.parseDouble(strNums[1]);

        }else if(crtText.contains("-")){
            Log.d("javastudy","-계산");
            String[] strNums = crtText.split("-");
            result = Double.parseDouble(strNums[0])-Double.parseDouble(strNums[1]);

        }else if(crtText.contains("+")){
            Log.d("javastudy","+계산");
            String[] strNums = crtText.split("\\+");
            result = Double.parseDouble(strNums[0])+Double.parseDouble(strNums[1]);

        }else{
            Log.d("javastudy","잘못된 계산");
        }

        return result;

    }



    //리스터 적용 메소드
    private void initListener(){
        txtDisplay = (TextView)findViewById(R.id.txtDisplay);
        btn0= (Button)findViewById(R.id.btn0);
        btn1= (Button)findViewById(R.id.btn1);
        btn2= (Button)findViewById(R.id.btn2);
        btn3= (Button)findViewById(R.id.btn3);
        btn4= (Button)findViewById(R.id.btn4);
        btn5= (Button)findViewById(R.id.btn5);
        btn6= (Button)findViewById(R.id.btn6);
        btn7= (Button)findViewById(R.id.btn7);
        btn8= (Button)findViewById(R.id.btn8);
        btn9= (Button)findViewById(R.id.btn9);
        btnDiv= (Button)findViewById(R.id.btnDiv);
        btnTimes= (Button)findViewById(R.id.btnTimes);
        btnMinus= (Button)findViewById(R.id.btnMinus);
        btnPlus= (Button)findViewById(R.id.btnPlus);
        btnEqual= (Button)findViewById(R.id.btnEqual);
        btnClear= (Button)findViewById(R.id.btnClear);

        btn0.setOnClickListener(listener);
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);
        btn7.setOnClickListener(listener);
        btn8.setOnClickListener(listener);
        btn9.setOnClickListener(listener);
        btnDiv.setOnClickListener(listener);
        btnTimes.setOnClickListener(listener);
        btnMinus.setOnClickListener(listener);
        btnPlus.setOnClickListener(listener);
        btnEqual.setOnClickListener(listener);
        btnClear.setOnClickListener(listener);
    }
}