package com.laozhang.corejava.day14.IO案例;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;

import com.laozhang.corejava.文件工具类.IOUtils;

public class 自制签名图片 {
	public static void main(String[] args) throws IOException {
		String file = "picture.jpg";
		BufferedImage img = new BufferedImage(100, 50,
				BufferedImage.TYPE_4BYTE_ABGR);
		String str = "By SYHJJ";
		Graphics2D g = (Graphics2D) img.getGraphics();
		g.setColor(Color.BLUE);
		g.drawString(str, 30, 40);
		OutputStream out = new FileOutputStream(file);
		ImageIO.write(img, "jpg", out);
		IOUtils.print(file);
	}
}
