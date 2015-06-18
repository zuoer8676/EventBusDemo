package com.example.eventbusdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import de.greenrobot.event.EventBus;

/** 
 * @author 刘赞 
 * @version 创建时间：2015-6-18 下午1:35:05 
 */
public class SecondActivity extends Activity{
	 private Button btn_FirstEvent;  
	  
	    @Override  
	    protected void onCreate(Bundle savedInstanceState) {  
	        super.onCreate(savedInstanceState);  
	        setContentView(R.layout.activity_second);  
	        btn_FirstEvent = (Button) findViewById(R.id.btn_first_event);  
	  
	        btn_FirstEvent.setOnClickListener(new View.OnClickListener() {  
	  
	            @Override  
	            public void onClick(View v) {  
	                // TODO Auto-generated method stub  
	                EventBus.getDefault().post(  
	                        new FirstEvent("FirstEvent btn clicked"));  
	            }  
	        });  
	    }  
}
