package exeption;

		public class A002ageNotValid extends Exception 
		{
			int AgeChake;
			public A002ageNotValid (int AgeChake)
			{
				this.AgeChake = AgeChake;
			}
			public void getmessage()
			{
				System.out.println("your Need More " +AgeChake +"Year to eligibe");
			}
		}