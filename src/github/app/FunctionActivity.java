package github.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.DigitalClock;
import android.widget.TextView;

public class FunctionActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_function);
		
		final DigitalClock dc=(DigitalClock) findViewById(R.id.digitalClock1);
		final TextView tv=(TextView) findViewById(R.id.act_function_tittle_top);

		dc.setClickable(true);
		dc.setOnClickListener(new View.OnClickListener() {
			
		@Override
		public void onClick(View v) {
		tv.setText(dc.getText().toString());
		tv.setTextColor(Color.RED);
		tv.setTextSize(50);
		
		}
		});
		}

	
}
