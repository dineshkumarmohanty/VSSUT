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

public class Civil extends AppCompatActivity {
    Button btnCivil2,btnCivil1,btnCivil3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnCivil3 = (Button) findViewById(R.id.btnCivil3);
        btnCivil1 = (Button) findViewById(R.id.btnCivil1);
        btnCivil2 = (Button) findViewById(R.id.btnCivil2);


        btnCivil3.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent btnrRegBtechIntent = openbtnCivil3(Civil.this);
                                                 startActivity(btnrRegBtechIntent);
                                             }

                                         }
        );
        btnCivil1.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent btnrRegBtechIntent = openbtnCivil1(Civil.this);
                                                 startActivity(btnrRegBtechIntent);
                                             }

                                         }
        );
        btnCivil2.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent btnrRegBtechIntent = openbtnCivil2(Civil.this);
                                                 startActivity(btnrRegBtechIntent);
                                             }

                                         }
        );
    }


    public static Intent openbtnCivil1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=civil-engineering"));
    }
    public static Intent openbtnCivil2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=civil-engineering"));
    }
    public static Intent openbtnCivil3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=civil-engineering"));
    }

}



