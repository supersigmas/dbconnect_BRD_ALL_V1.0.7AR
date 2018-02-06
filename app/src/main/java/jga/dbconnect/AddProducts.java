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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.TextView;
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
 * Created by jga on 2016.10.21.
 */
public class AddProducts extends Activity{

    jga.dbconnect.ConnectionClass connectionClass;

    EditText EdtText, JobNumber1, JobNumber3,JobNumber4,JobNumber5,JobNumber6,JobNumber7,JobNumber8,JobNumber9,JobNumber10,JobNumber2, Marker, Holder,NoHolder, Dryer, Coater, CoaterHolder;
    int Status1, Status2, Status3, Status4, Status5, Status6, Status7, Status8, Status9, Status10,Status11,Status12,Status13,Status14,Status15,Status16,Status17,Status18,Status19,Status20;
    EditText InDryer1, InDryer2,InDryer3,InDryer4,InDryer5,InDryer6,InDryer7,InDryer8,InDryer9,InDryer10,InDryer11,InDryer12,InDryer13,InDryer14,InDryer15,InDryer16,InDryer17,InDryer18,InDryer19,InDryer20;
    EditText Marker1, Marker2,Marker3,Marker4,Marker5,Marker6,Marker7,Marker8,Marker9,Marker10,Marker11,Marker12,Marker13,Marker14,Marker15,Marker16,Marker17,Marker18,Marker19,Marker20;
    EditText InCoater1, InCoater2,InCoater3,InCoater4,InCoater5,InCoater6,InCoater7,InCoater8,InCoater9,InCoater10,InCoater11,InCoater12,InCoater13,InCoater14,InCoater15,InCoater16,InCoater17,InCoater18,InCoater19,InCoater20;
    EditText InCoater21 ,InCoater22,InCoater23,InCoater24,InCoater25,InCoater26,InCoater27,InCoater28,InCoater29,InCoater30;
    EditText MarkerC1, MarkerC2,MarkerC3,MarkerC4,MarkerC5,MarkerC6,MarkerC7,MarkerC8,MarkerC9,MarkerC10,MarkerC11,MarkerC12,MarkerC13,MarkerC14,MarkerC15,MarkerC16,MarkerC17,MarkerC18,MarkerC19,MarkerC20;
    EditText MarkerC21,MarkerC22,MarkerC23,MarkerC24,MarkerC25,MarkerC26,MarkerC27,MarkerC28,MarkerC29,MarkerC30;
    Button btnadd, BtnNext, BtnCoater, BtnDeleteRack, BtnMarker, BtnDryer, BtnDone, BtnUpdate1, BtnKamera, BtnLaikiklis, BtnPadeklas;
    Button BtnDeleteJob1, BtnDeleteJob2,BtnDeleteJob3,BtnDeleteJob4,BtnDeleteJob5,BtnDeleteJob6,BtnDeleteJob7,BtnDeleteJob8,BtnDeleteJob9,BtnDeleteJob10;
    Button BtnExit;
    ProgressBar pbbar;
    ListView lstpro;
    TextView user;
    String proid, RackNo, JobNo1, JobNo2, JobNo3;
    CheckBox ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9, ch10, ch11, ch12, ch13, ch14, ch15, ch16, ch17, ch18, ch19, ch20;
    //Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addproducs);
        //spinner = (Spinner) findViewById(R.id.spinner);
        //String userid = getIntent().getStringExtra("userinfo");

        //Button btnClose = (Button) findViewById(R.id.btnClose);
        connectionClass = new jga.dbconnect.ConnectionClass();
        EdtText = (EditText) findViewById(R.id.EdtText);
        Holder = (EditText) findViewById(R.id.EdtHolder);
        //NoHolder = (EditText) findViewById(R.id.EdtNoHolder);
        Coater = (EditText) findViewById(R.id.EdtCoater);
        CoaterHolder = (EditText) findViewById(R.id.EdtCoterHolder);
        user = (TextView) findViewById(R.id.textView3);
        user.setText(getIntent().getStringExtra("user"));

