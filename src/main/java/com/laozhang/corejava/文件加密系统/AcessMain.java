package com.laozhang.corejava.文件加密系统;


import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AcessMain {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		Entrypt entrypt = new Entrypt();
		Server server = new Server();
		entrypt.setServer(server);
		server.setEntrypt(entrypt);
	}
}
