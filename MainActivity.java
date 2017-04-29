package com.juliehou.assigement3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    static final int EDIT_REQUEST = 1;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //editText = (EditText)findViewById(R.id.textView);
        setContentView(R.layout.activity_main);
    }

    protected void onSendButtonClick(View view) {
        // When you want an activity to start a second activity, use an intent.
        // An intent is an "intent to do something". It's a message that you
        // send to Android, stating that you want another activity started.
        Intent intent = new Intent(this, TimerActivity.class);
        //Intent intent1 = new Intent(this, AlarmActivity.class);
        //Intent intent2= new Intent(this, Canlendar.class);

        // You can add extra information to the intent with "extra's". The
        // putExtra method is overloaded so the value has a number of possible
        // types.
        intent.putExtra(TimerActivity.EXTRA_MESSAGE, "");

        // pass the intent to android in the startActivity call
        //startActivity(intent);
        startActivityForResult(intent, EDIT_REQUEST);
    }






}



