package ConcertTicketBookingSystem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentScreen {
    private JFrame frame;
    private int selectedTickets;

    public PaymentScreen(int selectedTickets) {
        this.selectedTickets = selectedTickets;
    }

    public void display() {
        frame = new JFrame("Payment - Concert Ticket Booking");
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel paymentLabel = new JLabel("Choose Payment Method", JLabel.CENTER);
        paymentLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        paymentLabel.setBounds(300, 50, 400, 40);
        frame.add(paymentLabel);

        JButton bankTransferButton = new JButton("Bank Transfer");
        bankTransferButton.setBounds(200, 200, 200, 100);
        frame.add(bankTransferButton);

        JButton walletButton = new JButton("E-Wallet");
        walletButton.setBounds(600, 200, 200, 100);
        frame.add(walletButton);

        // Redirect to Upload Slip Screen for both payment methods
        bankTransferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new UploadSlipScreen(selectedTickets).display();
            }
        });

        walletButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new UploadSlipScreen(selectedTickets).display();
            }
        });

        frame.setVisible(true);
    }
}
