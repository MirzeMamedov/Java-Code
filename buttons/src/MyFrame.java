import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame implements MouseListener {

     JFrame frame;
     JPanel leftPanel;
     JLabel headerLabel;
     JButton InboxButton;
     JButton SentButton;
     JButton ArchiveButton;
     JButton TrashButton;

     MyFrame(){

         headerLabel = new JLabel("Elysian");
         headerLabel.setBounds(66,20,250,75);
         headerLabel.setFont(new Font("Comic Sans",Font.BOLD,35));
         headerLabel.setBackground(Color.BLACK);
         headerLabel.setForeground(Color.WHITE);
         headerLabel.setOpaque(true);

         InboxButton = new JButton("Inbox");
         InboxButton.setBounds(0,120,250,50);
         InboxButton.addMouseListener(this);
         InboxButton.setFocusable(false);
         InboxButton.setBackground(Color.BLACK);
         InboxButton.setForeground(Color.WHITE);
         InboxButton.setFont(new Font("Comic Sans",Font.BOLD,25));
         InboxButton.setOpaque(true);
         InboxButton.setBorderPainted(false);

         SentButton = new JButton("Sent");
         SentButton.setBounds(0,170,250,50);
         SentButton.addMouseListener(this);
         SentButton.setFocusable(false);
         SentButton.setBackground(Color.BLACK);
         SentButton.setForeground(Color.WHITE);
         SentButton.setFont(new Font("Comic Sans",Font.BOLD,25));
         SentButton.setOpaque(true);
         SentButton.setBorderPainted(false);

         ArchiveButton = new JButton("Archive");
         ArchiveButton.setBounds(0,220,250,50);
         ArchiveButton.addMouseListener(this);
         ArchiveButton.setFocusable(false);
         ArchiveButton.setBackground(Color.BLACK);
         ArchiveButton.setForeground(Color.WHITE);
         ArchiveButton.setFont(new Font("Comic Sans",Font.BOLD,25));
         ArchiveButton.setOpaque(true);
         ArchiveButton.setBorderPainted(false);

         TrashButton = new JButton("Trash");
         TrashButton.setBounds(0,270,250,50);
         TrashButton.addMouseListener(this);
         TrashButton.setFocusable(false);
         TrashButton.setBackground(Color.BLACK);
         TrashButton.setForeground(Color.WHITE);
         TrashButton.setFont(new Font("Comic Sans",Font.BOLD,25));
         TrashButton.setOpaque(true);
         TrashButton.setBorderPainted(false);

         leftPanel = new JPanel();
         leftPanel.setLayout(null);
         leftPanel.setBounds(0,0,250,640);
         leftPanel.setBackground(Color.BLACK);
         leftPanel.setOpaque(true);
         leftPanel.add(headerLabel);
         leftPanel.add(InboxButton);
         leftPanel.add(SentButton);
         leftPanel.add(ArchiveButton);
         leftPanel.add(TrashButton);

         frame = new JFrame("Buttons");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(1000,600);
         frame.setLayout(null);
         frame.getContentPane().setBackground(new Color(85,93,108));
         frame.add(leftPanel);
         frame.setVisible(true);

     }




    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {


    }

    @Override
    public void mouseReleased(MouseEvent e) {


    }

    @Override
    public void mouseEntered(MouseEvent e) {

         if(e.getSource()==InboxButton){
             InboxButton.setBackground(new Color(85,93,108));
         } else if(e.getSource()==SentButton){
             SentButton.setBackground(new Color(85,93,108));
         } else if(e.getSource()==ArchiveButton){
             ArchiveButton.setBackground(new Color(85,93,108));
         } else if(e.getSource()==TrashButton){
             TrashButton.setBackground(new Color(85,93,108));
         }
    }

    @Override
    public void mouseExited(MouseEvent e) {

        if(e.getSource()==InboxButton){
            InboxButton.setBackground(Color.BLACK);
        } else if(e.getSource()==SentButton){
            SentButton.setBackground(Color.BLACK);
        } else if(e.getSource()==ArchiveButton){
            ArchiveButton.setBackground(Color.BLACK);
        } else if(e.getSource()==TrashButton){
            TrashButton.setBackground(Color.BLACK);
        }
    }
}
