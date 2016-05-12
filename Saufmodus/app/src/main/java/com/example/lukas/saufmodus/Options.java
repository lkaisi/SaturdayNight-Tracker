package com.example.lukas.saufmodus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Lukas on 03.05.2016. (C) Lukas Kaisermayr
 */
public class Options extends Activity {

    long nowTime = System.currentTimeMillis();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    Date nowDate=new Date();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);

        nowDate.setTime(nowTime);
        sdf.format(nowDate);

        anfangsSpinner();
        endSpinner();
        batman();
    }

    private void anfangsSpinner(){
        Spinner spinnerAnfang = (Spinner) findViewById(R.id.spinnerTimeStart);

        //Spinner Anfangszeit!!!
        List<String> zeiten = new ArrayList<>();
        zeiten.add(sdf.format(nowDate));

        Calendar cal = Calendar.getInstance(); // creates calendar
        cal.setTime(nowDate); // sets calendar time/date
        for (int i=0; i<12; i++){
            cal.add(Calendar.HOUR_OF_DAY, 1); // adds one hour
            System.out.println(cal.getTime());

            zeiten.add(""+sdf.format(cal.getTime()));
        }

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item,zeiten);

        dataAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        spinnerAnfang.setAdapter(dataAdapter);
    }

    private void endSpinner(){
        Spinner spinnerEnde = (Spinner) findViewById(R.id.spinnerTimeEnd);

        //Spinner Anfangszeit!!!
        List<String> zeiten = new ArrayList<>();
        zeiten.add(sdf.format(nowDate));

        Calendar cal = Calendar.getInstance(); // creates calendar
        cal.setTime(nowDate); // sets calendar time/date
        for (int i=0; i<12; i++){
            cal.add(Calendar.HOUR_OF_DAY, 1); // adds one hour
            System.out.println(cal.getTime());

            zeiten.add(""+sdf.format(cal.getTime()));
        }

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item,zeiten);

        dataAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        spinnerEnde.setAdapter(dataAdapter);
    }

    private void batman(){
        Button okButton = (Button) findViewById(R.id.buttonOK);

        final Intent i = new Intent(this, MainActivity.class);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("OK clicked!");
                startActivity(i);
            }
        });
    }
}
