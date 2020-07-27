package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph {

	private String imageName;
	private int width;
	private int height;
	
	private boolean needImage = true;
	private boolean gotImage = false;
	private static BufferedImage image;

	ImagePolymorph(int x, int y, int width, int height, String imageName) {
		super(x, y);
		this.imageName = imageName;
		this.width = width;
		this.height = height;
		loadImage(getImageName());
	}

	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int n) {
		width = n;
	}
	
	public void setHeight(int n) {
		height = n;
	}
	
	public String getImageName() {
		return imageName;
	}
	
	public void setImageName(String n) {
		imageName = n;
	}
	
	public boolean getNeedImage() {
		return needImage;
	}
	
	public void setNeedImage(boolean n) {
		needImage = n;
	}
	
	public boolean getGotImage() {
		return gotImage;
	}
	
	public void setGotImage(boolean n) {
		gotImage = n;
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
	public void setImage(BufferedImage n) {
		image = n;
	}
	
	void loadImage(String imageFile) {
	    if (getNeedImage() == true) {
	        try {
	            setImage(ImageIO.read(this.getClass().getResourceAsStream(imageFile)));
		    setGotImage(true);
	        } catch (Exception e) {
	            
	        }
	        setNeedImage(false);
	    }
	}
	
	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(getImage(), getX(), getY(), getWidth(), getHeight(), null);
	}

}
