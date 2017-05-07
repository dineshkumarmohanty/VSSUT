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

public class MCA extends AppCompatActivity {
    Button btnMCA2,btnMCA1,btnMCA3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnMCA3 = (Button) findViewById(R.id.btnMCA3);
        btnMCA1 = (Button) findViewById(R.id.btnMCA1);
        btnMCA2 = (Button) findViewById(R.id.btnMCA2);


        btnMCA3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnMCA3(MCA.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
        btnMCA1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnMCA1(MCA.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
        btnMCA2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnMCA2(MCA.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
    }


    public static Intent openbtnMCA1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=mca"));
    }
    public static Intent openbtnMCA2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=mca"));
    }
    public static Intent openbtnMCA3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=mca"));
    }

}








