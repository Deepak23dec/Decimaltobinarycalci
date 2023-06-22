package com.example.decimaltobinarycalci;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
    EditText etdecimal,etbinary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
         etdecimal=findViewById(R.id.etdecimal);
         etbinary=findViewById(R.id.etbinary);
         toolbar.setTitle("Decimal to binary calci");
         setSupportActionBar(toolbar);
    }
    public void onclickconvert(View view) {
        String str= etdecimal.getText().toString();
       int i =Integer.parseInt(str);
       String str2=Integer.toBinaryString(i);
       etbinary.setText(str2);
    }
    public void onclickreset(View view) {
        etdecimal.setText("");
        etbinary.setText("");

    }
}