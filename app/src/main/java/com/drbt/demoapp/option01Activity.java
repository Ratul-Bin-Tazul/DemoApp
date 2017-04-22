package com.drbt.demoapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by SAMSUNG on 1/26/2017.
 */

public class option01Activity extends Fragment{

    Button p1b1,p1b2,p1b3;
    Fragment fragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View view = inflater.inflate(R.layout.option01, container, false);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragment = new template_data();
        //Scene(fragment);
        fragmentTransaction.add(R.id.p1fragment, fragment);
        fragmentTransaction.setCustomAnimations(R.animator.inner_fragment_delayed_enter,
                R.animator.fragment_slide_right_exit);
        fragmentTransaction.commit();


        p1b1 = (Button)view.findViewById(R.id.p1b1);
        p1b2 = (Button)view.findViewById(R.id.p1b2);
        p1b3 = (Button)view.findViewById(R.id.p1b3);

        p1b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1b1.setBackgroundResource(R.drawable.selectedmenu_style);
                p1b2.setBackgroundResource(R.drawable.submenu_style);
                p1b3.setBackgroundResource(R.drawable.submenu_style);

                p1b1.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);
                p1b2.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p1b3.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);

                //changing the inner template layout
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p1fragment,fragment);


                ft.commit();

            }
        });

        p1b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Drawable leftArrowImg = getContext().getResources().getDrawable(R.mipmap.left_arrow_white);
                p1b1.setBackgroundResource(R.drawable.submenu_style);
                p1b2.setBackgroundResource(R.drawable.selectedmenu_style);
                p1b3.setBackgroundResource(R.drawable.submenu_style);

                p1b1.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p1b2.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);
                p1b3.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);

                //changing the inner template layout
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p1fragment,fragment);


                ft.commit();

            }
        });

        p1b3.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                p1b1.setBackgroundResource(R.drawable.submenu_style);
                p1b2.setBackgroundResource(R.drawable.submenu_style);
                p1b3.setBackgroundResource(R.drawable.selectedmenu_style);

                p1b1.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p1b2.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                p1b3.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.left_indicator_with_shadow2,0);

                //changing the inner template layout
                fragment = new template_data();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.setCustomAnimations(R.animator.fragment_slide_left,
                        R.animator.fragment_slide_left_exit);
                ft.replace(R.id.p1fragment,fragment);


                ft.commit();


            }
        });

        // Inflate the layout for this fragment
        return view;
    }

//    public void changeBg(View v) {
//        p1b1 = (Button)getView().findViewById(R.id.p1b1);
//        p1b2 = (Button)getView().findViewById(R.id.p1b2);
//        p1b3 = (Button)getView().findViewById(R.id.p1b3);
//
//        if(v==getView().findViewById(R.id.p1b1)) {
//            p1b1.setBackgroundResource(R.drawable.selectedmenu_style);
//            p1b2.setBackgroundResource(R.drawable.submenu_style);
//            p1b3.setBackgroundResource(R.drawable.submenu_style);
//
//        }
//        if(v==getView().findViewById(R.id.p1b2)) {
//            p1b1.setBackgroundResource(R.drawable.submenu_style);
//            p1b2.setBackgroundResource(R.drawable.selectedmenu_style);
//            p1b3.setBackgroundResource(R.drawable.submenu_style);
//
//        }
//        if(v==getView().findViewById(R.id.p1b3)) {
//            p1b1.setBackgroundResource(R.drawable.submenu_style);
//            p1b2.setBackgroundResource(R.drawable.submenu_style);
//            p1b3.setBackgroundResource(R.drawable.selectedmenu_style);
//
//        }
//    }



}
