package com.example.webapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webview);

        // Enable JavaScript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Set a WebViewClient to open links within the WebView
        webView.setWebViewClient(new WebViewClient());

        // Load the local HTML file
        webView.loadUrl("file:///android_asset/index.html");
    }
}
