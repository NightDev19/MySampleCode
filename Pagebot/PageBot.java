import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PageBot extends JFrame{

    /*PageBot(){
        JFrame Frame1 = new JFrame();

        Label lblUser = new Label("Username :");
        Label lblPass = new Label("Password :");
        TextField Username = new TextField(20);
        TextField Password = new TextField(20);
        TextArea Output = new TextArea();
        Button btnSubmit = new Button("Submit");

        lblUser.setBounds(20,40,80,50);
        lblPass.setBounds(20,80,80,50);
        Username.setBounds(100,50,200,30);
        Password.setBounds(100,90,200,30);
        Output.setBounds(20,120,350,200);
        btnSubmit.setBounds(20,320,60,30);

        Frame1.add(btnSubmit);
        Frame1.add(Output);
        Frame1.add(lblPass);
        Frame1.add(lblUser);
        Frame1.add(Username);
        Frame1.add(Password);

        Frame1.setSize(400,400);
        Frame1.setLayout(null);
        Frame1.setVisible(true);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Output.setText("\nUsername : " + Username.getText() + "\nPassword : " + Password.getText());
                
            }
        });
    }*/

    JPanel pnlMain = new JPanel();

    JLabel lblUser = new JLabel("Username");
    JLabel lblPass = new JLabel("Password");

    JButton btnSubmit = new JButton("Submit");
    JButton btnClear = new JButton("Clear All");

    JTextField fldFirstName = new JTextField(15);
    JTextField fldLastName = new JTextField(15);

    JTextArea outputArea = new JTextArea(8,20);

    FlowLayout fl = new FlowLayout();
    Font setFont = new Font("",Font.BOLD,14);

    public PageBot(){
        this.setSize(300,300);
        this.setLocation(200,200);
        this.setTitle("Event Driven Code");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        outputArea.setBackground(Color.LIGHT_GRAY);
        outputArea.setEditable(false);

        fldFirstName.setFont(setFont);
        fldLastName.setFont(setFont);

        pnlMain.add(lblUser);
        pnlMain.add(fldFirstName);
        pnlMain.add(lblPass);
        pnlMain.add(fldLastName);
        pnlMain.add(outputArea);

        btnSubmit.addActionListener(new actionButton1());
        pnlMain.add(btnSubmit);

        btnClear.addActionListener(new actionButton2());
        pnlMain.add(btnClear);

        this.add(pnlMain);
        this.setVisible(true);
    }

    class actionButton1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String firstname = fldFirstName.getText();
            String lastname = fldLastName.getText();

            outputArea.append("\nFirstname : "+ firstname + "\nLastname : "+ lastname);
        }
    }

    class actionButton2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            fldFirstName.setText("");
            fldLastName.setText("");
            outputArea.setText("");
        }
    }

    public static void main(String[] args){
        new PageBot();
    }
    
}