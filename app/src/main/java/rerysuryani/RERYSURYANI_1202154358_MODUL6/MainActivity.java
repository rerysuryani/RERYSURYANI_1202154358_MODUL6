package rerysuryani.RERYSURYANI_1202154358_MODUL6;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText mEmail;
    private EditText mPassword;
    private Button mlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        mEmail = (EditText) findViewById(R.id.email);
        mPassword = (EditText) findViewById(R.id.password);
        mlogin = (Button) findViewById(R.id.masuk);

    }

    private void SignIn() {
        String email = mEmail.getText().toString();
        String password = mPassword.getText().toString();

        if (TextUtils.isEmpty( email ) | TextUtils.isEmpty( password )) {
            Toast.makeText( MainActivity.this, "Harap isi Email dan Password Anda", Toast.LENGTH_SHORT ).show();

        } else {


        }
    }
    }