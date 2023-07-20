package com.amh.notifycraft.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.amh.notifycraft.CustomAdapter;
import com.amh.notifycraft.Note;
import com.amh.notifycraft.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Note> noteList = new ArrayList<>();
        noteList.add(new Note("hi"));
        noteList.add(new Note("test"));

        GridView gridView = findViewById(R.id.notifications_grid);
        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.custom_note, noteList);
        gridView.setAdapter(customAdapter);
    }
}