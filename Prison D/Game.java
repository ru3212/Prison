import java.util.Scanner;
public class Game implements PDPlayer
{
    private String opponent;
    private String choice;
    private int points;
    public Game()
    {
       opponent = "";
       choice = "d";
    }
    
    
    
    
    public String chooseCorD(String opponentsLastMove)
    {
        if (opponentsLastMove.equals("c"))
        {
            choice = "c";
        }
        return choice;
    }
    
    public String getAuthor()
    {
        System.out.println("Enter your first and last name: ");
        Scanner reader = new Scanner(System.in);
        opponent = reader.nextLine();
        return opponent;
    }
    
    public String toString()
    {
        String explain = "If the person's last move was a cooperate, then I would cooperate as well. By default my choice is defect";
        return explain;
    }
}