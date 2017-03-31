package com.example.a55.clase02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView)super.findViewById(R.id.txtSaludar);
        tv.setText("Otro Texto");

        Button btn1 = (Button)super.findViewById(R.id.btn1);

        View.OnClickListener listener = new MyListener();
        btn1.setOnClickListener(listener);

        Button btn2 = (Button)super.findViewById(R.id.btn2);
        btn2.setOnClickListener(listener);
    }
}
