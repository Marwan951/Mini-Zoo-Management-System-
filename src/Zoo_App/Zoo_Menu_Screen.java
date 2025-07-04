package Zoo_App;

import Animals.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zoo_Menu_Screen {

    private JFrame frame;
    private JTextArea outputArea;

    public Zoo_Menu_Screen() {
        // Setup the frame
        frame = new JFrame("Mini Zoo 🦁");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        ImageIcon bgIcon = new ImageIcon(getClass().getResource("/resources/zoo.png"));
        JLabel background = new JLabel(bgIcon);
        background.setLayout(new BorderLayout());
        frame.setContentPane(background);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false); // make panel transparent

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        buttonPanel.setOpaque(false); // transparent

        JButton tigerBtn = new JButton("Tiger");
        JButton dolphinBtn = new JButton("Dolphin");
        JButton penguinBtn = new JButton("Penguin");

        buttonPanel.add(tigerBtn);
        buttonPanel.add(dolphinBtn);
        buttonPanel.add(penguinBtn);

        // ✅ Output area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setOpaque(false); // transparent text area
        outputArea.setForeground(Color.black); // text color for visibility
        outputArea.setMargin(new Insets(10, 10, 10, 10));
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);

        panel.add(buttonPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        background.add(panel);

        frame.setVisible(true);

        // Button actions
        tigerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Tiger tiger = new Tiger("Tego",3,70);
                showAnimalActions(tiger, "Tiger");
            }
        });

        dolphinBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dolphin dolphin = new Dolphin("Dolphy", 1,40);
                showAnimalActions(dolphin, "Dolphin");
            }
        });

        penguinBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Penguin penguin = new Penguin("Pengo",2,90);
                showAnimalActions(penguin, "Penguin");
            }
        });
    }

    private void showAnimalActions(Animal animal, String type) {
        StringBuilder output = new StringBuilder();
        output.append("Name: " + animal.getName() + ", Age: " + animal.getAge() + " years ,Weight: " + animal.getWeight() + " pounds \n");
        if (animal instanceof Tiger tiger ) {
            output.append(tiger.walk()).append("\n");
        } else if (animal instanceof Dolphin dolphin) {
            output.append(dolphin.swim()).append("\n");
        } else if ( animal instanceof Penguin penguin) {
            output.append(penguin.walk()).append("\n");
            output.append(penguin.swim()).append("\n");
        }
        output.append(animal.eat()).append("\n");
        output.append(animal.drink()).append("\n");
        outputArea.setText(String.valueOf(output));
    }

}
