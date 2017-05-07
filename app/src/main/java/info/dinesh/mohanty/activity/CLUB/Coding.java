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



public class Coding extends AppCompatActivity {
    Button btnvisionco2,btnvisionco,btnvisionco1;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnvisionco = (Button) findViewById(R.id.btnvisionco);
        btnvisionco1=(Button) findViewById(R.id.btnvisionco1);
        btnvisionco2=(Button) findViewById(R.id.btnvisionco2);

        btnvisionco.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openbtnvisionco(Coding.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnvisionco1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionco1(Coding.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnvisionco2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionco2(Coding.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
    }

    public static Intent openbtnvisionco(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/category/campus/clubs/codingclub/"));
    }
    public static Intent openbtnvisionco1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.codechef.com/campus_chapter/enigma-1"));
    }
    public static Intent openbtnvisionco2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/enigma.vssut"));
    }
}
