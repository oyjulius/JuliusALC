package example.com.juliusalc41;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnAboutALC;
    private Button btnMyProfile;
    private TextView vWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAboutALC = (Button) findViewById(R.id.btnAboutAlc);
        btnMyProfile = (Button) findViewById(R.id.btnMyProfile);
        vWelcome = (TextView) findViewById(R.id.vWelcome);

        btnMyProfile.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openMyProfile();
                    }
                }
        );

        btnAboutALC.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openAboutUs();
                    }
                }
        );

        }
        public void openMyProfile(){
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
        }

    public void openAboutUs(){
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

}