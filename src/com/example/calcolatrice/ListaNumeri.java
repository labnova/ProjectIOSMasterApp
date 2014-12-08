package com.example.calcolatrice;

import java.util.ArrayList;

import android.content.Intent;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
//import android.widget.ListView;
import android.widget.TextView;

public class ListaNumeri extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_numeri);
		
		ArrayList<Double> listDouble = (ArrayList<Double>) getIntent().getSerializableExtra("arraylist");
		System.out.println("...serialized data.." + listDouble);
		
//		TextView lista= (TextView) findViewById(R.id.array);
//		
//		Intent ricevente= getIntent();
////		ArrayAdapter<Integer> serieDiNumeri = new ArrayAdapter(null, 0, 0, ricevente.getStringArrayListExtra("listaValori"));
////				
////				
////		int size= (int) ((Menu) serieDiNumeri).size();
////		
////		for(int i = 0; i < size; i++) {
////			lista.append((CharSequence) serieDiNumeri);
////			lista.append("\n");
////			}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista_numeri, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
//		if (id == R.id.action_settings) {
//			return true;
//		}
		return super.onOptionsItemSelected(item);
	}
}
