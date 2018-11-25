public class ShowSecondMessage
{
	private String message;
	
	ShowSecondMessage()
	{
		message = "I really prefer tea!";		
	}
	
	public void changeMessage(String newMessage)
	{
		message = newMessage;
	}
	
	public void displayMessage()
	{
		System.out.println(message);
	}
}