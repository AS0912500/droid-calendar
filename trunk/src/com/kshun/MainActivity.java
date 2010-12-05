package com.kshun;

import java.text.SimpleDateFormat;

import com.kshun.droidcalendar.model.MarkImageProvider;
import com.kshun.droidcalendar.view.CalendarView;
import com.kshun.droidcalendar.view.DefaultCalendarCellView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Log.i("app", "onCreate");
		MarkImageProvider.init(getResources());
		CalendarView<DefaultCalendarCellView> view = new CalendarView<DefaultCalendarCellView>(
				getApplicationContext(), DefaultCalendarCellView.class, new String[]{"日","月", "火","水","木","金","土"}, new SimpleDateFormat("yyyy年 MM月"));
		((LinearLayout) findViewById(R.id.root)).addView(view);
	}
}