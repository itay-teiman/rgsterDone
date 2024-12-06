package com.example.rester212;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.rgesrter412.ProgressDialog;

public class MainActivity extends AppCompatActivity {

    private ProgressDialog progress;
    Button b1;
    EditText t1;
    EditText t2;
    EditText t3;
    EditText t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    private Object editTextText;
    private Object id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        b1=(Button)findViewById(R.id.button);
        t1=(EditText)findViewById(R.id.editTextText);
        t2=(EditText)findViewById(R.id.editTextTextPassword);
        t3=(EditText)findViewById(R.id.editTextText2);
        t4=(EditText)findViewById(R.id.editTextPhone);
        t5=(TextView)findViewById(R.id.textView);
        t6=(TextView)findViewById(R.id.textView2);
        t7=(TextView)findViewById(R.id.textView8);
        t8=(TextView)findViewById(R.id.textView9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5.setText(t1.getText().toString());
                t6.setText(t2.getText().toString());
                t7.setText(t3.getText().toString());
                t8.setText(t4.getText().toString());
            }
        });

    }
}