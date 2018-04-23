package com.example.alex.sharetestapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit);

    }

    public void test1(View view) {
        String name = editText.getText().toString();

        SharedPreferences pref = getSharedPreferences("test",MODE_PRIVATE);
        pref.edit()
                .putString("name",name)
                .commit();

        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);


    }
}
