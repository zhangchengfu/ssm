package com.laozhang.corejava.day14.IO案例;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 照片的读取 {
	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入图片所在路径:");
		String file = console.nextLine();
		InputStream in = new FileInputStream(file);
		BufferedImage img = ImageIO.read(in);

		JFrame frame = new JFrame("图片");
		JPanel panel = new JPanel();
		JLabel label = new JLabel(new ImageIcon(img));
		panel.add(label);
		frame.setContentPane(panel);
		frame.setSize(600, 400);
		frame.setVisible(true);
	}
}
