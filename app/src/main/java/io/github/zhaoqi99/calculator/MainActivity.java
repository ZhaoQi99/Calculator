package io.github.zhaoqi99.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    /*
    数字键0-9
     */
    private Button num0;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;

    /*
    运算符+—×÷=
     */
    private Button ButtonAdd;
    private Button ButtonSub;
    private Button ButtonMul;
    private Button ButtonDiv;
    private Button ButtonEqu;

    /*
    其他
     */
    private Button ButtonPoint;
    private Button ButtonShowHistory;
    private Button ButtonAC;
    private Button ButtonDel;
    private Button ButtonMinus;
    private TextView TextViewFormula;
    private TextView TextViewResult;

    void FindAllViewByID(){
        num0=(Button)findViewById(R.id.ButtonNum0);
        num1=(Button)findViewById(R.id.ButtonNum1);
        num2=(Button)findViewById(R.id.ButtonNum2);
        num3=(Button)findViewById(R.id.ButtonNum3);
        num4=(Button)findViewById(R.id.ButtonNum4);
        num5=(Button)findViewById(R.id.ButtonNum5);
        num6=(Button)findViewById(R.id.ButtonNum6);
        num7=(Button)findViewById(R.id.ButtonNum7);
        num8=(Button)findViewById(R.id.ButtonNum8);
        num9=(Button)findViewById(R.id.ButtonNum9);
        ButtonAdd=(Button)findViewById(R.id.ButtonAdd);
        ButtonSub=(Button)findViewById(R.id.ButtonSub);
        ButtonMul=(Button)findViewById(R.id.ButtonMul);
        ButtonDiv=(Button)findViewById(R.id.ButtonDiv);
        ButtonEqu=(Button)findViewById(R.id.ButtonEqu);
        ButtonPoint=(Button)findViewById(R.id.ButtonPoint);
        ButtonShowHistory=(Button)findViewById(R.id.ButtonShowHistory);
        ButtonAC=(Button)findViewById(R.id.ButtonAC);
        ButtonDel=(Button)findViewById(R.id.ButtonDel);
        ButtonMinus=(Button)findViewById(R.id.ButtonMinus);
        TextViewResult=(TextView)findViewById(R.id.TextViewResult);
        TextViewFormula=(TextView)findViewById(R.id.TextViewFormula);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindAllViewByID();
    }

}
