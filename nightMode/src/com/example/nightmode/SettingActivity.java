package com.example.nightmode;

import android.os.Bundle;
import android.view.View;

public class SettingActivity extends BaseActivity {

	private int themes;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.setting);
	}

	public void back(View view) {

		SettingActivity.this.finish();
	}
	
	public void toggle(View view) {

		themes = new SkinSettingManager(this).toggleSkins();
		this.setTheme(themes);
		setContentView(R.layout.setting);
	}
}
