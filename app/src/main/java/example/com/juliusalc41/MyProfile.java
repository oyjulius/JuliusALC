package example.com.juliusalc41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {
    TextView txtName;
    TextView txtTrack;
    TextView txtCountry;
    TextView txtEmail;
    TextView txtPhone;
    TextView txtUsername;
    ImageView imgMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        txtName = (TextView) findViewById(R.id.txtName);
        txtTrack = (TextView) findViewById(R.id.txtTrack);
        txtCountry = (TextView) findViewById(R.id.txtCountry);
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        txtPhone = (TextView) findViewById(R.id.txtPhone);
        txtUsername = (TextView) findViewById(R.id.txtUsername);
        imgMe = (ImageView)findViewById(R.id.imgMe);


        txtName.setText("Julius Olagoke");
        txtTrack.setText("Track:           Android");
        txtCountry.setText("Country:       Nigeria");
        txtEmail.setText("Email:           oyjulius@gmail.com");
        txtPhone.setText("Phone number:    2348111336151");
        txtUsername.setText("Slack Username:  @Julius");
    }
}
