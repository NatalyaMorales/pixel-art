package onePiece;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Calavera {
    //Establecer medidas
    static int width = 1680;
    static int height = 1520;
    
    //Establecer colores
    static Color yellow = new Color(254,234,59);
    static Color red = new Color(243,65,53);
    static Color blue = new Color(62,80,180);

    static Graphics2D g;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    // Definimos el tamaÃ±o del pixel y la matriz de colores
    private final static int PIXEL_SIZE = 40;

    public static void paint() {
    	drawBackground(PIXEL_SIZE, blue);   
        //Sombrero delineado
        drawHorizontalLine(18, 24, 2, Color.black);
        drawHorizontalLine(16, 26, 3, Color.black);
        drawHorizontalLine(14, 28, 4, Color.black);
        drawHorizontalLine(13, 29, 5, Color.black);
        drawHorizontalLine(12, 30, 6, Color.black);
        drawHorizontalLine(11, 31, 7, Color.black);
        fillRect(10,8,23,2, Color.black);
        fillRect(4, 10,35,3, Color.black);
        drawHorizontalLine(3, 39, 11, Color.black);

        //Cabeza delineado
        fillRect(9, 13,24,5, Color.black);
        fillRect(10, 18,22,2, Color.black);
        fillRect(11, 20,20,2, Color.black);
        drawHorizontalLine(12, 30, 22, Color.black);
        drawHorizontalLine(13, 29, 23, Color.black);
        drawHorizontalLine(14, 28, 24, Color.black);
        drawHorizontalLine(15, 27, 25, Color.black);
        drawHorizontalLine(14, 28, 26, Color.black);
        fillRect(13, 27,17,5, Color.black);
        drawHorizontalLine(14, 28, 32, Color.black);
        fillRect(15, 33,13,2, Color.black);
        drawHorizontalLine(16, 26, 35, Color.black);
        drawHorizontalLine(18, 24, 36, Color.black);
        drawHorizontalLine(20, 22, 37, Color.black);

        //Cabeza
        fillRect(10, 13,22,5, Color.white);
        fillRect(11, 18,20,2, Color.white);
        fillRect(12, 20,18,2, Color.white);
        drawHorizontalLine(13, 29, 22, Color.white);
        drawHorizontalLine(14, 28, 23, Color.white);
        drawHorizontalLine(16, 26, 24, Color.white);
        drawHorizontalLine(18, 24, 25, Color.white);
        putPixel(16,26,Color.white);
        putPixel(26,26,Color.white);
        fillRect(18, 27,3,2, Color.white);
        fillRect(18, 30,3,2, Color.white);
        fillRect(22, 27,3,2, Color.white);
        fillRect(22, 30,3,2, Color.white);
        fillRect(16, 33,11,2, Color.white); 
        drawHorizontalLine(18, 24, 35, Color.white);
        drawHorizontalLine(20, 22, 36, Color.white);
        drawHorizontalLine(15, 16, 31, Color.white);
        drawHorizontalLine(15, 17, 32, Color.white);
        drawHorizontalLine(26, 27, 31, Color.white);
        drawHorizontalLine(25, 27, 32, Color.white);
        drawVerticalLine(28, 30, 14, Color.white);
        drawVerticalLine(28, 30, 28, Color.white);
        drawVerticalLine(28, 29, 16, Color.white);
        drawVerticalLine(28, 29, 26, Color.white);
        putPixel(15,30,Color.white);
        putPixel(27,30,Color.white);

        //Cara
        fillRect(14,15,5,5, Color.black);
        drawHorizontalLine(15,17, 14, Color.black);
        drawHorizontalLine(15,17, 20, Color.black);
        drawVerticalLine(16, 18, 13, Color.black);
        drawVerticalLine(16, 18, 19, Color.black);
        fillRect(24,15,5,5, Color.black);
        drawHorizontalLine(25,27, 14, Color.black);
        drawHorizontalLine(25,27, 20, Color.black);
        drawVerticalLine(16, 18, 23, Color.black);
        drawVerticalLine(16, 18, 29, Color.black);
        drawHorizontalLine(20,22, 21, Color.black);
        drawHorizontalLine(19,23, 22, Color.black);
        drawHorizontalLine(20,22, 23, Color.black);

        //Sombrero
        drawHorizontalLine(18, 24, 3, yellow);
        drawHorizontalLine(16, 26, 4, yellow);
        drawHorizontalLine(14, 28, 5, yellow);
        drawHorizontalLine(13, 29, 6, yellow);
        drawHorizontalLine(12, 30, 8, red);
        drawHorizontalLine(11,31, 9, red);
        drawHorizontalLine(4, 38, 11, yellow);

        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("D:/Amigu/Universidad/ProgramacionOrientada/onePiece/calavera.jpg"));
            System.out.println("Calavera has been printed!");
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
