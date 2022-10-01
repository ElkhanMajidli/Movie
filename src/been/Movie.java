package been;

public class Movie {
    public String name;
    public String date;
    public String ageRestriction;
    public Integer moviePrice;
    public String about;

    public Movie() {

    }

    public Movie(String name, String date, String ageRestriction, Integer moviePrice,String about) {
        this.name = name;
        this.date = date;
        this.ageRestriction = ageRestriction;
        this.moviePrice = moviePrice;
        this.about=about;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public Integer getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(Integer moviePrice) {
        this.moviePrice = moviePrice;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAllMovie(){
        return (this.getName()+" "+this.getDate()+" "+this.getAgeRestriction()+" "+this.getMoviePrice()+" "+this.getAbout());
    }
}