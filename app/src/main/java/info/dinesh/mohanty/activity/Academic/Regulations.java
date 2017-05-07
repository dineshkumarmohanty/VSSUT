package info.dinesh.mohanty.activity.Academic;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;

public class Regulations extends AppCompatActivity {
    Button btnRegBtech,btnRegMtech,btnRegMsc,btnRegMca,btnRegPhd;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regulations);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnRegBtech =(Button)findViewById(R.id.btnRegBtech);
        btnRegMtech =(Button)findViewById(R.id.btnRegMtech);
        btnRegMsc =(Button)findViewById(R.id.btnRegMsc);
        btnRegMca =(Button)findViewById(R.id.btnRegMca);
        btnRegPhd =(Button)findViewById(R.id.btnRegPhd);


        btnRegBtech.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent btnrRegBtechIntent = openbtech(Regulations.this);
                startActivity(btnrRegBtechIntent);
            }

        }
        );
        btnRegMtech.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openmtech(Regulations.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnRegMsc.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openmsc(Regulations.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnRegMca.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openmca(Regulations.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
        btnRegPhd.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent btnrRegBtechIntent = openphd(Regulations.this);
                                             startActivity(btnrRegBtechIntent);
                                         }

                                     }
        );
    }
    public static Intent openbtech(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://www.vssut.ac.in/pdf/B.Tech.pdf"));}
    public static Intent openmtech(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://www.vssut.ac.in/pdf/M.Tech.pdf"));}
    public static Intent openmsc(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://www.vssut.ac.in/pdf/M._Sc._Regulation.pdf"));}
    public static Intent openmca(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/MCA1.pdf"));}
    public static Intent openphd(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/doc/Regulation-for-Ph.D-Programme.pdf"));}



}
