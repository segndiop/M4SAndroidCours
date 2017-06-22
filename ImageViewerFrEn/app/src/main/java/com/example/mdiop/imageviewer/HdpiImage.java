package com.example.mdiop.imageviewer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mdiop on 22/06/2017.
 */

public class HdpiImage extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.hdpi_layout, parentViewGroup, false);

        return rootView;
    }
}
