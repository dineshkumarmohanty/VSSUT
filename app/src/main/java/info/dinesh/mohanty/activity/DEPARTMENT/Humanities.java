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

public class Humanities extends AppCompatActivity {
    Button btnHuman2,btnHuman1,btnHuman3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humanities);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnHuman3 = (Button) findViewById(R.id.btnHuman3);
        btnHuman1 = (Button) findViewById(R.id.btnHuman1);
        btnHuman2 = (Button) findViewById(R.id.btnHuman2);


        btnHuman3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnHuman3(Humanities.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
        btnHuman1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnHuman1(Humanities.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
        btnHuman2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnHuman2(Humanities.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
    }


    public static Intent openbtnHuman1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=humanities"));
    }
    public static Intent openbtnHuman2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=humanities"));
    }
    public static Intent openbtnHuman3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=humanities"));
    }

}




