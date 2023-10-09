import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SalaryDependents extends JFrame{
    double DailyRate,Salary,dis ,AddSalary,Deduction,WholeSalary,HR,HpD,DpM,Nod ;

    String AS = String.valueOf(AddSalary);
    String Deduc = Double.toString(Deduction);
    String WSalary = Double.toString(WholeSalary);
    JPanel pnl = new JPanel();

    JLabel Title = new JLabel("Salary Dependents",SwingConstants.CENTER);

    JLabel Name = new JLabel("Name");
    JLabel Gender = new JLabel("Gender");
    JLabel Age = new JLabel("Age");
    JLabel HPD = new JLabel("No. of Hours Per Day");
    JLabel DPM = new JLabel("No, of Day Per Month");
    JLabel HrRate = new JLabel("Hourly Rate");
    JLabel NOD = new JLabel("No. Of Dependents");


    JTextField txtName = new JTextField(50);
    JRadioButton Male = new JRadioButton();
    JRadioButton Female = new JRadioButton();
    JTextField txtAge = new JTextField(3);
    JTextField txtHPD = new JTextField(2);
    JTextField txtDPM = new JTextField(2);
    JTextField txtHrRate = new JTextField(5);
    JTextField txtNOD = new JTextField(3);

    JButton calculateButton = new JButton("Calculate");

    JTextArea outputTextArea = new JTextArea(20,20);
    JScrollPane scroll = new JScrollPane ( outputTextArea );
    
    public SalaryDependents(){
        pnl.setLayout(null);
        pnl.setBackground(Color.BLACK);
        
        this.setSize(700,450);
        this.setLocation(350,100);
        this.setTitle("SalaryDependents Dependents");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(Title);
        Title.setFont(new Font("Onyx",Font.BOLD,35));
        Title.setForeground(Color.white);
        //Title.setBackground(Color.GREEN);
        Title.setBounds(0,0,700,50);

        // Labels---------------------------------------------------
        
        this.add(Name);
        Name.setBounds(10,65,100,20);
        Name.setForeground(Color.WHITE);
        this.add(Gender);
        Gender.setBounds(10,95,100,20);
        Gender.setForeground(Color.WHITE);
        this.add(Age);
        Age.setBounds(10,125,100,20);
        Age.setForeground(Color.WHITE);
        this.add(HPD);
        HPD.setBounds(10,155,120,20);
        HPD.setForeground(Color.WHITE);
        this.add(DPM);
        DPM.setBounds(10,185,120,20);
        DPM.setForeground(Color.WHITE);
        this.add(HrRate);
        HrRate.setBounds(10,215,100,20);
        HrRate.setForeground(Color.WHITE);
        this.add(NOD);
        NOD.setBounds(10,245,120,20);
        NOD.setForeground(Color.WHITE);
        //Inputs----------------------------------------------------
        this.add(txtName);
        txtName.setBounds(150,65,200,20);
        txtName.setBorder(null);

        this.add(Male);
        Male.setText("Male");
        Male.setBounds(150,95,55,20);
        Male.setBackground(Color.GRAY);
        Male.setForeground(Color.WHITE);

        this.add(Female);
        Female.setText("Female");
        Female.setBounds(205,95,80,20);
        Female.setBackground(Color.GRAY);
        Female.setForeground(Color.WHITE);
        this.add(txtAge);
        txtAge.setBounds(150,125,200,20);
        txtAge.setBorder(null);
        this.add(txtHPD);
        txtHPD.setBounds(150,155,200,20);
        txtHPD.setBorder(null);
        this.add(txtDPM);
        txtDPM.setBounds(150,185,200,20);
        txtDPM.setBorder(null);
        this.add(txtHrRate);
        txtHrRate.setBounds(150,215,200,20);
        txtHrRate.setBorder(null);
        this.add(txtNOD);
        txtNOD.setBounds(150,245,200,20);
        txtNOD.setBorder(null);
        //Action------------------------------------------------
        calculateButton.addActionListener(new actionButton1());
        this.add(calculateButton);
        calculateButton.setBackground(Color.white);
        calculateButton.setBounds(100,295,100,30);
        //Output-----------------------------------------------------
        this.add(scroll);
        outputTextArea.setEditable(false);
        outputTextArea.setFont(new Font("Verdana",Font.BOLD,12));
        scroll.setBounds(400,65,250,300);
        scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        this.add(pnl);
        this.setVisible(true);
    }
    class actionButton1 implements ActionListener{;;
        @Override
        public void actionPerformed(ActionEvent e){
            String FullName = txtName.getText();
            String age = txtAge.getText();
            String hpd = txtHPD.getText();
            String dpm = txtDPM.getText();
            String hr = txtHrRate.getText();
            String nod = txtNOD.getText();
            String gender = "";
            HR = Double.parseDouble(hr);
            HpD = Double.parseDouble(hpd);
            DpM = Double.parseDouble(dpm);
            Nod = Double.parseDouble(nod);

            DailyRate = (HR*HpD);
            Salary = (DailyRate*DpM);
            
            
            
            if(Male.isSelected()){
                gender = "Male";
                dis = 1.5;
                if(Nod >= 5){
                    AddSalary = 4000;
                    Salary += AddSalary;
                    Deduction = (dis*Salary)/100;
                    WholeSalary = Salary - Deduction;
                    
                }else if (Nod >= 2 && Nod <= 4){
                    AddSalary = 2000;
                    Salary += AddSalary;
                    Deduction = (dis*Salary)/100;
                    WholeSalary = Salary - Deduction;
                }else if (Nod <= 1){
                    AddSalary = 1000;
                    Salary += AddSalary;
                    Deduction = (dis*Salary)/100;
                    WholeSalary = Salary - Deduction;
                }
            }
            else if(Female.isSelected()){
                gender = "Female";
                dis = 2.5;
                if(Nod >= 5){
                    AddSalary = 4000;
                    Salary += AddSalary;
                    Deduction = (dis*Salary)/100;
                    WholeSalary = Salary - Deduction;
                }else if (Nod >= 2 || Nod <= 4){
                    AddSalary = 2000;
                    Salary += AddSalary;
                    Deduction = (dis*Salary)/100;
                    WholeSalary = Salary - Deduction;
                }else if (Nod <= 1){
                    AddSalary = 1000;
                    Salary += AddSalary;
                    Deduction = (dis*Salary)/100;
                    WholeSalary = Salary - Deduction;
                }
                
            }
            String AS = String.format("%.2f",AddSalary);
            String Deduc = String.format("%.2f",Deduction);
            String WSalary = String.format("%.2f",WholeSalary);
            
            outputTextArea.append("\n Name : "+FullName+
                                  "\n Gender : "+ gender+
                                  "\n Age : "+age+
                                  "\n Hour Per day : "+hpd+
                                  "\n Day Per Month : "+dpm+
                                  "\n Hourly Rate : "+hr+
                                  "\n No. Of Dependents : "+nod+
                                  "\n Additional Payment : "+AS+
                                  "\n Total Deduction : "+Deduc+
                                  "\n Total Salary : "+WSalary+
                                  "\n----------------------------------------");;

        }
    }

    public static void main(String[] args) {
        new SalaryDependents();
    }
}