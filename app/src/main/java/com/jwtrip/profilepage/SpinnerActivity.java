package com.jwtrip.profilepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.jwtrip.profilepage.constants.DomesticConstants;
import com.jwtrip.profilepage.fragment.DomesticFragment;
import com.jwtrip.profilepage.fragment.OversiaFragment;

//        ArrayAdapter monthAdapter = ArrayAdapter
//                .createFromResource(this, R.array.test, android.R.layout.simple_spinner_dropdown_item);

public class SpinnerActivity extends AppCompatActivity {

    RelativeLayout RelDomesticFragment,RelOversiaFragment;
    TextView resultTxt;

    private FragmentManager fragmentManager;
    private DomesticFragment domesticFragment;
    private OversiaFragment oversiaFragment;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        initAndSetUpFragment();
        transaction = fragmentManager.beginTransaction();

    }

//  transaction
//      .add(R.id.frameLayout, domesticFragment)
//      .commitAllowingStateLoss();

    @SuppressLint("NonConstantResourceId")
    public void clickHandler(View view) {

        transaction = fragmentManager.beginTransaction();

        switch(view.getId()) {
            case R.id.RelDomesticFragment:
                  transaction.replace(R.id.frameLayout, domesticFragment).commit();
                break;

            case R.id.RelOversiaFragment:
                  transaction.replace(R.id.frameLayout, oversiaFragment).commit();
                break;
        }

    }

    private void setUpFragment(){
        fragmentManager = getSupportFragmentManager();
        domesticFragment = new DomesticFragment();
        oversiaFragment = new OversiaFragment();
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, domesticFragment).commitAllowingStateLoss();
    }

    private void initAndSetUpFragment(){
        RelDomesticFragment = findViewById(R.id.RelDomesticFragment);
        RelOversiaFragment = findViewById(R.id.RelOversiaFragment);
        setUpFragment();
    }
}