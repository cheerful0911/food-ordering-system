
public class QRCode 
{
	private static final String WHITE_BG = "\033[0;107m";
	private static final String BLACK_BG = "\033[40m";
	private static final String RESET = "\033[0m";
	public QRCode()
	{
		
	}
	
	public String Image()
	{
		String QR = BLACK_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s\n" + 
				BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\n" + 
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s\n" +
		    	BLACK_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s\n" +
		    	WHITE_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\n" +
		    	WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s\n" +
		    	WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\n" +
		    	WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s\n" + 
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\n" +
		    	WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s\n" +
		    	WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s\n" +
		    	BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s\n" +
		    	BLACK_BG + "\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\n" +
		    	WHITE_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\n" +
		    	BLACK_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s\n" +
		    	BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s" + BLACK_BG + "\s\s\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s\s\s\n" +
		    	BLACK_BG + "\s\s\s\s\s\s\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s" + WHITE_BG + "\s\s\s\s\s\s\s\s\s\s" + BLACK_BG + "\s\s\s\s\s\s\s\s" + WHITE_BG + "\s\s" + RESET;
	
	return QR;
	}
}
