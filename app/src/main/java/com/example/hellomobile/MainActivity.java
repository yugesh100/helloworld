package com.example.hellomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button countButton;
    private Button toastButton;
    private TextView textView;
    private int count;
    public static final String TAG= "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countButton = findViewById(R.id.button1);
        toastButton = findViewById(R.id.toggleButton1);
        textView = findViewById(R.id.textView2);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is a toast as yugesh sapkota", Toast.LENGTH_LONG).show();
            }
        });


    }

    public void count(View view) {
       count++;
       textView.setText(""+count);
       Log.d(TAG,""+count);

          }
}
//