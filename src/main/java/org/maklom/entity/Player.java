package org.maklom.entity;

import org.maklom.GamePanel;
import org.maklom.KeyHandler;

import java.awt.*;

public class Player extends Entity {
    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH)    {
        this.gp = gp;
        this.keyH = keyH;

        setDefualtValues();
    }
    public void setDefualtValues()  {

        x = 100;
        y = 100;
        speed = 4;
    }
    public void update()    {
        if(keyH.upPressed)  {
            y -= speed;
        }
        else if(keyH.downPressed)   {
            y += speed;
        }
        else if(keyH.leftPressed)   {
            x -= speed;
        }
        else if(keyH.rightPressed)  {
            x += speed;
        }

    }
    public void draw(Graphics2D g2)  {
        g2.setColor(Color.white);


        g2.fillRect(x, y, gp.tileSize, gp.tileSize);


    }
}
// C:\Users\AxelEngan\IdeaProjects\test2\src\main\resources\gubbe.png
// Image img = ImageIO.read(getClass().getResourceAsStream("/gubbe.png"));