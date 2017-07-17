package com.example.patricio.walter;

/**
 * Created by patricio on 13/05/17.
 */

public class TodoItem {

    String text;
    boolean status;

    TodoItem(String str, boolean done){
        text = str;
        status = done;
    }

    // get and set
    public String getText() {
        return text;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setText(String text) {
        this.text = text;
    }
}
