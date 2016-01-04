package com.laozhang.util;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;

import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifDirectory;

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
	
	/**
     * 将临时图片压缩后上传到指定目录下
     *
     * @param tempFile 临时图片
     * @param targetFile 目标图片
     * @param isThum 是否缩略图
     * @throws Exception 异常
     */
    public static void uploadFile(File tempFile, File targetFile, boolean isThum) throws Exception {
    	if (tempFile.exists()) {
    		 int degree = getRotateAngleForPhoto(tempFile);
             int swidth = 0; // 旋转后的宽度
             int sheight = 0; // 旋转后的高度
             int x; // 原点横坐标
             int y; // 原点纵坐标
      
             BufferedImage bi = ImageIO.read(tempFile); // 读取该图片
             // 处理角度--确定旋转弧度
             degree = degree % 360;
             if (degree < 0)
                 degree = 360 + degree;// 将角度转换到0-360度之间
             double theta = Math.toRadians(degree);// 将角度转为弧度
      
             // 确定旋转后的宽和高
             if (degree == 180 || degree == 0 || degree == 360) {
                 swidth = bi.getWidth();
                 sheight = bi.getHeight();
             } else if (degree == 90 || degree == 270) {
                 sheight = bi.getWidth();
                 swidth = bi.getHeight();
             } else {
                 swidth = (int) (Math.sqrt(bi.getWidth() * bi.getWidth()
                         + bi.getHeight() * bi.getHeight()));
                 sheight = (int) (Math.sqrt(bi.getWidth() * bi.getWidth()
                         + bi.getHeight() * bi.getHeight()));
             }
      
             x = (swidth / 2) - (bi.getWidth() / 2);// 确定原点坐标
             y = (sheight / 2) - (bi.getHeight() / 2);
      
             BufferedImage spinImage = new BufferedImage(swidth, sheight,
                     bi.getType());
             // 设置图片背景颜色
             Graphics2D gs = (Graphics2D) spinImage.getGraphics();
             gs.setColor(Color.white);
             gs.fillRect(0, 0, swidth, sheight);// 以给定颜色绘制旋转后图片的背景
      
             AffineTransform at = new AffineTransform();
             at.rotate(theta, swidth / 2, sheight / 2);// 旋转图象
             at.translate(x, y);
             AffineTransformOp op = new AffineTransformOp(at,
                     AffineTransformOp.TYPE_BICUBIC);
             spinImage = op.filter(bi, spinImage);
             FileOutputStream out = new FileOutputStream(targetFile);
             ImageIO.write(spinImage, "jpg", out); // 保存图片
             out.flush();
             out.close();
    	}
    }
    
    public static int getRotateAngleForPhoto(File file) throws Exception{
    	int angle = 0;
        Metadata metadata = JpegMetadataReader.readMetadata(file);
        Directory directory = metadata.getDirectory(ExifDirectory.class);
        if(directory.containsTag(ExifDirectory.TAG_ORIENTATION)){
            
            //Exif信息中方向
            int orientation = directory.getInt(ExifDirectory.TAG_ORIENTATION);
            
            //原图片的方向信息
            if(6 == orientation ){
                //6旋转90
                angle = 90;
            } else if( 3 == orientation){
                //3旋转180
                angle = 180;
            } else if( 8 == orientation){
                //8旋转270
                angle = 270;
            }
        }
        return angle;
    }
    
}

