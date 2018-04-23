package com.example.alex.sharetestapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView textView, textView2;
    private String name;
    private SharedPreferences pref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.text);
        textView2 = findViewById(R.id.text2);

        name = getSharedPreferences("test",MODE_PRIVATE)
                .getString("name","");

        Log.v("alex","name1="+name);
        textView.setText("Name = " + name);

    }

    public void change(View view) {

        pref = getSharedPreferences("test", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("name", "hihihihitest");
        editor.commit();

        Log.v("alex","namechange = " + name);

        textView2.setText("Namechange = " + name);


    }

}
