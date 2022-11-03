package interfaceex;
 
public class Tyre implements Bounceable {

    private int bf;

    private String material;



   public Tyre(String materialused) {
        super();
        this.material=materialused;
    }
 
 
    public String getColor() {
    return material;
}
 
 
  public void setmaterial(String material) {
       this.material = material;
   }
 
 
    public void bounce()
    {
       System.out.println("It's a "+ this.material+ " color tyre bouncing with bounce factor = "+this.bf);    
    }

    public void setBounceMultiple(int multiple)
    {

        this.bf = Bounceable.BOUNCE_FACTOR * multiple;

    }
 
}


//package interfaceex;
//
//public class Ball implements Bounceable {
//
//	private int bf;
//	private String color;
//	
//	
//	public Ball(String ballcolor) {
//		super();
//        this.color=ballcolor;
//	}
//	
//	
//	public String getColor() {
//		return color;
//	}
//
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//
//	public void bounce() {
//		System.out.println("It is a "+this.color+"Color ball bouncing with bounce factor"+this.bf);
//	}
//	
//	public void setBounceMultiple(int multiple)
//	{
//	
//	}
//	
//}

