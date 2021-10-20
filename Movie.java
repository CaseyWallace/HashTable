public class Movie implements Comparable <Movie>{
    public String title;
    public int year;
    
    public Movie(String inTitle, int inYear) {
        title = inTitle;
        year = inYear;
    }
    
    @Override
    public int compareTo(Movie otherMovie) {
        return this.title.compareTo(otherMovie.title);
    }
    
    @Override
    public String toString() {
        return ("" + title + " : " + year);
    }
}
