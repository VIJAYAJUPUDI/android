package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double input1 = 0, input2 = 0,result=0,temp,degree,radian,val;
    long ip;
    TextView edt1,ed2;
    boolean Addition, Subtract, Multiplication, Division,Mod,ssin,scos,stan,scosec,ssec,scot,slog,sroot;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonAdd, buttonSub, buttonMul, buttonDivision, buttonEqual, buttonDel,buttonmod,buttondot,
            buttonback,bsin,bcos,btan,blog,bcosec,bsec,bcot,broot,bscnt;

    LinearLayout linlayone,latwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0=findViewById(R.id.zero);
        button1=findViewById(R.id.one);
        button2=findViewById(R.id.two);
        button3=findViewById(R.id.three);
        button4=findViewById(R.id.four);
        button5=findViewById(R.id.five);
        button6=findViewById(R.id.six);
        button7=findViewById(R.id.seven);
        button8=findViewById(R.id.eight);
        button9=findViewById(R.id.nine);
        buttonAdd=findViewById(R.id.plus);
        buttonSub=findViewById(R.id.minus);
        buttonMul=findViewById(R.id.mul);
        buttonDivision=findViewById(R.id.div);
        buttonDel=findViewById(R.id.clr);
        buttonEqual=findViewById(R.id.eq);
        buttonmod=findViewById(R.id.mod);
        buttonback=findViewById(R.id.bone);
        buttondot=findViewById(R.id.dot);
        bscnt=findViewById(R.id.sci);
        bsin=findViewById(R.id.sin);
        bcos=findViewById(R.id.cos);
        btan=findViewById(R.id.tan);
        blog=findViewById(R.id.log);
        bcosec=findViewById(R.id.cosec);
        bsec=findViewById(R.id.sec);
        bcot=findViewById(R.id.cot);
        broot=findViewById(R.id.root);
        linlayone=findViewById(R.id.linlayone);
        latwo=findViewById(R.id.ltwo);
        edt1=findViewById(R.id.dis);
        ed2=findViewById(R.id.dis2);
        edt1.setText(null);
        ed2.setText(null);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input1 != 0){

                        ed2.setText(ed2.getText() + "1");
                }
                else {

                    edt1.setText(edt1.getText() + "1");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(input1 != 0){

                    ed2.setText(ed2.getText() + "2");
                }
                else {

                    edt1.setText(edt1.getText() + "2");
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input1 != 0){

                    ed2.setText(ed2.getText() + "3");
                }
                else {

                    edt1.setText(edt1.getText() + "3");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input1 != 0){

                    ed2.setText(ed2.getText() + "4");
                }
                else {

                    edt1.setText(edt1.getText() + "4");
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input1 != 0){

                    ed2.setText(ed2.getText() + "5");
                }
                else {

                    edt1.setText(edt1.getText() + "5");
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(input1 != 0){

                        ed2.setText(ed2.getText() + "6");
                    }
                    else {

                        edt1.setText(edt1.getText() + "6");
                    }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input1 != 0){

                    ed2.setText(ed2.getText() + "7");
                }
                else {

                    edt1.setText(edt1.getText() + "7");
                }



            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input1 != 0){

                    ed2.setText(ed2.getText() + "8");
                }
                else {

                    edt1.setText(edt1.getText() + "8");
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input1 != 0){

                    ed2.setText(ed2.getText() + "9");
                }
                else {

                    edt1.setText(edt1.getText() + "9");
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input1 != 0){

                    ed2.setText(ed2.getText() + "0");
                }
                else {

                    edt1.setText(edt1.getText() + "0");
                }
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input1 != 0){

                    ed2.setText("."+ed2.getText()  );
                }
                else {

                    edt1.setText("."+edt1.getText());
                }
            }
        });
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input1 != 0){

                    temp = Float.parseFloat(ed2.getText() + "");
                    temp=temp/10;
                    ip=(long)temp;
                    ed2.setText(ip+"");

                }
                else {

                    temp = Float.parseFloat(edt1.getText() + "");
                    temp=temp/10;
                    ip=(long)temp;
                    edt1.setText(ip+"");
                }
                temp=0;
            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1.getText().length() != 0 ) {
                    if(result==0) {
                        input1 = Float.parseFloat(edt1.getText() + "");
                        edt1.setText("+" + edt1.getText());
                        Addition = true;
                    }
                    else{
                        input1=result;
                        edt1.setText("+"+edt1.getText());
                        Addition=true;
                        ed2.setText("");
                    }
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0 ) {
                    if(result==0) {
                        input1 = Float.parseFloat(edt1.getText() + "");
                        edt1.setText("-" + edt1.getText());
                        Subtract = true;
                    }
                    else{
                        input1=result;
                        edt1.setText("-"+edt1.getText());
                        Subtract=true;
                        ed2.setText("");
                    }
                }
            }
        });
        buttonmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0 ) {
                    if(result==0) {
                        input1 = Float.parseFloat(edt1.getText() + "");
                        edt1.setText( edt1.getText()+"%" );
                        Mod = true;
                    }
                    else{
                        input1=result;
                        edt1.setText(edt1.getText()+"%");
                        Mod=true;
                        ed2.setText("");
                    }
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0 ) {
                    if(result==0) {
                        input1 = Float.parseFloat(edt1.getText() + "");
                        edt1.setText("*" + edt1.getText());
                        Multiplication= true;
                    }
                    else{
                        input1=result;
                        edt1.setText("*"+edt1.getText());
                        Multiplication=true;
                        ed2.setText("");
                    }
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0 ) {
                    if(result==0) {
                        input1 = Float.parseFloat(edt1.getText() + "");
                        edt1.setText("/" + edt1.getText());
                        Division = true;
                    }
                    else{
                        input1=result;
                        edt1.setText("/"+edt1.getText());
                        Division=true;
                        ed2.setText("");
                    }
                }
            }
        });
        bscnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linlayone.setVisibility(View.VISIBLE);
                latwo.setVisibility(View.VISIBLE);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0 ) {

                        input1 = Float.parseFloat(edt1.getText() + "");
                        edt1.setText( "sin"+ edt1.getText());
                       // ssin = true;
                   // degree = Float.parseFloat(edt1.getText() + "");
                    radian = Math.toRadians(input1);
                    val = Math.sin(radian);
                    ed2.setText(val+"");
                    input1=0;


                }
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0 ) {

                    input1 = Float.parseFloat(edt1.getText() + "");
                    edt1.setText( "cos"+ edt1.getText());
                    scos = true;
                    radian = Math.toRadians(input1);
                    val = Math.cos(radian);
                    ed2.setText(val+"");
                    input1=0;


                }
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0 ) {

                    input1 = Float.parseFloat(edt1.getText() + "");
                    edt1.setText( "tan"+ edt1.getText());
                    stan = true;
                    radian = Math.toRadians(input1);
                    val = Math.tan(radian);
                    ed2.setText(val+"");
                    input1=0;


                }
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0 ) {

                    input1 = Float.parseFloat(edt1.getText() + "");
                    edt1.setText(  "log"+edt1.getText());
                    slog = true;
                    radian = Math.toRadians(input1);
                    val = Math.log(radian);
                    ed2.setText(val+"");
                    input1=0;


                }
            }
        });
        bcosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0 ) {

                    input1 = Float.parseFloat(edt1.getText() + "");
                    edt1.setText(  "cosec"+edt1.getText());;
                    scosec = true;
                    radian = Math.toRadians(input1);
                    val = Math.sin(radian);
                    val=1/val;
                    ed2.setText(val+"");
                    input1=0;


                }
            }
        });
        bsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0 ) {

                    input1 = Float.parseFloat(edt1.getText() + "");
                    edt1.setText(  "sec"+edt1.getText());
                    radian = Math.toRadians(input1);
                    val = Math.cos(radian);
                    val=1/val;
                    ed2.setText(val+"");
                    input1=0;


                }
            }
        });
        bcot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0 ) {

                    input1 = Float.parseFloat(edt1.getText() + "");
                    edt1.setText(  "cot"+edt1.getText());
                    radian = Math.toRadians(input1);
                    val = Math.tan(radian);
                    val=1/val;
                    ed2.setText(val+"");
                    input1=0;


                }
            }
        });
        broot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0 ) {

                    input1 = Float.parseFloat(edt1.getText() + "");
                    edt1.setText( "root"+ edt1.getText());
                    radian = Math.toRadians(input1);
                    val = Math.sqrt(radian);
                    ed2.setText(val+"");
                    input1=0;


                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division||Mod ) {
                    input2 = Float.parseFloat(ed2.getText() + "");
                }

                if (Addition) {
                    edt1.setText(input1+"+"+input2);
                    input1=input1 +input2;
                    ed2.setText(input1  + "");
                    Addition = false;
                }

                if (Subtract) {
                    edt1.setText(input1+"-"+input2);
                    input1=input1 -input2;
                    ed2.setText(input1  + "");
                    Subtract = false;
                }

                if (Multiplication) {
                    edt1.setText(input1+"*"+input2);
                    input1=input1 *input2;
                    ed2.setText(input1  + "");
                    Multiplication = false;
                }

                if (Division) {
                    edt1.setText(input1+"/"+input2);
                    input1=input1 /input2;
                    ed2.setText(input1  + "");

                    Division = false;
                }
                if (Mod) {
                    edt1.setText(input1+"%"+input2);
                    input1=input1 %input2;
                    ed2.setText(input1  + "");

                    Division = false;
                }
                result=input1;
               /* if(ssin){
                    degree = Float.parseFloat(edt1.getText() + "");
                    radian = Math.toRadians(degree);
                     val = Math.sin(radian);
                     ed2.setText(val+"");
                }*/

            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(null);
                ed2.setText(null);
                input1 = 0.0;
                input2 = 0.0;
                result=0;
                val=0;
                temp=0;
                latwo.setVisibility(View.GONE);
                linlayone.setVisibility(View.GONE);
            }
        });
    }
}
