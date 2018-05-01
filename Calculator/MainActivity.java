package com.example.saahilhiranandani.mccexp1;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etfirst;
    EditText etsecond;
    Button btnadd, btnsub, btnmul, btndiv;
    TextView tvans;
    int a,b,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirst = (EditText)findViewById(R.id.etfirst);
        etsecond = (EditText)findViewById(R.id.etsecond);
        btnadd = (Button)findViewById(R.id.btnadd);
        btnsub = (Button)findViewById(R.id.btnsub);
        btnmul = (Button)findViewById(R.id.btnmul);
        btndiv= (Button)findViewById(R.id.btndiv);
        tvans = (TextView)findViewById(R.id.tvans);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(etfirst.getText().toString());
                b = Integer.parseInt(etsecond.getText().toString());
                result = a + b;
                tvans.setText("Ans: "+result);
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(etfirst.getText().toString());
                b = Integer.parseInt(etsecond.getText().toString());
                result = a - b;
                tvans.setText("Ans: "+result);
            }
        });btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(etfirst.getText().toString());
                b = Integer.parseInt(etsecond.getText().toString());
                result = a * b;
                tvans.setText("Ans: "+result);
            }
        });btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(etfirst.getText().toString());
                b = Integer.parseInt(etsecond.getText().toString());
                result = a / b;
                tvans.setText("Ans: "+result);
            }
        });

    }
}
