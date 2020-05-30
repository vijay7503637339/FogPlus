package com.example.fogplus;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


/**
 * A simple {@link Fragment} subclass.
 */
public class Ajenthome extends Fragment {

    public Ajenthome() {
        // Required empty public constructor
    }

    LinearLayout jobcard,booking,crm,reports,customer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_ajenthome, container, false);
        jobcard=view.findViewById(R.id.jobcard);
        booking=view.findViewById(R.id.booking);
        crm=view.findViewById(R.id.crm);
        reports=view.findViewById(R.id.reports);
        customer=view.findViewById(R.id.customer);
        jobcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),JobCard.class);
                startActivity(in);
            }
        });

        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),AjentBooking.class);
                startActivity(in);
            }
        });  crm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),CRM.class);
                startActivity(in);
            }
        }); reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),Reports.class);
                startActivity(in);
            }
        });
        return view;
    }
}
