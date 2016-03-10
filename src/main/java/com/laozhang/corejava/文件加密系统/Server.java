package com.laozhang.corejava.文件加密系统;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;

public class Server {
	private Entrypt entrypt;

	private File file;

	public void setEntrypt(Entrypt entrypt) {
		this.entrypt = entrypt;
	}

	public void selectFile() {
		JFileChooser fileChooser = new JFileChooser();
		int val = fileChooser.showOpenDialog(entrypt);
		if (val == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			entrypt.setPath(file.getAbsolutePath());
		}
	}

	public void entrypt() {
		if (file != null) {
			entrypt.setFalse();// �����м����ˣ���ô���ܽ�����������
			entrypt.setOpEnable();// �����ý��ܴ��Ľ��������밴ťΪ��ɫ
			try {
				InputStream in = new FileInputStream(file);
				String str = file.getAbsolutePath();
				String fileName = file.getName();
				int end = str.length() - fileName.length();
				String st = str.substring(0, end);
				File fileA = new File(st + "�Ѽ���" + fileName);
				OutputStream out = new FileOutputStream(fileA);
				byte[] bt = new byte[1024 * 500];
				int b;
				while ((b = in.read(bt)) != -1) {
					arithmatic(bt);
					out.write(bt, 0, b);
				}
				in.close();
				if (!entrypt.getIsSelect()) {
					file.delete();
				}
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	// ���ܷ���
	public void openScret() {
		if (file != null) {
			entrypt.setFalse();// �����м����ˣ���ô���ܽ�����Ϊ������
			entrypt.setClEnable();// �������ü��ܰ�ť����������ı���Ϊ��ɫ
			try {
				InputStream in = new FileInputStream(file);
				String str = file.getAbsolutePath();
				String fileName = file.getName();
				int end = str.length() - fileName.length();
				String st = str.substring(0, end);
				File fileA = new File(st + "�ѽ���" + fileName);
				OutputStream out = new FileOutputStream(fileA);
				byte[] bt = new byte[1024 * 500];
				int b;
				while ((b = in.read(bt)) != -1) {
					openScret(bt);
					out.write(bt, 0, b);
				}
				in.close();
				if (!entrypt.getIsSelect()) {
					file.delete();
				}
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	// �����㷨
	// �������ӿ������κε��ַ�
	public void arithmatic(byte[] bt) {
		String str = entrypt.getCloseText();
		int se = str.length();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += (byte) ((str.charAt(i) + i) ^ 10);
		}
		byte e = (byte) (sum / str.length());
		for (int i = 0; i < bt.length; i++) {
			bt[i] = (byte) (((bt[i] - se) ^ e ^ 11));
		}
	}

	// �����㷨
	public void openScret(byte[] bt) {
		String str = entrypt.getOpenText();
		int se = str.length();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += (byte) ((str.charAt(i) + i) ^ 10);
		}
		byte e = (byte) (sum / str.length());
		for (int i = 0; i < bt.length; i++) {
			bt[i] = (byte) (((bt[i] ^ 11 ^ e) + se));
		}
	}
}
