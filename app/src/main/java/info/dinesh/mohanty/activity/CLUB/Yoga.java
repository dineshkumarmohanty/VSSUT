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

public class Yoga extends AppCompatActivity {
    Button btnvisionyoga,btnvisionyoga1,btnvisionyoga2;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnvisionyoga = (Button) findViewById(R.id.btnvisionyoga);
        btnvisionyoga1 = (Button) findViewById(R.id.btnvisionyoga1);
        btnvisionyoga2 = (Button) findViewById(R.id.btnvisionyoga2);


        btnvisionyoga.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View v) {
                                                     Intent btnrRegBtechIntent = openbtnvisionyoga(Yoga.this);
                                                     startActivity(btnrRegBtechIntent);
                                                 }

                                             }
        );
        btnvisionyoga1.setOnClickListener(new View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View v) {
                                                      Intent btnrRegBtechIntent = openbtnvisionyoga1(Yoga.this);
                                                      startActivity(btnrRegBtechIntent);
                                                  }

                                              }
        );
        btnvisionyoga2.setOnClickListener(new View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View v) {
                                                      Intent btnrRegBtechIntent = openbtnvisionyoga2(Yoga.this);
                                                      startActivity(btnrRegBtechIntent);
                                                  }

                                              }
        );
    }




    public static Intent openbtnvisionyoga(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/"));
    }
    public static Intent openbtnvisionyoga1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/yoga-club.php"));
    }

    public static Intent openbtnvisionyoga2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/Yoga-Club-VSSUT-Burla-731185013617855/"));
    }
}
