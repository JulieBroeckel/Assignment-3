package com.juliehou.assigement3;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class TimerActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    static final int EDIT_REQUEST = 1;
    private TextView screen;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        Log.d("Test"," Made it 2");
    }

    public void onSendButtonClickTimer(View view) {
        Log.d("Test"," Made it 1");
        // get the message for the alarm from the EditText
        EditText edtMessage = (EditText) findViewById(R.id.messageId);
        String message = edtMessage.getText().toString();

        //
        EditText edtsecond = (EditText) findViewById(R.id.secondId);
        int second = Integer.parseInt(edtsecond.getText().toString());
        Intent intent= new Intent(AlarmClock.ACTION_SET_TIMER)
                .putExtra(AlarmClock.EXTRA_MESSAGE,message)
                .putExtra(AlarmClock.EXTRA_LENGTH,second)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,true);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }



    }


}
