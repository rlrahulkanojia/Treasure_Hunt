package demo.tensorflow.org.customvision_sample;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Riddle extends AppCompatActivity {
    TextView t1;
    Button b1;
    Button hint;
    List<String> s=new ArrayList<String>();
    int k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddle);
        t1=(TextView)findViewById(R.id.textView);
        s.add("No Riddle");
        s.add("What if Nicole Kidman was born in French revolution..");
        s.add("I have wheels but I can't commute ");
        s.add("Where one finds daily supplies");
        s.add("Three dwarfs enjoys fresh air from a vertical area");
        s.add("I am always high but people think as if I am here Where does people think I am.");
        s.add("It is in the place where the journey ends And it stands still watching everyone");
        Intent i=getIntent();
        k=i.getIntExtra("clue",1);
        t1.setText(s.get(k-1));
        b1=(Button)findViewById(R.id.audio);
        if (k==1)
        {
            b1.setVisibility(View.VISIBLE);
        }
        else
        {
            b1.setVisibility(View.INVISIBLE);
            t1.setVisibility(View.VISIBLE);
        }
        hint=(Button)findViewById(R.id.hint);
        hint.setVisibility(View.INVISIBLE);

        hint.postDelayed(new Runnable() {
            public void run() {
                hint.setVisibility(View.VISIBLE);
            }
        }, 240000);
    }

    public void camera(View view) {
        Intent i=new Intent(this,ClassifierActivity.class);
        i.putExtra("riddle",k);
        startActivity(i);
    }

    public void audiodone(View view) {
        MediaPlayer ring= MediaPlayer.create(Riddle.this,R.raw.sound);
        ring.start();
    }

    public void testd(View view) {
        Intent i1=new Intent(this,Hints.class);
        i1.putExtra("hint",k);
        startActivity(i1);
    }
}
