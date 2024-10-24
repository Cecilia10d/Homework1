import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Homework1 extends JFrame {

    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private DrawingPanel drawingPanel;
    private ButtonGroup group;

    public  Homework1() {
        setTitle("RadioButtonDemo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(5, 1));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);

        drawingPanel = new DrawingPanel();

        add(radioPanel, BorderLayout.WEST);
        add(drawingPanel, BorderLayout.CENTER);

        birdButton.addActionListener(new RadioButtonListener());
        catButton.addActionListener(new RadioButtonListener());
        dogButton.addActionListener(new RadioButtonListener());
        rabbitButton.addActionListener(new RadioButtonListener());
        pigButton.addActionListener(new RadioButtonListener());
    }

    private class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
        }
    }

    private class RadioButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            if (e.getSource() == birdButton) {
                message = "You selected Bird";
            } else if (e.getSource() == catButton) {
                message = "You selected Cat";
            } else if (e.getSource() == dogButton) {
                message = "You selected Dog";
            } else if (e.getSource() == rabbitButton) {
                message = "You selected Rabbit";
            } else if (e.getSource() == pigButton) {
                message = "You selected Pig";
            }
            JOptionPane.showMessageDialog(null, message);
        }
    }

    public static void main(String[] args) {
        Homework1 frame = new  Homework1();
        frame.setVisible(true);
    }
}
