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



public class Art extends AppCompatActivity {
    Button btnvisionph2,btnvisionph,btnvisionph1;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnvisionph = (Button) findViewById(R.id.btnvisionph);
        btnvisionph1=(Button) findViewById(R.id.btnvisionph1);
        btnvisionph2=(Button) findViewById(R.id.btnvisionph2);

        btnvisionph.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openbtnvisionph(Art.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnvisionph1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionph1(Art.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnvisionph2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionph2(Art.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
    }

    public static Intent openbtnvisionph(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/category/campus/clubs/designtab/"));
    }
    public static Intent openbtnvisionph1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/art-photography-club.php"));
    }
    public static Intent openbtnvisionph2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/pixelsvssut/"));
    }
}
