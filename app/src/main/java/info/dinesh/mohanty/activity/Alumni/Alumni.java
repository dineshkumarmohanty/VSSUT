package info.dinesh.mohanty.activity.Alumni;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;


public class Alumni extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button btnda,btnWEBALUMNI,btnAE ,btnexecutive ,btnChapter , btnFacebook ,btnLinkedin ,btnTwitter,btnGam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnda = (Button) findViewById(R.id.btnda);
        btnWEBALUMNI=(Button)findViewById(R.id.btnWEBALUMNI);
        btnAE=(Button)findViewById(R.id.btnAE);
        btnexecutive=(Button)findViewById(R.id.btnexecutive);
        btnChapter=(Button)findViewById(R.id.btnChapter);
        btnFacebook=(Button)findViewById(R.id.btnFacebook);
        btnLinkedin=(Button)findViewById(R.id.btnLinkedin);
        btnTwitter=(Button)findViewById(R.id.btnTwitter);
        btnGam=(Button)findViewById(R.id.btnGam);



        btnda.setOnClickListener(this);
        btnAE.setOnClickListener(this);
        btnexecutive.setOnClickListener(this);
        btnChapter.setOnClickListener(this);

        btnWEBALUMNI.setOnClickListener(new View.OnClickListener(){
                                              @Override
                                              public void onClick(View v) {
                                                  Intent btnrRegBtechIntent = openbtnMovieticket(Alumni.this);
                                                  startActivity(btnrRegBtechIntent);
                                              }

                                          }
        );
        btnFacebook.setOnClickListener(new View.OnClickListener(){
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnF(Alumni.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnTwitter.setOnClickListener(new View.OnClickListener(){
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnT(Alumni.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnLinkedin.setOnClickListener(new View.OnClickListener(){
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnL(Alumni.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnGam.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnda:
                startActivity(new Intent(Alumni.this, Distinguish.class));
                break;
            case R.id.btnAE:
                startActivity(new Intent(Alumni.this, AlumniEvent.class));
                break;
            case R.id.btnexecutive:
                startActivity(new Intent(Alumni.this, Executive.class));
                break;
            case R.id.btnChapter:
                startActivity(new Intent(Alumni.this, Chapters.class));
                break;
            case R.id.btnGam:
                startActivity(new Intent(Alumni.this, Gam.class));
                break;

        }
    }
    public static Intent openbtnMovieticket(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://www.vssutalumni.org/home.dz"));}
    public static Intent openbtnF(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("https://www.facebook.com/VSSUTtburla/"));}
    public static Intent openbtnL(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("https://www.linkedin.com/edu/school?id=373025"));}
    public static Intent openbtnT(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("https://twitter.com/vssut"));}

}
