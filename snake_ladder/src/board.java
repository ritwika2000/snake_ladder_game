import java.util.HashMap;
import java.util.Map;
public class board {
    int grid;
    Map<Integer,Integer> snake=new HashMap<>();
    Map<Integer,Integer>ladder=new HashMap<>();
    int winpos;
    public board()
    {
        grid=100;
        winpos=100;
    }
    public void addsnake(int start,int end)
    {
        snake.put(start,end);
    }
    public void addladder(int start,int end)
    {
        ladder.put(start,end);
    }

    public void play(user user1,Integer val)
    {
        if(user1.pos+val>winpos)
            return ;
        user1.pos+=val;

        if(snake.get(user1.pos)!=null)
        {
            System.out.println("sorry "+user1.id+" is bitten by snake");
            user1.pos= snake.get(user1.pos);
        }
        if(ladder.get(user1.pos)!=null)
        {
            System.out.println("wahh "+user1.id+" found a ladder");
            user1.pos=ladder.get(user1.pos);
        }
    }
}
