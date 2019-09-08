package com.example.midterm07590650;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Profile2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        Intent intent = getIntent();
        String user = intent.getStringExtra("username");

        if (user.equals("aaa")){
            TextView text = (TextView) findViewById(R.id.Name);
            TextView text1 = (TextView) findViewById(R.id.textView10);
            TextView text2 = (TextView) findViewById(R.id.textView11);
            TextView text3 = (TextView) findViewById(R.id.textView12);
            text.setText("Thanadon Suiyanan");
            text1.setText("มหาวิยาลัยศิลปากร");
            text2.setText("นนทบุรี");
            text3.setText("นนทบุรี");
        }
    }
}
