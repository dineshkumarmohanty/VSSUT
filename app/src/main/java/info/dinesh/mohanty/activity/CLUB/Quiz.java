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



public class Quiz extends AppCompatActivity {
    Button btnvisionqu,btnvisionqu1,btnvisionqu2;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnvisionqu = (Button) findViewById(R.id.btnvisionqu);
        btnvisionqu1=(Button) findViewById(R.id.btnvisionqu1);
        btnvisionqu2=(Button) findViewById(R.id.btnvisionqu2);

        btnvisionqu.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent btnrRegBtechIntent = openbtnvisionqu(Quiz.this);
                                               startActivity(btnrRegBtechIntent);
                                           }

                                       }
        );
        btnvisionqu1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionqu1(Quiz.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
        btnvisionqu2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnrRegBtechIntent = openbtnvisionqu2(Quiz.this);
                                                startActivity(btnrRegBtechIntent);
                                            }

                                        }
        );
    }

    public static Intent openbtnvisionqu(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/category/campus/clubs/quizzine/"));
    }
    public static Intent openbtnvisionqu1(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://thevission.org/category/campus/clubs/quizzine/"));
    }
    public static Intent openbtnvisionqu2(Context context) {
        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/quizzinevssut/"));
    }
}
