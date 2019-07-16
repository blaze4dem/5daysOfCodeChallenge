package com.example.myapplication;

import android.net.http.SslError;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityB extends AppCompatActivity {

    public String URL = "https://andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        // Set Action Bar Tittle
        ActionBar barTitle = getSupportActionBar();
        barTitle.setTitle("ABOUT ALC 4");

        // Set webVeiw
        WebView alc = findViewById(R.id.web);

        WebSettings set = alc.getSettings();
        set.setJavaScriptEnabled(true);
        set.setDomStorageEnabled(true);

        alc.loadUrl(URL);

        alc.setWebViewClient(new MyClient());
    }

    public class MyClient extends WebViewClient{
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {

            handler.proceed();
        }
    }
}
