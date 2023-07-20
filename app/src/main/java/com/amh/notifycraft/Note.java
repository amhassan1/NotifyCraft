package com.amh.notifycraft;

public class Note
{
    private String noteContent;

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public Note(String noteContent) {
        this.noteContent = noteContent;
    }
}
