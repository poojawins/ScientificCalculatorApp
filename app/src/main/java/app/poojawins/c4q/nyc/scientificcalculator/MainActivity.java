package app.poojawins.c4q.nyc.scientificcalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    TextView displayText;

    Button acButton;
    Button backspaceButton;
    Button percentButton;
    Button negativeButton;
    Button decimalButton;
    Button equalButton;

    Button plusButton;
    Button subtractButton;
    Button multiplyButton;
    Button divideButton;

    Button number9Button;
    Button number8Button;
    Button number7Button;
    Button number6Button;
    Button number5Button;
    Button number4Button;
    Button number3Button;
    Button number2Button;
    Button number1Button;
    Button number0Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText = (TextView) findViewById(R.id.displayText);

        acButton = (Button) findViewById(R.id.acButton);
        backspaceButton = (Button) findViewById(R.id.backspaceButton);
        percentButton = (Button) findViewById(R.id.percentButton);
        negativeButton = (Button) findViewById(R.id.negativeButton);
        decimalButton = (Button) findViewById(R.id.decimalButton);
        equalButton = (Button) findViewById(R.id.equalButton);

        plusButton = (Button) findViewById(R.id.plusButton);
        subtractButton = (Button) findViewById(R.id.subtractButton);
        multiplyButton = (Button) findViewById(R.id.multiplyButton);
        divideButton = (Button) findViewById(R.id.divideButton);

        number9Button = (Button) findViewById(R.id.number9Button);
        number8Button = (Button) findViewById(R.id.number8Button);
        number7Button = (Button) findViewById(R.id.number7Button);
        number6Button = (Button) findViewById(R.id.number6Button);
        number5Button = (Button) findViewById(R.id.number5Button);
        number4Button = (Button) findViewById(R.id.number4Button);
        number3Button = (Button) findViewById(R.id.number3Button);
        number2Button = (Button) findViewById(R.id.number2Button);
        number1Button = (Button) findViewById(R.id.number1Button);
        number0Button = (Button) findViewById(R.id.number0Button);

        ArrayList<Button> buttons = new ArrayList<>();

        buttons.add(acButton);
        buttons.add(backspaceButton);
        buttons.add(percentButton);
        buttons.add(negativeButton);
        buttons.add(decimalButton);
        buttons.add(equalButton);

        buttons.add(plusButton);
        buttons.add(subtractButton);
        buttons.add(multiplyButton);
        buttons.add(divideButton);

        buttons.add(number9Button);
        buttons.add(number8Button);
        buttons.add(number7Button);
        buttons.add(number6Button);
        buttons.add(number5Button);
        buttons.add(number4Button);
        buttons.add(number3Button);
        buttons.add(number2Button);
        buttons.add(number1Button);
        buttons.add(number0Button);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
