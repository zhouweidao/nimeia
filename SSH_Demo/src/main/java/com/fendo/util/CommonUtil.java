package com.fendo.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.imageio.ImageIO;
/**
 * 常用工具类
 * @author 唯道
 *
 */
public final class CommonUtil {
	private CommonUtil() {

		throw new AssertionError();
	
	}
	/**
	 * 按指定的高和宽压缩图片成png格式
	 * @param inputStream  图片输入流
	 * @param file  目标文件
	 * @param width  压缩后的宽度
	 * @param height  压缩后的高度
	 * @throws IOException  读写文件时可能引发IOExcption异常
	 */
	
	/**
	 * 用来判断一组纯数字字符串是否包含字母
	 * @param str
	 * @return
	 */
	public static boolean strIsOnlyNum(String str){
		if(str != null){
		char[] charArray = str.toCharArray();
		for(int i = 0; i<charArray.length; i++){
			if(charArray[i] >='a' && charArray[i] <= 'z' || charArray[i] >= 'A' && charArray[i] <= 'Z'){
				return false;
			}
		}
		return true;
		}else{
			return false;
		}
	}
	
	public static void compressImage(InputStream inputStream,File file,int width,int height) throws IOException{
		BufferedImage oldimage = ImageIO.read(inputStream);
		BufferedImage newimage = new BufferedImage(width, height,1);
		newimage.getGraphics().drawImage(oldimage, 0, 0, width,height,null);
		ImageIO.write(newimage, "PNG", file);
	}
	
	/**
	 * 获取文件名中的后缀名
	 * @param filename 文件名
	 * @return   包括点在内的后缀
	 */
	public static String getFilenameSuffix(String filename){
		int index = filename.lastIndexOf(".");
		return (index > 0 && index < filename.length()-1) ? filename.substring(index) : "";
	}
	/**
	 * 返回随机的唯一UUID作为文件名
	 * @return
	 */
	public static String getUniqueFileName(){
		return UUID.randomUUID().toString();
	}
	
	/**
	 * 格式化时间日期
	 * @param pattern  时间日期样式
	 * @param str  	时间日期字符串
	 * @return   转换后的日期
	 */
	public static Date stringToDate(String pattern,String str){
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		try {
			return format.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
	/**
	 * 将时间解析成字符串
	 * @param pattern   时间格式
	 * @param date    时间
	 * @return  字符串
	 */
	public static String dateToString(String pattern,Date date){
		SimpleDateFormat format = new SimpleDateFormat(pattern);
			return format.format(date);
	}
	
	public static Integer doubleToInteger(Double doublenum){
		 String s1 = String.valueOf(doublenum);
		 String s2 = s1.split("[.]")[0];
		 return Integer.parseInt(s2); 
	}

}
