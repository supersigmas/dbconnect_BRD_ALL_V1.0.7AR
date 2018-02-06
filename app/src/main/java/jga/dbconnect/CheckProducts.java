package jga.dbconnect;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import hitesh.sqlapp.R;


/**
 * Created by jga on 2017.06.29.
 */

public class CheckProducts extends Activity {

    jga.dbconnect.ConnectionClass connectionClass;
    EditText InCoater1, InCoater2,InCoater3,InCoater4,InCoater5,InCoater6,InCoater7,InCoater8,InCoater9,InCoater10,InCoater11,InCoater12,InCoater13,InCoater14,InCoater15,InCoater16,InCoater17,InCoater18,InCoater19,InCoater20;
    EditText InCoater21 ,InCoater22,InCoater23,InCoater24,InCoater25,InCoater26,InCoater27,InCoater28,InCoater29,InCoater30;
    EditText MarkerC1, MarkerC2,MarkerC3,MarkerC4,MarkerC5,MarkerC6,MarkerC7,MarkerC8,MarkerC9,MarkerC10,MarkerC11,MarkerC12,MarkerC13,MarkerC14,MarkerC15,MarkerC16,MarkerC17,MarkerC18,MarkerC19,MarkerC20;
    EditText MarkerC21,MarkerC22,MarkerC23,MarkerC24,MarkerC25,MarkerC26,MarkerC27,MarkerC28,MarkerC29,MarkerC30;
    EditText RackNumber, JobNumber1, JobNumber3,JobNumber4,JobNumber5,JobNumber6,JobNumber7,JobNumber8,JobNumber9,JobNumber10,JobNumber2, Marker, Holder,NoHolder, Dryer, Coater, CoaterHolder, EdtText;
    ProgressBar pbbar;
    ListView lstpro;
    Button btnadd, BtnReject, BtnCoater, BtnDeleteRack, BtnMarker, BtnDryer, BtnDone, BtnBack, BtnKamera, BtnLaikiklis, BtnPadeklas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkproducs);

        connectionClass = new jga.dbconnect.ConnectionClass();
        EdtText = (EditText) findViewById(R.id.EdtText);
        Holder = (EditText) findViewById(R.id.EdtHolder);

        //NoHolder = (EditText) findViewById(R.id.EdtNoHolder);
        Coater = (EditText) findViewById(R.id.EdtCoater);
        CoaterHolder = (EditText) findViewById(R.id.EdtCoterHolder);

        //Status1 = 1;


        InCoater1 = (EditText) findViewById(R.id.EdtCHolder1);
        InCoater2 = (EditText) findViewById(R.id.EdtCHolder2);
        InCoater3 = (EditText) findViewById(R.id.EdtCHolder3);
        InCoater4 = (EditText) findViewById(R.id.EdtCHolder4);
        InCoater5 = (EditText) findViewById(R.id.EdtCHolder5);
        InCoater6 = (EditText) findViewById(R.id.EdtCHolder6);
        InCoater7 = (EditText) findViewById(R.id.EdtCHolder7);
        InCoater8 = (EditText) findViewById(R.id.EdtCHolder8);
        InCoater9 = (EditText) findViewById(R.id.EdtCHolder9);
        InCoater10 = (EditText) findViewById(R.id.EdtCHolder10);
        InCoater11 = (EditText) findViewById(R.id.EdtCHolder11);
        InCoater12 = (EditText) findViewById(R.id.EdtCHolder12);
        InCoater13 = (EditText) findViewById(R.id.EdtCHolder13);
        InCoater14 = (EditText) findViewById(R.id.EdtCHolder14);
        InCoater15 = (EditText) findViewById(R.id.EdtCHolder15);
        InCoater16 = (EditText) findViewById(R.id.EdtCHolder16);
        InCoater17 = (EditText) findViewById(R.id.EdtCHolder17);
        InCoater18 = (EditText) findViewById(R.id.EdtCHolder18);
        InCoater19 = (EditText) findViewById(R.id.EdtCHolder19);
        InCoater20 = (EditText) findViewById(R.id.EdtCHolder20);
        InCoater21 = (EditText) findViewById(R.id.EdtCHolder21);
        InCoater22 = (EditText) findViewById(R.id.EdtCHolder22);
        InCoater23 = (EditText) findViewById(R.id.EdtCHolder23);
        InCoater24 = (EditText) findViewById(R.id.EdtCHolder24);
        InCoater25 = (EditText) findViewById(R.id.EdtCHolder25);
        InCoater26 = (EditText) findViewById(R.id.EdtCHolder26);
        InCoater27 = (EditText) findViewById(R.id.EdtCHolder27);
        InCoater28 = (EditText) findViewById(R.id.EdtCHolder28);
        InCoater29 = (EditText) findViewById(R.id.EdtCHolder29);
        InCoater30 = (EditText) findViewById(R.id.EdtCHolder30);

        MarkerC1  = (EditText) findViewById(R.id.EdtMarkerC1);
        MarkerC2  = (EditText) findViewById(R.id.EdtMarkerC2);
        MarkerC3  = (EditText) findViewById(R.id.EdtMarkerC3);
        MarkerC4  = (EditText) findViewById(R.id.EdtMarkerC4);
        MarkerC5  = (EditText) findViewById(R.id.EdtMarkerC5);
        MarkerC6  = (EditText) findViewById(R.id.EdtMarkerC6);
        MarkerC7  = (EditText) findViewById(R.id.EdtMarkerC7);
        MarkerC8  = (EditText) findViewById(R.id.EdtMarkerC8);
        MarkerC9  = (EditText) findViewById(R.id.EdtMarkerC9);
        MarkerC10  = (EditText) findViewById(R.id.EdtMarkerC10);
        MarkerC11  = (EditText) findViewById(R.id.EdtMarkerC11);
        MarkerC12  = (EditText) findViewById(R.id.EdtMarkerC12);
        MarkerC13  = (EditText) findViewById(R.id.EdtMarkerC13);
        MarkerC14  = (EditText) findViewById(R.id.EdtMarkerC14);
        MarkerC15  = (EditText) findViewById(R.id.EdtMarkerC15);
        MarkerC16  = (EditText) findViewById(R.id.EdtMarkerC16);
        MarkerC17  = (EditText) findViewById(R.id.EdtMarkerC17);
        MarkerC18  = (EditText) findViewById(R.id.EdtMarkerC18);
        MarkerC19  = (EditText) findViewById(R.id.EdtMarkerC19);
        MarkerC20  = (EditText) findViewById(R.id.EdtMarkerC20);
        MarkerC21  = (EditText) findViewById(R.id.EdtMarkerC21);
        MarkerC22  = (EditText) findViewById(R.id.EdtMarkerC22);
        MarkerC23  = (EditText) findViewById(R.id.EdtMarkerC23);
        MarkerC24  = (EditText) findViewById(R.id.EdtMarkerC24);
        MarkerC25  = (EditText) findViewById(R.id.EdtMarkerC25);
        MarkerC26  = (EditText) findViewById(R.id.EdtMarkerC26);
        MarkerC27  = (EditText) findViewById(R.id.EdtMarkerC27);
        MarkerC28  = (EditText) findViewById(R.id.EdtMarkerC28);
        MarkerC29  = (EditText) findViewById(R.id.EdtMarkerC29);
        MarkerC30  = (EditText) findViewById(R.id.EdtMarkerC30);



        BtnLaikiklis = (Button) findViewById(R.id.btnLaikiklis);
        BtnKamera = (Button) findViewById(R.id.btnKamera);
        BtnDone = (Button) findViewById(R.id.btnDone);
        BtnBack = (Button) findViewById(R.id.BtnBack);
        BtnPadeklas = (Button) findViewById(R.id.btnPadeklas);
        BtnCoater = (Button) findViewById(R.id.btnCoater);

        pbbar = (ProgressBar) findViewById(R.id.pbbar);
        pbbar.setVisibility(View.GONE);
        lstpro = (ListView) findViewById(R.id.lstproducts);

        BtnBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String userid = getIntent().getStringExtra("userinfo");
                String user = getIntent().getStringExtra("user");
                Intent i = new Intent(CheckProducts.this, AddProducts.class);
                i.putExtra("userinfo", userid);
                i.putExtra("user", user);
                startActivity(i);
                finish();

            }
        });

        EdtText.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    switch (keyCode) {
                        case KeyEvent.KEYCODE_DPAD_CENTER:
                        case KeyEvent.KEYCODE_ENTER:
                            Fill fill = new Fill();
                            fill.execute("");
                            EdtText.setText("");
                            timer.start();
                            return true;
                        default:
                            break;
                    }
                }
                return false;
            }
        });


        BtnDone.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                AddPro2 addPro = new AddPro2();
                addPro.execute("");

                Holder.setText("");
                Coater.setText("");
                CoaterHolder.setText("");
                InCoater1.setText("");MarkerC1.setText("");
                InCoater2.setText("");MarkerC2.setText("");
                InCoater3.setText("");MarkerC3.setText("");
                InCoater4.setText("");MarkerC4.setText("");
                InCoater5.setText("");MarkerC5.setText("");
                InCoater6.setText("");MarkerC6.setText("");
                InCoater7.setText("");MarkerC7.setText("");
                InCoater8.setText("");MarkerC8.setText("");
                InCoater9.setText("");MarkerC9.setText("");
                InCoater10.setText("");MarkerC10.setText("");
                InCoater11.setText("");MarkerC11.setText("");
                InCoater12.setText("");MarkerC12.setText("");
                InCoater13.setText("");MarkerC13.setText("");
                InCoater14.setText("");MarkerC14.setText("");
                InCoater15.setText("");MarkerC15.setText("");
                InCoater16.setText("");MarkerC16.setText("");
                InCoater17.setText("");MarkerC17.setText("");
                InCoater18.setText("");MarkerC18.setText("");
                InCoater19.setText("");MarkerC19.setText("");
                InCoater20.setText("");MarkerC20.setText("");
                InCoater21.setText("");MarkerC21.setText("");
                InCoater22.setText("");MarkerC22.setText("");
                InCoater23.setText("");MarkerC23.setText("");
                InCoater24.setText("");MarkerC24.setText("");
                InCoater25.setText("");MarkerC25.setText("");
                InCoater26.setText("");MarkerC26.setText("");
                InCoater27.setText("");MarkerC27.setText("");
                InCoater28.setText("");MarkerC28.setText("");
                InCoater29.setText("");MarkerC29.setText("");
                InCoater30.setText("");MarkerC30.setText("");

                timer.start();


            }
        });
        BtnCoater.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                FillList fillList = new FillList();
                fillList.execute("");
                timer.start();

            }
        });
        BtnLaikiklis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CoaterHolder.setText("");
            }
        });
        BtnKamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Coater.setText("");
            }
        });
        BtnPadeklas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Holder.setText("");
            }
        });


    }

    CountDownTimer timer = new CountDownTimer(7*60*1000,1000) {
        @Override
        public void onTick(long millisUntilFinished) {

        }

        @Override
        public void onFinish() {

            Intent logoff = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(logoff);
            finish();

        }
    };

    public class FillList extends AsyncTask<String, String, String> {
        String z = "";
        String incoater1, incoater2,incoater3,incoater4,incoater5,incoater6,incoater7,incoater8,incoater9,incoater10,incoater11,incoater12,incoater13,incoater14,incoater15,incoater16,incoater17,incoater18,incoater19,incoater20;
        String incoater21, incoater22,incoater23,incoater24,incoater25,incoater26,incoater27,incoater28,incoater29,incoater30;
        String marker1,  marker2, marker3, marker4, marker5, marker6, marker7, marker8, marker9, marker10, marker11, marker12, marker13, marker14, marker15, marker16, marker17, marker18, marker19, marker20;
        String marker21,marker22,marker23,marker24,marker25,marker26,marker27,marker28,marker29,marker30;
        String coaterholder = CoaterHolder.getText().toString();
        String darbas, coater;

        List<Map<String, String>> prolist  = new ArrayList<Map<String, String>>();

        @Override
        protected void onPreExecute() {

            pbbar.setVisibility(View.VISIBLE);
            //String noholder = NoHolder.getText().toString();

        }

        @Override
        protected void onPostExecute(String r) {

            pbbar.setVisibility(View.GONE);
            Toast.makeText(CheckProducts.this, r, Toast.LENGTH_LONG).show();

            String[] from = { "1", "2", "3" , "4", "5", "6", "7", "8", "9", "10", "11", "12", "13","14", "15","16","17","18","19","20", "21","22","23","24","25","26","27","28","29","30","21","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60", "61"};
            int[] views = { R.id.rack,R.id.mark,R.id.job1,R.id.job2, R.id.job3,R.id.job4,R.id.job5,R.id.job6,R.id.job7,R.id.job8,R.id.job9,R.id.job10,R.id.user,R.id.date,R.id.time,R.id.job11,R.id.job12,R.id.job13,R.id.job14,R.id.job15 };
            final SimpleAdapter ADA = new SimpleAdapter(CheckProducts.this, prolist, R.layout.lsttemplate, from, views);
            lstpro.setAdapter(ADA);

            InCoater1.setText(incoater1);
            InCoater2.setText(incoater2);
            InCoater3.setText(incoater3);
            InCoater4.setText(incoater4);
            InCoater5.setText(incoater5);
            InCoater6.setText(incoater6);
            InCoater7.setText(incoater7);
            InCoater8.setText(incoater8);
            InCoater9.setText(incoater9);
            InCoater10.setText(incoater10);
            InCoater11.setText(incoater11);
            InCoater12.setText(incoater12);
            InCoater13.setText(incoater13);
            InCoater14.setText(incoater14);
            InCoater15.setText(incoater15);
            InCoater16.setText(incoater16);
            InCoater17.setText(incoater17);
            InCoater18.setText(incoater18);
            InCoater19.setText(incoater19);
            InCoater20.setText(incoater20);
            InCoater21.setText(incoater21);
            InCoater22.setText(incoater22);
            InCoater23.setText(incoater23);
            InCoater24.setText(incoater24);
            InCoater25.setText(incoater25);
            InCoater26.setText(incoater26);
            InCoater27.setText(incoater27);
            InCoater28.setText(incoater28);
            InCoater29.setText(incoater29);
            InCoater30.setText(incoater30);
            MarkerC1.setText(marker1);
            MarkerC2.setText(marker2);
            MarkerC3.setText(marker3);
            MarkerC4.setText(marker4);
            MarkerC5.setText(marker5);
            MarkerC6.setText(marker6);
            MarkerC7.setText(marker7);
            MarkerC8.setText(marker8);
            MarkerC9.setText(marker9);
            MarkerC10.setText(marker10);
            MarkerC11.setText(marker11);
            MarkerC12.setText(marker12);
            MarkerC13.setText(marker13);
            MarkerC14.setText(marker14);
            MarkerC15.setText(marker15);
            MarkerC16.setText(marker16);
            MarkerC17.setText(marker17);
            MarkerC18.setText(marker18);
            MarkerC19.setText(marker19);
            MarkerC20.setText(marker20);
            MarkerC21.setText(marker21);
            MarkerC22.setText(marker22);
            MarkerC23.setText(marker23);
            MarkerC24.setText(marker24);
            MarkerC25.setText(marker25);
            MarkerC26.setText(marker26);
            MarkerC27.setText(marker27);
            MarkerC28.setText(marker28);
            MarkerC29.setText(marker29);
            MarkerC30.setText(marker30);
            Coater.setText(coater);

            lstpro.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                    HashMap<String, Object> obj = (HashMap<String, Object>) ADA.getItem(arg2);


                    //     qty.setText(qtys);
                }
            });



        }

        @Override
        protected String doInBackground(String... params) {

            if (coaterholder.trim().equals("")) z = "Iveskite laikiki";
            else{
                try {
                    Connection con = connectionClass.CONN();
                    if (con == null) {
                        z = "Error in connection with SQL server";
                    } else {
                        String query = "select jobno,marker,Coater from dbo.CoatingStatusTable where CoaterHolder = '" + coaterholder + "' and status = 2 order by nocoaterholder asc";
                        PreparedStatement ps = con.prepareStatement(query);
                        ResultSet rs = ps.executeQuery();

                        ArrayList data1 = new ArrayList();
                        while (rs.next()) {
                            Map<String, String> datanum = new HashMap<String, String>();
                            datanum.put("1", rs.getString("jobno"));
                            datanum.put("21", rs.getString("marker"));
                            datanum.put("61", rs.getString("Coater"));
                            //darbas = datanum.get("1") ;
                            //NoHolder.setText(darbas);
                            if (rs.next()) {
                                datanum.put("2", rs.getString("jobno"));
                                datanum.put("22", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("3", rs.getString("jobno"));
                                datanum.put("23", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("4", rs.getString("jobno"));
                                datanum.put("24", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("5", rs.getString("jobno"));
                                datanum.put("25", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("6", rs.getString("jobno"));
                                datanum.put("26", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("7", rs.getString("jobno"));
                                datanum.put("27", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("8", rs.getString("jobno"));
                                datanum.put("28", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("9", rs.getString("jobno"));
                                datanum.put("29", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("10", rs.getString("jobno"));
                                datanum.put("30", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("11", rs.getString("jobno"));
                                datanum.put("31", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("12", rs.getString("jobno"));
                                datanum.put("32", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("13", rs.getString("jobno"));
                                datanum.put("33", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("14", rs.getString("jobno"));
                                datanum.put("34", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("15", rs.getString("jobno"));
                                datanum.put("35", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("16", rs.getString("jobno"));
                                datanum.put("36", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("17", rs.getString("jobno"));
                                datanum.put("37", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("18", rs.getString("jobno"));
                                datanum.put("38", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("19", rs.getString("jobno"));
                                datanum.put("39", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("20", rs.getString("jobno"));
                                datanum.put("40", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("41", rs.getString("jobno"));
                                datanum.put("51", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("42", rs.getString("jobno"));
                                datanum.put("52", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("43", rs.getString("jobno"));
                                datanum.put("53", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("44", rs.getString("jobno"));
                                datanum.put("54", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("45", rs.getString("jobno"));
                                datanum.put("55", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("46", rs.getString("jobno"));
                                datanum.put("56", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("47", rs.getString("jobno"));
                                datanum.put("57", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("48", rs.getString("jobno"));
                                datanum.put("58", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("49", rs.getString("jobno"));
                                datanum.put("59", rs.getString("marker"));
                            }
                            if (rs.next()) {
                                datanum.put("50", rs.getString("jobno"));
                                datanum.put("60", rs.getString("marker"));
                            }
                            String darbas = (String) datanum.get("1") ;
                            incoater1 = (String) datanum.get("1");
                            incoater2 = (String) datanum.get("2");
                            incoater3 = (String) datanum.get("3");
                            incoater4 = (String) datanum.get("4");
                            incoater5 = (String) datanum.get("5");
                            incoater6 = (String) datanum.get("6");
                            incoater7 = (String) datanum.get("7");
                            incoater8 = (String) datanum.get("8");
                            incoater9 = (String) datanum.get("9");
                            incoater10 = (String) datanum.get("10");
                            incoater11 = (String) datanum.get("11");
                            incoater12 = (String) datanum.get("12");
                            incoater13 = (String) datanum.get("13");
                            incoater14 = (String) datanum.get("14");
                            incoater15 = (String) datanum.get("15");
                            incoater16 = (String) datanum.get("16");
                            incoater17 = (String) datanum.get("17");
                            incoater18 = (String) datanum.get("18");
                            incoater19 = (String) datanum.get("19");
                            incoater20 = (String) datanum.get("20");
                            incoater21 = (String) datanum.get("41");
                            incoater22 = (String) datanum.get("42");
                            incoater23 = (String) datanum.get("43");
                            incoater24 = (String) datanum.get("44");
                            incoater25 = (String) datanum.get("45");
                            incoater26 = (String) datanum.get("46");
                            incoater27 = (String) datanum.get("47");
                            incoater28 = (String) datanum.get("48");
                            incoater29 = (String) datanum.get("49");
                            incoater30 = (String) datanum.get("50");
                            marker1 = (String) datanum.get("21");
                            marker2 = (String) datanum.get("22");
                            marker3 = (String) datanum.get("23");
                            marker4 = (String) datanum.get("24");
                            marker5 = (String) datanum.get("25");
                            marker6 = (String) datanum.get("26");
                            marker7 = (String) datanum.get("27");
                            marker8 = (String) datanum.get("28");
                            marker9 = (String) datanum.get("29");
                            marker10 = (String) datanum.get("30");
                            marker11 = (String) datanum.get("31");
                            marker12 = (String) datanum.get("32");
                            marker13 = (String) datanum.get("33");
                            marker14 = (String) datanum.get("34");
                            marker15 = (String) datanum.get("35");
                            marker16 = (String) datanum.get("36");
                            marker17 = (String) datanum.get("37");
                            marker18 = (String) datanum.get("38");
                            marker19 = (String) datanum.get("39");
                            marker20 = (String) datanum.get("40");
                            marker21 = (String) datanum.get("51");
                            marker22 = (String) datanum.get("52");
                            marker23 = (String) datanum.get("53");
                            marker24 = (String) datanum.get("54");
                            marker25 = (String) datanum.get("55");
                            marker26 = (String) datanum.get("56");
                            marker27 = (String) datanum.get("57");
                            marker28 = (String) datanum.get("58");
                            marker29 = (String) datanum.get("59");
                            marker30 = (String) datanum.get("60");
                            coater = (String) datanum.get("61");
                            prolist.add(datanum);
                            Log.d("perkelimo tikrinimas", darbas);
                        }


                        z = "Success";
                    }
                } catch (Exception ex) {
                    z = "Error retrieving data from table";

                }
            }
            return z;
        }
    }

    public class AddPro2 extends AsyncTask<String, String, String> {


        String z = "";
        Boolean isSuccess = false;


        String jobnumber1 = InCoater1.getText().toString();
        String jobnumber2 = InCoater2.getText().toString();
        String jobnumber3 = InCoater3.getText().toString();
        String jobnumber4 = InCoater4.getText().toString();
        String jobnumber5 = InCoater5.getText().toString();
        String jobnumber6 = InCoater6.getText().toString();
        String jobnumber7 = InCoater7.getText().toString();
        String jobnumber8 = InCoater8.getText().toString();
        String jobnumber9 = InCoater9.getText().toString();
        String jobnumber10 = InCoater10.getText().toString();
        String jobnumber11 = InCoater11.getText().toString();
        String jobnumber12 = InCoater12.getText().toString();
        String jobnumber13 = InCoater13.getText().toString();
        String jobnumber14 = InCoater14.getText().toString();
        String jobnumber15 = InCoater15.getText().toString();
        String jobnumber16 = InCoater16.getText().toString();
        String jobnumber17 = InCoater17.getText().toString();
        String jobnumber18 = InCoater18.getText().toString();
        String jobnumber19 = InCoater19.getText().toString();
        String jobnumber20 = InCoater20.getText().toString();
        String jobnumber21 = InCoater21.getText().toString();
        String jobnumber22 = InCoater22.getText().toString();
        String jobnumber23 = InCoater23.getText().toString();
        String jobnumber24 = InCoater24.getText().toString();
        String jobnumber25 = InCoater25.getText().toString();
        String jobnumber26 = InCoater26.getText().toString();
        String jobnumber27 = InCoater27.getText().toString();
        String jobnumber28 = InCoater28.getText().toString();
        String jobnumber29 = InCoater29.getText().toString();
        String jobnumber30 = InCoater30.getText().toString();

        String marker1 = MarkerC1.getText().toString();
        String marker2 = MarkerC2.getText().toString();
        String marker3 = MarkerC3.getText().toString();
        String marker4 = MarkerC4.getText().toString();
        String marker5 = MarkerC5.getText().toString();
        String marker6 = MarkerC6.getText().toString();
        String marker7 = MarkerC7.getText().toString();
        String marker8 = MarkerC8.getText().toString();
        String marker9 = MarkerC9.getText().toString();
        String marker10 = MarkerC10.getText().toString();
        String marker11 = MarkerC11.getText().toString();
        String marker12 = MarkerC12.getText().toString();
        String marker13 = MarkerC13.getText().toString();
        String marker14 = MarkerC14.getText().toString();
        String marker15 = MarkerC15.getText().toString();
        String marker16 = MarkerC16.getText().toString();
        String marker17 = MarkerC17.getText().toString();
        String marker18 = MarkerC18.getText().toString();
        String marker19 = MarkerC19.getText().toString();
        String marker20 = MarkerC20.getText().toString();
        String marker21 = MarkerC21.getText().toString();
        String marker22 = MarkerC22.getText().toString();
        String marker23 = MarkerC23.getText().toString();
        String marker24 = MarkerC24.getText().toString();
        String marker25 = MarkerC25.getText().toString();
        String marker26 = MarkerC26.getText().toString();
        String marker27 = MarkerC27.getText().toString();
        String marker28 = MarkerC28.getText().toString();
        String marker29 = MarkerC29.getText().toString();
        String marker30 = MarkerC30.getText().toString();

        //String holder = Holder.getText().toString();
        //String dryer = Dryer.getText().toString();
        //String coater = Coater.getText().toString();
        String coaterholder = CoaterHolder.getText().toString();
        String userid = getIntent().getStringExtra("userinfo");
        int status = 1;


        @Override
        protected void onPreExecute() {
            pbbar.setVisibility(View.VISIBLE);
        }

        // @Override
         protected void onPostExecute(String r) {
             pbbar.setVisibility(View.GONE);
             Toast.makeText(CheckProducts.this, r, Toast.LENGTH_SHORT).show();
        //      if(isSuccess==true) {
        //         FillList fillList = new FillList();
        //         fillList.execute("");
        //     }

         }

        @Override
        protected String doInBackground(String... params) {
            if (coaterholder.trim().equals(""))
                z = "Iverkite laikykli";
            else {
                try {
                    Connection con = connectionClass.CONN();
                    if (con == null) {
                        z = "Error in connection with SQL server";
                    } else {

                        String dates = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
                                .format(Calendar.getInstance().getTime());
                        String times = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH)
                                .format(Calendar.getInstance().getTime());
                        //if ( !jobnumber1.equals("")) jobnumber1 = jobnumber1.substring(0, jobnumber1.length()-1);
                        //if ( !jobnumber2.equals("")) jobnumber2 = jobnumber2.substring(0, jobnumber2.length()-1);
                        //if ( !jobnumber3.equals("")) jobnumber3 = jobnumber3.substring(0, jobnumber3.length()-1);
                        //if ( !jobnumber4.equals("")) jobnumber4 = jobnumber4.substring(0, jobnumber4.length()-1);
                        //if ( !jobnumber5.equals("")) jobnumber5 = jobnumber5.substring(0, jobnumber5.length()-1);
                        //if ( !jobnumber6.equals("")) jobnumber6 = jobnumber6.substring(0, jobnumber6.length()-1);
                        // if ( !jobnumber7.equals("")) jobnumber7 = jobnumber7.substring(0, jobnumber7.length()-1);
                        // if ( !jobnumber8.equals("")) jobnumber8 = jobnumber8.substring(0, jobnumber8.length()-1);
                        // if ( !jobnumber9.equals("")) jobnumber9 = jobnumber9.substring(0, jobnumber9.length()-1);
                        // if ( !jobnumber10.equals("")) jobnumber10 = jobnumber10.substring(0, jobnumber10.length()-1);
                        if (!jobnumber1.equals("")) {
                            Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber1 + "' and marker ='" + marker1 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber1 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber2.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber2 + "' and marker ='" + marker2 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber2 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber3.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber3 + "' and marker ='" + marker3 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber3 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber4.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber4 + "' and marker ='" + marker4 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber4 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber5.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber5 + "' and marker ='" + marker5 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber5 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber6.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber6 + "' and marker ='" + marker6 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber6 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber7.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber7 + "' and marker ='" + marker7 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber7 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber8.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber8 + "' and marker ='" + marker8 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber8 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber9.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber9 + "' and marker ='" + marker9 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber9 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber10.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber10 + "' and marker ='" + marker10 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber10 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber11.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber11 + "' and marker ='" + marker11 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber11 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber12.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber12 + "' and marker ='" + marker12 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber12 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber13.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber13 + "' and marker ='" + marker13 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber13 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber14.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber14 + "' and marker ='" + marker14 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber14 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber15.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber15 + "' and marker ='" + marker15 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber15 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber16.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber16 + "' and marker ='" + marker16 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber16 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber17.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber17 + "' and marker ='" + marker17 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber17 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber18.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber18 + "' and marker ='" + marker18 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber18 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber19.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber19 + "' and marker ='" + marker19 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber19 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber20.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber20 + "' and marker ='" + marker20 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber20 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber21.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber21 + "' and marker ='" + marker21 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber21 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber22.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber22 + "' and marker ='" + marker22 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber22 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber23.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber23 + "' and marker ='" + marker23 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber23 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber24.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber24 + "' and marker ='" + marker24 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber24 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber25.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber25 + "' and marker ='" + marker25 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber25 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber26.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber26 + "' and marker ='" + marker26 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber26 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber27.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber27 + "' and marker ='" + marker27 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber27 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber28.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber28 + "' and marker ='" + marker28 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber28 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber29.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber29 + "' and marker ='" + marker29 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber29 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }
                        if (!jobnumber30.equals("")) {
                            //Log.d("tikrinimas", "noholder pilnas");
                            //if(status1.equals("0")){status = 0;}
                            String query = "delete from CoatingStatusTable where JobNo= '" + jobnumber30 + "' and marker ='" + marker30 + "' and CoaterHolder = '" + coaterholder + "'; insert into CoatingLogTable (JobNo,UserId,DateLast,TimeLast,Status) values ('" + jobnumber30 + "','" + userid + "','" + dates + "','" + times + "','" + 3 + "');";
                            PreparedStatement preparedStatement = con.prepareStatement(query);
                            preparedStatement.executeUpdate();
                        }


                        //String querydelete = "delete from dbo.CoatingRackTable where RackNo ='" + racknumber + "'";
                        //PreparedStatement deleteStatement = con.prepareStatement(querydelete);
                        //deleteStatement.executeUpdate();
                        z = "Added Successfully";
                        isSuccess = true;
                    }
                } catch (Exception ex) {
                    isSuccess = false;
                    z = "Exceptions";
                }
            }
            return z;
        }
    }

    public class Fill extends AsyncTask<String, String, String> {
        String edittext = EdtText.getText().toString();
        boolean z = true;
        int i = 0;
        //String substr = "";
        //String substr1 = "";

        @Override
        protected String doInBackground(String... params) {
            return null;

        }

        @Override
        protected void onPreExecute() {
            return;

        }

        @Override
        protected void onPostExecute(String r) {


            if (edittext.indexOf("D") >= 0) {
                CoaterHolder.setText(edittext);
                FillList fillList = new FillList();
                fillList.execute("");
            }
            if (edittext.indexOf("C") >= 0) {
                Coater.setText(edittext);
            }
            if (edittext.indexOf("A") >= 0) {
                Log.d("asas", "raide A");
            }

            return;
        }


    }

}
