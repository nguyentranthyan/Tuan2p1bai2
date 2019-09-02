package com.example.tuan2p1bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText f,c;
Button ctc,ctf,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f=findViewById(R.id.editText_f);
        c=findViewById(R.id.editText_c);
        ctc=findViewById(R.id.button_ctc);
        ctf=findViewById(R.id.button_ctf);
        clear=findViewById(R.id.button_clear);
        ctc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ff=Float.parseFloat(f.getText().toString());
                c.setText(""+((ff-32)*5/9));
            }
        });
        ctf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float cc=Float.parseFloat(c.getText().toString());
                f.setText(""+(cc*9/5+32));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f.setText("");
                c.setText("");
            }
        });
    }
}
