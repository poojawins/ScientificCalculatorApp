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

//    scientific calculator specific buttons
//    Button radButton;
//    Button squareRootButton;
//    Button xyButton; // (x^y)
//    Button expButton;
//    Button lnButton;
//    Button eButton;
//    Button logButton;
//    Button xButton; // (factorial)
//    Button inverseButton;
//    Button piButton;
//    Button sineButton;
//    Button cosineButton;
//    Button tangentButton;
//    Button openParenthesisButton;
//    Button closeParenthesisButton;
//    Button answerButton;

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

//        scientific calculator specific buttons
//        radButton = (Button) findViewById(R.id.radButton);
//        squareRootButton = (Button) findViewById(R.id.squareRootButton);
//        xyButton = (Button) findViewById(R.id.xyButton); // (x^y)
//        expButton = (Button) findViewById(R.id.expButton);
//        lnButton = (Button) findViewById(R.id.lnButton);
//        eButton = (Button) findViewById(R.id.eButton);
//        logButton = (Button) findViewById(R.id.logButton);
//        xButton = (Button) findViewById(R.id.xButton); // (factorial)
//        inverseButton = (Button) findViewById(R.id.inverseButton);
//        piButton = (Button) findViewById(R.id.piButton);
//        sineButton = (Button) findViewById(R.id.sineButton);
//        cosineButton = (Button) findViewById(R.id.cosineButton);
//        tangentButton = (Button) findViewById(R.id.tangentButton);
//        openParenthesisButton = (Button) findViewById(R.id.openParenthesisButton);
//        closeParenthesisButton = (Button) findViewById(R.id.closeParenthesisButton);
//        answerButton = (Button) findViewByID(R.id.answerButton);

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

//        scientific calculator specific buttons
//        buttons.add(radButton);
//        buttons.add(squareRootButton);
//        buttons.add(xyButton); // (x^y)
//        buttons.add(expButton);
//        buttons.add(lnButton);
//        buttons.add(eButton);
//        buttons.add(logButton);
//        buttons.add(xButton); // (factorial)
//        buttons.add(inverseButton);
//        buttons.add(piButton);
//        buttons.add(sineButton);
//        buttons.add(cosineButton);
//        buttons.add(tangentButton);
//        buttons.add(openParenthesisButton);
//        buttons.add(closeParenthesisButton);
//        buttons.add(answerButton);

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
                        // scientific calculator specific buttons
//                        case R.id.radButton:
//                            displayText.append(radButton.getText());
//                            break;
//                        case R.id.squareRootButton:
//                            displayText.append(squareRootButton.getText());
//                            break;
//                        case R.id.xyButton: // (x^y)
//                            displayText.append(xyButton.getText());
//                            break;
//                        case R.id.expButton:
//                            displayText.append(expButton.getText());
//                            break;
//                        case R.id.lnButton:
//                            displayText.append(lnButton.getText());
//                            break;
//                        case R.id.eButton:
//                            displayText.append(eButton.getText());
//                            break;
//                        case R.id.logButton:
//                            displayText.append(logButton.getText());
//                            break;
//                        case R.id.xButton: // (factorial)
//                            displayText.append(lnButton.getText());
//                            break;
//                        case R.id.inverseButton:
//                            displayText.append(inverseButton.getText());
//                            break;
//                        case R.id.piButton:
//                            displayText.append(piButton.getText());
//                            break;
//                        case R.id.sineButton:
//                            displayText.append(sineButton.getText());
//                            break;
//                        case R.id.cosineButton:
//                            displayText.append(cosineButton.getText());
//                            break;
//                        case R.id.tangentButton:
//                            displayText.append(tangentButton.getText());
//                            break;
//                        case R.id.openParenthesisButton:
//                            displayText.append(openParenthesisButton.getText());
//                            break;
//                        case R.id.closeParenthesisButton:
//                            displayText.append(closeParenthesisButton.getText());
//                            break;
//                      case R.id.answerButton:
//                          displayText.append(answerButton.getText());
//                          break;
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

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String expression = displayText.getText().toString();
                String result = Parser.parse(expression);
                displayText.setText(result);
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
