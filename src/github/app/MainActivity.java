package github.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity

{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
						
		setContentView(R.layout.activity_main);
						
		Button cont1 = (Button) findViewById(R.id.act_main_button_top);
		cont1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity (new Intent ("github.app.FunctionActivity"));
			}

		});		
	}
	
}
