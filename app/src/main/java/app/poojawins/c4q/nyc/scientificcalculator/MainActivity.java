package app.poojawins.c4q.nyc.scientificcalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import java.util.ArrayList;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    TextView displayText;

    Button acButton;
    Button backspaceButton;
    Button equalButton;

    Button percentButton;
    Button negativeButton;
    Button decimalButton;

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
        equalButton = (Button) findViewById(R.id.equalButton);

        percentButton = (Button) findViewById(R.id.percentButton);
        negativeButton = (Button) findViewById(R.id.negativeButton);
        decimalButton = (Button) findViewById(R.id.decimalButton);

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

        buttons.add(percentButton);
        buttons.add(negativeButton);
        buttons.add(decimalButton);

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

        for (Button button : buttons) {
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    switch (view.getId()) {
                        case R.id.percentButton:
                            displayText.append(percentButton.getText());
                            break;
                        case R.id.negativeButton:
                            displayText.append(negativeButton.getText());
                            break;
                        case R.id.decimalButton:
                            displayText.append(decimalButton.getText());
                            break;
                        case R.id.plusButton:
                            displayText.append(plusButton.getText());
                            break;
                        case R.id.subtractButton:
                            displayText.append(subtractButton.getText());
                            break;
                        case R.id.multiplyButton:
                            displayText.append(multiplyButton.getText());
                            break;
                        case R.id.divideButton:
                            displayText.append(divideButton.getText());
                            break;
                        case R.id.number9Button:
                            displayText.append(number9Button.getText());
                            break;
                        case R.id.number8Button:
                            displayText.append(number8Button.getText());
                            break;
                        case R.id.number7Button:
                            displayText.append(number7Button.getText());
                            break;
                        case R.id.number6Button:
                            displayText.append(number6Button.getText());
                            break;
                        case R.id.number5Button:
                            displayText.append(number5Button.getText());
                            break;
                        case R.id.number4Button:
                            displayText.append(number4Button.getText());
                            break;
                        case R.id.number3Button:
                            displayText.append(number3Button.getText());
                            break;
                        case R.id.number2Button:
                            displayText.append(number2Button.getText());
                            break;
                        case R.id.number1Button:
                            displayText.append(number1Button.getText());
                            break;
                        case R.id.number0Button:
                            displayText.append(number0Button.getText());
                            break;
                    }
                }
            });
        }

        acButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText.setText("");
            }
        });

        backspaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText.setText(displayText.getText().toString().substring(0, displayText.length() - 1));
            }
        });

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
