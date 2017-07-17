package com.example.patricio.walter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class TodoListActivity extends AppCompatActivity {

    // the state of the arrays is kept on this List View
    public ArrayList<TodoItem> todos = new ArrayList<TodoItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String todo = intent.getStringExtra(MainActivity.PUBLIC_MESSAGE);


        TableLayout table = (TableLayout) this.findViewById(R.id.tl_todo_table);
//        View main = (View) findViewById(R.layout.content_display_message);

        LayoutInflater inflater = (LayoutInflater)getApplicationContext().getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);

        // new TDO
        TodoItem fresh = new TodoItem(todo, false);
        todos.add(fresh);

//
//        for (TodoItem todoItem : todos) {
//
//            TableRow row = (TableRow) findViewById(R.id.tr_todo_row);
//
////            TextView text = (TextView) row.findViewById(R.id.textView);
////            CheckBox check = (CheckBox) row.findViewById(R.id.checkBox);
////            text.setText(todoItem.getText());
////            check.setChecked(todoItem.getStatus());
////
////            View view = inflater.inflate(  , null);
//
//            table.addView(row);
//        }

        //You would want to add your new inflated view to your layout.
//        main.addView(table);

        setContentView(R.layout.content_display_message);

    }




    public void backToMain(View view){

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }

}
