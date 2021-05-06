package movies;

public class Movie {
    private String name;
    private String category:

    public Movie(String movieName, String movieCategory){
        this.name = movieName;
        this.category = movieCategory;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public String setName(String movieName){
        return name = movieName;
    }


    public String setCategory(String categoryName){
        return category = categoryName;
    }

}
