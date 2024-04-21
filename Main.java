package Shapes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel(null);
	JPanel panel2 = new JPanel(null);
	JPanel panel3 = new JPanel(null);
	JComboBox combox1, combox2;
	JLabel label1 = new JLabel("AREA AND PERIMETER GENERATOR");
	JLabel label2 = new JLabel("Solve for: ");
	JLabel label3 = new JLabel("A = wl");
	JButton button1 = new JButton("Submit");
	JButton button2 = new JButton("Calculate");
	JTextField textfield1 = new JTextField();
	JTextField textfield2 = new JTextField();
	
	Main(){
		frame.setSize(900, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String Shapes[] = {"Rectangle", "Circle"};
		String Solve[] = {"Area", "Perimeter"};
	
		combox1 = new JComboBox(Shapes);
		combox1.setFont(new Font("Times New Roman", Font.PLAIN,15));
		combox1.setBounds(85, 70, 150, 20);
		combox1.addItemListener(null);
		
		combox2 = new JComboBox(Solve);
		combox2.setFont(new Font("Times New Roman", Font.PLAIN,15));
		combox2.setBounds(85, 100, 150, 20);
		combox2.addItemListener(null);
		
		button1.setBounds(240, 75, 80, 30);
		button1.addActionListener(this);
		
		button2.setBounds(700, 230, 100, 30);
		button2.addActionListener(this);
		
		panel1.setBounds(0, 0, 350, 700);
		panel1.setBackground(Color.cyan);
		
		panel2.setBounds(350, 0, 550, 700);
		panel2.setBackground(Color.green);
		
		panel3.setBounds(0, 0, 900, 50);
		panel3.setBackground(Color.MAGENTA);
		
		panel1.add(label2);
		panel1.add(combox1);
		panel1.add(combox2);
		panel1.add(button1);
		panel1.add(label3);
		panel2.add(button2);
		panel2.add(textfield1);
		panel2.add(textfield2);
		panel3.add(label1);
		
		label1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		label1.setBounds(60, 5, 900, 40);
		
		label2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label2.setBounds(15, 50, 100, 20);
		
		label3.setFont(new Font("Times New Roman", Font.PLAIN, 60));
		label3.setBounds(70, 200, 300, 70);

		frame.add(panel3);
		frame.add(panel1);
		frame.add(panel2);
		frame.setVisible(true);

	}
	
	public static void main(String[] args) {
		
		
		Main main = new Main();
//		Rectangle rectangle = new Rectangle(5,8);
//		System.out.println("Area of the Rectangle is " + rectangle.CalculateArea());
//		System.out.println("Perimeter of the Rectangle is " + rectangle.CalculatePerimeter());
//		
//		Circle circle = new Circle(4);
//		System.out.println("Area of the Circle is " + circle.CalculateArea());
//		System.out.println("Perimeter of the Circle is " + circle.CalculatePerimeter());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			
			String selectedShape = (String) combox1.getSelectedItem();
			String selectedSolve = (String) combox2.getSelectedItem();
			
			if (selectedShape.equals("Rectangle") && selectedSolve.equals("Area")) {
					label3.setText("A = wl");
					
					textfield1.setBounds(400, 100, 350, 30);
					textfield1.setText("Enter length");
					textfield1.setFont(new Font("Impact", Font.PLAIN,20));
					
					textfield2.setBounds(400, 155, 350, 30);
					textfield2.setText("Enter width");
					textfield2.setFont(new Font("Impact", Font.PLAIN,20));
					
			}
			else if(selectedShape.equals("Rectangle") && selectedSolve.equals("Perimeter")) {
					label3.setText("A = 2(w+l)");
					
					textfield1.setBounds(400, 100, 350, 30);
					textfield1.setText("Enter length");
					textfield1.setFont(new Font("Impact", Font.PLAIN,20));
					
					textfield2.setBounds(400, 155, 350, 30);
					textfield2.setText("Enter width");
					textfield2.setFont(new Font("Impact", Font.PLAIN,20));
			}
			
			else if(selectedShape.equals("Circle") && selectedSolve.equals("Area")) {
				label3.setText("A = πr2");
				
				textfield1.setBounds(400, 100, 350, 30);
				textfield1.setText("Enter radius");
				textfield1.setFont(new Font("Impact", Font.PLAIN,20));
				
				textfield2.setVisible(false);
			}
			else if(selectedShape.equals("Circle") && selectedSolve.equals("Perimeter")) {
				label3.setText("C = 2πr");
				
				textfield1.setBounds(400, 100, 350, 30);
				textfield1.setText("Enter radius");
				textfield1.setFont(new Font("Impact", Font.PLAIN,20));
				
				textfield2.setVisible(false);
			}
		}
		
		
	}
}


