package com.example.myfirstapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void disable(View v){
        findViewById(R.id.button).setEnabled(false);
        ((Button)findViewById(R.id.button)).setText("Disabled 2");
        Log.d("success2", "Button Disabled a New Way");

        /*
        v.setEnabled(false);
        Log.d("success", "Button Disabled");
        Button b = (Button) v;
        b.setText("Disabled");
        TextView hello = findViewById(R.id.hello);
        hello.setText("Deez Nuts!");
        */
    }
    public void handleText(View v){
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(input);
        Toast.makeText(this, input, Toast.LENGTH_LONG).show();
    }
}