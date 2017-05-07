package info.dinesh.mohanty.activity.CLUB;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;

public class Clubs extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button btnRobotics,btnDramatics,btnMusic,btnDance,btnAutomobile,btnLiterary,btnQuiz,btnSanskarKendra,btnArt,btnCoding,btnAthletic,btnyoga,btnIdea,btnEDP,btnAVC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnRobotics = (Button) findViewById(R.id.btnRobotics);
        btnDramatics = (Button) findViewById(R.id.btnDramatics);
        btnMusic = (Button) findViewById(R.id.btnMusic);
        btnDance = (Button) findViewById(R.id.btnDance);
        btnAutomobile = (Button) findViewById(R.id.btnAutomobile);
        btnLiterary = (Button) findViewById(R.id.btnLiterary);
        btnQuiz = (Button) findViewById(R.id.btnQuiz);
        btnSanskarKendra = (Button) findViewById(R.id.btnSanskarKendra);
        btnArt= (Button) findViewById(R.id.btnArt);
        btnCoding = (Button) findViewById(R.id.btnCoding);
        btnAthletic = (Button) findViewById(R.id.btnAthletic);
        btnyoga=(Button)findViewById(R.id.btnyoga);
        btnIdea = (Button) findViewById(R.id.btnIdea);
        btnEDP = (Button) findViewById(R.id.btnEDP);
        btnAVC=(Button)findViewById(R.id.btnAVC);





        btnRobotics.setOnClickListener(this);
        btnDramatics.setOnClickListener(this);
        btnMusic.setOnClickListener(this);
        btnDance.setOnClickListener(this);
        btnAutomobile.setOnClickListener(this);
        btnLiterary.setOnClickListener(this);
        btnQuiz.setOnClickListener(this);
        btnSanskarKendra.setOnClickListener(this);
        btnArt.setOnClickListener(this);
        btnCoding.setOnClickListener(this);
        btnAthletic.setOnClickListener(this);
        btnyoga.setOnClickListener(this);
        btnIdea.setOnClickListener(this);
        btnEDP.setOnClickListener(this);
        btnAVC.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnRobotics:
                startActivity(new Intent(Clubs.this, Robotics.class));
                break;
            case R.id.btnDramatics:
                startActivity(new Intent(Clubs.this, Dramatics.class));
                break;
            case R.id.btnMusic:
                startActivity(new Intent(Clubs.this, Music.class));
                break;
            case R.id.btnDance:
                startActivity(new Intent(Clubs.this, Dance.class));
                break;
            case R.id.btnAutomobile:
                startActivity(new Intent(Clubs.this,Automobile.class));
                break;
            case R.id.btnLiterary:
                startActivity(new Intent(Clubs.this, Literary.class));
                break;
            case R.id.btnQuiz:
                startActivity(new Intent(Clubs.this, Quiz.class));
                break;
            case R.id.btnSanskarKendra:
                startActivity(new Intent(Clubs.this, SanskarKendra.class));
                break;
            case R.id.btnArt:
                startActivity(new Intent(Clubs.this, Art.class));
                break;
            case R.id.btnCoding:
                startActivity(new Intent(Clubs.this, Coding.class));
                break;
            case R.id.btnAthletic:
                startActivity(new Intent(Clubs.this, Athletic.class));
                break;
            case R.id.btnyoga:
                startActivity(new Intent(Clubs.this, Yoga.class));
                break;
            case R.id.btnIdea:
                startActivity(new Intent(Clubs.this, Idea.class));
                break;
            case R.id.btnEDP:
                startActivity(new Intent(Clubs.this, EDP.class));
                break;
            case R.id.btnAVC:
                startActivity(new Intent(Clubs.this, AVC.class));
                break;


        }
    }
}
