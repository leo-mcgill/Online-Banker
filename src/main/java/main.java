package src.main.java;
import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args){
        // Create the frame
        JFrame frame = new JFrame("Online Bankerr");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        
        // Create a panel for the navbar
        JPanel navbar = new JPanel();
        navbar.setLayout(new FlowLayout(FlowLayout.LEFT));
        navbar.setBackground(Color.LIGHT_GRAY);

        // Add buttons to the navbar
        JButton homeButton = new JButton("Home");
        JButton aboutButton = new JButton("About");
        JButton contactButton = new JButton("Contact");
        navbar.add(homeButton);
        navbar.add(aboutButton);
        navbar.add(contactButton);

        // Create the main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Add the navbar to the top of the main panel
        mainPanel.add(navbar, BorderLayout.NORTH);

        // Add the main panel to the frame
        frame.add(mainPanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
