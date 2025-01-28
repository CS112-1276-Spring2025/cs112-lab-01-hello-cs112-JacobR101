public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello world! from Jacob");
        Printinfo();
        System.out.println("do I like video games?: " + Likes("video games"));
        Anime best = new Anime();
        best.setTitle("Demon Slayer");
        best.setDirector("Haruo Sotozaki");
        best.setRating(10);
        System.out.println("My favorite anime is " + best.getTitle());
    }

    public static void Printinfo() {
        System.out.println("I enjoy playing video games, scrolling on instagram, and going out with my friends");
    }
    public static boolean Likes(String check){
     String Mylikes =   "I enjoy playing video games, scrolling on instagram, and going out with my friends";
     return(Mylikes.contains(check));

    }
    }
