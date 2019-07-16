package sg.edu.rp.c346.p10problemstatement;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Frag1 extends Fragment {

    Button btnChangeColor;

    ArrayList <String> alcolor;
    public Frag1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_1, container,false);
        btnChangeColor = view.findViewById(R.id.btnColor);
        alcolor = new ArrayList<String>();
        alcolor.add("GREEN");
        alcolor.add("BLUE");
        alcolor.add("YELLOW");

        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.shuffle(alcolor);
                alcolor.get(0);

                int color;
                if ( alcolor.get(0).equals("GREEN")) {
                    color = Color.GREEN;
                } else if (alcolor.get(0).equals("BLUE")) {
                    color = Color.BLUE;
                } else if (alcolor.get(0).equals("YELLOW")) {
                    color = Color.YELLOW;
                } else {
                    color = Color.RED;
                }
                view.setBackgroundColor(color);
            }
        });
        return view;
    }

}