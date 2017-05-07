package info.dinesh.mohanty.activity.CLUB;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;



public class SanskarKendra extends AppCompatActivity {
    Button btnvisionsa2,btnvisionsa,btnvisionsa1;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanskar_kendra);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnvisionsa = (Button) findViewById(R.id.btnvisionsa);
        btnvisionsa1=(Button) findViewById(R.id.btnvisionsa1);
        btnvisionsa2=(Button) findViewById(R.id.btnvisionsa2);

        btnvisionsa.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openbtnvisionsa(SanskarKendra.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnvisionsa1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionsa1(SanskarKendra.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnvisionsa2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionsa2(SanskarKendra.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
    }

    public static Intent openbtnvisionsa(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/category/campus/clubs/sanskarkendra/"));
    }
    public static Intent openbtnvisionsa1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/ssg-students-aid-fund.php"));
    }
    public static Intent openbtnvisionsa2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/sanskarkendra.vssut.burla/"));
    }
}
