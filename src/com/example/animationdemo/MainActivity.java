package com.example.animationdemo;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

/***
 * 
 * ProgressBar精度条动画
 * 
 * @author zq
 * 
 */

public class MainActivity extends Activity implements OnClickListener {

	private ImageView imageview;
	private AnimationDrawable animationDrawable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initView();
	}

	private void initView() {
		// TODO Auto-generated method stub
		imageview = (ImageView) findViewById(R.id.imageView1);
		findViewById(R.id.button1).setOnClickListener(this);
		findViewById(R.id.button2).setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			imageview.setImageResource(R.anim.loading);  
			animationDrawable = (AnimationDrawable) imageview.getDrawable();
			animationDrawable.start();
			break;
		case R.id.button2:
			animationDrawable = (AnimationDrawable) imageview.getDrawable();
			animationDrawable.stop();
			break;

		default:
			break;
		}
	}

}
