package info.dinesh.mohanty.activity.Academic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

import info.dinesh.mohanty.R;

public class Holidaylist extends AppCompatActivity {
    private Toolbar toolbar;

    ImageView imgView;

    ScaleGestureDetector scaleGDetector;

    float scale=1f;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_holidaylist);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imgView=(ImageView)findViewById(R.id.image);

        scaleGDetector=new ScaleGestureDetector(this, new ScaleListener());



    }


    @Override

    public boolean onTouchEvent(MotionEvent ev) {

        scaleGDetector.onTouchEvent(ev);

        return true;

    }



    private class ScaleListener implements ScaleGestureDetector.OnScaleGestureListener{

        public boolean onScaleBegin(ScaleGestureDetector sgd){



            return true;



        }

        public void onScaleEnd(ScaleGestureDetector sgd){



        }

        public boolean onScale(ScaleGestureDetector sgd){

            // Multiply scale factor

            scale*= sgd.getScaleFactor();

            // Scale or zoom the imageview

            imgView.setScaleX(scale);

            imgView.setScaleY(scale);

            Log.i("Main",String.valueOf(scale));

            return true;

        }

    }

}

