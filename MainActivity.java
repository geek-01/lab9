package com.example.sagar.lab9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
EditText to,msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        to=findViewById(R.id.to);
        msg=findViewById(R.id.msg);
    }

    public void send(View view) {
        SmsManager sms=SmsManager.getDefault();
        sms.sendTextMessage(to.getText().toString(),null,msg.getText().toString(),null,null);
    }
}
