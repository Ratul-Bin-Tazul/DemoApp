package com.drbt.demoapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btn1,btn2,btn3;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (ImageButton)findViewById(R.id.btn1);
        btn2 = (ImageButton)findViewById(R.id.btn2);
        btn3 = (ImageButton)findViewById(R.id.btn3);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragment = new option01Activity();
        //Scene(fragment);
        fragmentTransaction.add(R.id.fragment, fragment);
        fragmentTransaction.setCustomAnimations(R.animator.fragment_slide_right_enter,
                R.animator.fragment_slide_right_exit);
        fragmentTransaction.commit();

    }

    public void changeFragment(View view) {


        if(view == findViewById(R.id.btn1)) {
            btn1.setImageResource(R.mipmap.ic_home_white_24dp);
            btn2.setImageResource(R.mipmap.ic_language_white_24dp);
            btn3.setImageResource(R.mipmap.ic_graphic_eq_white_24dp);

            btn1.setBackgroundColor(Color.parseColor("#283593"));
            btn2.setBackgroundColor(Color.parseColor("#2f5597"));
            btn3.setBackgroundColor(Color.parseColor("#2f5597"));

            fragment = new option01Activity();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            ft.setCustomAnimations(R.animator.fragment_slide_right_enter,
                    R.animator.fragment_slide_right_exit);
            ft.replace(R.id.fragment,fragment);


            ft.commit();
        }

        if(view == findViewById(R.id.btn2)) {
            btn1.setImageResource(R.mipmap.ic_home_white_24dp);
            btn2.setImageResource(R.mipmap.ic_language_white_24dp);
            btn3.setImageResource(R.mipmap.ic_graphic_eq_white_24dp);

            btn1.setBackgroundColor(Color.parseColor("#2f5597"));
            btn2.setBackgroundColor(Color.parseColor("#283593"));
            btn3.setBackgroundColor(Color.parseColor("#2f5597"));

            fragment = new option02Activity();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();

            //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
            ft.setCustomAnimations(R.animator.fragment_slide_right_enter,
                    R.animator.fragment_slide_right_exit);


            ft.replace(R.id.fragment,fragment);
            ft.commit();
        }

        if(view == findViewById(R.id.btn3)) {
            btn1.setImageResource(R.mipmap.ic_home_white_24dp);
            btn2.setImageResource(R.mipmap.ic_language_white_24dp);
            btn3.setImageResource(R.mipmap.ic_graphic_eq_white_24dp);

            btn1.setBackgroundColor(Color.parseColor("#2f5597"));
            btn2.setBackgroundColor(Color.parseColor("#2f5597"));
            btn3.setBackgroundColor(Color.parseColor("#283593"));


            fragment = new option03Activity();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            ft.setCustomAnimations(R.animator.fragment_slide_right_enter,
                    R.animator.fragment_slide_right_exit);

            ft.replace(R.id.fragment,fragment);
            ft.commit();
        }


    }


}
