import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.util.*;
import java.awt.event.*;

public class INGNepal implements ActionListener
{
       JTextField txtVacancyNumber,txtDesignation,txtSalary ,txtWorkingHour, txtVacancyNumber1, txtDesignation1,txtWages, txtWorkingHour1,
       txtVacancyNumber2,txtStafName, txtQualification,txtAppointedBy,txtVacancyNumber3, txtStaffName1,txtQualification1,txtAppointedBy1,
       txtVacancyNumber4;
      JButton addFullTime,addPartTime ,appointFullTime ,appointPartTime,displayButton  ,clearButton ,terminateButton;
      ArrayList<StaffHire> list = new ArrayList();
      JFrame fframe;
      JComboBox comboJobType,comboJobType1,comboShift,cmbYear, cmbMonth,cmbDay, cmbYear1, cmbMonth1, cmbDay1;
      String year,month,day,joiningDate, day1, month1, year1;
      JLabel title,title1,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22;
      JPanel ppanel;
     
      PartTimeStaffHire gg, h;
      int vno,Vnoo, vnoo,VN, vacant;
      String SN, qual, AB,JD, jobTypes, desginations, shifts, staffNames, joinDates, qualifications, appointedBy, jobType, desgination,appointedBys;
      float salary, workingHour, wagess, workingHours;
   
   
     public void m1(){
        fframe =  new JFrame("Staff Hire");
        fframe.setBounds(80,55,1210,730);
        fframe.setResizable(false);
        ppanel = new JPanel();
        ppanel .setLayout(null);
       
        //set background color
        Color  c = new Color(240,242,242);
        ppanel.setBackground(c);
       
        // add vacancy
       
        //for the title
        title = new JLabel();
        title.setText("Full Time Employee");
        title.setBounds(505,05,500,45);
        ppanel.add(title);
       
        //font for title
        Font f= new Font("Arial", Font.BOLD,20);
        title.setFont(f);
       
         //for full time staff
         // vacancy number
        l1= new JLabel("Vacancy Number:");
        l1.setBounds(30, 50, 200, 20);
        ppanel.add(l1);
       
        txtVacancyNumber = new JTextField();
        txtVacancyNumber.setBounds(140, 50, 100,30);
        ppanel.add(txtVacancyNumber);
       
         //designation
        l2 = new JLabel("Designation:");
        l2.setBounds(350, 50, 120, 20);
        ppanel.add(l2);
     
        txtDesignation = new JTextField();
        txtDesignation.setBounds(430, 50, 170,30);
        ppanel.add(txtDesignation);
 
        // job type
        l3 = new JLabel("Job Type:");
        l3.setBounds(700, 50, 200, 20);
        ppanel.add(l3);
       
        String[] JobType ={"Full Time", "Part Time"};
        comboJobType = new JComboBox(JobType);
        comboJobType .setBounds(760,50,190,30);
        ppanel.add(comboJobType );
       
        //salary
        l4 = new JLabel("Salary:");
        l4.setBounds(30, 90, 100, 20);
        ppanel.add(l4);
       
        txtSalary = new JTextField();
        txtSalary .setBounds(90, 90, 150,30);
        ppanel.add(txtSalary);
   
        //working hour
        l5 = new JLabel("Working Hour:");
        l5.setBounds(350, 90, 200, 20);
        ppanel.add(l5);
       
        txtWorkingHour = new JTextField();
        txtWorkingHour.setBounds(455, 90, 160,30);
        ppanel.add(txtWorkingHour);
       
        //button for full time staff
       
        addFullTime = new JButton("Add Vacancy number");
        addFullTime.setEnabled(true);
        addFullTime.setBounds(950, 100, 200, 25);
        addFullTime.addActionListener(this);
     
        //font of button
        Font button1_font = new Font("Tahoma",Font.PLAIN, 15);
        addFullTime.setFont(button1_font);
        ppanel.add(addFullTime);
        Color  c1 = new Color(255,255,255);
        addFullTime.setBackground(c1);
       
        //part time staff
        // vacancy number
        l6 = new JLabel("Vacancy Number:");
        l6.setBounds(30, 360, 200, 20);
        ppanel.add(l6);
   
        txtVacancyNumber1 = new JTextField();
        txtVacancyNumber1.setBounds(140, 360, 100,30);
        ppanel.add(txtVacancyNumber1);
       
        // Designation
        l7 = new JLabel("Designation:");
        l7.setBounds(340, 360, 200, 20);
        ppanel.add(l7);
       
        txtDesignation1 = new JTextField();
        txtDesignation1.setBounds(420, 360, 180,30);
        ppanel.add(txtDesignation1);
       
        // job type
        l8 = new JLabel("Job Type:");
        l8.setBounds(680, 360, 200, 20);
        ppanel.add(l8);
       
        String[] eight ={"Full Time", "Part Time"};
        comboJobType1 = new JComboBox(eight);
        comboJobType1.setBounds(760,360,180,30);
        ppanel.add(comboJobType1);
   
          //wages
        l9 = new JLabel("Wages:");
        l9.setBounds(30, 400, 100, 20);
        ppanel.add(l9);
       
        txtWages = new JTextField();
        txtWages.setBounds(80, 400, 150,30);
        ppanel.add(txtWages);
       
         //working hour
        l10 = new JLabel("Working Hour:");
        l10.setBounds(350, 400, 200, 20);
        ppanel.add(l10);
     
        txtWorkingHour1 = new JTextField();
        txtWorkingHour1.setBounds(440, 400, 160,30);
        ppanel.add(txtWorkingHour1);
       
         //shift    
        l11 = new JLabel("Shift:");
        l11.setBounds(680, 400, 100, 20);
        ppanel.add(l11);
       
        String[] eleven ={"Morning", "Evening"};
        comboShift = new JComboBox(eleven);
        comboShift.setBounds(730, 400, 150,30);
        ppanel.add(comboShift);
     
        //button to add part time staff
        addPartTime = new JButton("Add Vacancy number");
        addPartTime.setEnabled(true);
        addPartTime.setBounds(950, 400, 200, 25);
        addPartTime.addActionListener(this);
     
        //font for b2
        Font button2_font = new Font("Arial",Font.PLAIN, 15);
        addPartTime.setFont(button2_font);
        ppanel.add(addPartTime);
        Color  c2 = new Color(255,255,255);
        addPartTime.setBackground(c2);
       
        //appoint staff hired
         //for the title
        title1 = new JLabel();
        title1.setText("For Part Time Employee");
        title1.setBounds(500,310,400,45);
        ppanel.add(title1);
       
        //font for title
        Font f1= new Font("Arial", Font.BOLD,20);
        title1.setFont(f1);
       
        // for full time staff hire
         // vacancy number
        l12 = new JLabel("Vacancy Number:");
        l12.setBounds(30, 180, 200, 20);
        ppanel.add(l12);
       
        txtVacancyNumber2 = new JTextField();
        txtVacancyNumber2.setBounds(140, 180, 100,30);
        ppanel.add(txtVacancyNumber2);
       
       
         // staff name
        l13 = new JLabel("Staff Name:");
        l13.setBounds(340, 180, 200, 20);
        ppanel.add(l13);
       
        txtStafName = new JTextField();
        txtStafName.setBounds(420, 180, 160,30);
        ppanel.add(txtStafName);
       
       
         // joining date
        l14= new JLabel("Joining Date:");
        l14.setBounds(680, 180, 200, 20);
        ppanel.add(l14);
       
        String year[]={"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013","2014","2015","2016","2017","2018","2019","2020","2021"};
        cmbYear=new JComboBox(year);
        cmbYear.setBounds(755, 180, 70,30);
        ppanel.add(cmbYear);
       
        String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        cmbMonth=new JComboBox(month);
        cmbMonth.setBounds(830,180,70,30);
        ppanel.add(cmbMonth);
       
        String day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        cmbDay=new JComboBox(day);
        cmbDay.setBounds(905,180,50,30);
        ppanel.add(cmbDay);
       
     
        //Qualification
         l15 = new JLabel("Qualification:");
        l15.setBounds(30, 220, 100, 20);
        ppanel.add(l15);
       
        txtQualification = new JTextField();
        txtQualification.setBounds(110, 220, 150,30);
        ppanel.add(txtQualification);
       
         //Appointed by
        l16 = new JLabel("Appointed By:");
        l16.setBounds(320, 220, 200, 20);
        ppanel.add(l16);
     
        txtAppointedBy = new JTextField();
        txtAppointedBy.setBounds(420, 220, 160,30);
        ppanel.add(txtAppointedBy);
       
        //button to appoint full time staff
       
        appointFullTime = new JButton("Appoint staff");
        appointFullTime.setEnabled(true);
        appointFullTime.setBounds(950, 220, 200, 25);
        appointFullTime.addActionListener(this);
     
        //font for b3
        Font button3_font = new Font("Arial",Font.PLAIN, 15);
        appointFullTime.setFont(button3_font);
        ppanel.add(appointFullTime);
        Color  c3 = new Color(255,255,255);
        appointFullTime.setBackground(c3);
       
       
        // for part time staff
        // vacancy number
        l17 = new JLabel("Vacancy Number:");
        l17.setBounds(30, 490, 200, 20);
        ppanel.add(l17);
       
        txtVacancyNumber3 = new JTextField();
        txtVacancyNumber3.setBounds(140, 490, 70,30);
        ppanel.add(txtVacancyNumber3);
   
         // staff name
        l18 = new JLabel("Staff Name:");
        l18.setBounds(340, 490, 200, 20);
        ppanel.add(l18);
       
        txtStaffName1 = new JTextField();
        txtStaffName1.setBounds(420, 490, 160,30);
        ppanel.add(txtStaffName1);
       
       
         // joining date
        l19= new JLabel("Joining Date:");
        l19.setBounds(680, 490, 200, 20);
        ppanel.add(l19);
       
        String year1[]={"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013","2014","2015","2016","2017","2018","2019","2020","2021"};
        cmbYear1=new JComboBox(year1);
        cmbYear1.setBounds(755, 490, 70,30);
        ppanel.add(cmbYear1);
       
        String month1[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        cmbMonth1=new JComboBox(month1);
        cmbMonth1.setBounds(830,490,70,30);
        ppanel.add(cmbMonth1);
       
        String day1[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        cmbDay1=new JComboBox(day1);
        cmbDay1.setBounds(905,490,50,30);
        ppanel.add(cmbDay1);
       
        //Qualification
        l20 = new JLabel("Qualification:");
        l20.setBounds(30, 530, 100, 20);
        ppanel.add(l20);
       
        txtQualification1 = new JTextField();
        txtQualification1.setBounds(110, 530, 150,30);
        ppanel.add(txtQualification1);
       
         //Appointed by
        l21 = new JLabel("Appointed By:");
        l21.setBounds(350, 530, 200, 20);
        ppanel.add(l21);
     
        txtAppointedBy1 = new JTextField();
        txtAppointedBy1.setBounds(440, 530, 150,30);
        ppanel.add(txtAppointedBy1);
       
        //button to appoint part time staff
        appointPartTime = new JButton("Appoint Staff");
        appointPartTime.setEnabled(true);
        appointPartTime.setBounds(950, 530, 200, 25);
        appointPartTime.addActionListener(this);
     
        //font for b4
        Font button4_font = new Font("Arial",Font.PLAIN, 15);
        appointPartTime.setFont(button4_font);
        ppanel.add(appointPartTime);
        Color  c4 = new Color(255,255,255);
        appointPartTime.setBackground(c4);
       
       
        //terminate staff
        //add vacancy number
        l22 = new JLabel("Vacancy Number");
        l22.setBounds(30, 600, 200, 20);
        ppanel.add(l22);
       
         txtVacancyNumber4 = new JTextField();
         txtVacancyNumber4.setBounds(130, 600, 100,30);
        ppanel.add( txtVacancyNumber4);
       
        //display
       
        displayButton = new JButton("Display");
        displayButton.setEnabled(true);
        displayButton.setBounds(300, 650, 180, 25);
        displayButton.addActionListener(this);
     
        //font for b5
        Font button5_font = new Font("Arial",Font.PLAIN, 15);
        displayButton.setFont(button5_font);
        ppanel.add(displayButton);
        Color  c5 = new Color(255,255,255);
        displayButton.setBackground(c5);
       
        //to clear the value
        clearButton = new JButton("Clear");
        clearButton.setEnabled(true);
        clearButton.setBounds(700, 650, 200, 25);
        clearButton.addActionListener(this);
     
        //font for b5
        Font button6_font = new Font("Arial",Font.PLAIN, 15);
        clearButton.setFont(button6_font);
        ppanel.add(clearButton);
        Color  c6 = new Color(255,255,255);
        clearButton.setBackground(c6);
       
        //to terminate the result
        terminateButton = new JButton("Terminate");
        terminateButton.setEnabled(true);
        terminateButton.setBounds(500, 600, 200, 25);
        terminateButton.addActionListener(this);
     
        //font for b7
        Font button7_font = new Font("Arial",Font.PLAIN, 15);
        terminateButton.setFont(button7_font);
        ppanel.add(terminateButton);
        Color  c7 = new Color(255,255,255);
        terminateButton.setBackground(c7);
       
        fframe.setVisible(true);
        fframe.add(ppanel);
        fframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   
      }
        //add full time staff
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==addFullTime){
              vno=0;
              salary=0;
              workingHour=0;
              jobType="";
              desgination="";
             try{
                vno=Integer.parseInt(txtVacancyNumber.getText());
                desgination= txtDesignation.getText();
                salary=Float.parseFloat(txtSalary .getText());
                workingHour=Float.parseFloat(txtWorkingHour.getText());
                jobType=(comboJobType.getSelectedItem()).toString();
           
               //FOR COMPARING THE Vacancy No VALUES
               boolean isDuplicateVno=false;
               for(StaffHire obj:list) {
                if(obj.getvacancyNumber()==vno){
                   isDuplicateVno=true;
                  break;
                  }
                }
               if(isDuplicateVno==false){
                FullTimeStaffHire obj=new FullTimeStaffHire(vno, desgination,jobType,salary,workingHour);
                list.add(obj);
                JOptionPane.showMessageDialog(ppanel," Vacancy added for Full Time staff"+list.size());
               }else{
                 JOptionPane.showMessageDialog(ppanel,"*Input Vacancy nummber is already in the list.* "+list.size());
                 }
              }
               
             catch(Exception exp){
                  JOptionPane.showMessageDialog(ppanel,"Please enter all  fields. ");
              }
             }
       
              //appoint full time staff
         
 if(e.getSource()==appointFullTime){
     try{
   vnoo=Integer.parseInt(txtVacancyNumber2.getText());
             staffNames=txtStafName.getText();
             year = (cmbYear.getSelectedItem()).toString();
             month = (cmbMonth.getSelectedItem()).toString();
            day = (cmbDay.getSelectedItem()).toString();
            joinDates=(year+month+day).toString();
            qualifications=txtQualification.getText();
            appointedBys=txtAppointedBy.getText();
           
            boolean vnoFound=false;
            for(StaffHire obj: list){
                if(obj.getvacancyNumber()==vnoo){
                    vnoFound = true;
                    if(obj instanceof FullTimeStaffHire){
                   FullTimeStaffHire hh=(FullTimeStaffHire)obj;
                   if(hh.getjoined()==true){
                    JOptionPane.showMessageDialog(ppanel,"Staff is already hired!");
                }else{
                    hh.appointFullTimeStaff(staffNames, joinDates, appointedBys, qualifications);
                    JOptionPane.showMessageDialog(ppanel,"Staff is successfully appointed.");
                    break;
                }}
            }
            }
            }
                catch(Exception exp){
                  JOptionPane.showMessageDialog(ppanel,"*Not for full time Staff* ");
              }
             }
       
            //add Part Time Staff
           if(e.getSource()==addPartTime){
             Vnoo=0;
             wagess=0;
             workingHours=0;
             jobTypes="";
             desginations="";
             shifts="";
             try{
                Vnoo=Integer.parseInt(txtVacancyNumber1.getText());
                desginations=txtDesignation1.getText();
                wagess=Float.parseFloat(txtWages.getText());
                shifts=(comboShift.getSelectedItem()).toString();
                workingHours=Float.parseFloat(txtWorkingHour1.getText());
                jobTypes=(comboJobType1.getSelectedItem()).toString();
           
               //FOR COMPARING THE Vacancy No VALUES
                boolean isDuplicateVnoo=false;
                for(StaffHire var:list) {
                 if(var.getvacancyNumber()==Vnoo){
                   isDuplicateVnoo=true;
                    break;
                 }
               }
                if(isDuplicateVnoo==false){
                  PartTimeStaffHire abc=new PartTimeStaffHire(Vnoo, desginations,jobTypes,workingHours,wagess,shifts);
                  list.add(abc);
                  JOptionPane.showMessageDialog(ppanel,"Vacancy added for Part Time "+list.size());
                 }
                else{
                 JOptionPane.showMessageDialog(ppanel,"*Input Vacancy number is already in the list*. "+list.size());
                }
              }  
             catch(Exception exp){
             JOptionPane.showMessageDialog(ppanel,"Please enter all  fields. ");
             }    
           }
           
             //appoint part time staff
       
   if(e.getSource()==appointPartTime){
     try{
      VN=Integer.parseInt(txtVacancyNumber3.getText());
              SN=txtStaffName1.getText();
              year1 = (cmbYear1.getSelectedItem()).toString();
              month1 = (cmbMonth1.getSelectedItem()).toString();
              day1 = (cmbDay1.getSelectedItem()).toString();
              JD=(year1+month1+day1).toString();
              qual=txtQualification1.getText();
              AB=txtAppointedBy1.getText();
           
              boolean vnoFound=false;
              for(StaffHire var: list){
                if(var.getvacancyNumber()==VN){
                    vnoFound= true;
                    if(var instanceof PartTimeStaffHire){
                     h=(PartTimeStaffHire)var;
                    if(h.getjoined()==true){
                        JOptionPane.showMessageDialog(ppanel,"Staff is already hired!");
                    }else{
                    h.hirePartTime(SN, JD, AB, qual);
                    JOptionPane.showMessageDialog(ppanel,"Staff is successfully appointed.");
                    break;
                   
                }}
               }
            }
        }
               catch(Exception ex){
                  JOptionPane.showMessageDialog(ppanel,"Not for part time Staff !!");
              }
             }
         
          //terminate staff
          if(e.getSource()==terminateButton){
           vacant = Integer.parseInt( txtVacancyNumber4.getText());
           
           for(StaffHire var:list){
               if(var.getvacancyNumber()==vacant){
                   if(var instanceof PartTimeStaffHire){
                        gg = (PartTimeStaffHire)var;
                       if(gg.getterminated()==false){
                           gg.staffTerminated();
                            JOptionPane.showMessageDialog(ppanel,"Staff is successfully terminated");
                           break;
                        }
                       else if(gg.getterminated()== true){
                            JOptionPane.showMessageDialog(ppanel,"*Sorry! Staff has already been terminated.*");
                            break;
                        }
                    }
                    else{
                         JOptionPane.showMessageDialog(ppanel,"*Sorry!, please enter valid vacancy number.*");
                         break;
                       
                        }
                }
            }
        }
        //display
        if(e.getSource()==displayButton){
            for(StaffHire obj:list){
                if(obj instanceof FullTimeStaffHire){
                     FullTimeStaffHire oo =  (FullTimeStaffHire)obj;
                     oo.display();
                    }
                    else if(obj instanceof PartTimeStaffHire){
                      PartTimeStaffHire oo =  (PartTimeStaffHire)obj;
                     oo.display();
                    }
       
          }
         }
         
        //clear
        if(e.getSource()==clearButton){
            txtVacancyNumber.setText("");
            txtDesignation.setText("");
            txtSalary.setText("");
            txtWorkingHour.setText("");
            txtVacancyNumber1.setText("");
            txtDesignation1.setText("");
            txtWages.setText("");
            txtWorkingHour1.setText("");
            txtVacancyNumber2.setText("");
            txtStafName.setText("");
            txtQualification.setText("");
            txtAppointedBy.setText("");
            txtVacancyNumber3.setText("");
            txtStaffName1.setText("");
            txtQualification1.setText("");
           txtAppointedBy1.setText("");
            txtVacancyNumber4.setText("");
         
       
        }
 
       
      }
   
       
      public static void main(String[] args){
        INGNepal oo = new INGNepal ();
        oo.m1();
      }
   
}