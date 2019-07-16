package example.com.juliusalc41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutUs extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        BrowseALC();
    }
public void BrowseALC(){
    WebView viewWeb = (WebView)findViewById(R.id.mWebView);
    viewWeb.setWebViewClient(new WebViewClient());
    viewWeb.getSettings().setJavaScriptEnabled(true);
    viewWeb.getSettings().setLoadsImagesAutomatically(true);
    viewWeb.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

    viewWeb.loadUrl("https://angela.com/alc/");

}
}