package cosc592.unitconversions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_fourth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fourth );

        EditText et_inch = (EditText) findViewById(R.id.inputInch);
        TextChangeHandler temp = new TextChangeHandler();
        et_inch.addTextChangedListener(temp);

        EditText et_centimeter = (EditText) findViewById(R.id.inputCentimeter);
        TextChangeHandler2 temp1 = new TextChangeHandler2();
        et_centimeter.addTextChangedListener(temp1);

    }
    private class TextChangeHandler implements TextWatcher
    {
        public void afterTextChanged(Editable e)
        {
            try {

                EditText et_inch = (EditText) findViewById(R.id.inputInch);
                String inchString = et_inch.getText().toString();
                float inch = Float.parseFloat(inchString);

                double answerInch = inch * 2.54;

                TextView et_inchOutput =  findViewById(R.id.outputInch);
                et_inchOutput.setText(answerInch + "");
            }

            catch (Exception a)
            { } }
        public void beforeTextChanged(CharSequence s, int start, int count, int after)
        { }
        public void onTextChanged(CharSequence s, int start, int before, int after)
        { }}

    private class TextChangeHandler2 implements TextWatcher
    {
        public void afterTextChanged(Editable e)
        {
            try {

                EditText et_centimeter = (EditText) findViewById(R.id.inputCentimeter);
                String centimeterString = et_centimeter.getText().toString();
                float centimeter = Float.parseFloat(centimeterString);

                double answerCentimeter = centimeter * 0.393701;

                TextView et_centmeterOutput = findViewById(R.id.outputCentimeter);
                et_centmeterOutput.setText(answerCentimeter + "");
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

        EditText inputInch=(EditText)findViewById( R.id.inputInch );
        String inputInchString = inputInch.getText().toString();

        double feetInput;
        try {
            feetInput = Float.parseFloat( inputInchString );
        } catch (NumberFormatException e) {
            feetInput = 0;
        }
        double id, inch, cenimeter ;
        id = 0;
        inch  = 0;
        cenimeter = 0;
        if (id == R.id.inputFeet) {
            inch = inch * 2.54;

            TextView outputFeet = (TextView) findViewById( R.id.outputFeet );
            outputFeet.setText( outputFeet + "" );


        } else

            cenimeter = cenimeter *  0.393701;

        TextView outputMeter = (TextView) findViewById( R.id.outputMeter );
        outputMeter.setText( outputMeter + "" );

    }

    public void back(View view) {
        Intent mainActivity= new Intent( this,MainActivity.class );
        startActivity( mainActivity );
    }
}