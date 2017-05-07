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

public class Production extends AppCompatActivity {
    Button btnPro2,btnPro1,btnPro3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnPro3 = (Button) findViewById(R.id.btnPro3);
        btnPro1 = (Button) findViewById(R.id.btnPro1);
        btnPro2 = (Button) findViewById(R.id.btnPro2);


        btnPro3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnPro3(Production.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
        btnPro1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnPro1(Production.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
        btnPro2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnPro2(Production.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
    }


    public static Intent openbtnPro1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=production-engineering"));
    }
    public static Intent openbtnPro2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=production-engineering"));
    }
    public static Intent openbtnPro3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=production-engineering"));
    }

}







