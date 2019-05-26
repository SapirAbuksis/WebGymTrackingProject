package com.hit.gymapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * The only activity, including the web view
 */
public class MainActivity extends AppCompatActivity {

    WebView webView = null;

    /**
     * onCreate.
     * create the view
     *
     * @param savedInstanceState the save instance state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.loadUrl("http://10.0.2.2:8080/WebGymTracking/login.jsp");
        webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webView.addJavascriptInterface(new WebAppInterface(this), "Android");
        //opens all link in the same web view instead of the default browser
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;

            }
        });
        setContentView(webView);
    }

    /**
     * onBackPressed.
     * cancel the back button functionality
     */
    @Override
    public void onBackPressed() {
        return;
        //the back button does nothing, because the jQuery
    }
}