        Status1 = 1;
        Status2 = 1;
        Status3 = 1;
        Status4 = 1;
        Status5 = 1;
        Status6 = 1;
        Status7 = 1;
        Status8 = 1;
        Status9 = 1;
        Status10 = 1;
        Status11 = 1;
        Status12 = 1;
        Status13 = 1;
        Status14 = 1;
        Status15 = 1;
        Status16 = 1;
        Status17 = 1;
        Status18 = 1;
        Status19 = 1;
        Status20 = 1;
        //Status1 = 1;

        InDryer1 = (EditText) findViewById(R.id.EdtDry1);
        InDryer2 = (EditText) findViewById(R.id.EdtDry2);
        InDryer3 = (EditText) findViewById(R.id.EdtDry3);
        InDryer4 = (EditText) findViewById(R.id.EdtDry4);
        InDryer5 = (EditText) findViewById(R.id.EdtDry5);
        InDryer6 = (EditText) findViewById(R.id.EdtDry6);
        InDryer7 = (EditText) findViewById(R.id.EdtDry7);
        InDryer8 = (EditText) findViewById(R.id.EdtDry8);
        InDryer9 = (EditText) findViewById(R.id.EdtDry9);
        InDryer10 = (EditText) findViewById(R.id.EdtDry10);
        InDryer11 = (EditText) findViewById(R.id.EdtDry11);
        InDryer12 = (EditText) findViewById(R.id.EdtDry12);
        InDryer13 = (EditText) findViewById(R.id.EdtDry13);
        InDryer14 = (EditText) findViewById(R.id.EdtDry14);
        InDryer15 = (EditText) findViewById(R.id.EdtDry15);
        InDryer16 = (EditText) findViewById(R.id.EdtDry16);
        InDryer17 = (EditText) findViewById(R.id.EdtDry17);
        InDryer18 = (EditText) findViewById(R.id.EdtDry18);
        InDryer19 = (EditText) findViewById(R.id.EdtDry19);
        InDryer20 = (EditText) findViewById(R.id.EdtDry20);

        Marker1  = (EditText) findViewById(R.id.EdtMarker1);
        Marker2  = (EditText) findViewById(R.id.EdtMarker2);
        Marker3  = (EditText) findViewById(R.id.EdtMarker3);
        Marker4  = (EditText) findViewById(R.id.EdtMarker4);
        Marker5  = (EditText) findViewById(R.id.EdtMarker5);
        Marker6  = (EditText) findViewById(R.id.EdtMarker6);
        Marker7  = (EditText) findViewById(R.id.EdtMarker7);
        Marker8  = (EditText) findViewById(R.id.EdtMarker8);
        Marker9  = (EditText) findViewById(R.id.EdtMarker9);
        Marker10  = (EditText) findViewById(R.id.EdtMarker10);
        Marker11  = (EditText) findViewById(R.id.EdtMarker11);
        Marker12  = (EditText) findViewById(R.id.EdtMarker12);
        Marker13  = (EditText) findViewById(R.id.EdtMarker13);
        Marker14  = (EditText) findViewById(R.id.EdtMarker14);
        Marker15  = (EditText) findViewById(R.id.EdtMarker15);
        Marker16  = (EditText) findViewById(R.id.EdtMarker16);
        Marker17  = (EditText) findViewById(R.id.EdtMarker17);
        Marker18  = (EditText) findViewById(R.id.EdtMarker18);
        Marker19  = (EditText) findViewById(R.id.EdtMarker19);
        Marker20  = (EditText) findViewById(R.id.EdtMarker20);


        btnadd = (Button) findViewById(R.id.btnadd);
        //BtnReject= (Button) findViewById(R.id.btnReject);
        BtnCoater = (Button) findViewById(R.id.btnCoater);
        BtnUpdate1 = (Button) findViewById(R.id.btnUpdate1);

        BtnLaikiklis = (Button) findViewById(R.id.btnLaikiklis);
        BtnExit = (Button) findViewById(R.id.BtnExit);
        BtnKamera = (Button) findViewById(R.id.btnKamera);
        BtnPadeklas = (Button) findViewById(R.id.btnPadeklas);
        BtnNext = (Button) findViewById(R.id.BtnNext);

