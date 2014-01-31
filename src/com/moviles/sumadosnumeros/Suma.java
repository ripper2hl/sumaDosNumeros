package com.moviles.sumadosnumeros;

import java.io.Console;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Suma extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_suma);
		Button ejecutarSuma = (Button)findViewById(R.id.ejecutarSuma);
		Button cerrarapp = (Button)findViewById(R.id.botoncerrar);
		ejecutarSuma.setOnClickListener(sumar);
	}
	
	public void operacionSuma(){
		Operacion suma = new Operacion();
		EditText primerNumText = (EditText)findViewById(R.id.numeroUno);
		EditText segundoNumText = (EditText)findViewById(R.id.numeroDos);
		TextView resultado = (TextView)findViewById(R.id.resultadoSuma);
		try {
			
			Double primerNumero = Double.parseDouble(primerNumText.getText().toString());
			Double segundoNumero = Double.parseDouble(segundoNumText.getText().toString());
			Double resultadoSuma = suma.sumar(primerNumero, segundoNumero);
			resultado.setText(resultadoSuma.toString());

		} catch (Exception e) {
			Toast.makeText(this, "Ocurrio un error en la aplicacion", Toast.LENGTH_LONG).show();
		}

	}
	
	private OnClickListener sumar = new OnClickListener() {		
		@Override
		public void onClick(View view) {
			switch(view.getId()){
			    case R.id.ejecutarSuma:
				    operacionSuma();
				    break;
			    case R.id.botoncerrar:
				    //Intent intent = new Intent(Intent.ACTION_MAIN);
				    Suma.this.finish();
			    	System.exit(0);
				    break;
			
			}
		}
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.suma, menu);
		return true;
	}
}
