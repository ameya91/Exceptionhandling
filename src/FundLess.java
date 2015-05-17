
@SuppressWarnings("serial")
public class FundLess extends Exception 
{
	private double amt;
	public FundLess (double amt)
	{
		this.amt = amt;
	}
	public double getamt()	
	{
		return amt;
			}	
}