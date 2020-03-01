package afniramadania.tech.cunsumerapp;


import java.util.ArrayList;

import afniramadania.tech.cunsumerapp.entity.Note;

public interface LoadNotesCallback {

    void preExecute();

    void postExecute(ArrayList<Note> notes);

}
