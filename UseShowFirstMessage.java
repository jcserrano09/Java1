public class UseShowFirstMessage
{
	public static void main(String[] args)
	{
		ShowFirstMessage messageOne;
		messageOne = new ShowFirstMessage();
		messageOne.message = "I like to drink coffee";
		messageOne.displayMessage();

		ShowSecondMessage messageTwo;
		messageTwo = new ShowSecondMessage();
		messageTwo.changeMessage("I like to drink milk");
		messageTwo.displayMessage();
	}
}