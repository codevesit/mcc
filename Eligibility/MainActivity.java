package com.example.saahilhiranandani.eligible;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ans1;
    Button button1;
    EditText elg;
    int c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ans1=(TextView)findViewById(R.id.ans1);
        button1=(Button) findViewById(R.id.button1);
        elg=(EditText)findViewById(R.id.elg);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              c=Integer.parseInt(elg.getText().toString());
                if(c<18)
                    ans1.setText("eligible");
                else
                    ans1.setText("not");
            }
        });
    }
}
