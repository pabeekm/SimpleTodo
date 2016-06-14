package com.example.pbeekman.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        EditText etItem = (EditText)findViewById(R.id.etItem);
        try {
            etItem.setText(getIntent().getExtras().getString("text"));
        }
        catch (NullPointerException e) {
        }
    }

    public void onSaveItem(View v) {
        EditText etItem = (EditText)findViewById(R.id.etItem);
        Intent i = new Intent(EditItemActivity.this, MainActivity.class);
        i.putExtra("text", etItem.getText().toString());
        i.putExtra("pos", getIntent().getExtras().getInt("pos"));
        startActivity(i);
        this.finish();
    }

}