        pbbar = (ProgressBar) findViewById(R.id.pbbar);
        pbbar.setVisibility(View.GONE);
        lstpro = (ListView) findViewById(R.id.lstproducts);
        proid = "";
        RackNo = "";
        JobNo1= ""; JobNo2= ""; JobNo3 = "";
        ch1=(CheckBox)findViewById(R.id.checkBox1);
        ch2=(CheckBox)findViewById(R.id.checkBox2);
        ch3=(CheckBox)findViewById(R.id.checkBox3);
        ch4=(CheckBox)findViewById(R.id.checkBox4);
        ch5=(CheckBox)findViewById(R.id.checkBox5);
        ch6=(CheckBox)findViewById(R.id.checkBox6);
        ch7=(CheckBox)findViewById(R.id.checkBox7);
        ch8=(CheckBox)findViewById(R.id.checkBox8);
        ch9=(CheckBox)findViewById(R.id.checkBox9);
        ch10=(CheckBox)findViewById(R.id.checkBox10);
        ch11=(CheckBox)findViewById(R.id.checkBox11);
        ch12=(CheckBox)findViewById(R.id.checkBox12);
        ch13=(CheckBox)findViewById(R.id.checkBox13);
        ch14=(CheckBox)findViewById(R.id.checkBox14);
        ch15=(CheckBox)findViewById(R.id.checkBox15);
        ch16=(CheckBox)findViewById(R.id.checkBox16);
        ch17=(CheckBox)findViewById(R.id.checkBox17);
        ch18=(CheckBox)findViewById(R.id.checkBox18);
        ch19=(CheckBox)findViewById(R.id.checkBox19);
        ch20=(CheckBox)findViewById(R.id.checkBox20);

