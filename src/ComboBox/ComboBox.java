package ComboBox;



	import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

	import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////
////////////////*******Arnold Rivers*****//////////////////////////////
///////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
	
public class ComboBox {

			
		HashMap<Integer, String> Months = new HashMap<Integer, String>();
		public static  String[] Days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		public static  int[] Years = {2009,2010,2011,2012,2013,2014,2015, 2016, 2017, 2018, 2019};
		
		
		
		
		private JFrame frame;

		
		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				ComboBox window = new ComboBox();
				window.frame.setVisible(true);
				}catch (Exception e) {
				e.printStackTrace();}}});}

		public ComboBox() {
			initialize();}

		
		private void initialize() {
			
			Scanner int_ints= new Scanner(System.in);
			frame = new JFrame();
			frame.setBounds(100, 100, 450, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			Months.put(1, "January");
			Months.put(2, "February");
			Months.put(3, "March");
			Months.put(4, "April");
			Months.put(5, "May");
			Months.put(6, "June");
			Months.put(7, "July");
			Months.put(8, "August");
			Months.put(9, "September");
			Months.put(10, "October");
			Months.put(11, "November");
			Months.put(12, "December");

			Calendar now= Calendar.getInstance();
			int month= now.get(Calendar.MONTH)+1;
			int day= now.get(Calendar.DATE);
			final int year= now.get(Calendar.YEAR);
			System.out.println(year);
			System.out.println(month);
			System.out.println(day);
			
			
			for(int i=1; i<Months.size()+1; i++){
			System.out.println(Months.get(i));
			}
			
			final JComboBox<String> comboBox = new JComboBox<String>();
			
		
			
			comboBox.setBounds(167, 54, 120, 20);
			frame.getContentPane().add(comboBox);
			
				for(int i=1; i<Months.size()+1; i++){
					comboBox.addItem(Months.get(i));
			
			}

			final JComboBox<String> combo_1 = new JComboBox<String>();
			combo_1.setBounds(167, 106, 60, 20);
			frame.getContentPane().add(combo_1);
				
				int i = 0;
				while ( i <Days.length){
					
					
					combo_1.addItem(Days[i]);
					i++;
			}
			
			
			JComboBox<Integer> comboBox_2 = new JComboBox<Integer>();
			comboBox_2.setBounds(167, 158, 90, 20);
			frame.getContentPane().add(comboBox_2);
			
			while (i<Years.length){
				comboBox_2.addItem(Years[i]);}
					i++;
				for (int w=1; w<Months.size()+1;w++){
					if (month== w){
						comboBox.setSelectedItem(Months.get(w));}}
		
				while ( i<Days.length){
					if (day== i){
						combo_1.setSelectedItem(Days[i-1]);}}
						i++;
		
				while (i<Years.length){
					if (year== Years[i]  ){
						comboBox_2.setSelectedItem(Years[i]);}}
						i++;
		
		
		
			
			comboBox.addActionListener(new ActionListener() {
				 
	            public void actionPerformed(ActionEvent e)
	            {
	            Object choosen = comboBox.getSelectedItem();
	            
	            if (choosen.toString()=="November" || choosen.toString()=="September" || choosen.toString()=="June" || choosen.toString()=="April"){
	                    combo_1.removeAllItems();
	                    for (int x=0; x<Days.length -1;x++){
	                    	combo_1.addItem(Days[x]);
	                    }
	                    }
	                  
	                            
	                    else if (choosen.toString()=="January" || choosen.toString()=="March" || choosen.toString()=="May"|| choosen.toString()=="July"  || choosen.toString()=="August"  || choosen.toString()=="October" || choosen.toString()=="December"){
	                                   combo_1.removeAllItems();
	                                    for (int x=0; x<Days.length;x++){
	                                    	combo_1.addItem(Days[x]);
	                                    }}  
	        
	             else if((year % 4 == 0) && year % 100 != 0){
	        	if(choosen.toString()=="February" ){
	               combo_1.removeAllItems();
	                 for (int x=0; x<Days.length -2;x++){
	                 combo_1.addItem(Days[x]);}}}
	            
	             else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
	            	if(choosen.toString()=="February" ){
	                    combo_1.removeAllItems();
	                    for (int x=0; x<Days.length -2;x++){
	                    	combo_1.addItem(Days[x]);}}}
	           
	             else{

	                      combo_1.removeAllItems();
	                      for (int x=0; x<Days.length -3;x++){
	                      	combo_1.addItem(Days[x]);}}} });      		
			
			JLabel lblmonth = new JLabel("Month");
			lblmonth.setBounds(111, 57, 46, 14);
			
			frame.getContentPane().add(lblmonth);
			JLabel lblyear = new JLabel("Year");
			lblyear.setBounds(111, 161, 46, 14);
			
			frame.getContentPane().add(lblyear);
			JLabel lblday = new JLabel("Day");
			lblday.setBounds(111, 109, 46, 14);
			
			frame.getContentPane().add(lblday);}}

