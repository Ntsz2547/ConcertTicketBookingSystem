package ConcertTicketBookingSystem;

import javax.swing.*;

public class OrderSummaryScreen {
    private JFrame frame;
    private int selectedTickets;

    public OrderSummaryScreen(int selectedTickets) {
        this.selectedTickets = selectedTickets;
    }

    public void display() {
        frame = new JFrame("Order Summary - Concert Ticket Booking");
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel summaryLabel = new JLabel("Order Summary", JLabel.CENTER);
        summaryLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        summaryLabel.setBounds(300, 50, 400, 40);
        frame.add(summaryLabel);

        JLabel orderDetails = new JLabel("<html>Concert: Rock Festival<br>Tickets: " + selectedTickets + "<br>Total Price: " + (selectedTickets * 500) + " THB<br>Payment: Completed</html>");
        orderDetails.setBounds(300, 150, 400, 200);
        frame.add(orderDetails);

        frame.setVisible(true);
    }
}
