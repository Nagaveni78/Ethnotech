import java.util.*;
class spotify 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        ArrayList<String> playlist=new ArrayList<>();
        String firstsong=s.nextLine();
        String secondsong=s.nextLine();
        String thirdsong=s.nextLine();
        String fourthsong=s.nextLine();
        String fifthsong=s.nextLine();
        playlist.add(firstsong);
        playlist.add(secondsong);
        playlist.add(thirdsong);
        playlist.add(fourthsong);
        playlist.add(fifthsong);
        System.out.println(playlist);
        playlist.remove(2);
        playlist.remove(0);
        System.out.println("after removing the present songs are:"+playlist);
        System.out.println("size of the playlist is:"+playlist.size());
        System.out.println("the first song is:"+playlist.get(0));
        System.out.println("second song is:" +playlist.get(1));
        System.out.println("third song is:" +playlist.get(2));
    }
}











