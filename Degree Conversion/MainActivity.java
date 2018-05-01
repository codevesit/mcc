package com.example.saahilhiranandani.deg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ans;
    Button button1;
    EditText deg;
    int c;
    int d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ans=(TextView)findViewById(R.id.ans);
        button1=(Button)findViewById(R.id.button1);
        deg=(EditText)findViewById(R.id.deg);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               c=Integer.parseInt(deg.getText().toString());
               d=273+c;
                ans.setText("ans is "+d);



            }
        });
    }
}
