package com.example.bmicheak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText weith,fit,inch;
Button button;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weith=findViewById(R.id.weith);
        fit=findViewById(R.id.fit);
        inch=findViewById(R.id.inch);
        button=findViewById(R.id.button);
        tv=findViewById(R.id.tv);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String s=weith.getText().toString();
        String s1=fit.getText().toString();
        String s2=inch.getText().toString();
        float kg=Float.parseFloat(s);
        float f=Float.parseFloat(s1);
        float i=Float.parseFloat(s2);


        float m= (float) ((f*0.3048) + (i*0.0254));
        float result=kg/(m*m);


        if (result<=18.4){
            tv.setText("Cheak:Underweight \n Normal BMI between 18.5-24.9: Your BMI="+result);
        } else if (result>=18.5 && result<=24.9) {
            tv.setText("Cheak:Normal \n Normal BMI between 18.5-24.9: Your BMI="+result);
        } else if (result>=25.0 && result<=39.9) {
            tv.setText("Cheak:Overweight \n Normal BMI between 18.5-24.9: Your BMI="+result);
        }
        else
            tv.setText("Cheak:Obese  \n Normal BMI between 18.5-24.9: Your BMI="+result);
    }
});

    }
}