package entities;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import core.Entity;
import input.KeyHandler;
import main.GamePanel;

public class Player extends Entity{
	
	GamePanel gp;
	KeyHandler keyH;
	
	public Player(GamePanel gp, KeyHandler keyH) {
		this.gp = gp;
		this.keyH = keyH;
		
		setDefaultValues();
		getPlayerImage();
	}
	
	public void setDefaultValues() {
		
		x = 100;
		y = 100;
		speed = 4;
		direction = "front";
	}
	
	public void getPlayerImage() {
		try {
			
			front1 = ImageIO.read(getClass().getResourceAsStream("/player/sprite-front-front.png"));
			front2 = ImageIO.read(getClass().getResourceAsStream("/player/sprite-front-left.png"));
			front3 = ImageIO.read(getClass().getResourceAsStream("/player/sprite-front-right.png"));
			left1 = ImageIO.read(getClass().getResourceAsStream("/player/sprite-left-front.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/player/sprite-left-left.png"));
			left3 = ImageIO.read(getClass().getResourceAsStream("/player/sprite-left-right.png"));
			right1 = ImageIO.read(getClass().getResourceAsStream("/player/sprite-right-front.png"));
			right2 = ImageIO.read(getClass().getResourceAsStream("/player/sprite-right-left.png"));
			right3 = ImageIO.read(getClass().getResourceAsStream("/player/sprite-right-right.png"));
			back1 = ImageIO.read(getClass().getResourceAsStream("/player/sprite-back-front.png"));
			back2 = ImageIO.read(getClass().getResourceAsStream("/player/sprite-back-left.png"));
			back3 = ImageIO.read(getClass().getResourceAsStream("/player/sprite-back-right.png"));

			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void update() {
		if(keyH.upPressed == true || keyH.downPressed == true ||
				keyH.leftPressed == true || keyH.rightPressed == true) {
			if(keyH.upPressed == true) {
				direction = "back";
				y -= speed;
			}
			else if(keyH.downPressed == true) {
				direction = "front";
				y += speed;
			}
			else if(keyH.leftPressed == true) {
				direction = "left";
				x -= speed;
			}
			else if(keyH.rightPressed == true) {
				direction = "right";
				x += speed;
			}
			
			//TODO Arrumar a sincronia disso
			
			spriteCounter++;
			if(spriteCounter > 10) {
				if(spriteNum == 1) {
					spriteNum = 3;
				}
				else if(spriteNum == 2) {
					spriteNum = 1;
				}
				else if(spriteNum == 3) {
					spriteNum = 2;
				}
				spriteCounter = 0;
			}
		}
		

	}
	
	public void draw(Graphics2D g2) {
		BufferedImage image = null;
		
		switch(direction) {
		case "front":
			if(spriteNum == 1) {
				image = front1;
			}
			if(spriteNum == 2) {
				image = front2;
			}
			if(spriteNum == 3) {
				image = front3;
			}
			break;
		case "back":
			if(spriteNum == 1){
				image = back1;
			}
			if(spriteNum == 2){
				image = back2;
			}
			if(spriteNum == 3){
				image = back3;
			}
			break;
		case "left":
			if(spriteNum == 1) {
				image = left1;
			}
			if(spriteNum == 2) {
				image = left2;
			}
			if(spriteNum == 3) {
				image = left3;
			}
			break;
		case "right":
			if(spriteNum == 1) {
				image = right1;
			}
			if(spriteNum == 2) {
				image = right2;
			}
			if(spriteNum == 3) {
				image = right3;
			}
			break;
		}
		
		g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
	}
}
