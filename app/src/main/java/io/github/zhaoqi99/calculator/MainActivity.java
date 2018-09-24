package io.github.zhaoqi99.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

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

    private String formula="0";
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

    void SetAllOnClickListener()
    {
        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        ButtonAdd.setOnClickListener(this);
        ButtonSub.setOnClickListener(this);
        ButtonMul.setOnClickListener(this);
        ButtonDiv.setOnClickListener(this);
        ButtonEqu.setOnClickListener(this);
        ButtonAC.setOnClickListener(this);
        ButtonDel.setOnClickListener(this);
        ButtonPoint.setOnClickListener(this);
        ButtonMinus.setOnClickListener(this);
        ButtonShowHistory.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(formula.equals("0"))
            formula="";
        Button btn=(Button)view;
        int len=formula.length();
        switch (view.getId()){
            case R.id.ButtonNum0:
            case R.id.ButtonNum1:
            case R.id.ButtonNum2:
            case R.id.ButtonNum3:
            case R.id.ButtonNum4:
            case R.id.ButtonNum5:
            case R.id.ButtonNum6:
            case R.id.ButtonNum7:
            case R.id.ButtonNum8:
            case R.id.ButtonNum9:
            case R.id.ButtonPoint:
                formula+=btn.getText().toString();
                break;
            case R.id.ButtonAdd:
            case R.id.ButtonSub:
            case R.id.ButtonMul:
            case R.id.ButtonDiv:
                char ss=formula.charAt(len-1);
                if (ss=='+'||ss=='—'||ss=='×'||ss=='÷'){
                    formula=formula.substring(0,len-1);
                }
                formula+=btn.getText().toString();
                break;
            case R.id.ButtonAC:
                formula="0";
                break;
            case R.id.ButtonDel:
                formula=formula.substring(0, len- 2);
                break;
            case R.id.ButtonMinus:
                if(formula.charAt(0)=='-'){
                    formula=formula.substring(1,len-1);
                }else{
                    formula="-"+formula;
                }
                break;
            case R.id.ButtonEqu:
                break;
        }
        TextViewFormula.setText(formula);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindAllViewByID();
        SetAllOnClickListener();
    }

}
