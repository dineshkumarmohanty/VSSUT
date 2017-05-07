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

public class Physics extends AppCompatActivity {
    Button btnPhy2,btnPhy1,btnPhy3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnPhy3 = (Button) findViewById(R.id.btnPhy3);
        btnPhy1 = (Button) findViewById(R.id.btnPhy1);
        btnPhy2 = (Button) findViewById(R.id.btnPhy2);


        btnPhy3.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnPhy3(Physics.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
        btnPhy1.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnPhy1(Physics.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
        btnPhy2.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnPhy2(Physics.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
    }


    public static Intent openbtnPhy1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=physics"));
    }
    public static Intent openbtnPhy2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=physics"));
    }
    public static Intent openbtnPhy3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=physics"));
    }

}







