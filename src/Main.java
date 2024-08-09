import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class javaswing2 extends JFrame {
    JCheckBox cb1,cb2,cb3,cb4,cb5;
    public javaswing2(){
        setTitle("Food Billing");

        cb1= new JCheckBox("Burger Rs.120");
        cb2= new JCheckBox("Coke Rs.60");
        cb3= new JCheckBox("Fries Rs.80");
        cb4= new JCheckBox("Puff Rs.40");
        cb5= new JCheckBox("Softie Rs.50");
        JButton bill=new JButton("Total bill");
        JLabel l=new JLabel("Select Items You Want To Order");
        JLabel l1 =new JLabel("Quantity");
        JTextField t1 = new JTextField("0");
        JTextField t2 = new JTextField("0");
        JTextField t3 = new JTextField("0");
        JTextField t4 = new JTextField("0");
        JTextField t5 = new JTextField("0");



        cb1.setBounds(40,40, 120,20);
        cb2.setBounds(40,80, 120,20);
        cb3.setBounds(40,120, 120,20);
        cb4.setBounds(40,160,120,20);
        cb5.setBounds(40,200,120,20);
        bill.setBounds(40,240,120,20);
        l.setBounds(10,10,300,20);
        l1.setBounds(220,10,100,20);
        t1.setBounds(220,40,50,20);
        t2.setBounds(220,80,50,20);
        t3.setBounds(220,120,50,20);
        t4.setBounds(220,160,50,20);
        t5.setBounds(220,200,50,20);

        bill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0.0;
                String s="";
                if(cb1.isSelected()){
                    int n1= Integer.parseInt(t1.getText());
                    total+=(n1*120);
                    s+="Burger  Rs.120 x "+ n1 + "= Rs."+(n1*120)+"\n";
                }
                if(cb2.isSelected()){
                    int n2= Integer.parseInt(t2.getText());
                    total+=(n2*60);
                    s+="Coke  Rs.60 x "+ n2 + "= Rs."+(n2*60)+"\n";
                }
                if(cb3.isSelected()){
                    int n3= Integer.parseInt(t3.getText());
                    total+=(n3*80);
                    s+="Fries  Rs.80 x "+n3+"= Rs."+(n3*80)+"\n";
                }
                if(cb4.isSelected()){
                    int n4= Integer.parseInt(t4.getText());
                    total+=(n4*40);
                    s+="Puff  Rs.40 x "+n4+"= Rs."+(n4*40)+"\n";
                }
                if(cb5.isSelected()){
                    int n5= Integer.parseInt(t5.getText());
                    total+=(n5*50);
                    s+="Softie  Rs.50 x "+n5+"= Rs."+(n5*50)+"\n";
                }
                if(total>500){
                    s+="Discount = Rs."+(total*0.1)+"\n";
                    total=total-(total*0.1);
                }
                s+="---------------------------------------- \n";
                JOptionPane.showMessageDialog(new JOptionPane(),s+"Total Bill:     Rs."+total);
            }
        });

        add(cb1);
        add(cb2);
        add(cb3);
        add(bill);
        add(cb4);
        add(cb5);
        add(l);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(l1);


        setLayout(null);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        javaswing2 ob = new javaswing2();
    }
}