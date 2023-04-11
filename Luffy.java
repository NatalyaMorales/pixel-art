package onePiece;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Luffy {
    //Establecer medidas
    static int width = 1120;
    static int height = 1520;
    
    //Establecer colores
    static Color piel = new Color(254,203,146);
    static Color yellow = new Color(254,234,59);
    static Color darkYellow = new Color(253,192,6);
    static Color blue = new Color(62,80,180);
    static Color light_blue = new Color(180,226,244);
    static Color red = new Color(243,65,53);

    static Graphics2D g;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    // Definimos el tamaÃ±o del pixel y la matriz de colores
    private final static int PIXEL_SIZE = 40;

    public static void paint() {
    	drawBackground(PIXEL_SIZE, light_blue);   
        //Delineado negro  
        drawHorizontalLine(11, 18, 1, Color.black);
        drawHorizontalLine(9, 20, 2, Color.black);
        drawHorizontalLine(8, 21, 3, Color.black);
        drawHorizontalLine(6, 22, 4, Color.black);
        fillRect(5, 5,18,15, Color.black);
        drawVerticalLine(5, 15, 4, Color.black);
        drawVerticalLine(6, 12, 3, Color.black);
        drawVerticalLine(7, 10, 2, Color.black);
        drawVerticalLine(12, 13, 2, Color.black); 
        drawVerticalLine(8, 9, 1, Color.black);
        drawVerticalLine(5, 18, 23, Color.black);
        drawVerticalLine(7, 18, 24, Color.black);
        drawVerticalLine(11, 17, 25, Color.black);
        drawVerticalLine(13, 16, 26, Color.black);
        putPixel(27,14,Color.black);
        drawHorizontalLine(6, 20, 20, Color.black);
        drawHorizontalLine(7, 19, 21, Color.black);
        drawHorizontalLine(9, 17, 22, Color.black);
        fillRect(10, 23,9,9, Color.black);
        drawVerticalLine(25, 31, 19, Color.black);
        drawVerticalLine(27, 30, 20, Color.black);
        drawVerticalLine(28, 29, 21, Color.black);
        drawVerticalLine(24, 31, 9, Color.black);
        drawVerticalLine(25, 30, 8, Color.black);
        drawVerticalLine(26, 29, 7, Color.black);
        drawVerticalLine(27, 28, 6, Color.black);
        fillRect(7, 32,4,4, Color.black);
        drawVerticalLine(33, 35, 6, Color.black);
        drawVerticalLine(32, 34, 11, Color.black);
        putPixel(5,34,Color.black);
        drawHorizontalLine(14, 18,32, Color.black);
        fillRect(15, 33,4,5, Color.black);
        drawVerticalLine(34, 36, 14, Color.black);
        drawVerticalLine(35, 36, 19, Color.black);

        //Sombrero
        drawHorizontalLine(11, 18, 2, darkYellow);
        drawHorizontalLine(9, 20, 3, darkYellow);
        drawHorizontalLine(17, 21, 4, darkYellow);
        drawHorizontalLine(19, 22, 5, darkYellow);
        drawHorizontalLine(21, 22, 6, darkYellow);
        drawHorizontalLine(22,23, 7, darkYellow);
        putPixel(23,8,darkYellow);
        drawHorizontalLine(13, 16, 4, red);
        drawHorizontalLine(17, 18, 5, red);
        drawHorizontalLine(19, 20, 6, red);
        putPixel(21,7,red);
        putPixel(19,4,yellow);
        putPixel(11,3,yellow);
        drawHorizontalLine(12, 16, 2, yellow);
        drawHorizontalLine(17, 18, 3, yellow);
        drawHorizontalLine(6, 12, 5, darkYellow);
        drawVerticalLine(16, 18, 22, darkYellow);
        drawHorizontalLine(23, 24, 17, darkYellow);
        drawHorizontalLine(24, 25, 16, darkYellow);
        drawHorizontalLine(23, 25, 15, darkYellow);
        drawHorizontalLine(16, 12, 5, darkYellow);
        fillRect(22,13,4,2, darkYellow);
        fillRect(21,11,4,2, darkYellow);
        fillRect(20,10,4,2, darkYellow);
        fillRect(18,9,5,2, darkYellow);
        fillRect(15,8,6,2, darkYellow);
        fillRect(6,6,11,2, darkYellow);
        drawVerticalLine(8, 9, 2, darkYellow);
        drawHorizontalLine(4, 5, 6, darkYellow);
        drawHorizontalLine(5, 7, 8, darkYellow);
        drawHorizontalLine(4, 5, 9, darkYellow);
        drawHorizontalLine(3, 4, 10, darkYellow);
        putPixel(5,7,yellow);
        putPixel(3,9,yellow);
        fillRect(3, 7,2,2, yellow);
        drawHorizontalLine(6, 14, 6, yellow);

        //Cara
        putPixel(11,10,piel);
        drawHorizontalLine(10, 12, 11, piel);
        fillRect(6, 14,3,6, piel);
        fillRect(9, 12,5,8, piel);
        drawHorizontalLine(7, 19, 20, piel);
        drawHorizontalLine(9, 16, 21, piel);
        fillRect(13, 18,5,2, piel);
        fillRect(19, 18,2,2, piel);
        putPixel(18,19,piel);
        putPixel(19,17,piel);
        putPixel(17,16,piel);
        drawHorizontalLine(15, 17, 17, piel);
        
        //Ojos
        drawVerticalLine(15, 16, 6, Color.white);
        drawHorizontalLine(7, 8, 17, Color.white);
        putPixel(8,14,Color.white);
        fillRect(7, 15,2,2, Color.black);
        putPixel(7,14,Color.black);
        putPixel(7,15,darkYellow);
        drawVerticalLine(15, 16, 15, Color.white);
        drawHorizontalLine(13, 14, 17, Color.white);
        putPixel(14,14,Color.white);
        fillRect(13, 15,2,2, Color.black);
        putPixel(13,14,Color.black);
        putPixel(13,15,darkYellow);
        putPixel(10,19,Color.black);
        
        //Ropa
        fillRect(11, 24,5,5, red);
        drawVerticalLine(24, 27, 10, red);
        drawVerticalLine(26, 27, 9, red);
        drawVerticalLine(26, 27, 16, red);
        drawHorizontalLine(11, 12, 23, red);
        drawHorizontalLine(14, 15, 23, red);
        putPixel(12,25,Color.black);
        putPixel(12,27,Color.black);
        drawHorizontalLine(9, 11, 29, blue);
        drawHorizontalLine(9, 15, 30, blue);
        drawHorizontalLine(14, 16, 31, blue);
        drawHorizontalLine(10, 11, 31, blue);
        drawHorizontalLine(15, 17, 32, blue);
        fillRect(7, 33,4,2, piel);
        
        //Cuerpo
        putPixel(10,32,piel);
        putPixel(6,34,piel);
        fillRect(15, 34,3,3, piel);
        drawHorizontalLine(16, 17, 33, piel);
        drawVerticalLine(35, 36, 18, piel);
        drawVerticalLine(27, 28, 7, piel);
        putPixel(8,28,piel);
        fillRect(17, 28,3,3, piel);
        drawVerticalLine(23, 25, 17, piel);
        drawVerticalLine(25, 27, 18, piel);
        drawVerticalLine(28, 29, 20, piel);

        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("D:/Amigu/Universidad/ProgramacionOrientada/onePiece/luffy.jpg"));
            System.out.println("Luffy has been printed!");
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
