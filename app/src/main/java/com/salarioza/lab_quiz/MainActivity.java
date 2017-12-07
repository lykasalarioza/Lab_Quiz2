package com.salarioza.lab_quiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText psswrd;
    Button log_in;
    Button remember_me;
    TextView display;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.etusername);
        psswrd = (EditText) findViewById(R.id.etpassword);
        log_in = (Button) findViewById(R.id.login);
        remember_me = (Button) findViewById(R.id.rememberme);
        pref = getPreferences(Context.MODE_PRIVATE);
        display = (TextView) findViewById(R.id.tvuser);

    }

    public void saveinfo(View view) {
        String username = pref.getString("Uname","");
        String password = pref.getString("Pword","");
        user.setText(username,TextView.BufferType.EDITABLE);
        psswrd.setText(password,TextView.BufferType.EDITABLE);
    }

    public void loginpageinfo(View view) {
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("Uname", user.getText().toString());
        editor.putString("Pword", psswrd.getText().toString());
        editor.commit();
        SecondAct();
    }

    public void SecondAct() {
        Intent intent = new Intent(this, welcome.class);
        startActivity(intent);
    }
}
