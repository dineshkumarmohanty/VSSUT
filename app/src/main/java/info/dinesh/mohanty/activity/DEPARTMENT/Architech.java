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

public class Architech extends AppCompatActivity {
    Button btnarch2,btnarch1,btnarch3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architech);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnarch3 = (Button) findViewById(R.id.btnarch3);
        btnarch1 = (Button) findViewById(R.id.btnarch1);
        btnarch2 = (Button) findViewById(R.id.btnarch2);


        btnarch3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnarch3(Architech.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
        btnarch1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnarch1(Architech.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
        btnarch2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnarch2(Architech.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
    }


    public static Intent openbtnarch1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=architecture"));
    }
    public static Intent openbtnarch2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=architecture"));
    }
    public static Intent openbtnarch3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=architecture"));
    }

}







