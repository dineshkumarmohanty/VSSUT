package info.dinesh.mohanty.activity.TNP;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;

public class Bro extends AppCompatActivity {
    Button btnTNP1,btnTNP2;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bro);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnTNP1 =(Button)findViewById(R.id.btnTNP1);
        btnTNP2 =(Button)findViewById(R.id.btnTNP2);


        btnTNP1.setOnClickListener(new View.OnClickListener(){
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openTNP1(Bro.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnTNP2.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openTNP2(Bro.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );

    }
    public static Intent openTNP1(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/pdf/Placement%20Brochure-2017.pdf"));}
    public static Intent openTNP2(Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("http://vssut.ac.in/pdf/Branch%20Wise%20Information-2017.pdf"));}




}
