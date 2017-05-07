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

public class Chemistry extends AppCompatActivity {
    Button btnChemistry2,btnChemistry1,btnChemistry3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnChemistry3 = (Button) findViewById(R.id.btnChemistry3);
        btnChemistry1 = (Button) findViewById(R.id.btnChemistry1);
        btnChemistry2 = (Button) findViewById(R.id.btnChemistry2);


        btnChemistry3.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnbtnChemistry3(Chemistry.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnChemistry1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnChemistry1(Chemistry.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnChemistry2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnChemistry2(Chemistry.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
    }


    public static Intent openbtnChemistry1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=chemistry"));
    }
    public static Intent openbtnChemistry2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=chemistry"));
    }
    public static Intent openbtnbtnChemistry3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=chemistry"));
    }

}


