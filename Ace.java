package onePiece;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Ace {
    //Establecer medidas
    static int width = 1000;
    static int height = 1240;
    
    //Establecer colores
    static Color orange = new Color(253,88,34);
    static Color darkOrange = new Color(191,53,9);
    static Color lightBlue = new Color(143,210,224);
    static Color darkBlue = new Color(4,169,244);
    static Color red = new Color(213,2,1);
    static Color piel = new Color(255,224,178);
    static Color darkPiel = new Color(252,199,116);
    static Color brown = new Color(116,81,66);
    static Color lila = new Color(204,169,221);

    static Graphics2D g;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    // Definimos el tamaÃ±o del pixel y la matriz de colores
    private final static int PIXEL_SIZE = 40;
    /*private final static Color[][] PIXELS = {
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.RED, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE}
    };*/

    public static void paint() {
    	drawBackground(PIXEL_SIZE, lila);   
        //Dibujar delineado negro  
        drawHorizontalLine(8, 16, 1, Color.black);
        drawHorizontalLine(7, 17, 2, Color.black);
        fillRect(6, 3, 13, 4, Color.black);
        drawHorizontalLine(4, 20, 7, Color.black);
        drawHorizontalLine(2, 22, 8, Color.black);
        drawHorizontalLine(1, 23, 9, Color.black);
        drawHorizontalLine(1, 23, 10, Color.black);
        drawHorizontalLine(2, 22, 11, Color.black);
        drawHorizontalLine(4, 20, 12, Color.black);
        drawHorizontalLine(6, 18, 13, Color.black);
        drawHorizontalLine(5, 19, 14, Color.black);
        drawHorizontalLine(6, 18, 15, Color.black);
        drawHorizontalLine(6, 18, 16, Color.black);
        putPixel(7,17,Color.black);
        putPixel(17,17,Color.black);
        drawHorizontalLine(10, 14, 17, Color.black);
        drawHorizontalLine(9, 15, 18, Color.black);
        fillRect(8, 19, 9, 9, Color.black);
        drawVerticalLine(21, 22, 6, Color.black);
        drawVerticalLine(20, 23, 7, Color.black);
        drawVerticalLine(21, 22, 18, Color.black);
        drawVerticalLine(20, 23, 17, Color.black);
        fillRect(9, 28, 3, 2, Color.black);
        fillRect(13, 28, 3, 2, Color.black);
        drawHorizontalLine(10, 11, 30, Color.black);
        drawHorizontalLine(13, 14, 30, Color.black);
        //Sombrero
        drawHorizontalLine(8, 16, 2, orange);
        fillRect(7, 3, 11, 4, orange);
        drawHorizontalLine(6, 18, 7, red);
        drawHorizontalLine(3, 21, 8, orange);
        fillRect(2, 9, 21, 2, orange);
        drawHorizontalLine(4, 20, 9, darkOrange);
        drawHorizontalLine(3, 21, 10, darkOrange);
        drawHorizontalLine(3, 4, 11, darkOrange);
        drawHorizontalLine(20, 21, 11, darkOrange);
        fillRect(9, 6, 2,2, darkBlue);
        fillRect(14, 6, 2,2, darkBlue);
        drawVerticalLine(6, 7, 8, lightBlue);
        drawVerticalLine(6, 7, 11, lightBlue);
        drawVerticalLine(6, 7, 13, lightBlue);
        drawVerticalLine(6, 7, 16, lightBlue);
        drawHorizontalLine(9, 10, 5, lightBlue);
        drawHorizontalLine(14, 15, 5, lightBlue);
        //Cara
        fillRect(9, 11, 7,6, piel);
        putPixel(7,14,piel);
        putPixel(8,15,piel);
        putPixel(17,14,piel);
        putPixel(16,15,piel);
        putPixel(7,15,darkPiel);
        putPixel(8,16,darkPiel);
        putPixel(17,15,darkPiel);
        putPixel(16,16,darkPiel);
        drawVerticalLine(12, 13, 10, Color.black);
        drawVerticalLine(12, 13, 14, Color.black);
        fillRect(11, 17,3,2, darkPiel);
        drawHorizontalLine(9, 15, 11, darkPiel);
        putPixel(9,12,darkPiel);
        putPixel(15,12,darkPiel);
        //Cuerpo
        drawHorizontalLine(9, 15, 19, piel);
        drawHorizontalLine(11, 13, 19, red);
        putPixel(10,18,red);
        putPixel(14,18,red);
        fillRect(8, 20,9,3, piel);
        drawHorizontalLine(8, 16, 21, darkPiel);
        putPixel(9,20,darkPiel);
        putPixel(15,20,darkPiel);
        putPixel(16,22,darkPiel);
        putPixel(12,22,darkPiel);
        putPixel(8,22,darkPiel);
        drawVerticalLine(21, 22, 17, piel);
        drawVerticalLine(21, 22, 7, piel);
        drawVerticalLine(21, 22, 9, Color.black);
        drawVerticalLine(21, 22, 15, Color.black);
        putPixel(14,29,piel);
        putPixel(10,29,piel);
        drawHorizontalLine(9, 15, 23, brown);
        drawHorizontalLine(11, 13, 23, lightBlue);

        drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("D:/Amigu/Universidad/ProgramacionOrientada/onePiece/ace.jpg"));
            System.out.println("Ace has been printed!");
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
