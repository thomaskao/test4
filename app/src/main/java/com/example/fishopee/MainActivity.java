package com.example.fishopee;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import java.util.*;
import java.lang.*;
import java.io.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button enter,signup,button;
    private EditText user,password;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = findViewById(R.id.btnenter);
        signup = findViewById(R.id.btnsignup);
        user = findViewById(R.id.edittext1);
        password = findViewById(R.id.edittext2);
        text = findViewById(R.id.text);
        button = findViewById(R.id.button);

        String username1="766",userpassword1="456";

        enter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String userinput=user.getText().toString(),passwordinput=password.getText().toString();

                if((username1.equals(userinput))&&(userpassword1.equals(passwordinput))){
                    text.setText("登入成功");


                }

                else {
                    text.setText("帳號錯誤");
                }

            }
        });
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String userinput=user.getText().toString(),passwordinput=password.getText().toString();

                if((username1.equals(userinput))&&(userpassword1.equals(passwordinput))){
                    text.setText("登入成功");


                }



            }
        });

    }
}