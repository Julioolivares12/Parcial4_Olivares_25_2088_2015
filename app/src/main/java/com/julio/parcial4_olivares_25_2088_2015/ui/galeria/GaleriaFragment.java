package com.julio.parcial4_olivares_25_2088_2015.ui.galeria;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.julio.parcial4_olivares_25_2088_2015.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GaleriaFragment extends Fragment {


    public GaleriaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_galeria, container, false);
    }

}
