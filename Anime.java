public class Anime {
    private String title;
    private String director;
    private int rating; //rating out of 10
    

    public Anime(String title, String director, int rating) {
        this.setDirector(director);
        this.setTitle(title);
        this.setRating(rating);
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    public void setRating(int rating) {
        if (rating >= 0 && rating <= 10) { 
            this.rating = rating;
        } else {
            System.out.print("Error: Rating must be between 1 and 10\n");
        }
    }
    public String getTitle() {
        return title;
        }
        
    public String getDirector() {
        return director;
        }
        
    public int getRating() {
        return rating;
        }
    public String toString() {
            return "Anime{" +
                   "title='" + title + '\'' +
                   ", director='" + director + '\'' +
                   ", rating=" + rating +
                   '}';
        }
    }

