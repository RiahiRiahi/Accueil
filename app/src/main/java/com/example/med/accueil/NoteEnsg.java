package com.example.med.accueil;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by MED on 22/03/2017.
 */

public class NoteEnsg extends Fragment {
    View myview;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.noteensg, container, false);

        return myView;

    }
}