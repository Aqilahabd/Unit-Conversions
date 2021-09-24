package cosc592.unitconversions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_third );

        EditText et_feet = (EditText) findViewById(R.id.inputFeet);
        TextChangeHandler temp = new TextChangeHandler();
        et_feet.addTextChangedListener(temp);

        EditText et_meter = (EditText) findViewById(R.id.inputMeter);
        TextChangeHandler2 temp1 = new TextChangeHandler2();
        et_meter.addTextChangedListener(temp1);

        EditText inputFeet=(EditText)findViewById( R.id.inputFeet );
    }
    private class TextChangeHandler implements TextWatcher
    {
        public void afterTextChanged(Editable e)
        {
            try {

                EditText et_feet = (EditText) findViewById(R.id.inputFeet);
                String feetString = et_feet.getText().toString();
                float feet = Float.parseFloat(feetString);

                double answerFeet = feet * 0.3048;

                TextView et_feetOutput =  findViewById(R.id.outputFeet);
                et_feetOutput.setText(answerFeet + "");
            }

            catch (Exception a)
            { }
        }
        public void beforeTextChanged(CharSequence s, int start, int count, int after)
        { }
        public void onTextChanged(CharSequence s, int start, int before, int after)
        { }
    }
    private class TextChangeHandler2 implements TextWatcher
    {
        public void afterTextChanged(Editable e)
        {
            try {

                EditText et_meter = (EditText) findViewById(R.id.inputMeter);
                String meterString = et_meter.getText().toString();
                float meter = Float.parseFloat(meterString);

                double answerMeter = meter * 3.28084;

                TextView et_meterOutput =  findViewById(R.id.outputMeter);
                et_meterOutput.setText(answerMeter + "");
            }
            catch (Exception a)
            { } }
        public void beforeTextChanged(CharSequence s, int start, int count, int after)
        { }
        public void onTextChanged(CharSequence s, int start, int before, int after)
        { }}

    public void Calculate(View view) {
        calculate() ;}

    public void  calculate() {

        EditText inputFeet=(EditText)findViewById( R.id.inputFeet );
        String inputFeetString = inputFeet.getText().toString();

        double feetInput;
        try {
            feetInput = Float.parseFloat( inputFeetString );
        } catch (NumberFormatException e) {
            feetInput = 0;
        }
        double id, feet, meter ;
        id = 0;
        meter  = 0;
        feet = 0;
        if (id == R.id.inputFeet) {
            feet = feet * 0.3048;

            TextView outputFeet = (TextView) findViewById( R.id.outputFeet );
            outputFeet.setText( outputFeet + "" );

        } else

            meter = meter * 3.28084;

        TextView outputMeter = (TextView) findViewById( R.id.outputMeter );
        outputMeter.setText( outputMeter + "" );
    }

    public void back(View view) {
        Intent mainActivity= new Intent( this,MainActivity.class );
        startActivity( mainActivity );
    }
}