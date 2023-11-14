import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class Main extends Frame {
    TextField fname;
    TextField lname;
    TextField regno;
    Image icon

    Main() {
       icon = Toolkit.getDefaultToolkit().getImage("icon.ico");
        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        setIconImage(icon);
        setLocationRelativeTo(null);

        Button sub = new Button("Submit");
        Label lab1 = new Label("first name");
        Label lab2 = new Label("second name");
        Label lab3 = new Label("RegNo");

        fname = new TextField();
        lname = new TextField();
        regno = new TextField();

        fname.setBounds(130, 50, 150, 30);
        lname.setBounds(130, 100, 150, 30);
        regno.setBounds(130, 150, 150, 30);
        sub.setBounds(100, 200, 70, 30);

        add(fname);
        add(lname);
        add(regno);
        add(sub);

        sub.setBackground(Color.ORANGE);

        lab1.setBounds(10, 50, 100, 30);
        lab1.setBackground(Color.BLUE);
        lab1.setForeground(Color.WHITE);
        add(lab1);

        lab2.setBounds(10, 100, 100, 30);
        lab2.setBackground(Color.BLUE);
        lab2.setForeground(Color.WHITE);
        add(lab2);

        lab3.setBounds(10, 150, 100, 30);
        lab3.setBackground(Color.BLUE);
        lab3.setForeground(Color.WHITE);
        add(lab3);

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the button click
                String name1 = fname.getText();
                String name2 = lname.getText();
                String reg1 = regno.getText();
                try {
                    int reg = Integer.parseInt(reg1);
                    sender.connect(name1, name2, reg);
                    System.out.println("Data submitted successfully!");
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid RegNo format. Please enter a valid integer.");
                }
            }
        });

        // Adding a WindowListener to handle closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }


    public static void main(String[] args) {
        new Main();
    }
}
