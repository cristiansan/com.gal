package github.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;


public class FunctionActivity extends Activity implements OnClickListener {
Button start, stop;	
private Chronometer chronometer;

@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_function);
    chronometer = (Chronometer) findViewById(R.id.digitalClock1);
    ((Button) findViewById(R.id.button1)).setOnClickListener(this);
    ((Button) findViewById(R.id.button2)).setOnClickListener(this);
}
@Override
public void onClick(View v) {
     switch(v.getId()) {
     case R.id.button1:
            chronometer.setBase(SystemClock.elapsedRealtime());
            chronometer.start();
            break;
   case R.id.button2:
         chronometer.stop();
          break;
    }}
}
