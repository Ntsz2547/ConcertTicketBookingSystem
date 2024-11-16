package ConcertTicketBookingSystem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UploadSlipScreen {
    private JFrame frame;
    private int selectedTickets;

    public UploadSlipScreen(int selectedTickets) {
        this.selectedTickets = selectedTickets;
    }

    public void display() {
        frame = new JFrame("Upload Payment Slip - Concert Ticket Booking");
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel uploadLabel = new JLabel("Upload Payment Slip", JLabel.CENTER);
        uploadLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        uploadLabel.setBounds(300, 50, 400, 40);
        frame.add(uploadLabel);

        JLabel instructionLabel = new JLabel("Please upload your payment slip below:");
        instructionLabel.setBounds(300, 150, 400, 30);
        frame.add(instructionLabel);

        JButton uploadButton = new JButton("Upload Slip");
        uploadButton.setBounds(400, 250, 200, 50);
        frame.add(uploadButton);

        JButton confirmButton = new JButton("Confirm");
        confirmButton.setBounds(400, 350, 200, 50);
        frame.add(confirmButton);

        // Upload Button Action
        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Slip uploaded successfully.");
            }
        });

        // Confirm Button Action: Redirect to Order Summary
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new OrderSummaryScreen(selectedTickets).display();
            }
        });

        frame.setVisible(true);
    }
}
