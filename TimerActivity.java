package com.juliehou.assigement3;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TimerActivity extends AppCompatActivity {

    public static final int TextView2= 0;
    public static final String TextView3 = "";
    private static final int Seconds=0;
    private EditText messageView;

    private TextView screen;
    private EditText TextView;
    static final int EDIT_REQUEST = 1;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView Hello = (TextView) findViewById(R.id.textView2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
    }
    protected void onClick(View view) {
        String TextView3 = messageView.getText().toString();
        int TextView2=messageView.getText();
        startTimer("message",5);
    }

    protected void startTimer (String message, int second) {

        Intent intent= new Intent(AlarmClock.ACTION_SET_TIMER)
                .putExtra(AlarmClock.EXTRA_MESSAGE,message)
                .putExtra(AlarmClock.EXTRA_LENGTH,second)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,true);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }



    }


}
