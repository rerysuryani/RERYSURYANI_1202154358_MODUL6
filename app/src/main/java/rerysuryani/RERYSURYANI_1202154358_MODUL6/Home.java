package rerysuryani.RERYSURYANI_1202154358_MODUL6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void SignOut(View view) {
        Intent intent = new Intent(Home.this, MainActivity.class);
               startActivity(intent);
    }
}