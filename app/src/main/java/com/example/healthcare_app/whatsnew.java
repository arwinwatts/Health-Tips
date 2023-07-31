package com.example.healthcare_app;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class whatsnew extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsnew);

        TextView textView = findViewById(R.id.textView10);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView2 = findViewById(R.id.textView11);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView3 = findViewById(R.id.textView12);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}