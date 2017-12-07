package com.salarioza.lab_quiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class welcome extends AppCompatActivity {
    SharedPreferences pref;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        display = (TextView) findViewById(R.id.tvuser);
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        Sharedpref();

    }
    public void Sharedpref(){
        String username = pref.getString("Uname","");
        display.setText(username);
    }
    public void gobacktomain (View view){
        Intent intent2 = new Intent (this, MainActivity.class);
        startActivity(intent2);
    }
}
