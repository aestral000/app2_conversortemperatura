package br.edu.ifsp.dmos5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.edu.ifsp.dmos5.model.CelsiusStrategy;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView lbl_converted_value;
    private Button btn_convert_celsius;
    private EditText txt_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lbl_converted_value = findViewById(R.id.lbl_converted_value);
        btn_convert_celsius = findViewById(R.id.btn_convert_celsius);
        btn_convert_celsius.setOnClickListener(this);
        txt_input = findViewById(R.id.txt_input);
    }

    @Override
    public void onClick(View view) {
        try {
            if(view == btn_convert_celsius  ){
                CelsiusStrategy celsius = CelsiusStrategy.getInstance();
                lbl_converted_value.setText(String.format("%.1f °C",celsius.getConversion(Double.parseDouble(String.valueOf(txt_input.getText())))));
            }
        }catch (RuntimeException ex){
            Toast.makeText(this, "Erro inesperado ao realizar a conversão", Toast.LENGTH_SHORT).show();
        }

    }

}