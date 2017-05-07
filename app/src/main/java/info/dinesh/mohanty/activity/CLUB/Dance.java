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



public class Dance extends AppCompatActivity {
    Button btnvisionda2,btnvisionda,btnvisionda1;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnvisionda = (Button) findViewById(R.id.btnvisionda);
        btnvisionda1=(Button) findViewById(R.id.btnvisionda1);
        btnvisionda2=(Button) findViewById(R.id.btnvisionda2);

        btnvisionda.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openbtnvisionda(Dance.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnvisionda1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionda1(Dance.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnvisionda2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionda2(Dance.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
    }

    public static Intent openbtnvisionda(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/category/campus/clubs/vibranz/"));
    }
    public static Intent openbtnvisionda1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/cultural-association.php"));
    }
    public static Intent openbtnvisionda2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/VibranzSwag"));
    }
}
