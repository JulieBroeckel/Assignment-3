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


public class AlarmActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    static final int EDIT_REQUEST = 1;
    private TextView screen;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
    }

    public void onSendButtonClickAlarm(View view) {
        Log.d("Log ","made it");
        // get the message for the alarm from the EditText
        EditText edtMessage = (EditText) findViewById(R.id.messageId);
        String message = edtMessage.getText().toString();

        EditText edtHour = (EditText) findViewById(R.id.hourId);
        int hour = Integer.parseInt(edtHour.getText().toString());
        //
        EditText edtMint = (EditText) findViewById(R.id.minuteId);
        int minute = Integer.parseInt(edtMint.getText().toString());

        //
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);

        intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
        intent.putExtra(AlarmClock.EXTRA_HOUR, hour);
        intent.putExtra(AlarmClock.EXTRA_MINUTES, minute);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
