package com.drbt.demoapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by SAMSUNG on 1/26/2017.
 */

public class option03Activity extends Fragment {
    Button p3b1,p3b2,p3b3,p3b4;
    Fragment fragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.option03, container, false);



        //setting up the inner fragment
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragment = new template_data();
        //Scene(fragment);
        fragmentTransaction.add(R.id.p3fragment, fragment);
        fragmentTransaction.setCustomAnimations(R.animator.fragment_slide_left,
                R.animator.fragment_slide_left_exit);
        fragmentTransaction.commit();

        p3b1 = (Button)view.findViewById(R.id.p3b1);
        p3b2 = (Button)view.findViewById(R.id.p3b2);
        p3b3 = (Button)view.findViewById(R.id.p3b3);
        p3b4 = (Button)view.findViewById(R.id.p3b4);

        p3b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p3b1.setBackgroundResource(R.drawable.selectedmenu_style);
                p3b2.setBackgroundResource(R.drawable.submenu_style);
                p3b3.setBackgroundResource(R.drawable.submenu_style);
                p3b4.setBackgroundResource(R.drawable.submenu_style);

                p3b1.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);
                p3b2.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p3b3.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p3b4.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);

                //changing the inner template fragment
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p3fragment,fragment);
                ft.commit();


            }
        });

        p3b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p3b1.setBackgroundResource(R.drawable.submenu_style);
                p3b2.setBackgroundResource(R.drawable.selectedmenu_style);
                p3b3.setBackgroundResource(R.drawable.submenu_style);
                p3b4.setBackgroundResource(R.drawable.submenu_style);

                p3b1.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p3b2.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);
                p3b3.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p3b4.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);

                //changing the inner template fragment
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p3fragment,fragment);
                ft.commit();



            }
        });

        p3b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p3b1.setBackgroundResource(R.drawable.submenu_style);
                p3b2.setBackgroundResource(R.drawable.submenu_style);
                p3b3.setBackgroundResource(R.drawable.selectedmenu_style);
                p3b4.setBackgroundResource(R.drawable.submenu_style);


                p3b1.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p3b2.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p3b3.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);
                p3b4.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);


                //changing the inner template fragment
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p3fragment,fragment);
                ft.commit();


            }
        });

        p3b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p3b1.setBackgroundResource(R.drawable.submenu_style);
                p3b2.setBackgroundResource(R.drawable.submenu_style);
                p3b3.setBackgroundResource(R.drawable.submenu_style);
                p3b4.setBackgroundResource(R.drawable.selectedmenu_style);


                p3b1.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p3b2.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p3b3.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p3b4.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);


                //changing the inner template fragment
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p3fragment,fragment);
                ft.commit();


            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}