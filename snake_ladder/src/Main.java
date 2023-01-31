import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        board board=new board();
        user u1=new user(0,1,"Ritwika");
        user u2=new user(0,2,"Riyanka");
        user u3=new user(0,3,"Suman");
        Deque<user> list=new LinkedList<user>();
        list.add(u1);
        list.add(u2);
        list.add(u3);

       snakeladdergame game=new snakeladdergame(board,list);
       game.board.addsnake(11,2);
       game.board.addsnake(99,34);
       game.board.addsnake(21,9);
       game.board.addsnake(56,8);
       game.board.addladder(7,26);
       game.board.addladder(45,89);
       game.board.addladder(30,79);

       game.simulate();

    }
}