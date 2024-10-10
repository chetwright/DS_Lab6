import java.util.Stack;
import javafx.scene.paint.Color;


public class PaintBrush
{

	
	Paint paint;
	
	
	enum BrushMode{
		paintMode,
		fillMode,
		pattern1Mode,
		pattern2Mode
	}

	BrushMode mode;
	
	Paint Gold = new PaintColor(Color.GOLD);
	Paint White = new PaintColor(Color.WHITE);
	Paint Green = new PaintColor(Color.GREEN);
	Paint Blue = new PaintColor(Color.BLUE);
	Paint Purple = new PaintColor(Color.PURPLE);
	Paint Red = new PaintColor(Color.RED);
	Paint Black = new PaintColor(Color.BLACK);
/**
set the "paint" for the paintbrush
*/	
	public void setPaint(Paint paint)
	{
   
   
	}


/*
   gets the present paint on the paint brush
*/
	public Paint getPaint()
	{
		return Gold;
	}
	
   
   /*
   makes the paint on the paint brush a brigter shade.
   */
	public void setBrighter()
	{		

	}


   /*
      makes the paint on the paintbrush a darker shade
   */
	public void setDarker()
	{
		
	}


   /*
      paints the mesh, using the current paint and mode at point x,y
   */
	public void paint(int x, int y, Paint[][] mesh)
	{
		
	}

	
	
/*
   set the drawing mode of the paint brush.
*/
	public void pointMode()
	{
		mode= BrushMode.paintMode;
	}

	public void fillMode()
	{
		mode = BrushMode.fillMode;
	}

	public void pattern1Mode()
	{
		mode = BrushMode.pattern1Mode;
	}

	public void pattern2Mode()
	{
		mode = BrushMode.pattern2Mode;
	}

}
