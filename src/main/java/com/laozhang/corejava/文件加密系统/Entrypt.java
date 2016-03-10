package com.laozhang.corejava.文件加密系统;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Entrypt extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1180825618590603685L;

	private Server server;

	private boolean startOpen = true;

	public void setServer(Server server) {
		this.server = server;
	}

	public Entrypt() {
		init();
	}

	// 初始化
	private void init() {
		setTitle("文件加密系统");
		setSize(700, 400);
		setContentPane(contentPane());
		setResizable(false);
		centerShow(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 创建主面板
	private JPanel contentPane() {
		JPanel p = new JPanel(new BorderLayout());
		p.add(BorderLayout.NORTH, checkPane());
		p.add(BorderLayout.CENTER, centerPane());
		p.setBorder(new EmptyBorder(40, 0, 0, 0));
		p.setBackground(Color.gray);
		return p;
	}

	// 创建中心面板
	private JPanel centerPane() {
		JPanel p = new JPanel(new BorderLayout());
		p.add(BorderLayout.NORTH, filePane("文件名：", "浏览"));
		p.add(BorderLayout.SOUTH, genePane());
		p.setBorder(new EmptyBorder(20, 80, 60, 80));
		return p;
	}

	// 创建加密解密因子面板
	private JButton ent;
	private JButton ont;

	private JPanel genePane() {
		JPanel p = new JPanel(new GridLayout(3, 1, 0, 8));
		p.add(checkBoxPane());
		ent = willPane("加密因子：", "加密", p);
		ont = willPane("解密因子：", "解密", p);
		ent.setEnabled(false);
		ont.setEnabled(false);
		p.setBorder(new EmptyBorder(50, 105, 0, 105));
		ent.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				server.entrypt();
			}
		});
		ont.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				server.openScret();
			}
		});

		return p;
	}

	private JPanel checkBoxPane() {
		JPanel p = new JPanel();
		JLabel op = new JLabel("开始解密");
		final JCheckBox jc = new JCheckBox();
		JLabel cl = new JLabel("开始加密");
		final JCheckBox jcs = new JCheckBox();
		p.add(cl);
		p.add(jcs);
		p.add(op);
		p.add(jc);
		jc.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (jc.isSelected() && startOpen) {
					ont.setEnabled(true);
					openScret.setEditable(true);
				} else {
					ont.setEnabled(false);
					openScret.setEditable(false);
				}
			}
		});

		jcs.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (jcs.isSelected() && startOpen) {
					closeScret.setEditable(true);
					ent.setEnabled(true);
				} else {
					closeScret.setEditable(false);
					ent.setEnabled(false);
				}
			}
		});
		return p;
	}

	private JTextField openScret;
	private JTextField closeScret;

	private JButton willPane(String lb, String btns, JPanel pane) {
		JPanel p = new JPanel(new BorderLayout(10, 10));
		JLabel lab = new JLabel(lb);
		JTextField jt = new JTextField();
		jt.setEditable(false);
		if (btns.equals("解密")) {
			openScret = jt;
		} else if (btns.equals("加密")) {
			closeScret = jt;
		}
		JButton btn = new JButton(btns);
		p.add(BorderLayout.WEST, lab);
		p.add(BorderLayout.CENTER, jt);
		p.add(BorderLayout.EAST, btn);
		pane.add(p);
		return btn;
	}

	// 创建文件选择面板
	private JTextField fileText;

	private JPanel filePane(String lb, String btns) {
		JPanel p = new JPanel(new BorderLayout(10, 10));
		JLabel lab = new JLabel(lb);
		fileText = new JTextField();
		fileText.setEditable(false);
		fileText.setBackground(Color.white);
		JButton btn = new JButton(btns);
		p.add(BorderLayout.WEST, lab);
		p.add(BorderLayout.CENTER, fileText);
		p.add(BorderLayout.EAST, btn);

		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				server.selectFile();
			}
		});
		return p;
	}

	// 选择框面板
	private JPanel checkPane() {
		JPanel p = new JPanel(new BorderLayout());
		Font font = new Font("", Font.BOLD, 48);
		JLabel lab = new JLabel("文件加密系统", JLabel.CENTER);
		lab.setFont(font);
		p.add(BorderLayout.CENTER, lab);
		p.add(BorderLayout.SOUTH, chPane());
		return p;
	}

	private JCheckBox check;

	private JPanel chPane() {
		JPanel p = new JPanel();
		JLabel ch = new JLabel("是否保留原文件：");
		check = new JCheckBox();
		p.add(ch);
		p.add(check);
		return p;
	}

	public void setPath(String path) {
		fileText.setText(path);
	}

	public String getOpenText() {
		return openScret.getText().trim();
	}

	public String getCloseText() {
		return closeScret.getText().trim();
	}

	public boolean getIsSelect() {
		if (check.isSelected()) {
			return true;
		}
		return false;
	}

	public void centerShow(Window frame) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension sizeScr = tk.getScreenSize();
		int x = (int) (sizeScr.getWidth() - frame.getWidth()) / 2;
		int y = (int) (sizeScr.getHeight() - frame.getHeight()) / 2;
		frame.setLocation(x, y);
	}

	public void setFalse() {
		startOpen = false;
	}

	public void setOpEnable() {
		ont.setEnabled(false);
		openScret.setEditable(false);
	}

	public void setClEnable() {
		closeScret.setEditable(false);
		ent.setEnabled(false);
	}
}
