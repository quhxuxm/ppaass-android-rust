package com.ppaass.androidwithrust;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("greeting");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RustGreetings g = new RustGreetings();
        String r = g.sayHello("world");
        ((TextView)findViewById(R.id.greetingField)).setText(r);
    }
}
