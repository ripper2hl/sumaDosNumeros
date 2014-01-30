package com.moviles.sumadosnumeros;

import java.io.Console;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Suma extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_suma);
		//
		Button ejecutarSuma = (Button)findViewById(R.id.ejecutarSuma);
		Button cerrarapp = (Button)findViewById(R.id.botoncerrar);
		ejecutarSuma.setOnClickListener(sumar);
	}
	
	public void operacionSuma(){
		Operacion suma = new Operacion();
		EditText primerNumText = (EditText)findViewById(R.id.numeroUno);
		EditText segundoNumText = (EditText)findViewById(R.id.numeroDos);
		TextView resultado = (TextView)findViewById(R.id.resultadoSuma);
		//debug
		String test = primerNumText.toString();
		System.out.print(primerNumText.toString());
		//
		Double primerNumero = Double.parseDouble(primerNumText.getText().toString());
		Double segundoNumero = Double.parseDouble(segundoNumText.getText().toString());
		Double resultadoSuma = suma.sumar(primerNumero, segundoNumero);
		System.out.print(resultadoSuma);
		resultado.setText(resultadoSuma.toString());
	}
	
	/*
	public void operacionSuma(){
		Operacion suma = new Operacion();
		EditText primerNumText = (EditText)findViewById(R.id);
		EditText segundoNumText = (EditText)findViewById(R.id.segundoNumero);
		EditText resultadoText = (EditText)findViewById(R.id.resultado);
		double primerNumero = Double.parseDouble(primerNumText.toString());
		double segundoNumero = Double.parseDouble(segundoNumText.toString());
		double resultado = suma.sumar(primerNumero, segundoNumero);
	}
	*/
	private OnClickListener sumar = new OnClickListener() {		
		@Override
		public void onClick(View view) {
			operacionSuma();
		}
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.suma, menu);
		return true;
	}
}
