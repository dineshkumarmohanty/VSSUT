package info.dinesh.mohanty.activity.COMPANY;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;

public class Company extends AppCompatActivity  {

    private Toolbar toolbar;
    private Button btnme1,btnme,btnme2 , btniic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnme1 = (Button) findViewById(R.id.btnme1);
        btnme2 = (Button) findViewById(R.id.btnme2);
        btnme = (Button) findViewById(R.id.btnme);
        btniic = (Button) findViewById(R.id.iicvssut);



        btnme2.setOnClickListener(new View.OnClickListener(){
                                                   @Override
                                                   public void onClick(View v) {
                                                       Intent btnrRegBtechIntent = getOpenFacebookIntent(Company.this);
                                                       startActivity(btnrRegBtechIntent);
                                                   }

                                               }
        );
        btnme.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v) {
                                         Intent btnrRegBtechIntent = openme(Company.this);
                                         startActivity(btnrRegBtechIntent);
                                     }

                                 }
        );
        btnme1.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v) {
                                         Intent btnrRegBtechIntent = openme1(Company.this);
                                         startActivity(btnrRegBtechIntent);
                                     }

                                 }
        );

        btniic.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View v) {
                                          Intent btnrRegBtechIntent = getOpenFacebookIntent1(Company.this);
                                          startActivity(btnrRegBtechIntent);
                                      }

                                  }
        );

    }

   // public static Intent openme2
            //(Context context){return new Intent(Intent.ACTION_VIEW,
            //Uri.parse("https://www.facebook.com/dinesh.sudat"));}
    public static Intent openme
            (Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("https://plus.google.com/u/1/109816904984103883145/about"));}

    public static Intent openme1
            (Context context){return new Intent(Intent.ACTION_VIEW,
            Uri.parse("https://in.linkedin.com/in/dineshkumarmohanty"));}

    public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0); //Checks if FB is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://profile/100007974400277")); //Trys to make intent with FB's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/dinesh.sudat")); //catches and opens a url to the desired page
        }
    }
    public static Intent getOpenFacebookIntent1(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0); //Checks if FB is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://page/989359477829300")); //Trys to make intent with FB's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/ideaclubvssut/")); //catches and opens a url to the desired page
        }
    }
}
