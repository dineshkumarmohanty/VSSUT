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

public class Mecha extends AppCompatActivity {
    Button btnMecha2,btnMecha1,btnMecha3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecha);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnMecha3 = (Button) findViewById(R.id.btnMecha3);
        btnMecha1 = (Button) findViewById(R.id.btnMecha1);
        btnMecha2 = (Button) findViewById(R.id.btnMecha2);


        btnMecha3.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent btnrRegBtechIntent = openbtnMecha3(Mecha.this);
                                            startActivity(btnrRegBtechIntent);
                                        }

                                    }
        );
        btnMecha1.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent btnrRegBtechIntent = openbtnMecha1(Mecha.this);
                                            startActivity(btnrRegBtechIntent);
                                        }

                                    }
        );
        btnMecha2.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent btnrRegBtechIntent = openbtnMecha2(Mecha.this);
                                            startActivity(btnrRegBtechIntent);
                                        }

                                    }
        );
    }


    public static Intent openbtnMecha1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/faculty.php?url=mechanical-engineering"));
    }
    public static Intent openbtnMecha2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/previous-questions.php?url=mechanical-engineering"));
    }
    public static Intent openbtnMecha3(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.vssut.ac.in/lecture-notes.php?url=mechanical-engineering"));
    }

}





