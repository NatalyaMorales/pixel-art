package onePiece;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Chopper {
    //Establecer medidas
    static int width = 1080;
    static int height = 1400;
    
    //Establecer colores
    static Color pink = new Color(233,93,107);
    static Color darkpink = new Color(180,56,82);
    static Color brown = new Color(224,177,117);
    static Color darkbrown = new Color(129,99,62);
    static Color blue = new Color(17,70,122);
    static Color wine = new Color(122,44,67);
    static Color darkwine = new Color(63,26,35);
    static Color light_blue = new Color(180,226,244);

    static Graphics2D g;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    // Definimos el tamaÃ±o del pixel y la matriz de colores
    private final static int PIXEL_SIZE = 40;

    public static void paint() {
    	drawBackground(PIXEL_SIZE, light_blue);   
        //Delineado negro  
        fillRect(5,4,17,10, Color.black);
        drawHorizontalLine(6, 20, 3, Color.black);
        drawHorizontalLine(7, 19, 2, Color.black);
        drawHorizontalLine(9, 17, 1, Color.black);
        drawVerticalLine(5, 12, 4, Color.black);
        drawVerticalLine(5, 11, 3, Color.black);
        drawVerticalLine(6, 10, 2, Color.black);
        drawVerticalLine(5, 12, 22, Color.black);
        drawVerticalLine(5, 11, 23, Color.black);
        drawVerticalLine(6, 10, 24, Color.black);
        drawHorizontalLine(6, 20, 14, Color.black);
        drawHorizontalLine(5, 21, 15, Color.black);
        drawHorizontalLine(4, 22, 16, Color.black);
        drawHorizontalLine(5, 21, 17, Color.black);
        drawHorizontalLine(6, 20, 18, Color.black);
        drawHorizontalLine(7, 19, 19, Color.black);
        drawHorizontalLine(8, 18, 20, Color.black);
        drawHorizontalLine(9, 17, 21, Color.black);
        drawHorizontalLine(10, 16, 22, Color.black);
        drawHorizontalLine(9, 17, 23, Color.black);
        drawHorizontalLine(8, 18, 24, Color.black);
        drawVerticalLine(25, 26, 7, Color.black);
        drawVerticalLine(25, 26, 19, Color.black);
        drawHorizontalLine(8, 18, 27, Color.black);
        drawHorizontalLine(9, 17, 28, Color.black);
        fillRect(10,29,7,2, Color.black);
        putPixel(13,30,Color.black);
        drawHorizontalLine(10, 12, 31, Color.black);
        drawHorizontalLine(9, 12, 32, Color.black);
        drawHorizontalLine(10, 11, 33, Color.black);
        drawHorizontalLine(14, 16, 31, Color.black);
        drawHorizontalLine(14, 17, 32, Color.black);
        drawHorizontalLine(15, 16, 33, Color.black);

        //Sombrero1
        fillRect(9,2,9,10, pink);
        drawHorizontalLine(7, 19, 10, pink);
        drawVerticalLine(10, 12, 18, pink);
        drawVerticalLine(10, 12, 8, pink);
        drawVerticalLine(3, 6, 8, pink);
        drawVerticalLine(4, 5, 6, pink);
        drawVerticalLine(3, 5, 7, pink);
        drawVerticalLine(3, 6, 18, pink);
        drawVerticalLine(4, 5, 20, pink);
        drawVerticalLine(3, 5, 19, pink);

        //Sombrero2
        drawHorizontalLine(9, 17, 13, pink);
        drawHorizontalLine(7, 19, 14, pink);
        drawHorizontalLine(6, 20, 15, pink);
        drawHorizontalLine(9, 17, 14, darkpink);
        drawHorizontalLine(7, 19, 15, darkpink);
        drawHorizontalLine(5, 21, 16, darkpink);
        drawHorizontalLine(6, 20, 17, darkpink);
        drawHorizontalLine(7, 19, 18, darkpink);

        //Cruz
        putPixel(12,7,Color.white); 
        putPixel(13,8,Color.white); 
        putPixel(14,7,Color.white); 
        putPixel(12,9,Color.white); 
        putPixel(14,9,Color.white); 

        //Astas
        drawVerticalLine(7, 10, 3, darkbrown);
        drawVerticalLine(6, 11, 4, darkbrown);
        drawVerticalLine(9, 12, 5, darkbrown);
        drawVerticalLine(11, 12, 6, darkbrown);
        putPixel(7,12,darkbrown); 
        putPixel(8,13,darkbrown); 
        fillRect(6,7,2,3, darkbrown);
        drawVerticalLine(7, 10, 23, darkbrown);
        drawVerticalLine(6, 11, 22, darkbrown);
        drawVerticalLine(9, 12, 21, darkbrown);
        drawVerticalLine(11, 12, 20, darkbrown);
        putPixel(19,12,darkbrown); 
        putPixel(18,13,darkbrown); 
        fillRect(19,7,2,3, darkbrown);

        //Cara
        fillRect(8,17,11,3, brown);
        drawHorizontalLine(9, 17, 16, brown);
        drawHorizontalLine(9, 17, 20, brown);
        drawHorizontalLine(10, 16, 21, brown);
        drawHorizontalLine(12, 14, 22, brown);
        
        //Ojos
        fillRect(10,17,2,3, Color.white);
        fillRect(15,17,2,3, Color.white);
        drawVerticalLine(18, 19, 11, Color.black);
        drawVerticalLine(18, 19, 15, Color.black);
        putPixel(13,20,blue); 
        
        //Ropa
        fillRect(10,27,7,2, wine);
        fillRect(11,29,5,2, wine);
        
        //Cuerpo
        putPixel(11,31,brown);  
        putPixel(15,31,brown); 
        drawHorizontalLine(10, 11, 32, darkbrown);
        drawHorizontalLine(15, 16, 32, darkbrown);
        drawHorizontalLine(17, 18, 26, darkbrown);
        drawHorizontalLine(8, 9, 26, darkbrown);
        drawHorizontalLine(10, 16, 26, brown);
        drawHorizontalLine(8, 18, 25, brown);
        drawHorizontalLine(9, 17, 24, brown);
        drawHorizontalLine(10, 11, 23, brown);
        drawHorizontalLine(15, 16, 23, brown);
        putPixel(10,25,Color.black);
        putPixel(16,25,Color.black);

        drawSquareGrid(PIXEL_SIZE, Color.black);
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("D:/Amigu/Universidad/ProgramacionOrientada/onePiece/chopper.jpg"));
            System.out.println("Chopper has been printed!");
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

