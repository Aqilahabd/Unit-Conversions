package cosc592.unitconversions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );

        EditText et_mile = (EditText) findViewById(R.id.inputMile);
        TextChangeHandler temp = new TextChangeHandler();
        et_mile.addTextChangedListener(temp);

        EditText et_kiloMeter = (EditText) findViewById(R.id.inputKilometer);
        TextChangeHandler2 temp1 = new TextChangeHandler2();
        et_kiloMeter.addTextChangedListener(temp1);
    }

    public void Calculate(View view) {
        calculate() ;}

    public void  calculate() {

        EditText inputMile = (EditText) findViewById( R.id.inputMile );
        String inputMileString = inputMile.getText().toString();

        double mileInput;
        try {
            mileInput = Float.parseFloat( inputMileString );
        } catch (NumberFormatException e) {
            mileInput = 0; }

        double id, mile, kilometer;
        id = 0;
        kilometer = 0;
        mile = 0;
        if (id == R.id.inputMile) {
            mile = mile * 1.621371;

            TextView outputMile = (TextView) findViewById( R.id.outputMile );
            outputMile.setText( outputMile + "" );
        } else
            kilometer = kilometer * 0.621371;

        TextView outputKilometer = (TextView) findViewById( R.id.outputKilometer );
        outputKilometer.setText( outputKilometer + "" );
    }

    private class TextChangeHandler implements TextWatcher
    {
        public void afterTextChanged(Editable e)
        {
            try {

                EditText et_mile = (EditText) findViewById(R.id.inputMile);
                String mileString = et_mile.getText().toString();
                float mile = Float.parseFloat(mileString);

                double answerKilometer = mile * 1.609344;

                TextView et_mileOutput =  findViewById(R.id.outputMile);
                et_mileOutput.setText(answerKilometer + "");
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

                EditText et_kiloMeter = (EditText) findViewById(R.id.inputKilometer);
                String kiloMeterString = et_kiloMeter.getText().toString();
                float kiloMeter = Float.parseFloat(kiloMeterString);

                double answerMile = kiloMeter * 0.621371;

                TextView et_kiloMeterOutput = findViewById(R.id.outputKilometer);
                et_kiloMeterOutput.setText(answerMile + "");
            }

            catch (Exception a)
            { }
        }
        public void beforeTextChanged(CharSequence s, int start, int count, int after)
        { }
        public void onTextChanged(CharSequence s, int start, int before, int after)
        { }}
    public void back(View view) {
        Intent mainActivity= new Intent( this,MainActivity.class );
        startActivity( mainActivity );
    }
}
