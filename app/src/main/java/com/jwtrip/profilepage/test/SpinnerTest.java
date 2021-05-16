//package com.jwtrip.profilepage;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.Spinner;
//import android.widget.Toast;
//
//
//public class SpinnerTest extends AppCompatActivity {
//    ArrayAdapter<CharSequence> adspin1, adspin2;
//    String choice_do="";
//    String choice_se="";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_spinner_test);
//        final Spinner spin1 = (Spinner)findViewById(R.id.spinner);
//        final Spinner spin2 = (Spinner)findViewById(R.id.spinner2);
//        Button btn_refresh = (Button)findViewById(R.id.btn_refresh);
//
//        adspin1 = ArrayAdapter.createFromResource(this, R.array.spinner_do, android.R.layout.simple_spinner_dropdown_item);
//        adspin1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spin1.setAdapter(adspin1);
//        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//
//                if (adspin1.getItem(i).equals("서울")) {
//                    choice_do = "서울";
//                    adspin2 = ArrayAdapter.createFromResource(SpinnerTest.this,
//                            R.array.spinner_do_seoul, android.R.layout.simple_spinner_dropdown_item);
//
//                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    spin2.setAdapter(adspin2);
//                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//
//                        @Override
//                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                            choice_se = adspin2.getItem(i).toString();
//                        }
//
//                        @Override
//                        public void onNothingSelected(AdapterView<?> adapterView) { }
//                    });
//
//                } else if (adspin1.getItem(i).equals("인천")) {
//
//                    choice_do = "인천";
//                    adspin2 = ArrayAdapter.createFromResource(SpinnerTest.this, R.array.spinner_do_incheon,
//                            android.R.layout.simple_spinner_dropdown_item);
//
//                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    spin2.setAdapter(adspin2);
//                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                        @Override
//                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                            choice_se = adspin2.getItem(i).toString();
//                        }
//
//                        @Override
//                        public void onNothingSelected(AdapterView<?> adapterView) { }
//                    });
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) { }
//        });
//
//        //버튼 클릭시 이벤트입니다.
//        btn_refresh.setOnClickListener(view ->
//                Toast.makeText(SpinnerTest.this, choice_do + "=" + choice_se, Toast.LENGTH_SHORT).show()
//        );
//    }
//}
