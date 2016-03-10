package com.laozhang.corejava.day16;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @描述 聊天室服务端
 * @日期 May 17, 2013 10:11:23 AM
 * @作者 JSD1304
 */
public class TalkServer {
	// 创建集合来存放客户端
	private List<Socket> clients;

	// 端口
	private int port;

	// 构造方法:初始化集合和端口
	public TalkServer(int port) {
		this.port = port;
		this.clients = new ArrayList<Socket>();
	}

	public void start() {
		System.out.println("聊天室程序启动...");
		try {
			ServerSocket ss = new ServerSocket(port);
			System.out.printf("服务器开启,正在监听[%s]端口...\n", port);
			while(true){
				// 调用accept()方法监听客户端的连接
				Socket socket = ss.accept();
				// 把客户端添加到集合中
				clients.add(socket);
				// 统计目前在线人数
				System.out.printf("目前在线人数为:[%s]\n",clients.size());
				//得到IP地址
				System.out.printf("\t新加入者IP为:[%s]\n",socket.getInetAddress());
				
				//创建一条正在聊天的服务线程,并且启动
				//new TalkThread(clients,socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//服务器的主入口
	public static void main(String[] args) {
		int port = 18888;
		new TalkServer(port).start();
	}
}
