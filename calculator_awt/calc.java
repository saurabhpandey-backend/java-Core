package calculator_awt;
import java.awt.*;

public class calc {
    void clc(){
        Frame frame = new Frame("Calculator");

        TextField  text = new TextField();
        text.setBounds(20,30,260,45);
        text.setBackground(Color.BLUE);
        frame.add(text);

        Button b1 = new Button("1");
        b1.setBounds(20,96,60,35);
        frame.add(b1);

        Button b2 = new Button("2");
        b2.setBounds(85,96,60,35);
        frame.add(b2);

        Button b3 = new Button("3");
        b3.setBounds(150,96,60,35);
        frame.add(b3);

        Button pl = new Button("+");
        pl.setBounds(240,96,40,35);
        frame.add(pl);



        Button b4 = new Button("4");
        b4.setBounds(20,141,60,35);
        frame.add(b4);

        Button b5 = new Button("5");
        b5.setBounds(85,141,60,35);
        frame.add(b5);

        Button b6 = new Button("6");
        b6.setBounds(150,141,60,35);
        frame.add(b6);

        Button pl2 = new Button("-");
        pl2.setBounds(240,141,40,35);
        frame.add(pl2);



        Button b7 = new Button("7");
        b7.setBounds(20,186,60,35);
        frame.add(b7);

        Button b8 = new Button("8");
        b8.setBounds(85,186,60,35);
        frame.add(b8);

        Button b9 = new Button("9");
        b9.setBounds(150,186,60,35);
        frame.add(b9);

        Button pl3 = new Button("*");
        pl3.setBounds(240,186,40,35);
        frame.add(pl3);



        Button clear = new Button("Clear");
        clear.setBounds(20,231,60,35);
        frame.add(clear);

        Button zero = new Button("0");
        zero.setBounds(85,231,60,35);
        frame.add(zero);

        Button eq = new Button("=");
        eq.setBounds(150,231,60,35);
        frame.add(eq);

        Button pl4 = new Button("/");
        pl4.setBounds(240,231,40,35);
        frame.add(pl4);



        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
