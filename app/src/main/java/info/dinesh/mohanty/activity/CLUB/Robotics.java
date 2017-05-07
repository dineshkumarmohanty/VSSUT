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

public class Robotics extends AppCompatActivity {
    Button btnvisionrobotics,btnvisionrobotics1,btnvisionrobotics2;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robotics);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnvisionrobotics = (Button) findViewById(R.id.btnvisionrobotics);
        btnvisionrobotics1 = (Button) findViewById(R.id.btnvisionrobotics1);
        btnvisionrobotics2 = (Button) findViewById(R.id.btnvisionrobotics2);


        btnvisionrobotics.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View v) {
                                                     Intent btnrRegBtechIntent = openbtnvisionrobotics(Robotics.this);
                                                     startActivity(btnrRegBtechIntent);
                                                 }

                                             }
        );
        btnvisionrobotics1.setOnClickListener(new View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View v) {
                                                      Intent btnrRegBtechIntent = openbtnvisionrobotics1(Robotics.this);
                                                      startActivity(btnrRegBtechIntent);
                                                  }

                                              }
        );
        btnvisionrobotics2.setOnClickListener(new View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View v) {
                                                      Intent btnrRegBtechIntent = openbtnvisionrobotics2(Robotics.this);
                                                      startActivity(btnrRegBtechIntent);
                                                  }

                                              }
        );
    }




    public static Intent openbtnvisionrobotics(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/category/campus/clubs/robotics/"));
    }
    public static Intent openbtnvisionrobotics1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://vssutrobotics.in/"));
    }

    public static Intent openbtnvisionrobotics2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/vssutrobotics/"));
    }
}
