import java.util.*;

public class snakeladdergame {
    public board board;
    Deque<user> user=new LinkedList<user>();

    user winner=null;

    public snakeladdergame(board board,Deque<user>user)
    {
        this.board=board;
        this.user=user;
    }
    public void adduser(user a)
    {
        user.add(a);
    }
    public int rolldice()
    {
        int min=1;
        int max=6;
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }

    public void simulate()
    {
        while(winner==null)
        {
            user u1=user.pop();
            int cur=u1.pos;
            int id= u1.id;

            int val=rolldice();
            board.play(u1,val);

            if(u1.pos== board.winpos)
            {
                System.out.println("Congratulation "+u1.name+" is winner!!");
                winner=u1;
            }
           else
            {
                System.out.println("the current position of "+u1.name+" is "+u1.pos);
                user.addLast(u1);
            }
        }
    }
}