        BtnUpdate1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                FillList2 fillList2 = new FillList2();
                fillList2.execute("");
                timer.start();

            }
        });

        BtnNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String userid = getIntent().getStringExtra("userinfo");
                String user = getIntent().getStringExtra("user");
                Intent i = new Intent(AddProducts.this, CheckProducts.class);
                i.putExtra("userinfo", userid);
                i.putExtra("user", user);
                startActivity(i);
                finish();

            }
        });
        BtnExit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent logoff = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(logoff);
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
       btnadd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String ed_text = CoaterHolder.getText().toString().trim();
                String ed_text2 = Coater.getText().toString().trim();
                if (ed_text.equals("") || ed_text2.equals(""))
                {Toast.makeText(AddProducts.this, "Iveskite Kameros ir Laikiklio numerius", Toast.LENGTH_SHORT).show();
                    Log.d("asas", "klaida ivyko");}
                else {
                    if (ch1.isChecked()) {Status1 = 0;}
                    if (ch2.isChecked()) {Status2 = 0;}
                    if (ch3.isChecked()) {Status3 = 0;}
                    if (ch4.isChecked()) {Status4 = 0;}
                    if (ch5.isChecked()) {Status5 = 0;}
                    if (ch6.isChecked()) {Status6 = 0;}
                    if (ch7.isChecked()) {Status7 = 0;}
                    if (ch8.isChecked()) {Status8 = 0;}
                    if (ch9.isChecked()) {Status9 = 0;}
                    if (ch10.isChecked()) {Status10 = 0;}
                    if (ch11.isChecked()) {Status11 = 0;}
                    if (ch12.isChecked()) {Status12 = 0;}
                    if (ch13.isChecked()) {Status13 = 0;}
                    if (ch14.isChecked()) {Status14 = 0;}
                    if (ch15.isChecked()) {Status15 = 0;}
                    if (ch16.isChecked()) {Status16 = 0;}
                    if (ch17.isChecked()) {Status17 = 0;}
                    if (ch18.isChecked()) {Status18 = 0;}
                    if (ch19.isChecked()) {Status19 = 0;}
                    if (ch20.isChecked()) {Status20 = 0;}

                    AddPro addPro = new AddPro();
                    addPro.execute("");
                    InDryer1.setText("");
                    InDryer2.setText("");
                    InDryer3.setText("");
                    InDryer4.setText("");
                    InDryer5.setText("");
                    InDryer6.setText("");
                    InDryer7.setText("");
                    InDryer8.setText("");
                    InDryer9.setText("");
                    InDryer10.setText("");
                    InDryer11.setText("");
                    InDryer12.setText("");
                    InDryer13.setText("");
                    InDryer14.setText("");
                    InDryer15.setText("");
                    InDryer16.setText("");
                    InDryer17.setText("");
                    InDryer18.setText("");
                    InDryer19.setText("");
                    InDryer20.setText("");

                    Marker1.setText("");
                    Marker2.setText("");
                    Marker3.setText("");
                    Marker4.setText("");
                    Marker5.setText("");
                    Marker6.setText("");
                    Marker7.setText("");
                    Marker8.setText("");
                    Marker9.setText("");
                    Marker10.setText("");
                    Marker11.setText("");
                    Marker12.setText("");
                    Marker13.setText("");
                    Marker14.setText("");
                    Marker15.setText("");
                    Marker16.setText("");
                    Marker17.setText("");
                    Marker18.setText("");
                    Marker19.setText("");
                    Marker20.setText("");

                    ch1.setChecked(false);
                    ch2.setChecked(false);
                    ch3.setChecked(false);
                    ch4.setChecked(false);
                    ch5.setChecked(false);
                    ch6.setChecked(false);
                    ch7.setChecked(false);
                    ch8.setChecked(false);
                    ch9.setChecked(false);
                    ch10.setChecked(false);
                    ch11.setChecked(false);
                    ch12.setChecked(false);
                    ch13.setChecked(false);
                    ch14.setChecked(false);
                    ch15.setChecked(false);
                    ch16.setChecked(false);
                    ch17.setChecked(false);
                    ch18.setChecked(false);
                    ch19.setChecked(false);
                    ch20.setChecked(false);

                    Status1 = 1;
                    Status2 = 1;
                    Status3 = 1;
                    Status4 = 1;
                    Status5 = 1;
                    Status6 = 1;
                    Status7 = 1;
                    Status8 = 1;
                    Status9 = 1;
                    Status10 = 1;
                    Status11 = 1;
                    Status12 = 1;
                    Status13 = 1;
                    Status14 = 1;
                    Status15 = 1;
                    Status16 = 1;
                    Status17 = 1;
                    Status18 = 1;
                    Status19 = 1;
                    Status20 = 1;

                    Holder.setText("");
                    Coater.setText("");
                    CoaterHolder.setText("");
                    timer.start();
                }

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

    public class FillList2 extends AsyncTask<String, String, String> {
        String z = "";
        String indryer1, indryer2,indryer3,indryer4,indryer5,indryer6,indryer7,indryer8,indryer9,indryer10,indryer11,indryer12,indryer13,indryer14,indryer15,indryer16,indryer17,indryer18,indryer19,indryer20;
        String marker1, marker2,marker3,marker4,marker5,marker6,marker7,marker8,marker9,marker10,marker11,marker12,marker13,marker14,marker15,marker16,marker17,marker18,marker19,marker20;

        String holder = Holder.getText().toString();
        String darbas;

        List<Map<String, String>> prolist  = new ArrayList<Map<String, String>>();

        @Override
        protected void onPreExecute() {

            pbbar.setVisibility(View.VISIBLE);
            //String noholder = NoHolder.getText().toString();

        }

        @Override
        protected void onPostExecute(String r) {

            pbbar.setVisibility(View.GONE);
            Toast.makeText(AddProducts.this, r, Toast.LENGTH_LONG).show();

            String[] from = { "1", "2", "3" , "4", "5", "6", "7", "8", "9", "10", "11", "12", "13","14", "15","16","17","18","19","20", "21","22","23","24","25","26","27","28","29","30","21","32","33","34","35","36","37","38","39","40"};
            int[] views = { R.id.rack,R.id.mark,R.id.job1,R.id.job2, R.id.job3,R.id.job4,R.id.job5,R.id.job6,R.id.job7,R.id.job8,R.id.job9,R.id.job10,R.id.user,R.id.date,R.id.time,R.id.job11,R.id.job12,R.id.job13,R.id.job14,R.id.job15 };
            final SimpleAdapter ADA = new SimpleAdapter(AddProducts.this, prolist, R.layout.lsttemplate, from, views);
            lstpro.setAdapter(ADA);

            InDryer1.setText(indryer1);
            InDryer2.setText(indryer2);
            InDryer3.setText(indryer3);
            InDryer4.setText(indryer4);
            InDryer5.setText(indryer5);
            InDryer6.setText(indryer6);
            InDryer7.setText(indryer7);
            InDryer8.setText(indryer8);
            InDryer9.setText(indryer9);
            InDryer10.setText(indryer10);
            InDryer11.setText(indryer11);
            InDryer12.setText(indryer12);
            InDryer13.setText(indryer13);
            InDryer14.setText(indryer14);
            InDryer15.setText(indryer15);
            InDryer16.setText(indryer16);
            InDryer17.setText(indryer17);
            InDryer18.setText(indryer18);
            InDryer19.setText(indryer19);
            InDryer20.setText(indryer20);

            Marker1.setText(marker1);
            Marker2.setText(marker2);
            Marker3.setText(marker3);
            Marker4.setText(marker4);
            Marker5.setText(marker5);
            Marker6.setText(marker6);
            Marker7.setText(marker7);
            Marker8.setText(marker8);
            Marker9.setText(marker9);
            Marker10.setText(marker10);
            Marker11.setText(marker11);
            Marker12.setText(marker12);
            Marker13.setText(marker13);
            Marker14.setText(marker14);
            Marker15.setText(marker15);
            Marker16.setText(marker16);
            Marker17.setText(marker17);
            Marker18.setText(marker18);
            Marker19.setText(marker19);
            Marker20.setText(marker20);


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

            if (holder.trim().equals("")) z = "Please enter holder";
                else{
                try {
                    Connection con = connectionClass.CONN();
                    if (con == null) {
                        z = "Error in connection with SQL server";
                    } else {
                        String query = "select jobno, marker from dbo.CoatingStatusTable where HolderNo = '" + holder + "' and status = 1 order by noholder asc";
                        PreparedStatement ps = con.prepareStatement(query);
                        ResultSet rs = ps.executeQuery();

                        ArrayList data1 = new ArrayList();
                        while (rs.next()) {
                            Map<String, String> datanum = new HashMap<String, String>();
                            datanum.put("1", rs.getString("jobno"));
                            datanum.put("21", rs.getString("marker"));
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
                            indryer1 = (String) datanum.get("1");
                            indryer2 = (String) datanum.get("2");
                            indryer3 = (String) datanum.get("3");
                            indryer4 = (String) datanum.get("4");
                            indryer5 = (String) datanum.get("5");
                            indryer6 = (String) datanum.get("6");
                            indryer7 = (String) datanum.get("7");
                            indryer8 = (String) datanum.get("8");
                            indryer9 = (String) datanum.get("9");
                            indryer10 = (String) datanum.get("10");
                            indryer11 = (String) datanum.get("11");
                            indryer12 = (String) datanum.get("12");
                            indryer13 = (String) datanum.get("13");
                            indryer14 = (String) datanum.get("14");
                            indryer15 = (String) datanum.get("15");
                            indryer16 = (String) datanum.get("16");
                            indryer17 = (String) datanum.get("17");
                            indryer18 = (String) datanum.get("18");
                            indryer19 = (String) datanum.get("19");
                            indryer20 = (String) datanum.get("20");

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

   public class AddPro extends AsyncTask<String, String, String> {

        String z = "";
        Boolean isSuccess = false;

        String jobnumber1 = InDryer1.getText().toString();
        String jobnumber2 = InDryer2.getText().toString();
        String jobnumber3 = InDryer3.getText().toString();
        String jobnumber4 = InDryer4.getText().toString();
        String jobnumber5 = InDryer5.getText().toString();
        String jobnumber6 = InDryer6.getText().toString();
        String jobnumber7 = InDryer7.getText().toString();
        String jobnumber8 = InDryer8.getText().toString();
        String jobnumber9 = InDryer9.getText().toString();
        String jobnumber10 = InDryer10.getText().toString();
       String jobnumber11 = InDryer11.getText().toString();
       String jobnumber12 = InDryer12.getText().toString();
       String jobnumber13 = InDryer13.getText().toString();
       String jobnumber14 = InDryer14.getText().toString();
       String jobnumber15 = InDryer15.getText().toString();
       String jobnumber16 = InDryer16.getText().toString();
       String jobnumber17 = InDryer17.getText().toString();
       String jobnumber18 = InDryer18.getText().toString();
       String jobnumber19 = InDryer19.getText().toString();
       String jobnumber20 = InDryer20.getText().toString();

       String marker1 = Marker1.getText().toString();
       String marker2 = Marker2.getText().toString();
       String marker3 = Marker3.getText().toString();
       String marker4 = Marker4.getText().toString();
       String marker5 = Marker5.getText().toString();
       String marker6 = Marker6.getText().toString();
       String marker7 = Marker7.getText().toString();
       String marker8 = Marker8.getText().toString();
       String marker9 = Marker9.getText().toString();
       String marker10 = Marker10.getText().toString();
       String marker11 = Marker11.getText().toString();
       String marker12 = Marker12.getText().toString();
       String marker13 = Marker13.getText().toString();
       String marker14 = Marker14.getText().toString();
       String marker15 = Marker15.getText().toString();
       String marker16 = Marker16.getText().toString();
       String marker17 = Marker17.getText().toString();
       String marker18 = Marker18.getText().toString();
       String marker19 = Marker19.getText().toString();
       String marker20 = Marker20.getText().toString();

        String holder = Holder.getText().toString();
        //String noholder = NoHolder.getText().toString();
        //String dryer = Dryer.getText().toString();
        String coater = Coater.getText().toString();
       String coaterholder = CoaterHolder.getText().toString();
        String userid = getIntent().getStringExtra("userinfo");
        int status1 = Status1;
        int status2 = Status2;
        int status3 = Status3;
        int status4 = Status4;
        int status5 = Status5;
        int status6 = Status6;
        int status7 = Status7;
        int status8 = Status8;
        int status9 = Status9;
        int status10 = Status10;
        int status11 = Status11;
        int status12 = Status12;
        int status13 = Status13;
        int status14 = Status14;
        int status15 = Status15;
        int status16 = Status16;
        int status17 = Status17;
        int status18 = Status18;
        int status19 = Status19;
        int status20 = Status20;
        int status = 2;


        @Override
        protected void onPreExecute() {
            pbbar.setVisibility(View.VISIBLE);
        }

        // @Override
         protected void onPostExecute(String r) {
             pbbar.setVisibility(View.GONE);
             Toast.makeText(AddProducts.this, r, Toast.LENGTH_SHORT).show();
        //      if(isSuccess==true) {
        //         FillList fillList = new FillList();
        //         fillList.execute("");
        //     }

         }

        @Override
        protected String doInBackground(String... params) {
            Log.d("perkelimo tikrinimas", "iki patikros");
            if (coaterholder.trim().equals("")||coater.trim().equals("")||holder.trim().equals(""))
                z = "Iveskite kameros, padeklo ir laikiklio numerius";
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
                        Log.d("perkelimo tikrinimas", "iki pirmo");
                        if ( !jobnumber1.equals("")) {
                            Log.d("perkelimo tikrinimas", "uz pirmo");
                            if(status1 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker1 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber1 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber1 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status1 = 1;
                        }
                        if ( !jobnumber2.equals("")) {
                            if(status2 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker2 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber2 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber2 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status2 = 1;
                        }
                        if ( !jobnumber3.equals("")) {
                            if(status3 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker3 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber3 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber3 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status3 = 1;
                        }
                        if ( !jobnumber4.equals("")) {
                            if(status4 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker4 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber4 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber4 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status4 = 1;
                        }
                        if ( !jobnumber5.equals("")) {
                            if(status5 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker5 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber5 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber5 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status5 = 1;
                        }
                        if ( !jobnumber6.equals("")) {
                            if(status6 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker6 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber6 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber6 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status6 = 1;
                        }
                        if ( !jobnumber7.equals("")) {
                            if(status7 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker7 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber7 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber7 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status7 = 1;
                        }
                        if ( !jobnumber8.equals("")) {
                            if(status8 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker8 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber8 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber8 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status8 = 1;
                        }
                        if ( !jobnumber9.equals("")) {
                            if(status9 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker9 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber9 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber9 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status9 = 1;
                        }
                        if ( !jobnumber10.equals("")) {
                            if(status10 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker10 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber10 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber10 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status10 = 1;
                        }
                        if ( !jobnumber11.equals("")) {
                            //Log.d("perkelimo tikrinimas", "uz pirmo");
                            if(status11 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker11 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber11 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber11 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status11 = 1;
                        }
                        if ( !jobnumber12.equals("")) {
                            //Log.d("perkelimo tikrinimas", "uz pirmo");
                            if(status12 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker12 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber12 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber12 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status12 = 1;
                        }
                        if ( !jobnumber13.equals("")) {
                            //Log.d("perkelimo tikrinimas", "uz pirmo");
                            if(status13 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker13 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber13 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber13 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status13 = 1;
                        }
                        if ( !jobnumber14.equals("")) {
                            //Log.d("perkelimo tikrinimas", "uz pirmo");
                            if(status14 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker14 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber14 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber14 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status14 = 1;
                        }
                        if ( !jobnumber15.equals("")) {
                            //Log.d("perkelimo tikrinimas", "uz pirmo");
                            if(status15 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker15 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber15 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber15 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status15 = 1;
                        }
                        if ( !jobnumber16.equals("")) {
                            //Log.d("perkelimo tikrinimas", "uz pirmo");
                            if(status16 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker16 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber16 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber16 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status16 = 1;
                        }
                        if ( !jobnumber17.equals("")) {
                            //Log.d("perkelimo tikrinimas", "uz pirmo");
                            if(status17 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker17 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber17 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber17 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status17 = 1;
                        }
                        if ( !jobnumber18.equals("")) {
                            //Log.d("perkelimo tikrinimas", "uz pirmo");
                            if(status18 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker18 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber18 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber18 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status18 = 1;
                        }
                        if ( !jobnumber19.equals("")) {
                            //Log.d("perkelimo tikrinimas", "uz pirmo");
                            if(status19 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker19 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber19 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber19 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status19 = 1;
                        }
                        if ( !jobnumber20.equals("")) {
                            //Log.d("perkelimo tikrinimas", "uz pirmo");
                            if(status20 == 0){status = 1;}
                            else {
                                String query = "update dbo.CoatingStatusTable set UserId3 = '" + userid + "', TimeLast = '" + times + "', DateLast = '" + dates + "', status = '" + status + "', Coater = '" + coater + "', CoaterHolder = '" + coaterholder + "', NoCoaterHolder = ((select max (NoCoaterHolder) from dbo.CoatingStatusTable where coaterholder = '" + coaterholder + "') + 1) where Marker = '" + marker20 + "' and HolderNo = '" + holder + "' and jobno = '" + jobnumber20 + "'; insert into CoatingLogTable (Coater,JobNo,UserId,DateLast,TimeLast,Status) values ('" + coater + "','" + jobnumber20 + "','" + userid + "','" + dates + "','" + times + "','" + status + "');";
                                PreparedStatement preparedStatement = con.prepareStatement(query);
                                preparedStatement.executeUpdate();
                            }
                            //String queryy = "update dbo.CoatingStatusTable set NoHolder = ((select max (NoHolder) from dbo.CoatingStatusTable where HolderNo = '" + holder + "') + 1) where rackno = '" + racknumber + "' and jobno = '" + jobnumber1 + "'";
                            //PreparedStatement preparedStatementy = con.prepareStatement(queryy);
                            //preparedStatementy.executeUpdate();
                            status = 2; status20 = 1;
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


            if (edittext.indexOf("H") >= 0) {
                Holder.setText(edittext);
                FillList2 fillList = new FillList2();
                fillList.execute("");
            }
            if (edittext.indexOf("C") >= 0) {
                Coater.setText(edittext);
            }
            if (edittext.indexOf("D") >= 0) {
                CoaterHolder.setText(edittext);
            }
            if (edittext.indexOf("A") >= 0) {
                Log.d("asas", "raide A");
            }

            return;
        }


    }

    }
