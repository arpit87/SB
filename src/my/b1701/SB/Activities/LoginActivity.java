package my.b1701.SB.Activities;

import android.app.Activity;


public class LoginActivity extends Activity  {

	private ProgressBar queryProgressBar;
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_view);	

		queryProgressBar = (ProgressBar) findViewById(R.id.queryLogin_progressBar);
	}

	public void onStart() {
		super.onStart();
		

	}

	public void onStop() {
		super.onStop();
		
	}

	public void onResume() {
		super.onResume();
		
	}	
	}

	
	