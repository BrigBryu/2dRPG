package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
    //SCREEN SETTINGS
    final int originalTileSize = 16; //16x16 tile
    final int scale = 3;
    public final int tileSize = originalTileSize * scale; // 48x48 pixel tile
    public final int maxScreenCol = 16;
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    public int screenHeight = tileSize * maxScreenRow; // 576 pixels

    //WORLD SETTINGS
    public final int maxWorldCol = 50; //Change depending on map size
    public final int maxWorldRow = 50; //Change depending on map size
    public final int worldWidth = tileSize * maxWorldRow;
    public final int worldHeight = tileSize * maxWorldCol;

    //FPS
    int FPS = 60;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); // makes rendering better
        //needs key handler class
        this.setFocusable(true); //GamePanel can be "focused" to receive key input
    }

    @Override
    public void run() {

    }
}
