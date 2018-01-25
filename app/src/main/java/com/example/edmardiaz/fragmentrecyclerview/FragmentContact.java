package com.example.edmardiaz.fragmentrecyclerview;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EdmarDiaz on 1/24/2018.
 */

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;

    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment,container,false);
        myrecyclerview = (RecyclerView)v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Edmar Diaz", "09092134567", R.drawable.avatar3));
        lstContact.add(new Contact("Tami Ascaño", "09XXXXXXXXX", R.drawable.avatar2));
        lstContact.add(new Contact("Edison Escabarte", "09XXXXXXXXX", R.drawable.avatar3));
        lstContact.add(new Contact("Renz Sause", "09XXXXXXXXX", R.drawable.avatar2));
        lstContact.add(new Contact("Kirt Tan", "09XXXXXXXXX", R.drawable.avatar3));
        lstContact.add(new Contact("Adrian Borruel", "09XXXXXXXXX", R.drawable.avatar2));
        lstContact.add(new Contact("Bea Enriquez", "09XXXXXXXXX", R.drawable.avatar3));
        lstContact.add(new Contact("Benjo Garcia", "09XXXXXXXXX", R.drawable.avatar2));
        lstContact.add(new Contact("Christine Llave", "09XXXXXXXXX", R.drawable.avatar3));
        lstContact.add(new Contact("Chester Ligutan", "09XXXXXXXXX", R.drawable.avatar2));

    }
}
