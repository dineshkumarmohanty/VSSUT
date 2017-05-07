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



public class Music extends AppCompatActivity {
    Button btnvisionmu2,btnvisionmu,btnvisionmu1;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnvisionmu = (Button) findViewById(R.id.btnvisionmu);
        btnvisionmu1=(Button) findViewById(R.id.btnvisionmu1);
        btnvisionmu2=(Button) findViewById(R.id.btnvisionmu2);

        btnvisionmu.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openbtnvisionmu(Music.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnvisionmu1.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       Intent btnrRegBtechIntent = openbtnvisionmu1(Music.this);
                                                       startActivity(btnrRegBtechIntent);
                                                   }

                                               }
        );
        btnvisionmu2.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       Intent btnrRegBtechIntent = openbtnvisionmu2(Music.this);
                                                       startActivity(btnrRegBtechIntent);
                                                   }

                                               }
        );
    }

    public static Intent openbtnvisionmu(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/category/campus/clubs/souls/"));
    }
    public static Intent openbtnvisionmu1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/music-club.php"));
    }
    public static Intent openbtnvisionmu2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/soulsvssutburla"));
    }
}
