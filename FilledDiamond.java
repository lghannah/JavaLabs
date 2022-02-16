import objectdraw.*;
import java.awt.*;

public class FilledDiamond {
    
    private Line [] lines;
    private Location topLeft;
    private double width, height;
    private DrawingCanvas myCanvas;
    
    public FilledDiamond( Location t, double w, double h, 
                     DrawingCanvas canvas){
                     	
        int numLines = (int)w;
        lines = new Line[numLines];
        myCanvas = canvas;
        width = w;height = h;
        double x, y1,  y2;
        topLeft = t;
        x = topLeft.getX();
        y1 = topLeft.getY() + height/2;
        y2 = y1;
        double m = height/width;
        System.out.println("m = "+m);
        for (int k = 0;k < numLines;k++)
        {      	
        	lines[k] =new Line(x,y1,x,y2,myCanvas);
        	// update x, y1, y2
        	x +=1;	
        	if (x <= topLeft.getX()+width/2)
        	{
        		y1 -=m;y2+=m;
        	}
        	else
        	{
        		y1 +=m;y2-=m;
        	}      	
        }

        
    }
    public FilledDiamond(double x, double y, double w, double h, 
                     DrawingCanvas canvas){
        this(new Location(x,y),w,h,canvas);
  
   }
    
    public void move( double dx, double dy) {
       // for ( int edgeNum = 0; edgeNum < lines.length; edgeNum++ ){
       //   lines[edgeNum].move(dx, dy);
         
        // }
        for(Line ln:lines)
        	ln.move(dx, dy);
    }
    public void hide( ) {
        //for ( int edgeNum = 0; edgeNum < lines.length; edgeNum++ ){
        //    lines[edgeNum].hide();
        //}
         for(Line ln:lines)
        	ln.hide();
        
    }
    
    public void show( ) {
        for ( int edgeNum = 0; edgeNum < lines.length; edgeNum++ ){
            lines[edgeNum].show();
        }
    }
    public void setColor( Color c) {
        for ( int edgeNum = 0; edgeNum < lines.length; edgeNum++ ){
            lines[edgeNum].setColor(c);
        }
    }
    
    
}
