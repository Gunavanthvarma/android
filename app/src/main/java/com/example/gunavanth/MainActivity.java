package com.example.gunavanth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn;
        EditText email1,password;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email1 = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.Password);
        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (email1.getText().toString().equals("gunavanthvarma@gmail.com") && password.getText().toString().equals("gunvar")) {
                        Context context = getApplicationContext();
                        CharSequence text = "LOGGED IN SUCCESSFULLY";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                        Intent i = new Intent(v.getContext(), home.class);
                        startActivity(i);
                    } else {
                        Context context = getApplicationContext();
                        CharSequence text = "INCORRECT CREDENTIALS";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }




        });

    }
}


