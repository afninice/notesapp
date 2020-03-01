package afniramadania.tech.notesapp;


import java.util.ArrayList;

import afniramadania.tech.notesapp.entity.Note;

public interface LoadNotesCallback {

    void preExecute();

    void postExecute(ArrayList<Note> notes);

}
