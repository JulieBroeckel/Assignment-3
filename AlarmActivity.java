package com.juliehou.assigement3;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class AlarmActivity extends AppCompatActivity {
    private TextView screen;
    private EditText editText;
    static final int EDIT_REQUEST = 1;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView Hello = (TextView)findViewById(R.id.textView2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
    }
    public void onSendButtonClickAlarm(View view){

        Intent intent =new Intent(this, AlarmActivity.class);
        intent.putExtra(AlarmActivity.EXTRA_MESSAGE, editText.getText().toString());
        EditText editText=(EditText)findViewById(R.id.editText);
        String message= editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivityForResult(intent,EDIT_REQUEST);
    }

    protected void startTimer(String message, int hour, int minute) {

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minute);


        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
