package com.example.edmardiaz.fragmentrecyclerview;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by EdmarDiaz on 1/24/2018.
 */

public class FragmentFavorite extends Fragment {

    View v;

    public FragmentFavorite() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.favorite_fragment,container,false);
        return v;
    }
}
