package com.example.nightmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void setting(View view) {
		Intent intent = new Intent(MainActivity.this,SettingActivity.class);
		MainActivity.this.startActivity(intent);
	}

	@Override
	protected void onResume() {
		super.onResume();
		
		this.setTheme(new SkinSettingManager(this).getCurrentSkinRes());
		setContentView(R.layout.activity_main);
	}

	
}
