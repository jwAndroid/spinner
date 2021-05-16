package com.jwtrip.profilepage.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.jwtrip.profilepage.R;
import com.jwtrip.profilepage.constants.DomesticConstants;
import com.jwtrip.profilepage.constants.OverseaConstants;



public class OversiaFragment extends Fragment {

    Spinner oversiaSpinnerLev1 , oversiaSpinnerLev2 , oversiaSpinnerLev3;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_oversia, container, false);
        init();

        String[] oversiasItems = getResources().getStringArray(R.array.oversias);
        openSpinner(oversiasItems);

        return view;
    }

    private void init(){
        oversiaSpinnerLev1 = view.findViewById(R.id.oversiaSpinnerLev1);
        oversiaSpinnerLev2 = view.findViewById(R.id.oversiaSpinnerLev2);
        oversiaSpinnerLev3 = view.findViewById(R.id.oversiaSpinnerLev3);
    }


    //나라
    private void openSpinner(String[] items){
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, items);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        oversiaSpinnerLev1.setAdapter(monthAdapter);
        oversiaSpinnerLev1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                overseaCityChoiceMet(items[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
    }

    //도시
    private void openSpinner2(String[] items, String city){
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, items);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        oversiaSpinnerLev2.setAdapter(monthAdapter);
        oversiaSpinnerLev2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String[] cityChoice = new String[0];

                if (city.equals(OverseaConstants.AFRICA_MIDDLE_EAST)){
                    switch (items[position]) {
                        case OverseaConstants.UNITED_ARABEMIRATES:
                            cityChoice = getResources().getStringArray(R.array.arab); break;

                        case OverseaConstants.OMAN:
                            cityChoice = getResources().getStringArray(R.array.mus); break;

                        case OverseaConstants.MOROCO:
                            cityChoice = getResources().getStringArray(R.array.casa); break;

                        case OverseaConstants.CATARRH:
                            cityChoice = getResources().getStringArray(R.array.kata);break;

                        case OverseaConstants.ISRAEL:
                            cityChoice = getResources().getStringArray(R.array.israel);break;

                        case OverseaConstants.REPUBLIC_OF_SOUTHAFRICA:
                            cityChoice = getResources().getStringArray(R.array.southAfrica);break;

                        case OverseaConstants.MAURITIUS:
                            cityChoice = getResources().getStringArray(R.array.mauritius);break;

                        case OverseaConstants.SESEL:
                            cityChoice = getResources().getStringArray(R.array.sesel);break;

                    }
                }
                if (city.equals(OverseaConstants.AUSTRALIA_NEWZEALAND)){
                    switch (items[position]) {
                        case OverseaConstants.AUSTRALIA:
                            cityChoice = getResources().getStringArray(R.array.hoju); break;

                        case OverseaConstants.NEWZEALAND:
                            cityChoice = getResources().getStringArray(R.array.newLand); break;

                        case OverseaConstants.FIJI:
                            cityChoice = getResources().getStringArray(R.array.pgLand); break;
                    }
                }
                if (city.equals(OverseaConstants.EAST_ASIA)){
                    switch (items[position]) {
                        case OverseaConstants.TAIWAN:
                            cityChoice = getResources().getStringArray(R.array.deaman);break;
                        case OverseaConstants.CHINA:
                            cityChoice = getResources().getStringArray(R.array.china);break;

                        case OverseaConstants.MONGOLIA:
                            cityChoice = getResources().getStringArray(R.array.mongolia);break;
                    }
                }
                if (city.equals(OverseaConstants.EUROPE)){

                    switch (items[position]) {
                        case OverseaConstants.RUSSIA:
                            cityChoice = getResources().getStringArray(R.array.russia);

                            break;
                        case OverseaConstants.ENGLAND:
                            cityChoice = getResources().getStringArray(R.array.england);

                            break;
                        case OverseaConstants.IRELAND:
                            cityChoice = getResources().getStringArray(R.array.iLand);
                            break;

                        case OverseaConstants.FRANCE:
                            cityChoice = getResources().getStringArray(R.array.france);
                            break;

                        case OverseaConstants.SPAIN:
                            cityChoice = getResources().getStringArray(R.array.spain);
                            break;
                        case OverseaConstants.PORTUGAL:
                            cityChoice = getResources().getStringArray(R.array.portugal);
                            break;
                        case OverseaConstants.BELGIUM:
                            cityChoice = getResources().getStringArray(R.array.belgium);
                            break;
                        case OverseaConstants.NETHERLANDS:
                            cityChoice = getResources().getStringArray(R.array.netherlands);
                            break;
                        case OverseaConstants.GERMANY:
                            cityChoice = getResources().getStringArray(R.array.germany);
                            break;
                        case OverseaConstants.SWISS:
                            cityChoice = getResources().getStringArray(R.array.swiss);
                            break;
                        case OverseaConstants.AUSTRIA:
                            cityChoice = getResources().getStringArray(R.array.austria);
                            break;
                        case OverseaConstants.ITALY:
                            cityChoice = getResources().getStringArray(R.array.italy);
                            break;
                        case OverseaConstants.GREECE:
                            cityChoice = getResources().getStringArray(R.array.greece);
                            break;
                        case OverseaConstants.MALTA:
                            cityChoice = getResources().getStringArray(R.array.malta);
                            break;
                        case OverseaConstants.DENMARK:
                            cityChoice = getResources().getStringArray(R.array.denmark);
                            break;
                        case OverseaConstants.NORWAY:
                            cityChoice = getResources().getStringArray(R.array.norway);
                            break;
                        case OverseaConstants.SWEDEN:
                            cityChoice = getResources().getStringArray(R.array.sweden);
                            break;
                        case OverseaConstants.FINLAND:
                            cityChoice = getResources().getStringArray(R.array.finland);
                            break;
                        case OverseaConstants.ICELAND:
                            cityChoice = getResources().getStringArray(R.array.iceland);
                            break;
                        case OverseaConstants.POLAND:
                            cityChoice = getResources().getStringArray(R.array.poland);
                            break;
                        case OverseaConstants.CZECH:
                            cityChoice = getResources().getStringArray(R.array.czech);
                            break;
                        case OverseaConstants.HUNGARY:
                            cityChoice = getResources().getStringArray(R.array.hungary);
                            break;
                        case OverseaConstants.CROATIA:
                            cityChoice = getResources().getStringArray(R.array.croatia);
                            break;
                        case OverseaConstants.TURKEY:
                            cityChoice = getResources().getStringArray(R.array.turkey);
                            break;
                    }
                }
                if (city.equals(OverseaConstants.HONGKONG_MACAU)){
                    switch (items[position]) {
                        case OverseaConstants.HONGKONG:
                            cityChoice = getResources().getStringArray(R.array.hongcong);
                            break;
                        case OverseaConstants.MACAO:
                            cityChoice = getResources().getStringArray(R.array.macao);
                            break;
                    }
                }
                if (city.equals(OverseaConstants.JAPAN)){

                    switch (items[position]) {
                        case OverseaConstants.OSACA:
                            cityChoice = getResources().getStringArray(R.array.osaca);
                            break;
                        case OverseaConstants.TOKYO:
                            cityChoice = getResources().getStringArray(R.array.tokyo);
                            break;
                        case OverseaConstants.HUKUOKA:
                            cityChoice = getResources().getStringArray(R.array.hukuoka);
                            break;
                        case OverseaConstants.OKINAWA:
                            cityChoice = getResources().getStringArray(R.array.okinawa);
                            break;
                        case OverseaConstants.NAGOYA:
                            cityChoice = getResources().getStringArray(R.array.nagoya);
                            break;
                        case OverseaConstants.JUKOKU:
                            cityChoice = getResources().getStringArray(R.array.jukoku);
                            break;
                        case OverseaConstants.SIKOCU:
                            cityChoice = getResources().getStringArray(R.array.sikocu);
                            break;
                        case OverseaConstants.HUCAIDO:
                            cityChoice = getResources().getStringArray(R.array.hucaido);
                            break;
                    }

                }
                if (city.equals(OverseaConstants.NORTHAMERICA_SOUTHAMERICA)){

                    switch (items[position]) {
                        case OverseaConstants.AMERICA:
                            cityChoice = getResources().getStringArray(R.array.america);
                            break;

                        case OverseaConstants.HAWAI:
                            cityChoice = getResources().getStringArray(R.array.hawai);
                            break;

                        case OverseaConstants.CANADA:
                            cityChoice = getResources().getStringArray(R.array.canada);
                            break;

                        case OverseaConstants.MEXICO:
                            cityChoice = getResources().getStringArray(R.array.mexico);
                            break;
                    }
                }
                if (city.equals(OverseaConstants.SOUTHEAST_ASIA)){

                    switch (items[position]) {
                        case OverseaConstants.VIETNAM:
                            cityChoice = getResources().getStringArray(R.array.vietnam);
                            break;
                        case OverseaConstants.THAILAND:
                            cityChoice = getResources().getStringArray(R.array.thailand);
                            break;
                        case OverseaConstants.LAOS:
                            cityChoice = getResources().getStringArray(R.array.laos);
                            break;
                        case OverseaConstants.MYANMAR:
                            cityChoice = getResources().getStringArray(R.array.myanmar);
                            break;
                        case OverseaConstants.CAMBODIA:
                            cityChoice = getResources().getStringArray(R.array.cambodia);
                            break;
                        case OverseaConstants.PHILIPPINES:
                            cityChoice = getResources().getStringArray(R.array.philippines);
                            break;
                        case OverseaConstants.PALAU:
                            cityChoice = getResources().getStringArray(R.array.palau);
                            break;
                        case OverseaConstants.MALAYSIA:
                            cityChoice = getResources().getStringArray(R.array.malaysia);
                            break;
                        case OverseaConstants.SINGAPORE:
                            cityChoice = getResources().getStringArray(R.array.singapore);
                            break;
                        case OverseaConstants.INDONESIA:
                            cityChoice = getResources().getStringArray(R.array.indonesia);
                            break;
                        case OverseaConstants.NEPAL:
                            cityChoice = getResources().getStringArray(R.array.nepal);
                            break;
                        case OverseaConstants.INDIA:
                            cityChoice = getResources().getStringArray(R.array.india);
                            break;
                        case OverseaConstants.MALDIVE:
                            cityChoice = getResources().getStringArray(R.array.maldive);
                            break;
                    }
                }

                openSpinner3(cityChoice , items[position]);

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
    }

    //지역
    private void openSpinner3(String[] items, String city){
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, items);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        oversiaSpinnerLev3.setAdapter(monthAdapter);
        oversiaSpinnerLev3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
    }


    private void overseaCityChoiceMet(String itemCheck){
        String[] countyChoice;

        switch (itemCheck){

            case OverseaConstants.AFRICA_MIDDLE_EAST :
                countyChoice = getResources().getStringArray(R.array.africa_mid);
                break;

            case OverseaConstants.AUSTRALIA_NEWZEALAND :
                countyChoice = getResources().getStringArray(R.array.hoju_newland);
                break;

            case OverseaConstants.EAST_ASIA :
                countyChoice = getResources().getStringArray(R.array.asiaDong);
                break;

            case OverseaConstants.EUROPE :
                countyChoice = getResources().getStringArray(R.array.europe);
                break;

            case OverseaConstants.HONGKONG_MACAU :
                countyChoice = getResources().getStringArray(R.array.hongAndMacao);
                break;

            case OverseaConstants.JAPAN :
                countyChoice = getResources().getStringArray(R.array.japan);
                break;

            case OverseaConstants.NORTHAMERICA_SOUTHAMERICA :
                countyChoice = getResources().getStringArray(R.array.northamerica);
                break;

            case OverseaConstants.SOUTHEAST_ASIA :
                countyChoice = getResources().getStringArray(R.array.southeastasia);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + itemCheck);
        }

        openSpinner2(countyChoice , itemCheck);
    }

}