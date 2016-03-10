package com.laozhang.corejava.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @描述 聊天室客户端
 * @日期 May 17, 2013 11:03:22 AM
 * @作者 JSD1304
 */
public class TalkClient {
	// 主机
	private String host;
	// 端口
	private int port;
	// 通道
	private Socket socket;

	// 构造方法
	public TalkClient(String host, int port) {
		this.host = host;
		this.port = port;
	}

	// 客户端连接服务器
	public void connect() {
		try {
			socket = new Socket(host, port);
			System.out.println("客户端连接成功!");
			beginTalk();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();// socket记得要关闭
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 开始聊天的方法
	public void beginTalk() throws IOException {
		BufferedReader input = null;
		final BufferedReader reply = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		PrintWriter pw = null;

		input = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(socket.getOutputStream());

		// 读取服务端的数据[启动一个线程来负责读取服务端发送过来的信息]
		new Thread(new Runnable() {
			public void run() {
				String msg = null;
				try {
					while ((msg = reply.readLine()) != null) {
						System.out.println(msg);
					}
				} catch (IOException e) {
					System.out.println("打印线程退出...");
				}
			}
		}).start();

		String line = null;
		System.out.println("你说:");
		while (true) {
			// 读取用户信息
			line = input.readLine();
			// 判断退出指令
			if (line.equals("[exit]")) {
				System.out.printf("[%s]下线了.", socket.getInetAddress()
						.getHostAddress());
				pw.println("[EXIT]");
				pw.flush();
				break;
			}
			//写入服务器
			pw.println(line);
			pw.flush();
		}
	}
	
	//客户端主入口
	public static void main(String[] args) {
		if(args.length < 1){
			System.err.println("IP地址不正确~");
			return;
		}
		String host = args[0];
		new TalkClient(host,18888).connect();
	}
}
