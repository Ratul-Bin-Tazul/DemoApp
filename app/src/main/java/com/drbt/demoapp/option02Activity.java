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

public class option02Activity extends Fragment {

    Button p2b1,p2b2,p2b3,p2b4,p2b5,p2b6;
    Fragment fragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.option02, container, false);


        //setting up the fragment
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragment = new template_data();
        //Scene(fragment);
        fragmentTransaction.add(R.id.p2fragment, fragment);
        fragmentTransaction.setCustomAnimations(R.animator.inner_fragment_delayed_enter,
                R.animator.fragment_slide_right_exit);
        fragmentTransaction.commit();

        //connecting the buttons
        p2b1 = (Button)view.findViewById(R.id.p2b1);
        p2b2 = (Button)view.findViewById(R.id.p2b2);
        p2b3 = (Button)view.findViewById(R.id.p2b3);
        p2b4 = (Button)view.findViewById(R.id.p2b4);
        p2b5 = (Button)view.findViewById(R.id.p2b5);
        p2b6 = (Button)view.findViewById(R.id.p2b6);



        p2b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2b1.setBackgroundResource(R.drawable.selectedmenu_style);
                p2b2.setBackgroundResource(R.drawable.submenu_style);
                p2b3.setBackgroundResource(R.drawable.submenu_style);
                p2b4.setBackgroundResource(R.drawable.submenu_style);
                p2b5.setBackgroundResource(R.drawable.submenu_style);
                p2b6.setBackgroundResource(R.drawable.submenu_style);

                p2b1.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);
                p2b2.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b3.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b4.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b5.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b6.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);

                //changing the inner template fragment
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p2fragment,fragment);
                ft.commit();

            }
        });

        p2b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2b1.setBackgroundResource(R.drawable.submenu_style);
                p2b2.setBackgroundResource(R.drawable.selectedmenu_style);
                p2b3.setBackgroundResource(R.drawable.submenu_style);
                p2b4.setBackgroundResource(R.drawable.submenu_style);
                p2b5.setBackgroundResource(R.drawable.submenu_style);
                p2b6.setBackgroundResource(R.drawable.submenu_style);

                p2b1.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b2.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);
                p2b3.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b4.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b5.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b6.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);

                //changing the inner template fragment
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p2fragment,fragment);
                ft.commit();

            }
        });

        p2b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2b1.setBackgroundResource(R.drawable.submenu_style);
                p2b2.setBackgroundResource(R.drawable.submenu_style);
                p2b3.setBackgroundResource(R.drawable.selectedmenu_style);
                p2b4.setBackgroundResource(R.drawable.submenu_style);
                p2b5.setBackgroundResource(R.drawable.submenu_style);
                p2b6.setBackgroundResource(R.drawable.submenu_style);

                p2b1.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b2.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b3.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);
                p2b4.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b5.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b6.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);

                //changing the inner template fragment
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p2fragment,fragment);
                ft.commit();

            }
        });

        p2b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2b1.setBackgroundResource(R.drawable.submenu_style);
                p2b2.setBackgroundResource(R.drawable.submenu_style);
                p2b3.setBackgroundResource(R.drawable.submenu_style);
                p2b4.setBackgroundResource(R.drawable.selectedmenu_style);
                p2b5.setBackgroundResource(R.drawable.submenu_style);
                p2b6.setBackgroundResource(R.drawable.submenu_style);

                p2b1.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b2.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b3.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b4.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);
                p2b5.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b6.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);

                //changing the inner template fragment
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p2fragment,fragment);
                ft.commit();

            }
        });

        p2b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2b1.setBackgroundResource(R.drawable.submenu_style);
                p2b2.setBackgroundResource(R.drawable.submenu_style);
                p2b3.setBackgroundResource(R.drawable.submenu_style);
                p2b4.setBackgroundResource(R.drawable.submenu_style);
                p2b5.setBackgroundResource(R.drawable.selectedmenu_style);
                p2b6.setBackgroundResource(R.drawable.submenu_style);

                p2b1.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b2.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b3.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b4.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b5.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);
                p2b6.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);

                //changing the inner template fragment
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p2fragment,fragment);
                ft.commit();

            }
        });

        p2b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2b1.setBackgroundResource(R.drawable.submenu_style);
                p2b2.setBackgroundResource(R.drawable.submenu_style);
                p2b3.setBackgroundResource(R.drawable.submenu_style);
                p2b4.setBackgroundResource(R.drawable.submenu_style);
                p2b5.setBackgroundResource(R.drawable.submenu_style);
                p2b6.setBackgroundResource(R.drawable.selectedmenu_style);

                p2b1.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b2.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b3.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b4.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b5.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p2b6.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);

                //changing the inner template fragment
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p2fragment,fragment);
                ft.commit();

            }
        });
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}