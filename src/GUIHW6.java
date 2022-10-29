import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIHW6 {
    JPanel panelA = new JPanel(); //variables part
    JPanel panelB = new JPanel();
    JPanel panelC = new JPanel();
    JPanel panelD = new JPanel();
    JPanel panelE = new JPanel();
    public JFrame frame;
    public void initiateWindow() { //create a main frame of HW6
        frame = new JFrame("GUI_HW6");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);


        JLabel title = new JLabel("Total Points:");//total point's panel
        JTextField field = new JTextField(10);
        panelA.add(title);
        panelA.add(field);
        panelA.setLayout(new FlowLayout(FlowLayout.RIGHT, 70,40));


        JLabel title2 = new JLabel("Earned Points:"); //earn point's panel
        JTextField field2 = new JTextField(10);
        panelB.add(title2);
        panelB.add(field2);
        panelB.setLayout(new FlowLayout(FlowLayout.RIGHT, 70, 40));


        JLabel title3 = new JLabel("Percentage:"); //percentages' panel
        JTextField field3 = new JTextField(10);
        panelC.add(title3);
        panelC.add(field3);
        panelC.setLayout(new FlowLayout(FlowLayout.RIGHT, 70, 40));


        JButton button = new JButton("Click and output the score"); //create the button
        panelD.add(button);
        panelD.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 40));

        button.addActionListener(new ActionListener() //button function
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println(field.getText()); //calculate the score output
                try {
                    double Totalpoint = Double.parseDouble(field.getText());
                    double Earnedpoints = Double.parseDouble(field2.getText());
                    double Percentage = Double.parseDouble(field3.getText());
                    if (Totalpoint <= 0 || Earnedpoints <= 0 || Earnedpoints > Totalpoint || Percentage <= 0 || Percentage >100) {
                        showResult("Wrong input!");
                    } else {
                        Grades grade = new Grades(Totalpoint, Earnedpoints, Percentage);
                        showResult("Weighted Score:" + grade.getWeightedGrade());
                    }
                } catch(Exception exception) {
                    showResult("Wrong input!");
                }
            }
        });

        frame.add(panelA);
        frame.add(panelB);
        frame.add(panelC);
        frame.add(panelD);
        frame.setVisible(true);
        frame.setBounds(500,200,500,500);
        frame.setLayout(new GridLayout(5,1));
    }
    public void showResult(String content){ //the part of showing output
        panelE.removeAll();
        panelE.setVisible(true);
        panelE.setVisible(false);
        JLabel label5 = new JLabel(content);
        panelE.add(label5);
        panelE.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 40));
        frame.add(panelE);
        frame.setVisible(true);
    }


}