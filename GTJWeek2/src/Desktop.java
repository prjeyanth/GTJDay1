
public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("15 inch Monitor");
	}
	
	public static void main (String args[]) {
		
		Desktop dsktp = new Desktop();
		dsktp.computerModel();
		dsktp.desktopSize();
		
		
	}

}
