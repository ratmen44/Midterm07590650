package com.example.midterm07590650;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button LoginButton = findViewById(R.id.button);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText usernameEdittext = findViewById(R.id.editText2);
                EditText passwordEdittext = findViewById(R.id.editText2);

                String inputUsername = usernameEdittext.getText().toString();
                int value = Integer.parseInt(inputUsername);

                String inputPassword = passwordEdittext.getText().toString();

                String success = getString(R.string.login_success);
                String failed = getString(R.string.login_failed);

                Auth auth = new Auth(inputUsername, inputPassword);

                boolean result = auth.check();

                if (result && auth.getmUsername().equals("aaa")) {
                    Toast.makeText(LoginActivity.this, success, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, Profile2Activity.class);
                    intent.putExtra("username", auth.getmUsername());
                    startActivity(intent);
                } else if (result && auth.getmUsername().equals("bbb")) {
                    Toast.makeText(LoginActivity.this, success, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, Profile2Activity.class);
                    intent.putExtra("username", auth.getmUsername());
                    startActivity(intent);
                } else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.login_failed);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    dialog.show();
                }
            }
        });
    }
}

