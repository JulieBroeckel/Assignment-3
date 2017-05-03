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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canlendar);
    }

    public void onSendButtonClickcan(View view) {

        // get the message for the alarm from the EditText
       // EditText edtMessage = (EditText) findViewById(R.id.messageId);
        //String message = edtMessage.getText().toString();

        EditText edttitle = (EditText) findViewById(R.id.TitleId);
       String title = edttitle.getText().toString();
        //
        EditText edtlocation = (EditText) findViewById(R.id.LocaltionId);
        String location = edtlocation.getText().toString();

        EditText edtbegin = (EditText) findViewById(R.id.beginId);
        String begin = edtbegin.getText().toString();

        EditText edtend = (EditText) findViewById(R.id.endId);
        String end = edtend.getText().toString();

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

