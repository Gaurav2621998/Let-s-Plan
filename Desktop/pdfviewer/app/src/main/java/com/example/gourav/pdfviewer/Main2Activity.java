package com.example.gourav.pdfviewer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button=(Button)findViewById(R.id.view11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdfviewer-53cf5.appspot.com/o/ch2.ppt?alt=media&token=220f9546-7037-44d5-ac17-f18e64d60a03"));
//                startActivity(i);
                WebView mWebView=new WebView(Main2Activity.this);
                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.loadUrl("https://docs.google.com/gview?embedded=true&url=https://firebasestorage.googleapis.com/v0/b/pdfviewer-53cf5.appspot.com/o/ch2.ppt?alt=media&token=220f9546-7037-44d5-ac17-f18e64d60a03");
                setContentView(mWebView);
            }
        });
    }
}
