package com.laozhang.corejava.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

/**
 * @描述 聊天服务线程,实现群聊
 * @日期 May 17, 2013 10:26:07 AM
 * @作者 JSD1304
 */
public class TalkThread extends Thread {
	// 所有客户的Socket
	private List<Socket> clients;

	// 自己Socket
	private Socket self;

	public TalkThread(List<Socket> clients, Socket self) {
		this.clients = clients;
		this.self = self;
	}

	@Override
	public void run() {
		// 获取输入/输出流
		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new InputStreamReader(self.getInputStream()));
			// 读取数据
			String line = null;
			while ((line = br.readLine()) != null) {
				if (line.equals("[exit]")) {
					// 客户端退出
					System.out.printf("[%s]离开.\n", self.getInetAddress()
							.getHostAddress());
					// 把信息发送给所有的客户端
					String msg = "我下线了~";
					// 广播下线通知
					sendMsg(msg);
					// 移除客户端集合中下线的客户
					clients.remove(self);
					break;
				}
				sendMsg(line);
			}
		} catch (IOException e) {
			System.out.printf("[%s]离开.\n", self.getInetAddress()
					.getHostAddress());
			clients.remove(self);
		} finally {
			//客户端关闭连接
			try {
				self.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void sendMsg(String line) throws IOException {
		//创建输出流
		PrintWriter pw = null;
		String ip = self.getInetAddress().getHostAddress();
		line = "[" +ip+ "]说:" + line;
		//读取数据广播到每一个客户端
		for(Socket s : clients){
			pw = new PrintWriter(s.getOutputStream());
			pw.println(line);
			//刷新缓存
			pw.flush();
		}
	}
}
