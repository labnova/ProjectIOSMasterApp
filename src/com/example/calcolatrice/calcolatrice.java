package com.example.calcolatrice;

import java.util.ArrayList;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class calcolatrice extends Activity   {
	
	EditText numero1;
	EditText numero2;
	TextView risultato;
	Button lista;
	Button addizione;
	Button sottrazione;
	Button moltiplicazione;
	Button divisione;
   
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        /**----DICHIARAZIONI VARIABILI E TEXTVIEW--**/ 
        numero1 = (EditText) findViewById(R.id.numero1);
    	numero2 = (EditText) findViewById(R.id.numero2);
    	
    	risultato = (EditText) findViewById(R.id.risultato);
         
    	 lista= (Button) findViewById(R.id.lista);
    	  addizione= (Button) findViewById(R.id.addizione);
//    	  addizione.setOnClickListener(this);

    	  sottrazione= (Button) findViewById(R.id.sottrazione);
          moltiplicazione= (Button) findViewById(R.id.moltiplicazione);
          divisione= (Button) findViewById(R.id.divisione);
       
        
        //LISTA RISULTATI
        final ArrayList<Double> serieDiNumeri = new ArrayList<Double>();
        
        
        
                
       
  
   /**----COMANDI BUTTON PER LE OPERAZIONI--**/ 
          
   addizione.setOnClickListener(new OnClickListener() {
   
    public void onClick(View v) {
    	String num1="";
    	String num2="";
    	num1= numero1.getText().toString();
        num2= numero2.getText().toString();
        //Integer.parseInt(num1);
        //Integer.parseInt(num2);
      double intero1= Double.parseDouble(num1);
      double intero2= Double.parseDouble(num2); 
       double ris= 0;
       ris = intero1 + intero2;
		serieDiNumeri.add(ris);
		
		risultato.setText(Double.toString(ris));
		
		
	}

	
	
	
});
    
    sottrazione.setOnClickListener(new OnClickListener() {
    	   
        public void onClick(View v) {
        	String num1= numero1.getText().toString();
            String num2= numero2.getText().toString();
            
            double intero1= Double.parseDouble(num1);
           double intero2= Double.parseDouble(num2);
    		double ris = intero1 - intero2;
    		serieDiNumeri.add(ris);
    		risultato.setText(Double.toString(ris));
    		
    	}

    	
    	
    	
    });
    
    moltiplicazione.setOnClickListener(new OnClickListener() {
 	   
        public void onClick(View v) {
        	String num1= numero1.getText().toString();
            String num2= numero2.getText().toString();
            
          double intero1= Double.parseDouble(num1);
          double intero2= Double.parseDouble(num2);
    		double ris = intero1 * intero2;
    		serieDiNumeri.add(ris);
    		risultato.setText(Double.toString(ris));
    		
    	}

    	
    	
    	
    });

    
    divisione.setOnClickListener(new OnClickListener() {
  	   
        public void onClick(View v) {
        	String num1= numero1.getText().toString();
            String num2= numero2.getText().toString();
            
           double intero1= Double.parseDouble(num1);
           double intero2= Double.parseDouble(num2);
           double ris = intero1 / intero2;
    		serieDiNumeri.add(ris);
    		risultato.setText(Double.toString(ris));
    		
    	}

    	
    	
    	
    });
    
    
    /**----PASSAGGIO INTENT PER 'LISTANUMERI'--**/ 
        
    lista.setOnClickListener(new OnClickListener() {
    	   
        public void onClick(View v) {
//        	String serieDiNumeri2= "ciao";
//        	Intent passaggio = new Intent(calcolatrice.this, ListaNumeri.class);
//    		passaggio.putExtra("listaValori", serieDiNumeri2);
//        	startActivity(passaggio);
        	Intent intent = new Intent(calcolatrice.this, ListaNumeri.class);
        	ArrayList<Double> listDouble = new ArrayList<Double>();
        	listDouble.add(1111.00000);
        	listDouble.add(13331.00000);
        	intent.putExtra("arraylist", listDouble);
        	startActivity(intent);
    		
    	}

    	
    	
    	
    });
    
    

    
    }
    
    
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
       
        return super.onOptionsItemSelected(item);
    }





	




	
}
