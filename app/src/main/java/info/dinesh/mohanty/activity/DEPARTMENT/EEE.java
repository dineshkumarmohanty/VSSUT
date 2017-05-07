package info.dinesh.mohanty.activity.DEPARTMENT;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;

public class EEE extends AppCompatActivity {
    Button btnEEE2,btnEEE1,btnEEE3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnEEE3 = (Button) findViewById(R.id.btnEEE3);
        btnEEE1 = (Button) findViewById(R.id.btnEEE1);
        btnEEE2 = (Button) findViewById(R.id.btnEEE2);


        btnEEE3.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnEEE3(EEE.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
        btnEEE1.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnEEE1(EEE.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
        btnEEE2.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnEEE2(EEE.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
    }


    public static Intent openbtnEEE1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=electrical-engineering-eee"));
    }
    public static Intent openbtnEEE2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=electrical-engineering-eee"));
    }
    public static Intent openbtnEEE3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=electrical-engineering-eee"));
    }

}



