package com.example.patricio.walter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String PUBLIC_MESSAGE = "this is a new message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){

        Intent intent = new Intent(this, TodoListActivity.class);

        EditText editText = (EditText) findViewById(R.id.et_box);

        String message = editText.getText().toString();

        intent.putExtra(PUBLIC_MESSAGE, message);

        startActivity(intent);
    }

}


