package com.example.jaya.itday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Main6Activity extends AppCompatActivity {

        CardView c,d;
        //String[] arr={"City Palace","Dudh Talai","Jag Mandir","FatahSagar" };
        ArrayList<String>s=new ArrayList<>();
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        c=(CardView)findViewById(R.id.c1);
        //d=(CardView)findViewById(R.id.c2);
        s.add("City Palcae");
        s.add("Dudh Talai");
        s.add("Jag Mandir");
        s.add("FatahSagar");
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main6Activity.this,Main4Activity.class);
                i.putExtra("list",s);
            }
        });



    }
}
