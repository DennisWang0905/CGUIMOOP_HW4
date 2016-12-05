package HW4;
import java.util.ArrayList;

public class Player {

	 
		// TODO Auto-generated method stub
     private String name;
     private int chips;
     private int bet=0;
     private ArrayList<Card>oneRoundCard=new ArrayList<>();
     
     public Player (String name ,int chips){
    	 this.name=name;
    	 this.chips=chips;
     }
	public String get_name(){
		return name;
	}
	public int make_bet(){
		if(bet>chips)
		{
			System.out.print("你沒摳摳囉，不可以在下了!Sorry BRO!!");
			return bet;
			
		}
		else
			bet=1;
		return bet;
	}
	 public void setOneRoundCard( ArrayList<Card>cards){
		 oneRoundCard=cards;
		 
	 }
	 public boolean hit_me()
	 {
		 if(this.getTotalValue()<17) return true;
		 else return false;
	 } 
	 
	 public int getTotalValue()
	 {
		 
		 int total=0;
		 int ace=0;
		 for (int i=0;i<oneRoundCard.size();i++)
		 {
			 if(oneRoundCard.get(i).getRank() == 1)
				 ace=1;
			 else
			 {
				if(oneRoundCard.get(i).getRank()>10)total +=10;
				else total +=oneRoundCard.get(i).getRank();
			 }
		 }
		 if (ace == 1)
		 {
			if(total <=10) total+=11;
			else total +=1;
		 }
		 return total;
		 }
		 
		 public int get_current_chips()
		 {
			return chips; 
		 }
	     public void increase_chips(int diff){
	    	 chips += diff;
	     }
	     public void say_hello()
	     {
	    	 System.out.println("Hello, I am"+ name+".");
	    	 System.out.println("I have "+chips+ "chips.");
	     }

}

