package com.example.toaststyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_LONG, R.style.exampleToast).show();
            }
        });
    }
}
