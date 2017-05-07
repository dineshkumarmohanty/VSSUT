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



public class Literary extends AppCompatActivity {
    Button btnvision2,btnvision,btnvision1;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literary);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnvision = (Button) findViewById(R.id.btnvision);
        btnvision1=(Button) findViewById(R.id.btnvision1);
        btnvision2=(Button) findViewById(R.id.btnvision2);

        btnvision.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openbtnvision(Literary.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnvision1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvision1(Literary.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnvision2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvision2(Literary.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
    }

    public static Intent openbtnvision(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/category/campus/clubs/literary/"));
    }
    public static Intent openbtnvision1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/"));
    }
    public static Intent openbtnvision2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/thevission.vssut"));
    }
}
