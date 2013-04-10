import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 public class DLT extends JPanel implements ActionListener
 {



   public DLT()
   {
      
      setLayout(new BorderLayout());

      JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
      String tabs[] = {"Instruction","Conversion","Addition","Subtraction","Multiplication","Division","AND","OR","NOT"};

        tabbedPane.addTab(tabs[0],InstructionPane(tabs[0]));
        tabbedPane.addTab(tabs[1],ConversionPane(tabs[1]));
  tabbedPane.addTab(tabs[2],AdditionPane(tabs[2]));
        tabbedPane.addTab(tabs[3],SubtractionPane(tabs[3]));
	tabbedPane.addTab(tabs[4],MultiplicationPane(tabs[4]));
        tabbedPane.addTab(tabs[5],DivisionPane(tabs[5]));
	tabbedPane.addTab(tabs[6],ANDPane(tabs[6]));
        tabbedPane.addTab(tabs[7],ORPane(tabs[7]));
	tabbedPane.addTab(tabs[8],NOTPane(tabs[8]));

      tabbedPane.setSelectedIndex(0);
      add(tabbedPane,BorderLayout.CENTER);
   }
  
   JPanel InstructionPane(String s)
   {
      JPanel p = new JPanel();
      p.setLayout(new GridLayout(15,1));
      JLabel jl1= new JLabel("                                                                                  INSTRUCTIONS");
      p.add(jl1);
      JLabel jl2= new JLabel("1. Enter base from 0-62");
      p.add(jl2);
      JLabel jl3= new JLabel("    10-35 --> A-Z");
      p.add(jl3);
      JLabel jl4= new JLabel("    36-62 --> a-z");
      p.add(jl4);
      JLabel jl5= new JLabel("");
      p.add(jl5);
      JLabel jl6= new JLabel("2. Enter numbers in the format");
      p.add(jl6);
      JLabel jl7= new JLabel("    A.t  or 10.22 (ie. floating numbers)");
      p.add(jl7);
      JLabel jl8= new JLabel("");
      p.add(jl8);
      JLabel jl9= new JLabel("3. While using AND OR NOT");  
      p.add(jl9);
      JLabel jl10= new JLabel("   (i)  the length of both numbers must be same.");
      p.add(jl10);
      JLabel jl11= new JLabel("   (ii) the numbers MUST be in BASE 2");
      p.add(jl11);
      JLabel jl12= new JLabel("");
      p.add(jl12);
      JLabel jl13= new JLabel("                                                                                                                                                                    Aadam Saleem");
      p.add(jl13);
      JLabel jl14= new JLabel("                                                                                                                                                                        11-CSS-01");
      p.add(jl14);
      return p;
   }

   JPanel ConversionPane(String s)
   {
      JPanel p = new JPanel();
      p.setLayout(new GridLayout(15,1));
      JLabel jl1= new JLabel("Enter Base");
      p.add(jl1);
      jtc1= new JTextField();
      p.add(jtc1);
      JLabel jl2= new JLabel("Enter Number");
      p.add(jl2);
      jtc2= new JTextField();
      p.add(jtc2);
      JLabel jl3= new JLabel("Enter New Base");
      p.add(jl3);
      jtc3= new JTextField();
      p.add(jtc3);
      JLabel jl4= new JLabel(" ");
      p.add(jl4);
      JLabel jl5= new JLabel(" ");
      p.add(jl5);
      bc= new JButton("Convert");
      p.add(bc);
      JLabel jl6= new JLabel();
      p.add(jl6);
      JLabel jl7= new JLabel("ANSWER...!!!");
      p.add(jl7);
      jtc8= new JTextField();
      p.add(jtc8);
      bc.addActionListener(this);
      return p;
   }

   JPanel AdditionPane(String s)
   { 
      JPanel p = new JPanel();
      p.setLayout(new GridLayout(18,1));
      JLabel jl1= new JLabel("Enter Base 1");
      p.add(jl1);
      jta1= new JTextField();
      p.add(jta1);
      JLabel jl2= new JLabel("Enter Number 1");
      p.add(jl2);
      jta2= new JTextField();
      p.add(jta2);
      JLabel jl3= new JLabel(" ");
      p.add(jl3);
      JLabel jl4= new JLabel("Enter Base 2");
      p.add(jl4);
      jta4= new JTextField();
      p.add(jta4);
      JLabel jl5= new JLabel("Enter Number 2");
      p.add(jl5);
      jta5= new JTextField();
      p.add(jta5);
      JLabel jl6= new JLabel(" ");
      p.add(jl6);
      JLabel jl7= new JLabel(" ");
      p.add(jl7);
      ba= new JButton("ADD");
      p.add(ba);
      JLabel jl8= new JLabel();
      p.add(jl8);
      JLabel jl9= new JLabel("ANSWER in BASE 1");
      p.add(jl9);
      jta9= new JTextField();
      p.add(jta9);
      JLabel jl10= new JLabel("ANSWER in BASE 2");
      p.add(jl10);
      jta10= new JTextField();
      p.add(jta10);
      ba.addActionListener(this);
      return p;
   }

   JPanel SubtractionPane(String s)
   {
      JPanel p = new JPanel();
      p.setLayout(new GridLayout(18,1));
      JLabel jl1= new JLabel("Enter Base 1");
      p.add(jl1);
      jts1= new JTextField();
      p.add(jts1);
      JLabel jl2= new JLabel("Enter Number 1");
      p.add(jl2);
      jts2= new JTextField();
      p.add(jts2);
      JLabel jl3= new JLabel(" ");
      p.add(jl3);
      JLabel jl4= new JLabel("Enter Base 2");
      p.add(jl4);
      jts4= new JTextField();
      p.add(jts4);
      JLabel jl5= new JLabel("Enter Number 2");
      p.add(jl5);
      jts5= new JTextField();
      p.add(jts5);
      JLabel jl6= new JLabel(" ");
      p.add(jl6);
      JLabel jl7= new JLabel(" ");
      p.add(jl7);
      bs= new JButton("SUBTRACT");
      p.add(bs);
      JLabel jl8= new JLabel();
      p.add(jl8);
      JLabel jl9= new JLabel("ANSWER in BASE 1");
      p.add(jl9);
      jts9= new JTextField();
      p.add(jts9);
      JLabel jl10= new JLabel("ANSWER in BASE 2");
      p.add(jl10);
      jts10= new JTextField();
      p.add(jts10);
      bs.addActionListener(this);
      return p;
   }

   JPanel MultiplicationPane(String s)
   {
      JPanel p = new JPanel();
      p.setLayout(new GridLayout(18,1));
      JLabel jl1= new JLabel("Enter Base 1");
      p.add(jl1);
      jtm1= new JTextField();
      p.add(jtm1);
      JLabel jl2= new JLabel("Enter Number 1");
      p.add(jl2);
      jtm2= new JTextField();
      p.add(jtm2);
      JLabel jl3= new JLabel(" ");
      p.add(jl3);
      JLabel jl4= new JLabel("Enter Base 2");
      p.add(jl4);
      jtm4= new JTextField();
      p.add(jtm4);
      JLabel jl5= new JLabel("Enter Number 2");
      p.add(jl5);
      jtm5= new JTextField();
      p.add(jtm5);
      JLabel jl6= new JLabel(" ");
      p.add(jl6);
      JLabel jl7= new JLabel(" ");
      p.add(jl7);
      bm= new JButton("MULTIPLY");
      p.add(bm);
      JLabel jl8= new JLabel();
      p.add(jl8);
      JLabel jl9= new JLabel("ANSWER in BASE 1");
      p.add(jl9);
      jtm9= new JTextField();
      p.add(jtm9);
      JLabel jl10= new JLabel("ANSWER in BASE 2");
      p.add(jl10);
      jtm10= new JTextField();
      p.add(jtm10);
      bm.addActionListener(this);
      return p;
   }

   JPanel DivisionPane(String s)
   {
      JPanel p = new JPanel();
      p.setLayout(new GridLayout(18,1));
      JLabel jl1= new JLabel("Enter Base 1");
      p.add(jl1);
      jtd1= new JTextField();
      p.add(jtd1);
      JLabel jl2= new JLabel("Enter Number 1");
      p.add(jl2);
      jtd2= new JTextField();
      p.add(jtd2);
      JLabel jl3= new JLabel(" ");
      p.add(jl3);
      JLabel jl4= new JLabel("Enter Base 2");
      p.add(jl4);
      jtd4= new JTextField();
      p.add(jtd4);
      JLabel jl5= new JLabel("Enter Number 2");
      p.add(jl5);
      jtd5= new JTextField();
      p.add(jtd5);
      JLabel jl6= new JLabel(" ");
      p.add(jl6);
      JLabel jl7= new JLabel(" ");
      p.add(jl7);
      bd= new JButton("DIVIDE");
      p.add(bd);
      JLabel jl8= new JLabel();
      p.add(jl8);
      JLabel jl9= new JLabel("ANSWER in BASE 1");
      p.add(jl9);
      jtd9= new JTextField();
      p.add(jtd9);
      JLabel jl10= new JLabel("ANSWER in BASE 2");
      p.add(jl10);
      jtd10= new JTextField();
      p.add(jtd10);
      bd.addActionListener(this);
      return p;
   }

   JPanel ANDPane(String s)
   {
      JPanel p = new JPanel();
      p.setLayout(new GridLayout(16,1));
      JLabel jl1= new JLabel("Enter Number 1");
      p.add(jl1);
      jtan1= new JTextField();
      p.add(jtan1);
      JLabel jl2= new JLabel("Enter Number 2");
      p.add(jl2);
      jtan2= new JTextField();
      p.add(jtan2);
      JLabel jl3= new JLabel(" ");
      p.add(jl3);
      JLabel jl7= new JLabel(" ");
      p.add(jl7);
      JLabel jl8= new JLabel(" ");
      p.add(jl8);
      ban= new JButton("AND");
      p.add(ban);
      JLabel jl9= new JLabel();
      p.add(jl9);
      JLabel jl10= new JLabel("ANSWER...!!!");
      p.add(jl10);
      jtan11= new JTextField();
      p.add(jtan11);
      ban.addActionListener(this);
      return p;
   }

   JPanel ORPane(String s)
   {
      JPanel p = new JPanel();
      p.setLayout(new GridLayout(16,1));
      JLabel jl1= new JLabel("Enter Number 1");
      p.add(jl1);
      jto1= new JTextField();
      p.add(jto1);
      JLabel jl2= new JLabel("Enter Number 2");
      p.add(jl2);
      jto2= new JTextField();
      p.add(jto2);
      JLabel jl3= new JLabel(" ");
      p.add(jl3);
      JLabel jl7= new JLabel(" ");
      p.add(jl7);
      JLabel jl8= new JLabel(" ");
      p.add(jl8);
      bo= new JButton("OR");
      p.add(bo);
      JLabel jl9= new JLabel();
      p.add(jl9);
      JLabel jl10= new JLabel("ANSWER...!!!");
      p.add(jl10);
      jto11= new JTextField();
      p.add(jto11);
      bo.addActionListener(this);
      return p;
   }

   JPanel NOTPane(String s)
   {
      JPanel p = new JPanel();
      p.setLayout(new GridLayout(15,1));
      JLabel jl1= new JLabel("Enter Number 1");
      p.add(jl1);
      jtn1= new JTextField();
      p.add(jtn1);
      JLabel jl3= new JLabel(" ");
      p.add(jl3);
      JLabel jl4= new JLabel(" ");
      p.add(jl4);
      JLabel jl5= new JLabel(" ");
      p.add(jl5);
      bn= new JButton("NOT");
      p.add(bn);
      JLabel jl6= new JLabel();
      p.add(jl6);
      JLabel jl7= new JLabel("ANSWER...!!!");
      p.add(jl7);
      jtn8= new JTextField();
      p.add(jtn8);
      bn.addActionListener(this);
      return p;
   }


     public void actionPerformed(ActionEvent e)
	{ 
	   
	   if(e.getSource()==bc)
	   {
		String s=jtc2.getText();
	        int b=Integer.parseInt(jtc1.getText()); 
		int bs=Integer.parseInt(jtc3.getText());
		String cno=cbase(s,b,bs);
		jtc8.setText(cno);
	   }
	   else if(e.getSource()==ba)
	   {
		String s1= jta2.getText();
		int b1=Integer.parseInt(jta1.getText());
		String cno1=cbase(s1,b1,10);
		float n1=Float.parseFloat(cno1);
		String s2= jta5.getText();
		int b2=Integer.parseInt(jta4.getText());
		String cno2=cbase(s2,b2,10);
		float n2=Float.parseFloat(cno2);
		float ns=n1+n2;
		String ss= new String(""+ns);
		String cnum1=cbase(ss,10,b1);
		String cnum2=cbase(ss,10,b2);
		jta9.setText(cnum1);
		jta10.setText(cnum2);
	   }
	   else if(e.getSource()==bs)
	   {
		String s1= jts2.getText();
		int b1=Integer.parseInt(jts1.getText());
		String cno1=cbase(s1,b1,10);
		float n1=Float.parseFloat(cno1);
		String s2= jts5.getText();
		int b2=Integer.parseInt(jts4.getText());
		String cno2=cbase(s2,b2,10);
		float n2=Float.parseFloat(cno2);
		float ns=n1-n2;
		String ss= new String(""+ns);
		String cnum1=cbase(ss,10,b1);
		String cnum2=cbase(ss,10,b2);
		jts9.setText(cnum1);
		jts10.setText(cnum2);
	   }
	   else if(e.getSource()==bm)
	   {
		String s1= jtm2.getText();
		int b1=Integer.parseInt(jtm1.getText());
		String cno1=cbase(s1,b1,10);
		float n1=Float.parseFloat(cno1);
		String s2= jtm5.getText();
		int b2=Integer.parseInt(jtm4.getText());
		String cno2=cbase(s2,b2,10);
		float n2=Float.parseFloat(cno2);
		float ns=n1*n2;
		String ss= new String(""+ns);
		String cnum1=cbase(ss,10,b1);
		String cnum2=cbase(ss,10,b2);
		jtm9.setText(cnum1);
		jtm10.setText(cnum2);
	   }
	   else if(e.getSource()==bd)
	   {
		String s1= jtd2.getText();
		int b1=Integer.parseInt(jtd1.getText());
		String cno1=cbase(s1,b1,10);
		float n1=Float.parseFloat(cno1);
		String s2= jtd5.getText();
		int b2=Integer.parseInt(jtd4.getText());
		String cno2=cbase(s2,b2,10);
		float n2=Float.parseFloat(cno2);
		float ns=n1/n2;
		String ss= new String(""+ns);
		String cnum1=cbase(ss,10,b1);
		String cnum2=cbase(ss,10,b2);
		jtd9.setText(cnum1);
		jtd10.setText(cnum2);
	   }
	   else if(e.getSource()==ban)
	   {
		String s1= jtan1.getText();
		String s2= jtan2.getText();
		String s3;
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		char[] c = new char[50];
		
		int min=30000,x=0,y=0;
		int s1l=s1.length(),s2l=s2.length();
		if(min<s1l)
		   min=s1l;
		else
		   min=s2l;
		for(int j=0;j<min;j++)
		{  
		   if(a[j]=='0' && b[j]=='0')
			c[j]='0';
		   else if(a[j]=='1' && b[j]=='0')
			c[j]='0';
		   else if(a[j]=='0' && b[j]=='1')
			c[j]='0';
		   else if(a[j]=='1' && b[j]=='1')
			c[j]='1';
		   else c[j]='.';
		}
		s3=new String(c);
		jtan11.setText(s3);
	   }
	   else if(e.getSource()==bo)
	   {
		String s1= jto1.getText();
		String s2= jto2.getText();
		String s3;
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		char[] c = new char[50];
		
		int min=30000,x=0,y=0;
		int s1l=s1.length(),s2l=s2.length();
		if(min<s1l)
		   min=s1l;
		else
		   min=s2l;
		for(int j=0;j<min;j++)
		{
		   if(a[j]=='0' && b[j]=='0')
			c[j]='0';
		   else if(a[j]=='1' && b[j]=='0')
			c[j]='1';
		   else if(a[j]=='0' && b[j]=='1')
			c[j]='1';
		   else if(a[j]=='1' && b[j]=='1')
			c[j]='1';
		   else c[j]='.';
		}
		s3=new String(c);
		jto11.setText(s3);
	   }
	   else if(e.getSource()==bn)
	   {
		String s1= jtn1.getText();
		char[] a=s1.toCharArray();
		int sl=s1.length();
		for( int j=0; j<sl;j++)
		{
		   if(a[j]=='0')
			a[j]='1';
		   else if(a[j]=='1')
			 a[j]='0';
		}
		String s2=new String(a);
		jtn8.setText(s2);
	   }
        }

     JTextField jtc1,jtc2,jtc3,jtc8,jta1,jta2,jta4,jta5,jta9,jta10,jts1,jts2,jts4,jts5,jts9,jts10,jtm1,jtm2,jtm4,jtm5,jtm9,jtm10,jtd1,jtd2,jtd4,jtd5,jtd9,jtd10,jtan1,jtan2,jtan11,jto1,jto2,jto11,jtn1,jtn8;
     JButton bc,ba,bm,bd,ban,bo,bn,bs;
     JTextField text1,text2,text3,text4,text5,text6,text7;
     public int flag1=0,flag2=0;


     public String cbase(String s , int b , int b1)
     {
	flag1=flag2=0;
	String[] ssplit=null;
	ssplit=s.split("\\.");
	char[] digit=ssplit[0].toCharArray();
	char[] digit1=ssplit[1].toCharArray();
	char[] digit2;
	digit2=new char[8];
	int[] digits;
	digits=new int[1000];
	String cno="";
	int r=0,no1=0;
	double no=0,no2=0;
	int i;
	char c;
	for(i=0;i<digit.length;i++)
	{
		digit[i]=convert(digit[i],b);
		if((int)digit[i]>=b)
		{
			flag1=1;
			break ;
		}
	}
	for(i=0;i<digit1.length;i++)
	{
		digit1[i]=convert(digit1[i],b);
		if((int)digit1[i]>=b)
		{
			flag2=1;
			break ;
		}
	}
	if(flag1==0 && flag2==0)
	{
		for(i=0;i<digit.length;i++)
		{
			no+=((double)digit[i]*(double )(Math.pow(b,(digit.length-1)-i)));
		}
		for(i=0;i<digit1.length;i++)
		{
			no+=((double)digit1[i]*(double)(Math.pow(b,-(i+1))));
		}
		if(b1==10)
		{
			cno=String.valueOf(no);
			return cno;
		}
	 	else
		{
		 no1=(int)no;
		 no2= no-(double )((int)no);
		 i=0;
		 do
		  {
			r=(int)(no2*b1);
			r=convertb(r);
			digit2[i]=(char)r;
			i++;
			no2=(double)(no2*b1)-(double)((int)(no2*b1));
		  }			
		 while((int)(no2*10)>0);
		 for(i=digit2.length-1;i>=0;i--)
		  {
			c=digit2[i];
			cno=c+cno;
		  }
		 char d='.';
		 cno=d+cno;
		 do
		  {
			r=no1%b1;
			r=convertb(r);
			c=(char)r;
			cno=c+cno;
			no1=no1/b1;
		  }  
		 while(no1>0);
		 return cno;
		}
		
	}
	return cno;
    }


    char convert(char digit,int b)
    {
	if((int)digit>47&&(int)digit<58)
	{
		digit=(char)((int)digit-48);
	}
	if((int)digit>64&&(int)digit<91)
	{
		digit=(char)((int)digit-55);
	}
	if((int)digit>96&&(int)digit<123)
	{
		digit=(char)((int)digit-61);
	}
	return digit;
	}
	
	int convertb(int r)
	{
 	  if(r>9&&r<36)
	  {	
		r+=55;
	  }
	  else if(r>35)
	  {
		r+=61;
	  }
	  else if(r<10)
	  {
		r+=48;				
	  }
	  return r;
	}
      


    public static void main(String... s)
    {
      JFrame frame = new JFrame("Generic Base Calculator");
      frame.addWindowListener(new WindowAdapter()
				  {
				    public void windowClosing(WindowEvent e)
				    {
				      System.exit(0);
				    }
				  });
      frame.getContentPane().add(new DLT());
      frame.setSize(650,400);
      frame.setVisible(true);
      
  }
}
