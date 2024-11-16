package ConcertTicketBookingSystem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTicketScreen {
    private JFrame frame;
    private int selectedTickets = 0;
    private JLabel bookingDetailsLabel;

    public void display() {
        frame = new JFrame("Select Tickets - Concert Ticket Booking");
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel selectTicketsLabel = new JLabel("Select Number of Tickets", JLabel.CENTER);
        selectTicketsLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        selectTicketsLabel.setBounds(300, 50, 400, 40);
        frame.add(selectTicketsLabel);

        JLabel numberLabel = new JLabel("Number of Tickets:");
        numberLabel.setBounds(300, 200, 200, 30);
        frame.add(numberLabel);

        JButton minusButton = new JButton("-");
        minusButton.setBounds(450, 200, 50, 30);
        frame.add(minusButton);

        JLabel ticketCountLabel = new JLabel("0", JLabel.CENTER);
        ticketCountLabel.setBounds(510, 200, 50, 30);
        frame.add(ticketCountLabel);

        JButton plusButton = new JButton("+");
        plusButton.setBounds(570, 200, 50, 30);
        frame.add(plusButton);

        bookingDetailsLabel = new JLabel("<html>Zone: General Admission<br>Status: Available<br>Price: 0 THB</html>");
        bookingDetailsLabel.setBounds(300, 300, 400, 100);
        frame.add(bookingDetailsLabel);

        JButton confirmButton = new JButton("Confirm Tickets");
        confirmButton.setBounds(400, 450, 200, 50);
        frame.add(confirmButton);

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedTickets > 0) {
                    selectedTickets--;
                    ticketCountLabel.setText(String.valueOf(selectedTickets));
                    updateBookingDetails();
                }
            }
        });

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedTickets++;
                ticketCountLabel.setText(String.valueOf(selectedTickets));
                updateBookingDetails();
            }
        });

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedTickets > 0) {
                    frame.dispose();
                    new PaymentScreen(selectedTickets).display();
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select at least one ticket.");
                }
            }
        });

        frame.setVisible(true);
    }

    private void updateBookingDetails() {
        int totalPrice = selectedTickets * 500;
        bookingDetailsLabel.setText("<html>Zone: General Admission<br>Status: Available<br>Price: " + totalPrice + " THB</html>");
    }
}
