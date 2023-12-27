import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Date212GUI extends JFrame{
	public Date212GUI(){
		initializeGUI();
	} //no-argument constructor

	private void initializeGUI(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(600, 300);
        this.setLocation(100, 100);
        this.setTitle("Date Display");
        this.getContentPane();
        this.setLayout(new GridLayout(0,2));
	} //establishes GUI
} //class Date212GUI