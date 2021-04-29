package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

import static java.lang.System.exit;

public class MainActivity extends AppCompatActivity {

    int ISP(char X)
    {
        if(X == '+' || X == '-')
            return 2;
        else if(X == '*' || X == '/')
            return 4;
        else if(X == '^')
            return 5;
        else if(X >= '0' && X <= '9' || X == '.')
            return 8;
        else if(X == '(')
            return 0;
        else if(X == '!')
            return 11;
        return 11;
    }

    int ICP(char X)
    {
        if(X == '+' || X == '-')
            return 1;
        else if(X == '*' || X == '/')
            return 3;
        else if(X == '^')
            return 6;
        else if(X >= '0' && X <= '9' || X == '.')
            return 7;
        else if(X == '(')
            return 9;
        else if(X == ')')
            return 0;
        return 10;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result = (TextView) findViewById(R.id.result);

        Button one = (Button) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+"1");
            }
        });
        Button two = (Button) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+"2");
            }
        });
        Button three = (Button) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+"3");
            }
        });
        Button four = (Button) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+"4");
            }
        });
        Button five = (Button) findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+"5");
            }
        });
        Button six = (Button) findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+"6");
            }
        });
        Button seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+"7");
            }
        });
        Button eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+"8");
            }
        });
        Button nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+"9");
            }
        });
        Button zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+"0");
            }
        });
        Button AC = (Button) findViewById(R.id.AC);
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(" ");
            }
        });
        Button C = (Button) findViewById(R.id.C);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                else if(result.getText().length() == 1)
                    result.setText(" ");
                else
                    result.setText(result.getText().subSequence(0,result.getText().length()-1));
            }
        });
        Button plusButton = (Button) findViewById(R.id.plusButton);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (result.getText() == " " || result.getText().toString().isEmpty()) {
                        result.setText("0+");
                    } else if (result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN") {
                        result.setText("0+");
                    } else if (result.getText().charAt(result.length() - 1) == '+') {
                        //do nothing
                    } else if (result.getText().charAt(result.length() - 1) == '-' || result.getText().charAt(result.length() - 1) == '*' || result.getText().charAt(result.length() - 1) == '/' || result.getText().charAt(result.length() - 1) == '^') {
                        //do nothing
                    } else {
                        result.setText(result.getText() + "+");
                    }
                } catch(Exception e){result.setText("+");}
            }
        });
        Button minusButton = (Button) findViewById(R.id.minusButton);
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                        result.setText(" ");
                    else if (result.getText().charAt(result.length() - 1) == '+' || result.getText().charAt(result.length() - 1) == '-') {
                        result.setText(result.getText().subSequence(0, result.getText().length() - 1));
                    }
                    result.setText(result.getText() + "-");
                }catch (Exception e){result.setText("-");}
            }
        });
        Button intoButton = (Button) findViewById(R.id.intoButton);
        intoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                        result.setText(" ");
                    else if (result.getText().charAt(result.length() - 1) == '*') {
                        result.setText(result.getText().subSequence(0, result.getText().length() - 1));
                    }
                    result.setText(result.getText() + "*");
                }catch(Exception e){result.setText("*");}
            }
        });
        Button byButton = (Button) findViewById(R.id.byButton);
        byButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                        result.setText(" ");
                    else if (result.getText().charAt(result.length() - 1) == '/') {
                        result.setText(result.getText().subSequence(0, result.getText().length() - 1));
                    }
                    result.setText(result.getText() + "/");
                }catch(Exception e){result.setText("/");}
            }
        });
        Button powerButton = (Button) findViewById(R.id.powerButton);
        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                        result.setText(" ");
                    else if (result.getText().charAt(result.length() - 1) == '^') {
                        result.setText(result.getText().subSequence(0, result.getText().length() - 1));
                    }
                    result.setText(result.getText() + "^");
                }catch(Exception e){result.setText("^");}
            }
        });
        Button right = (Button) findViewById(R.id.right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+")");
            }
        });
        Button left = (Button) findViewById(R.id.left);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+"(");
            }
        });
        Button dot = (Button) findViewById(R.id.dot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");
                result.setText(result.getText()+".");
            }
        });
        Button equalButton = (Button) findViewById(R.id.equalButton);
        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText() == "Error " || result.getText() == "Infinity " || result.getText() == "-Infinity " || result.getText() == "NaN")
                    result.setText(" ");

                StringBuilder postfix = new StringBuilder();
                Stack<Character> stack = new Stack<>();
                CharSequence exp = result.getText() + ")";
                int i = 0;

                stack.push('(');

                while (i < exp.length()) {
                    if (stack.isEmpty()) {
                        break;
                    }
                    else {
                        char X = stack.pop();

                        if (exp.charAt(i) == ' ') {
                            stack.push(X);
                        } else if (exp.charAt(i) >= '0' && exp.charAt(i) <= '9' || exp.charAt(i) == '.') {
                            stack.push(X);
                            postfix.append(exp.charAt(i));
                        } else if (exp.charAt(i) == '(') {
                            stack.push(X);
                            stack.push(exp.charAt(i));
                        } else if (exp.charAt(i) == ')') {
                            while (X != '(') {
                                postfix.append(' ');
                                postfix.append(X);
                                X = stack.pop();
                            }
                        } else if (exp.charAt(i) == '-' && i == 0 && exp.charAt(1) >= '0' && exp.charAt(1) <= '9') {
                            stack.push(X);
                            stack.push('!');
                        } else if(exp.charAt(i) == '-' && (exp.charAt(i-1) == '*' || exp.charAt(i-1) == '/' || exp.charAt(i-1) == '^' || exp.charAt(i-1) == ' ' || exp.charAt(i-1) == '(') && exp.charAt(i+1) >= '0' && exp.charAt(i) <= '9') {
                            stack.push(X);
                            stack.push('!');
                        } else if (ICP(exp.charAt(i)) == 10) {
                            stack.push(X);
                        } else if (ICP(exp.charAt(i)) <= ISP(X)) {
                            while (ICP(exp.charAt(i)) <= ISP(X)) {
                                postfix.append(' ');
                                postfix.append(X);
                                X = stack.pop();
                            }
                            postfix.append(' ');
                            stack.push(X);
                            stack.push(exp.charAt(i));
                        } else if (ICP(exp.charAt(i)) > ISP(X)) {
                            postfix.append(' ');
                            stack.push(X);
                            stack.push(exp.charAt(i));
                        }
                        i++;
                    }
                }
                postfix.append('#');
                Stack<Double> stack1 = new Stack<Double>();
                i = 0;
                double X;
                double Y;
                double num;
                String flag = new String();
                try {
                    while (i < postfix.length()) {
                        if (postfix.charAt(i) >= '0' && postfix.charAt(i) <= '9' || postfix.charAt(i) == '.') {
                            num = Double.parseDouble(postfix.substring(i, postfix.indexOf(" ", i)));
                            stack1.push(num);
                            i = postfix.indexOf(" ", i) + 1;
                        }
                        else {
                            switch(postfix.charAt(i)){
                                case '+' :
                                     Y = stack1.pop();
                                     X = stack1.pop();
                                     stack1.push(X+Y);
                                     break;
                                case '-' :
                                    Y = stack1.pop();
                                    X = stack1.pop();
                                    stack1.push(X-Y);
                                    break;
                                case '*' :
                                    Y = stack1.pop();
                                    X = stack1.pop();
                                    stack1.push(X*Y);
                                    break;
                                case '/' :
                                    Y = stack1.pop();
                                    X = stack1.pop();
                                    stack1.push(X/Y);
                                    break;
                                case '^' :
                                    Y = stack1.pop();
                                    X = stack1.pop();
                                    stack1.push(Math.pow(X,Y));
                                    break;
                                case '!' :
                                    Y = stack1.pop();
                                    stack1.push(-Y);
                                    break;
                                case '#':
                                    X = stack1.pop();
                                    int Z = (int) X;
                                    Double x = new Double(X);
                                    if(X == Z)
                                        result.setText(Z+"");
                                    else if (X == Double.POSITIVE_INFINITY) {
                                        result.setText("Infinity ");
                                    } else if (X == Double.NEGATIVE_INFINITY) {
                                        result.setText("-Infinity ");
                                    } else if (x.isNaN()) {
                                        result.setText("NaN");
                                    } else
                                        result.setText(X+"");
                                    break;
                            }
                            i++;
                        }
                    }
                }catch (Exception e){result.setText("Error ");}
            }
        });
    }
}