package video_store;


import java.io.IOException;
import java.util.Scanner;

public class VideoStoreLauncher {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello Admin! This is your Video Shop! ");
        System.out.println("Enter Your Name: ");
        String ownerName=sc.nextLine();
        System.out.println("Thanks for registering:"+ownerName);




        //this is object array of video to store first three video
        Video[] videos = new Video[3];
        videos[0] = new Video( "The Matrix",true,0);
        videos[1] = new Video( "Godfather II",true,0);
        videos[2] = new Video( "Star Wars Episode IV: A New Hope",true,0);



        //object of videoStore class
        VideoStore videoStore = new VideoStore();


        //first three video assign to shop
        for(int i=0;i<3;i++){
            videoStore.movie_availability.put(videos[i].title,videos[i].flag);
            videoStore.movie_rating.put(videos[i].title,0.0);
            videoStore.movie_reivew_count.put(videos[i].title,0);

        }


        boolean loop=true;

        while (loop){

            System.out.println("1. add video");
            System.out.println("2. return video");
            System.out.println("3. checkOut video");
            System.out.println("4. receive rating video");
            System.out.println("5. display InventoryList of video");
            System.out.println("0. To quit the video shop");

            System.out.println("Enter your choice");
            int choice =sc.nextInt();

            switch(choice){
                case 1:
                    videoStore.addVideo();
                    break;
                case 2:

                    videoStore.returnVideo();
                    break;
                case 3:
                    videoStore.checkOut();
                    break;
                case 4:

                    videoStore.receiveRating();
                    break;
                case 5:
                    videoStore.display();
                    break;
                case 0:
                    System.out.println("Thanks for shopping with us");
                    loop=false;
                    break;
                default:
                    System.out.println("Thanks for shopping with us");
                    loop=false;


            }


        }




    }

}
