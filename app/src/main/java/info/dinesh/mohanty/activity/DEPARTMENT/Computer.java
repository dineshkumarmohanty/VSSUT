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

public class Computer extends AppCompatActivity {
    Button btnComputer2,btnComputer1,btnComputer3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnComputer3 = (Button) findViewById(R.id.btnComputer3);
        btnComputer1 = (Button) findViewById(R.id.btnComputer1);
        btnComputer2 = (Button) findViewById(R.id.btnComputer2);


        btnComputer3.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnComputer3(Computer.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
        btnComputer1.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnComputer1(Computer.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
        btnComputer2.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnComputer2(Computer.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
    }


    public static Intent openbtnComputer1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=computer-science-engineering-it"));
    }
    public static Intent openbtnComputer2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=computer-science-engineering-it"));
    }
    public static Intent openbtnComputer3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=computer-science-engineering-it"));
    }

}




