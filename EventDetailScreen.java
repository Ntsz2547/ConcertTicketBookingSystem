package ConcertTicketBookingSystem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDetailScreen {
    private JFrame frame;

    public void display() {
        frame = new JFrame("Event Details - Concert Ticket Booking");
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel eventTitleLabel = new JLabel("Event Details", JLabel.CENTER);
        eventTitleLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        eventTitleLabel.setBounds(300, 50, 400, 40);
        frame.add(eventTitleLabel);

        JLabel eventInfoLabel = new JLabel("<html>Show Date: XXXX<br>Venue: XXXX<br>Price per Ticket: 500 THB</html>");
        eventInfoLabel.setBounds(100, 150, 300, 200);
        frame.add(eventInfoLabel);

        JButton proceedButton = new JButton("Select Tickets");
        proceedButton.setBounds(400, 400, 150, 50);
        frame.add(proceedButton);

        proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new SelectTicketScreen().display();
            }
        });

        frame.setVisible(true);
    }
}
