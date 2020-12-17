package com.example.vbicomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.vbi_cpn.ToastTeProvider;
import com.example.vbi_cpn.ToastTesing;

import java.util.List;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		updateDetail("");
	}

	@Override
	public void onStart() {
		super.onStart();

		// manage other components that need to respond
		// to the activity lifecycle
	}

	@Override
	public void onStop() {
		super.onStop();
		// manage other components that need to respond
		// to the activity lifecycle
	}

	public void updateDetail(String uri) {  //
		List<ToastTesing> list = ToastTeProvider
				.parse(uri);
		String itemListAsString = list.toString();
//		listener.onRssItemSelected(itemListAsString);
	}
}
