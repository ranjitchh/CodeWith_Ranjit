import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="StudentReport.class",width=500 height=500>
</applet>*/
public class StudentReport extends Applet implements ActionListener
{
Label lblTitle,lblRegno,lblCourse,lblSemester,lblSub1, lblSub2;

TextField txtRegno,txtCourse,txtSemester,txtSub1,txtSub2;
Button cmdReport;
String rno="", course="", sem="",sub1="",sub2="",avg="",heading="";
public void init()
{
GridBagLayout gbag= new GridBagLayout(); 
GridBagConstraints gbc = new GridBagConstraints(); 
setLayout(gbag);

lblTitle = new Label("Enter Student Details");
lblRegno= new Label("Register Number");
txtRegno=new TextField(25);
lblCourse=new Label("Course Name"); 
txtCourse=new TextField(25); 
lblSemester=new Label("Semester "); 
txtSemester=new TextField(25); 
lblSub1=new Label("Marks of Subject1"); 
txtSub1=new TextField(25);
lblSub2=new Label("Marks of Subject2"); 
txtSub2=new TextField(25);

cmdReport = new Button("View Report");

// Define the grid bag gbc.weighty=2.0;
gbc.gridwidth=GridBagConstraints.REMAINDER; 
gbc.anchor=GridBagConstraints.NORTH; 
gbag.setConstraints(lblTitle,gbc);

//Anchor most components to the right gbc.anchor=GridBagConstraints.EAST;
gbc.gridwidth=GridBagConstraints.RELATIVE; 
gbag.setConstraints(lblRegno,gbc); 
gbc.gridwidth=GridBagConstraints.REMAINDER; 
gbag.setConstraints(txtRegno,gbc);


gbc.gridwidth=GridBagConstraints.RELATIVE; 
gbag.setConstraints(lblCourse,gbc); 
gbc.gridwidth=GridBagConstraints.REMAINDER; 
gbag.setConstraints(txtCourse,gbc);

gbc.gridwidth=GridBagConstraints.RELATIVE;



gbag.setConstraints(lblSemester,gbc); 
gbc.gridwidth=GridBagConstraints.REMAINDER; 
gbag.setConstraints(txtSemester,gbc);

gbc.gridwidth=GridBagConstraints.RELATIVE; 
gbag.setConstraints(lblSub1,gbc); 
gbc.gridwidth=GridBagConstraints.REMAINDER; 
gbag.setConstraints(txtSub1,gbc);

gbc.gridwidth=GridBagConstraints.RELATIVE; 
gbag.setConstraints(lblSub2,gbc); 
gbc.gridwidth=GridBagConstraints.REMAINDER; 
gbag.setConstraints(txtSub2,gbc);


gbc.anchor=GridBagConstraints.CENTER; 
gbag.setConstraints(cmdReport,gbc);

add(lblTitle); 
add(lblRegno); 
add(txtRegno); 
add(lblCourse); 
add(txtCourse); 
add(lblSemester); 
add(txtSemester); 
add(lblSub1); 
add(txtSub1); 
add(lblSub2); 
add(txtSub2); 
add(cmdReport);
cmdReport.addActionListener(this);
}


public void actionPerformed(ActionEvent ae)
{
try{
if(ae.getSource() == cmdReport)
{

rno=txtRegno.getText().trim(); 
course=txtCourse.getText().trim(); 
sem=txtSemester.getText().trim(); 
sub1=txtSub1.getText().trim(); 
sub2=txtSub2.getText().trim();
avg="Avg Marks:" + ((Integer.parseInt(sub1) + Integer.parseInt(sub2))/2);



rno="Register No:" + rno; 
course="Course :"+ course; 
sem="Semester :"+sem; 
sub1="Subject1 :"+sub1; 
sub2="Subject2 :"+sub2;

heading="Student Report"; 
removeAll(); showStatus("");
repaint();
}

}catch(NumberFormatException e)
{

showStatus("Invalid Data");
}

}
public void paint(Graphics g)
{
g.drawString(heading,30,30); 
g.drawString(rno,30,80); 
g.drawString(course,30,100); 
g.drawString(sem,30,120); 
g.drawString(sub1,30,140); 
g.drawString(sub2,30,160); 
g.drawString(avg,30,180);
}

}