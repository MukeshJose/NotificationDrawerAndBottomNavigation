package com.example.notificationdrawerandbottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class BlankFragmentOne extends Fragment {


    private Button button;
    private Button button2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank_one, container, false);
        initView(view);
//        button1 = view.findViewById(R.id.button);
//        button2 = view.findViewById(R.id.button_2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getActivity(), "hello", Toast.LENGTH_SHORT).show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SampleActivity.class);
                startActivity(intent);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }


    private void initView(View view) {
        button = view.findViewById(R.id.button);
        button2 = view.findViewById(R.id.button_2);
    }
}