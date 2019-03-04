package com.arlsp.mvp_demo;

import android.app.ProgressDialog;
import android.opengl.EGL14;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements ILoginView, View.OnClickListener {
    private EditText usernameEdit,passwordEdit;
    private Button loginButton;
    ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEdit=(EditText)findViewById(R.id.username);
        passwordEdit=(EditText)findViewById(R.id.password);
        loginButton=(Button) findViewById(R.id.login);
        pd=new ProgressDialog(this);

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setPasswordError() {

    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void loginSuccess() {

    }
}
