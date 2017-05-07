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

public class Dramatics extends AppCompatActivity {
    Button btnvisiondramatics,btnvisiondramatics1,btnvisiondramatics2;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dramatics);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnvisiondramatics = (Button) findViewById(R.id.btnvisiondramatics);
        btnvisiondramatics1=(Button) findViewById(R.id.btnvisiondramatics1);
        btnvisiondramatics2=(Button) findViewById(R.id.btnvisiondramatics2);

        btnvisiondramatics.setOnClickListener(new View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View v) {
                                                      Intent btnrRegBtechIntent = openbtnvisiondramatics(Dramatics.this);
                                                      startActivity(btnrRegBtechIntent);
                                                  }

                                              }
        );
        btnvisiondramatics1.setOnClickListener(new View.OnClickListener() {
                                                             @Override
                                                             public void onClick(View v) {
                                                                 Intent btnrRegBtechIntent = openbtnvisiondramatics1(Dramatics.this);
                                                                 startActivity(btnrRegBtechIntent);
                                                             }

                                                         }
        );
        btnvisiondramatics2.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       Intent btnrRegBtechIntent = openbtnvisiondramatics2(Dramatics.this);
                                                       startActivity(btnrRegBtechIntent);
                                                   }

                                               }
        );
    }

    public static Intent openbtnvisiondramatics(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/category/campus/clubs/dramatics/"));
    }
    public static Intent openbtnvisiondramatics1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://emoticavssut.wordpress.com/"));
    }
    public static Intent openbtnvisiondramatics2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/emoticathehouseofactors"));
    }
}