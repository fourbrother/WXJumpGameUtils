package cn.wjdiankong.wxjump;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PhoneImagePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private Image image=null; 
	
	@Override
	public void paint(Graphics g){
		try {
			Utils.screen();
			//这个路径需要自己设定
			image = ImageIO.read(new File("D:\\jump.png"));
			//这个图像展示大小需要自己设定，这里用的是Pixel手机1080*1920，我缩减一半
			g.drawImage(image, 0, 0, 540, 960, null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
