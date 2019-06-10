package Frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Girdtext {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f1=new JFrame("王者荣耀英雄列表");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(700,500);
		f1.setLocation(200, 200);
		f1.setVisible(true);
		
		JPanel base=new JPanel();
		f1.setContentPane(base);
		BorderLayout border=new BorderLayout();
		base.setLayout(border);
		
		JPanel left=new JPanel();
		GridLayout gridleft=new GridLayout(5, 1, 5, 5);
		left.setLayout(gridleft);	
		left.setPreferredSize(new Dimension(100, 0));
		base.add(left,BorderLayout.WEST);
		JButton bleft[]=new JButton[5];

		for(int i=0;i<bleft.length;i++){
			bleft[i]=new JButton();
			left.add(bleft[i]);
		}
		
		
		JPanel mid=new JPanel();
		GridLayout grid=new GridLayout(5, 5, 5, 5);
		mid.setLayout(grid);		
		JButton bmid[]=new JButton[25];
		String path="s:/JAVA作业/英雄/";//s:/JAVA作业/英雄/
		ImageIcon image;
		
		for(int i=0;i<bmid.length;i++){
			bmid[i]=new JButton();
			image=new ImageIcon(path+(i+1)+".jpg");
			bmid[i].setIcon(image);
			mid.add(bmid[i]);
		}
		mid.setPreferredSize(new Dimension(500, 0));
		base.add(mid,BorderLayout.CENTER);
		
		
		JPanel right=new JPanel();
		GridLayout gridright=new GridLayout(5, 1, 5, 5);
		right.setLayout(gridright);	
		right.setPreferredSize(new Dimension(100, 0));
		base.add(right,BorderLayout.EAST);
		
		JButton bright[]=new JButton[5];
//		String path="e:/javatest/英雄/";
//		ImageIcon image;
		
		for(int i=0;i<bright.length;i++){
			bright[i]=new JButton();
//			image=new ImageIcon(path+(i+1)+".jpg");
//			b[i].setIcon(image);
			right.add(bright[i]);
		}	
		
	
		for(int i=0;i<bmid.length;i++){
		bmid[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton button=(JButton)e.getSource();
					bleft[0].setIcon(button.getIcon());
	
				}
			});
		
		}
		base.updateUI();
		
	}

}