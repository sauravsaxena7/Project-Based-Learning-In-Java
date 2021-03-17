package video_store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VideoStore {




    String choice;

    InputStreamReader inpRead = new InputStreamReader(System.in);
    BufferedReader BuffRead = new BufferedReader(inpRead);


    Scanner sc = new Scanner(System.in);


    Map<String, Boolean> movie_availability = new HashMap<String, Boolean>();

    Map<String, Double> movie_rating = new HashMap<String, Double>();

    Map<String, Integer> movie_reivew_count = new HashMap<String, Integer>();




    public String getTile() throws IOException {
        String title = BuffRead.readLine();
        return title;
    }



    public void addVideo() throws IOException {

        System.out.println("Enter the title of video.");

        String title = getTile();

        if(movie_availability.containsKey(title)){
            System.out.print("This video is already sponsored by our company!");
            System.out.println("Please give me something new.");
            return;
        }

        movie_availability.put(title,true);
        movie_rating.put(title,Double.valueOf(0));
        movie_reivew_count.put(title,0);

        System.out.println("Video has been added successfully!");

    }



    public void display(){

        for(Map.Entry<String, Boolean> me : movie_availability.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }


    }



    public void checkOut() throws IOException {

        System.out.println("To checkOut! Enter the title of video.");
        String title = getTile();


        if(movie_availability.containsKey(title)){
            if(movie_availability.get(title)){
                System.out.println("Nice choice buddy!" +
                        " This video is currently available" +
                        " Are you want to buy this video: "+title+" ? Y/N  ");

                if(movie_rating.get(title)==0){

                    System.out.println("This video has not rating yet!");

                }else{
                    System.out.println("This video has "+movie_rating.get(title)+" rating out of 5");

                }

                choice = sc.next();
                if(choice.equals("y")){
                    System.out.println("Yay you get it,Thanks for shopping!");
                    movie_availability.replace(title,false);
                }else{
                    System.out.println("Thanks for interacting us! we will meet again.");
                }

            }else{
                System.out.println("Currently this video is out of stock!");
            }
        }else{
            System.out.print("This video is not sponsored by our company!");
            System.out.println("Sorry for your inconvenience.");
        }



    }






    public void returnVideo() throws IOException {
        System.out.println("Enter the video name which you want to return it!");
        String title = getTile();


        if(!movie_availability.containsKey(title)){
            System.out.print("This video is not sponsored by our company!");
            System.out.println("This activity should not be appreciated");
            return;
        }

        if(!movie_availability.get(title)){
            movie_availability.replace(title,true);
            System.out.println("this video has been returned successfully!");
            System.out.println("Are you want to rate this video ? Y/N");

            choice = sc.next();



            if(choice.equals("y")){
                receiveRating();
            }


        }else{
            System.out.println("You cannot return this video");
        }




    }





    public void receiveRating() throws IOException {

        System.out.println("Enter the video name or tile for rating the video");
        String title = getTile();

        System.out.println("Enter Rating for this video");
        int d1 = sc.nextInt();

        double d=Double.valueOf(d1);
        if(d<0.0){
            d=1.0;
        }else if(d>5.0){
            d=5.0;
        }


        int count = movie_reivew_count.get(title);
        count=count+1;

        d=d+movie_rating.get(title);

        double d2= d/count;

        movie_reivew_count.replace(title,count);
        movie_rating.replace(title,d2);

        System.out.println("Thanks for rate this video! your review may help others");



    }





}
