package onePiece;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Sunny {
    //Establecer medidas
    static int width = 1280;
    static int height = 1200;
    
    //Establecer colores
    static Color orange = new Color(226,115,34);
    static Color dark_orange = new Color(197,84,24);
    static Color yellow = new Color(246,225,118);
    static Color dark_yellow = new Color(168,146,61);
    static Color sand = new Color(176,164,122);
    static Color light_sand = new Color(231,222,178);

    static Graphics2D g;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    // Definimos el tamaÃ±o del pixel y la matriz de colores
    private final static int PIXEL_SIZE = 40;

    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);   
        
        //Cabello Sombras
        fillRect(13,5,7,5, dark_orange);
        fillRect(14,3,5,2, dark_orange);
        drawHorizontalLine(15,17,2, dark_orange);
        putPixel(16,1,dark_orange);
        fillRect(22,6,5,5, dark_orange);
        fillRect(23,3,3,3, dark_orange);
        putPixel(24,2,dark_orange);
        putPixel(20,9,dark_orange);
        drawHorizontalLine(23,24,12, dark_orange);
        drawVerticalLine(8, 10, 21, dark_orange);
        drawHorizontalLine(22,25,11, dark_orange);
        fillRect(24,13,4,7, dark_orange);
        drawVerticalLine(13,18, 28, dark_orange);
        drawVerticalLine(12,17, 29, dark_orange);
        drawVerticalLine(12,16, 30, dark_orange);
        fillRect(8,19,16,2, dark_orange);
        fillRect(4,13,4,7, dark_orange);
        drawVerticalLine(12,16, 1, dark_orange);
        drawVerticalLine(12,17, 2, dark_orange);
        drawVerticalLine(13,18, 3, dark_orange);
        fillRect(7,12,2,2, dark_orange);
        fillRect(6,3,3,9, dark_orange);
        putPixel(7,2,dark_orange);
        putPixel(12,9,dark_orange);
        drawVerticalLine(6,10, 5, dark_orange);
        drawVerticalLine(5,11, 9, dark_orange);
        drawVerticalLine(7,10, 10, dark_orange);
        drawVerticalLine(8,9, 11, dark_orange);
        drawHorizontalLine(8,24,21, dark_orange);
        drawHorizontalLine(7,25,22, dark_orange);
        drawHorizontalLine(6,26,23, dark_orange);
        drawHorizontalLine(5,26,24, dark_orange);
        drawHorizontalLine(4,14,25, dark_orange);
        drawHorizontalLine(3,13,26, dark_orange);
        drawHorizontalLine(2,11,27, dark_orange);
        drawHorizontalLine(3,9,28, dark_orange);
        drawHorizontalLine(17,27,25, dark_orange);
        drawHorizontalLine(18,28,26, dark_orange);
        drawHorizontalLine(20,29,27, dark_orange);
        drawHorizontalLine(22,28,28, dark_orange);

        //Cabello 
        drawVerticalLine(13, 16, 2, orange);
        drawVerticalLine(14, 17, 3, orange);
        fillRect(4,14,2,5, orange);
        drawVerticalLine(6, 10, 6, orange);
        drawVerticalLine(3,9, 7, orange);
        drawVerticalLine(5,9, 8, orange);
        drawVerticalLine(7,8, 9, orange);
        putPixel(10,8,orange);
        drawVerticalLine(5,6, 14, orange);
        drawVerticalLine(3,7, 15, orange);
        drawVerticalLine(2,7, 16, orange);
        drawVerticalLine(3,8, 17, orange);
        drawVerticalLine(5,8, 18, orange);
        drawVerticalLine(9,10, 21, orange);
        drawVerticalLine(8,10, 22, orange);
        drawVerticalLine(6,10, 23, orange);
        drawVerticalLine(3,10, 24, orange);
        drawVerticalLine(6,9, 25, orange);
        fillRect(24,14,6,3, orange);
        drawHorizontalLine(25, 28, 17, orange);
        putPixel(23,13,orange);
        putPixel(29,13,orange);
        drawHorizontalLine(6, 8, 24, orange);
        drawHorizontalLine(5,9, 25, orange);
        drawHorizontalLine(4,11, 26, orange);
        drawHorizontalLine(3,9, 27, orange);
        putPixel(7,23,orange);
        drawHorizontalLine(22,23, 21, orange);
        drawHorizontalLine(21,24, 22, orange);
        drawHorizontalLine(21,25, 23, orange);
        drawHorizontalLine(21,25, 24, orange);
        drawHorizontalLine(22,26, 25, orange);
        drawHorizontalLine(23,27, 26, orange);
        drawHorizontalLine(24,28, 27, orange);

        //Cabeza
        fillRect(8,14,16,5, dark_yellow);
        drawHorizontalLine(13, 19, 9, dark_yellow);
        drawHorizontalLine(11, 20, 10, dark_yellow);
        drawHorizontalLine(10, 21, 11, dark_yellow);
        drawHorizontalLine(9, 22, 12, dark_yellow);
        drawHorizontalLine(9, 10, 13, dark_yellow);
        fillRect(9,19,3,2, dark_yellow);
        putPixel(22,20,dark_yellow);
        drawHorizontalLine(9, 21, 21, dark_yellow);
        drawHorizontalLine(11, 20, 22, dark_yellow);
        drawHorizontalLine(14, 17, 23, dark_yellow);
        fillRect(13,10,7,11, yellow);
        drawVerticalLine(11, 20, 12, yellow);
        drawVerticalLine(13, 18, 11, yellow);
        drawVerticalLine(11, 20, 20, yellow);
        drawVerticalLine(12, 20, 21, yellow);
        drawVerticalLine(13, 19, 22, yellow);
        drawHorizontalLine(14,19, 21, yellow);
        drawHorizontalLine(15,18, 22, yellow);
        
        //Ojos
        fillRect(10,15,2,2, Color.black);
        drawVerticalLine(15,16,9, Color.white);
        drawVerticalLine(15,16,12, Color.white);
        drawHorizontalLine(10,11,14, Color.white);
        drawHorizontalLine(10,11,17, Color.white);
        fillRect(20,15,2,2, Color.black);
        drawVerticalLine(15,16,19, Color.white);
        drawVerticalLine(15,16,22, Color.white);
        drawHorizontalLine(20,21,14, Color.white);
        drawHorizontalLine(20,21,17, Color.white);

        //Boca
        fillRect(14,16,4,5, sand);
        drawVerticalLine(17, 19, 13, sand);
        drawVerticalLine(16, 18, 17, light_sand);
        drawVerticalLine(17, 19, 18, light_sand);
        fillRect(15,17,2,2, Color.black);
        drawHorizontalLine(14,17,19, Color.black);
        putPixel(13,18,Color.black);
        putPixel(18,18,Color.black);

        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("D:/Amigu/Universidad/ProgramacionOrientada/onePiece/sunny.jpg"));
            System.out.println("Sunny has been printed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawVerticalLine(int a, int b, int x, Color c){
    	for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
        for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    
    private static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    private static void drawBackground(int size, Color c) {
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }

    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }
}
