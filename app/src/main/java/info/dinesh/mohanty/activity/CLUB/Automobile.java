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



public class Automobile extends AppCompatActivity {
    Button btnvisionsae,btnvisionsupra1,btnvisionsupra2,btnvisionbaja1,btnvisionbaja2;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automobile);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnvisionsae = (Button) findViewById(R.id.btnvisionsae);
        btnvisionsupra1=(Button) findViewById(R.id.btnvisionsupra1);
        btnvisionsupra2=(Button) findViewById(R.id.btnvisionsupra2);
        btnvisionbaja1=(Button) findViewById(R.id.btnvisionbaja1);
        btnvisionbaja2=(Button) findViewById(R.id.btnvisionbaja2);

        btnvisionsae.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openbtnvisionsae(Automobile.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnvisionsupra1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionsupra1(Automobile.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnvisionsupra2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionsupra2(Automobile.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnvisionbaja1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionbaja1(Automobile.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnvisionbaja2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionbaja2(Automobile.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
    }

    public static Intent openbtnvisionsae(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/category/campus/clubs/sae/"));
    }
    public static Intent openbtnvisionsupra1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://veerracerss.in/home/"));
    }
    public static Intent openbtnvisionsupra2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/veerracerss"));
    }
    public static Intent openbtnvisionbaja1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssutsae.com"));
    }
    public static Intent openbtnvisionbaja2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/TeamVEERssRacing"));
    }
}
