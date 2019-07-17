package demo.tensorflow.org.customvision_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Hints extends AppCompatActivity {
    List<String> s=new ArrayList<String>();
    ImageView i1,i2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int k=getIntent().getIntExtra("hint",0);
        setContentView(R.layout.activity_hints);
        s.add("No Hint");
        s.add("Change D.O.B");
        s.add("Start-up in set max's favourite ");
        s.add("photos");
        s.add("Ankuran");
        s.add("Bribe's Caddy");
        s.add("101000101");
        t1=(TextView)findViewById(R.id.testd);
        t1.setText(s.get(k-1));
        i1=(ImageView)findViewById(R.id.har);
        i2=(ImageView)findViewById(R.id.jal);
        i1.setVisibility(View.INVISIBLE);
        i2.setVisibility(View.INVISIBLE);
        t1.setVisibility(View.VISIBLE);
        if (k==4)
        {
            i1.setVisibility(View.VISIBLE);
            i2.setVisibility(View.VISIBLE);
            t1.setVisibility(View.INVISIBLE);
        }
    }
}
