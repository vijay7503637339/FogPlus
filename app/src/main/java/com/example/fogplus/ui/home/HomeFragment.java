package com.example.fogplus.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.fogplus.Bookings;
import com.example.fogplus.MainDrawer;
import com.example.fogplus.OrderHistory;
import com.example.fogplus.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    LinearLayout orderhistory,myAppointment,MyVehicle,AddVehicle;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        orderhistory=root.findViewById(R.id.orderhistory);
        myAppointment=root.findViewById(R.id.myAppointment);
        MyVehicle=root.findViewById(R.id.MyVehicle);
        AddVehicle=root.findViewById(R.id.AddVehicle);

        orderhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), OrderHistory.class);
                startActivity(intent);
            }
        });


        myAppointment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Bookings.class);
                startActivity(intent);
            }
        });
        return root;
    }
}
