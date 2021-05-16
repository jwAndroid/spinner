package com.jwtrip.profilepage.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.jwtrip.profilepage.R;
import com.jwtrip.profilepage.constants.DomesticConstants;

import org.jetbrains.annotations.NotNull;

public class DomesticFragment extends Fragment {

    Spinner spinner , spinner2;
    TextView resultText;
    View view;

    private Activity cusContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_domestic, container, false);
        init();

        String[] domesticItems = getResources().getStringArray(R.array.domestic);
        openSpinner(domesticItems);

        return view;
    }

    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);
        if (context instanceof Activity){
            cusContext = (Activity)context;
        }
    }

    private void init(){
        spinner = view.findViewById(R.id.domesticSpinnerLev1);
        spinner2 = view.findViewById(R.id.domesticSpinnerLev2);
        resultText = view.findViewById(R.id.text2);
    }

    //도시
    private void openSpinner(String[] items){
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, items);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(monthAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                domesticChoiceMet(items[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
    }
    //지역
    private void openSpinner2(String[] items, String city){
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, items);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(monthAdapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (city != null && items[position] != null){
//                    resultRegion(items[position]);
//                    resultCity(city);
//                    Log.d("스피너 결과값:", "최종: " +resultCity(city)+" "+resultRegion(items[position]));
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
    }

    private void domesticChoiceMet(String itemCheck){
        if (itemCheck.equals(DomesticConstants.SEOUL)){
            String[] seoul = getResources().getStringArray(R.array.seoul);
            openSpinner2(seoul , itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.BUSAN)){
            String[] busan = getResources().getStringArray(R.array.busan);
            openSpinner2(busan, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.DAEGU)){
            String[] daegu = getResources().getStringArray(R.array.daegu);
            openSpinner2(daegu, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.INCHUN)){
            String[] inchen = getResources().getStringArray(R.array.inchen);
            openSpinner2(inchen, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.GWANGJU)){
            String[] gwangju = getResources().getStringArray(R.array.gwangju);
            openSpinner2(gwangju, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.DAEJEON)){
            String[] daejeon = getResources().getStringArray(R.array.daejeon);
            openSpinner2(daejeon, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.ULSAN)){
            String[] ulsan = getResources().getStringArray(R.array.ulsan);
            openSpinner2(ulsan, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.SEJONG)){
            String[] sejong = getResources().getStringArray(R.array.sejong);
            openSpinner2(sejong, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.GYEONGGI)){
            String[] gyeonggi = getResources().getStringArray(R.array.gyeonggi);
            openSpinner2(gyeonggi, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.GANGWON)){
            String[] gangwon = getResources().getStringArray(R.array.gangwon);
            openSpinner2(gangwon, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.NORTHCHUNGCHEONG)){
            String[] northchungcheong = getResources().getStringArray(R.array.northchungcheong);
            openSpinner2(northchungcheong, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.SOUTHCHUNGCHEONG)){
            String[] southchungcheong = getResources().getStringArray(R.array.southchungcheong);
            openSpinner2(southchungcheong, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.NORTHJEOLLA)){
            String[] northjeolla = getResources().getStringArray(R.array.northjeolla);
            openSpinner2(northjeolla, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.SOUTHJEOLLA)){
            String[] southjeolla = getResources().getStringArray(R.array.southjeolla);
            openSpinner2(southjeolla, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.NORTHGYEONGSANG)){
            String[] northgyeongsang = getResources().getStringArray(R.array.northgyeongsang);
            openSpinner2(northgyeongsang, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.SOUTHGYEONGSANG)){
            String[] southgyeongsang = getResources().getStringArray(R.array.southgyeongsang);
            openSpinner2(southgyeongsang, itemCheck);
        }
        if (itemCheck.equals(DomesticConstants.JEJUDO)){
            String[] jejudo = getResources().getStringArray(R.array.jejudo);
            openSpinner2(jejudo, itemCheck);
        }
    }


//     String resultRegion(String region){ return region; }
//     String resultCity(String city){ return city; }


}