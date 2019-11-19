package com.julio.parcial4_olivares_25_2088_2015.ui.preferencias;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.julio.parcial4_olivares_25_2088_2015.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PreferencesFragment extends Fragment {


    public PreferencesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        return textView;
    }

}
