package info.dinesh.mohanty.activity.CLUB;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import info.dinesh.mohanty.R;

public class Main2Activity extends AppCompatActivity {

    Button robotix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        robotix =(Button)findViewById(R.id.btngo);
        robotix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent facebookIntent;
                facebookIntent = openFacebook(Main2Activity.this);
                startActivity(facebookIntent);

            }

        });
    }
    public static Intent openFacebook(Context context)
    {


        return new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/karthikofficialpage"));


    }
}

