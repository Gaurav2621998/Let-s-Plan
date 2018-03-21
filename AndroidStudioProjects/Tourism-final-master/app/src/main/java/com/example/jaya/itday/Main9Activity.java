package com.example.jaya.itday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import java.util.ArrayList;

public class Main9Activity extends AppCompatActivity {

    CardView c,d;
    //String[] arr={"City Palace","Dudh Talai","Jag Mandir","FatahSagar" };
    ArrayList<String> s=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        c=(CardView)findViewById(R.id.c1);
        //d=(CardView)findViewById(R.id.c2);
        s.add("");
        s.add("Dudh Talai");
        s.add("Jag Mandir");
        s.add("FatahSagar");
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main9Activity.this,Main3Activity.class);
                i.putExtra("list",s);
                startActivity(i);


            }
        });
    }
}
