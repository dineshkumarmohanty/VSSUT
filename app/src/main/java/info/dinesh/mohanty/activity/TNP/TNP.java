package info.dinesh.mohanty.activity.TNP;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;


public class TNP extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button btnbro,btnstat,btncontact,btnmess,newstnp,facebookbtn,youtubebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnp);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnbro = (Button) findViewById(R.id.btnbro);
        btnstat=(Button)findViewById(R.id.btnstat);
        btncontact=(Button)findViewById(R.id.btncontact);
        btnmess=(Button)findViewById(R.id.btnmess);
        newstnp=(Button)findViewById(R.id.newstnp);
        facebookbtn=(Button)findViewById(R.id.facebookbtn);
        youtubebtn=(Button)findViewById(R.id.youtubebtn);


        btnbro.setOnClickListener(this);
        btnstat.setOnClickListener(this);
        btncontact.setOnClickListener(this);
        btnmess.setOnClickListener(this);
        newstnp.setOnClickListener(this);
        facebookbtn.setOnClickListener(this);
        youtubebtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnbro:
                startActivity(new Intent(TNP.this,Bro.class));
                break;
            case R.id.btnstat:
                startActivity(new Intent(TNP.this, STAT.class));
                break;
            case R.id.btncontact:
                startActivity(new Intent(TNP.this, CONCH.class));
                break;
            case R.id.btnmess:
                startActivity(new Intent(TNP.this, TNPNotice.class));
                break;
            case R.id.newstnp:
                startActivity(new Intent(TNP.this, News.class));
                break;
            case R.id.facebookbtn:
                startActivity(new Intent(TNP.this, Facebooktnp.class));
                break;
            case R.id.youtubebtn:
                startActivity(new Intent(TNP.this, Youtubetnp.class));
                break;

        }
    }

}

