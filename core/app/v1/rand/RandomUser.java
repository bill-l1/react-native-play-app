package v1.rand;

public class RandomUser {

  public class RandomUserName {
    private String title;
    private String first;
    private String last;

    public RandomUserName(String title, String first, String last){
      this.title = title;
      this.first = first;
      this.last = last;
    }

    public String getTitle(){
      return title;
    }

    public String getFirst(){
      return first;
    }

    public String getLast(){
      return last;
    }
  }

  public class RandomUserPic {
    private String medium;

    public RandomUserPic(String medium){
      this.medium = medium;
    }

    public String getMedium(){
      return medium;
    }
  }

  private RandomUserName name;
  private RandomUserPic picture;
  private String email;

  public RandomUser(String title, String first, String last, String email){
    this.name = new RandomUserName(title, first, last);
    this.picture = new RandomUserPic("https://randomuser.me/api/portraits/men/1.jpg");
    this.email = email;
  }

  public RandomUserName getName(){
    return name;
  }

  public RandomUserPic getPicture(){
    return picture;
  }

  public String getEmail(){
    return email;
  }

}
