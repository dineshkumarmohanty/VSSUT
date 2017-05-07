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

public class Math extends AppCompatActivity {
    Button btnMath2,btnMath1,btnMath3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnMath3 = (Button) findViewById(R.id.btnMath3);
        btnMath1 = (Button) findViewById(R.id.btnMath1);
        btnMath2 = (Button) findViewById(R.id.btnMath2);


        btnMath3.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnMath3(Math.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
        btnMath1.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnMath1(Math.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
        btnMath2.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnMath2(Math.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
    }


    public static Intent openbtnMath1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=mathematics"));
    }
    public static Intent openbtnMath2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=mathematics"));
    }
    public static Intent openbtnMath3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=mathematics"));
    }

}





