package com.juliehou.assigement3;
import android.content.Intent;
import android.provider.AlarmClock;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.message;

public class Canlendar extends AppCompatActivity {
    private TextView screen;
    private EditText editText;
    static final int EDIT_REQUEST = 1;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        editText = (EditText)findViewById(R.id.textView);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canlendar);

    }
    public void onSendButtonClickCanlendar(View view){

        Intent intent =new Intent(this, AlarmActivity.class);
        intent.putExtra(AlarmActivity.EXTRA_MESSAGE, editText.getText().toString());
        EditText editText=(EditText)findViewById(R.id.editText);
        String message= editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivityForResult(intent,EDIT_REQUEST);
    }
    public void addEvent(String title, String location, long begin, long end) {
        Intent intent = new Intent(Intent.ACTION_INSERT)
                .setData(CalendarContract.Events.CONTENT_URI)
                .putExtra(CalendarContract.Events.TITLE, title)
                .putExtra(CalendarContract.Events.EVENT_LOCATION, location)
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, begin)
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, end);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}

