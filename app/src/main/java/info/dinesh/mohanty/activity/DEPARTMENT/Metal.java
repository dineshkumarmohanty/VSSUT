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

public class Metal extends AppCompatActivity {
    Button btnMetal2,btnMetal1,btnMetal3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metal);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnMetal3 = (Button) findViewById(R.id.btnMetal3);
        btnMetal1 = (Button) findViewById(R.id.btnMetal1);
        btnMetal2 = (Button) findViewById(R.id.btnMetal2);


        btnMetal3.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnMetal3(Metal.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
        btnMetal1.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnMetal1(Metal.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
        btnMetal2.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openbtnMetal2(Metal.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
    }


    public static Intent openbtnMetal1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=metallurgy-materials-engineering"));
    }
    public static Intent openbtnMetal2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=metallurgy-materials-engineering"));
    }
    public static Intent openbtnMetal3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=metallurgy-materials-engineering"));
    }

}






