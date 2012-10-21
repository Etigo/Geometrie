
public class Bod {
	
	private int x=0;
	private int y=0;
	
	protected Bod(){
		this(0,0);
	}
	
	protected Bod(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	void setBod(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	int getBod(Bod bod) {
		//TODO Dodìlat
		return 0;
	}
	
	void posunBodu(int deltaX, int deltaY){
		x = x + deltaX;
		y = y + deltaY;
	}

}
