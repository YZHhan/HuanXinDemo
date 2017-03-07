package com.example.administrator.huanxindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * 实现注册
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText userName;
    private EditText userPwd;
    private TextView resiterBtn;
    private TextView loginText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void init(){
        userName= (EditText) findViewById(R.id.nameE);
        userPwd= (EditText) findViewById(R.id.pwdE);
        resiterBtn= (TextView) findViewById(R.id.registerBtn);
        loginText= (TextView) findViewById(R.id.loginBtn);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.registerBtn:

                break;
            case R.id.loginBtn:

                break;
        }

    }
}
