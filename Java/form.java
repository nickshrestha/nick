import lang.stride.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

/**
 * Write a description of class add here.
 * @author (your name) @version (a version number or a date)
 */
public class form
{

    /**
     * 
     */
    static public void main(String[] args)
    {
        JFrame fframe =  new  JFrame();
        fframe.setTitle("Form1");
        fframe.setBounds(100, 55, 1000, 600);
        JPanel ppanel =  new  JPanel();
        ppanel.setLayout(null);
        ppanel.setBackground(Color.LIGHT_GRAY);
        fframe.add(ppanel);
        /* for the title*/
        JLabel title =  new  JLabel();
        title.setText("Student's Registration Form");
        title.setBounds(280, 30, 1000, 45);
        ppanel.add(title);
        /* font for title*/
        Font f =  new  Font("Arial", Font.PLAIN, 30);
        title.setFont(f);
        /* student ID*/
        JLabel l1 =  new  JLabel("Student ID:");
        l1.setBounds(30, 90, 600, 70);
        ppanel.add(l1);
        /* student id*/
        JTextField text_one =  new  JTextField();
        text_one.setBounds(110, 105, 100, 30);
        ppanel.add(text_one);
        /* school year*/
        JLabel l2 =  new  JLabel("School Year:");
        l2.setBounds(640, 90, 600, 70);
        ppanel.add(l2);
        String[] sy = {"2012-2013", "2013-2014", "2014-2015", "2015-2016"};
        JComboBox combo_boxx =  new  JComboBox(sy);
        combo_boxx.setBounds(730, 110, 150, 30);
        ppanel.add(combo_boxx);
        /* first name*/
        JLabel l3 =  new  JLabel("First Name:");
        l3.setBounds(30, 150, 600, 70);
        ppanel.add(l3);
        /* last name*/
        JLabel l4 =  new  JLabel("Last Name:");
        l4.setBounds(370, 150, 600, 70);
        ppanel.add(l4);
        /* middle name*/
        JLabel l5 =  new  JLabel("Middle Name:");
        l5.setBounds(640, 150, 600, 70);
        ppanel.add(l5);
        /* Address*/
        JLabel l6 =  new  JLabel("Address:");
        l6.setBounds(40, 210, 600, 70);
        ppanel.add(l6);
        /* dob*/
        JLabel l7 =  new  JLabel("Date of Birth:");
        l7.setBounds(390, 210, 600, 70);
        ppanel.add(l7);
        /* pob*/
        JLabel l8 =  new  JLabel("Place of Birth:");
        l8.setBounds(620, 210, 600, 70);
        ppanel.add(l8);
        /* Age*/
        JLabel l9 =  new  JLabel("Age:");
        l9.setBounds(50, 270, 600, 70);
        ppanel.add(l9);
        /* gender*/
        JLabel l10 =  new  JLabel("Gender:");
        l10.setBounds(360, 270, 600, 70);
        ppanel.add(l10);
        /* status*/
        JLabel l11 =  new  JLabel("Status:");
        l11.setBounds(650, 270, 600, 70);
        ppanel.add(l11);
        /* year*/
        JLabel l12 =  new  JLabel("Year:");
        l12.setBounds(50, 330, 600, 70);
        ppanel.add(l12);
        /* guardian*/
        JLabel l13 =  new  JLabel("Guardian");
        l13.setBounds(350, 330, 600, 70);
        ppanel.add(l13);
        /* Relation*/
        JLabel l14 =  new  JLabel("Relation:");
        l14.setBounds(640, 330, 600, 70);
        ppanel.add(l14);
        /* address*/
        JLabel l15 =  new  JLabel("Address:");
        l15.setBounds(40, 390, 600, 70);
        ppanel.add(l15);
        /* contact*/
        JLabel l16 =  new  JLabel("Contact #:");
        l16.setBounds(530, 390, 600, 70);
        ppanel.add(l16);
        /* 0 of 0*/
        JLabel l17 =  new  JLabel("0 of 0");
        l17.setBounds(400, 475, 600, 70);
        ppanel.add(l17);
        /* first name*/
        JTextField text_three =  new  JTextField();
        text_three.setBounds(110, 170, 150, 30);
        ppanel.add(text_three);
        /* last name*/
        JTextField text_four =  new  JTextField();
        text_four.setBounds(450, 170, 150, 30);
        ppanel.add(text_four);
        /* middle name*/
        JTextField text_five =  new  JTextField();
        text_five.setBounds(730, 170, 150, 30);
        ppanel.add(text_five);
        /* address*/
        JTextField text_six =  new  JTextField();
        text_six.setBounds(110, 230, 170, 50);
        ppanel.add(text_six);
        
        /* dob*/
        String[] dob = {"2012-2013", "2013-2014", "2014-2015", "2015-2016"};
        JComboBox dob_box =  new  JComboBox(dob);
        dob_box.setBounds(480, 230, 130, 30);
        ppanel.add(dob_box);
        /* pob*/
        JTextField text_eig =  new  JTextField();
        text_eig.setBounds(710, 230, 170, 50);
        ppanel.add(text_eig);
        
        /* age*/
        JTextField text_nin =  new  JTextField();
        text_nin.setBounds(110, 290, 90, 30);
        ppanel.add(text_nin);
        /* radiobutton*/
        JRadioButton j_radio =  new  JRadioButton();
        j_radio.setText("Male");
        j_radio.setBounds(425, 290, 80, 30);
        ppanel.add(j_radio);
        j_radio.setOpaque(false);
        j_radio.setContentAreaFilled(false);
        j_radio.setBorderPainted(false);
        JRadioButton jj_radio =  new  JRadioButton();
        jj_radio.setText("Female");
        jj_radio.setBounds(505, 290, 90, 30);
        ppanel.add(jj_radio);
        jj_radio.setOpaque(false);
        jj_radio.setContentAreaFilled(false);
        jj_radio.setBorderPainted(false);
        ButtonGroup hh =  new  ButtonGroup();
        hh.add(jj_radio);
        hh.add(j_radio);
        /* status*/
        String[] status = {"Single", "Married", "Divorced"};
        JComboBox status_box =  new  JComboBox(status);
        status_box.setBounds(710, 290, 170, 30);
        ppanel.add(status_box);
        /* year*/
        String[] year = {"1st", "2nd", "3rd"};
        JComboBox year_box =  new  JComboBox(year);
        year_box.setBounds(110, 350, 90, 30);
        ppanel.add(year_box);
        /* guardian*/
        JTextField text_twe =  new  JTextField();
        text_twe.setBounds(420, 350, 150, 30);
        ppanel.add(text_twe);
        /* relation*/
        JTextField text_fourteen =  new  JTextField();
        text_fourteen.setBounds(710, 350, 170, 30);
        ppanel.add(text_fourteen);
        /* address*/
        JTextField text_thir =  new  JTextField();
        text_thir.setBounds(110, 410, 230, 50);
        ppanel.add(text_thir);
        /* contact*/
        JTextField text_fifteen =  new  JTextField();
        text_fifteen.setBounds(620, 410, 255, 50);
        ppanel.add(text_fifteen);
        /* button*/
        JButton button =  new  JButton("|<");
        button.setEnabled(true);
        button.setBounds(20, 500, 70, 20);
        /* font*/
        Font button_font =  new  Font("Arial", Font.PLAIN, 19);
        button.setFont(button_font);
        ppanel.add(button);
        /* button1*/
        JButton button1 =  new  JButton("<<");
        button1.setEnabled(true);
        button1.setBounds(100, 500, 70, 20);
        /* font*/
        Font button1_font =  new  Font("Arial", Font.PLAIN, 19);
        button1.setFont(button1_font);
        ppanel.add(button1);
        /* button2*/
        JButton button2 =  new  JButton(">>");
        button2.setEnabled(true);
        button2.setBounds(180, 500, 70, 20);
        /* font*/
        Font button2_font =  new  Font("Arial", Font.PLAIN, 19);
        button2.setFont(button2_font);
        ppanel.add(button2);
        /* button3*/
        JButton button3 =  new  JButton(">|");
        button3.setEnabled(true);
        button3.setBounds(270, 500, 70, 20);
        /* font*/
        Font button3_font =  new  Font("Arial", Font.PLAIN, 19);
        button3.setFont(button3_font);
        ppanel.add(button3);
        /* button4*/
        JButton button4 =  new  JButton("New");
        button4.setEnabled(true);
        button4.setBounds(600, 490, 100, 40);
        /* font*/
        Font button4_font =  new  Font("Arial", Font.PLAIN, 19);
        button4.setFont(button4_font);
        ppanel.add(button4);
        /* button5*/
        JButton button5 =  new  JButton("Save");
        button5.setEnabled(true);
        button5.setBounds(750, 490, 100, 40);
        /* font*/
        Font button5_font =  new  Font("Arial", Font.PLAIN, 19);
        button5.setFont(button5_font);
        ppanel.add(button5);
        fframe.setVisible(true);
        fframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
