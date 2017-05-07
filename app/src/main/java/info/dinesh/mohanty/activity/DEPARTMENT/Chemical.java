package info.dinesh.mohanty.activity.DEPARTMENT;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;

public class Chemical extends AppCompatActivity {
    Button btnChemical3,btnChemical1,btnChemical2;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemical);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnChemical3 = (Button) findViewById(R.id.btnChemical3);
        btnChemical1 = (Button) findViewById(R.id.btnChemical1);
        btnChemical2 = (Button) findViewById(R.id.btnChemical2);


        btnChemical3.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View v) {
                                                     Intent btnrRegBtechIntent = openbtnChemical3(Chemical.this);
                                                     startActivity(btnrRegBtechIntent);
                                                 }

                                             }
        );
        btnChemical1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnChemical1(Chemical.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnChemical2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnChemical2(Chemical.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
    }

    public static Intent openbtnChemical3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=chemical-engineering"));
    }
    public static Intent openbtnChemical1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=chemical-engineering"));
    }
    public static Intent openbtnChemical2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=chemical-engineering"));
    }

}
