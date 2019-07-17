package demo.tensorflow.org.customvision_sample;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button cl1;
    Button cl2;
    Button cl3;
    Button cl4;
    ProgressBar p1;
    Button cl5;
    Button cl6;
    Button cl7;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1=(ProgressBar)findViewById(R.id.circularProgressbar);
        cl1=(Button)findViewById(R.id.clue1);
        cl2=(Button)findViewById(R.id.clue2);
        cl3=(Button)findViewById(R.id.clue3);
        cl4=(Button)findViewById(R.id.clue4);
        cl5=(Button)findViewById(R.id.clue5);
        cl6=(Button)findViewById(R.id.clue6);
        cl7=(Button)findViewById(R.id.clue7);
        t1=(TextView)findViewById(R.id.textView2);
        Intent i=getIntent();
        int k=i.getIntExtra("riddle",1);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        SharedPreferences.Editor editor = pref.edit();
        int s=pref.getInt("name",1);
        if(k>s)
        {
            editor.putInt("name", k);
            editor.commit();
        }
        else
            k=s;

        if(k>=2)
        {
            cl2.setVisibility(View.VISIBLE);
            p1.setProgress(16);
            if(k>=3)
            {
                cl3.setVisibility(View.VISIBLE);
                p1.setProgress(33);
                if(k>=4)
                {
                    cl4.setVisibility(View.VISIBLE);
                    p1.setProgress(50);
                    if(k>=5)
                    {
                        cl5.setVisibility(View.VISIBLE);
                        p1.setProgress(66);
                        if(k>=6)
                        {
                            cl6.setVisibility(View.VISIBLE);
                            p1.setProgress(83);
                            if(k>=7)
                                cl7.setVisibility(View.VISIBLE);
                            p1.setProgress(100);
                            if(k==8)
                                t1.setVisibility(View.VISIBLE);
                        }
                    }
                }
            }
        }

    }


    public void next(View view) {
        Intent i=new Intent(this,Riddle.class);
        i.putExtra("clue",1);
        startActivity(i);
    }

    public void next2(View view) {
        Intent i=new Intent(this,Riddle.class);
        i.putExtra("clue",2);
        startActivity(i);
    }

    public void next3(View view) {
        Intent i=new Intent(this,Riddle.class);
        i.putExtra("clue",3);
        startActivity(i);
    }

    public void next4(View view) {
        Intent i=new Intent(this,Riddle.class);
        i.putExtra("clue",4);
        startActivity(i);
    }

    public void next5(View view) {
        Intent i=new Intent(this,Riddle.class);
        i.putExtra("clue",5);
        startActivity(i);
    }

    public void next6(View view) {
        Intent i=new Intent(this,Riddle.class);
        i.putExtra("clue",6);
        startActivity(i);
    }

    public void next7(View view) {
        Intent i=new Intent(this,Riddle.class);
        i.putExtra("clue",7);
        startActivity(i);
    }
}
