package com.juliehou.assigement3;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    static final int EDIT_REQUEST = 1;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    protected void onTimerClick(View view) {
        Log.d("Test"," Made it 4");
        Intent intent = new Intent(this, TimerActivity.class);
        startActivity(intent);

    }

    protected void onAlarmButtonClick(View view) {

        Intent intent = new Intent(this, AlarmActivity.class);

        startActivity(intent);

    }

    protected void oncanButtonClick(View view) {

        Intent intent = new Intent(this, Canlendar.class);

        startActivity(intent);

    }

}



