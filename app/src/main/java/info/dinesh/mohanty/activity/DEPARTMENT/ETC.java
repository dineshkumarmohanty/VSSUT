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

public class ETC extends AppCompatActivity {
    Button btnETC2,btnETC1,btnETC3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnETC3 = (Button) findViewById(R.id.btnETC3);
        btnETC1 = (Button) findViewById(R.id.btnETC1);
        btnETC2 = (Button) findViewById(R.id.btnETC2);


        btnETC3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnETC3(ETC.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
        btnETC1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnETC1(ETC.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
        btnETC2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent btnrRegBtechIntent = openbtnETC2(ETC.this);
                                           startActivity(btnrRegBtechIntent);
                                       }

                                   }
        );
    }


    public static Intent openbtnETC1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=electronics-and-tele-communication"));
    }
    public static Intent openbtnETC2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=electronics-and-tele-communication"));
    }
    public static Intent openbtnETC3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=electronics-and-tele-communication"));
    }

}



