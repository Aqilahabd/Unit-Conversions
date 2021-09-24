package cosc592.unitconversions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        updateView();
    }
    private void updateView() {
        TextView labelMessage = (TextView) findViewById( R.id.labelMessage );
        labelMessage.setText( "App performs Unit Conversions" + "\n\n\n" + "Mill/Kilometer" + "\n"
                + " Feet/Meter" +"\n" + "Inch/Centimeter"+"\n\n\n\n" + "Choose from menue above");
    }

        public  boolean onCreateOptionsMenu(Menu menu)
    {
            getMenuInflater().inflate( R.menu.menu_main,menu );
        return super.onCreateOptionsMenu( menu );
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.milekilometer) {
            Intent activitySecond = new Intent( this, activity_second.class );
            startActivity( activitySecond );

        } else if (id == R.id.feetmeter) {
            Intent activityThired = new Intent( this, activity_third.class );
            startActivity( activityThired );

        } else if (id == R.id.inchcentimeter) {
            Intent activityFourth = new Intent( this, activity_fourth.class );
            startActivity( activityFourth );


        }
        return true;
    }
}
