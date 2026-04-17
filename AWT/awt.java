import java.awt.*;

public class awt {
    void test(){
        Frame frame = new Frame("First frame");

        Label la = new Label("enter your name1");
        la.setBackground(Color.darkGray);
        la.setForeground(Color.magenta);
        la.setBounds(10, 50, 98, 10);
        frame.add(la);

        TextArea text1 = new TextArea();
        text1.setBounds(15,50,100,10);
        text1.setBackground(Color.BLUE);
        frame.add(text1);

        Label la2 = new Label("enter your name2");
        la2.setBackground(Color.darkGray);
        la2.setForeground(Color.magenta);
        la2.setBounds(120, 120, 50, 50);
        frame.add(la2);
        TextArea text2 = new TextArea();
        text2.setBounds(150,50,100,10);
        text2.setBackground(Color.BLUE);
        frame.add(text2);

        frame.setSize(270,170);
        frame.setVisible(true);
        
    }
}
