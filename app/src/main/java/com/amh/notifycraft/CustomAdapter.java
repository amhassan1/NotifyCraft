package com.amh.notifycraft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Note> {

    List<Note> noteList;
    int customNoteId;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<Note> objects) {
        super(context, resource, objects);
        this.noteList = objects;
        this.customNoteId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view != null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(customNoteId, null);
        }

        TextView noteContentView = view.findViewById(R.id.note_content);
        Button notifyMeButton = view.findViewById(R.id.notify_me_button);

        Note note = noteList.get(position);

        noteContentView.setText(note.getNoteContent());

        return view;
    }

    @Override
    public int getCount() {
        return noteList.size();
    }
}
