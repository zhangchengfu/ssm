package com.laozhang.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;

/**
 * 文件、流、上传、下载等工具类
 * @author Lenovo
 *
 */
public class IOStreamUtils {
	
	/**
     * 将临时图片压缩后上传到指定目录下
     * @param tempFile 临时图片
     * @param targetFile 目标图片
     * @throws Exception 异常
     */
	public static void uploadFile(File tempFile, File targetFile) throws Exception {
		if (tempFile.exists()) {
			Image img = ImageIO.read(tempFile);
            //图片长度和高度
            int width = img.getWidth(null);
            int height = img.getHeight(null);
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            //图片压缩
            bufferedImage.getGraphics().drawImage(img.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
            FileOutputStream out = new FileOutputStream(targetFile);
            //上传文件
            ImageIO.write(bufferedImage, "jpg", out);
            out.flush();
            out.close();
		}
	}
}
