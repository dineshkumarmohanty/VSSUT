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



public class Athletic extends AppCompatActivity {
    Button btna2,btna,btna1;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_athletic);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btna = (Button) findViewById(R.id.btna);
        btna1=(Button) findViewById(R.id.btna1);
        btna2=(Button) findViewById(R.id.btna2);

        btna.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openbtna(Athletic.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btna1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtna1(Athletic.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btna2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtna2(Athletic.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
    }

    public static Intent openbtna(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/category/campus/clubs/athletics/"));
    }
    public static Intent openbtna1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/athletic-club.php"));
    }
    public static Intent openbtna2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/athleticsclubvssut/"));
    }
}
