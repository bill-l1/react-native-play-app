package v1.rand;

import play.mvc.Http;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class RandomUserGenerator {

  private static String[] titles = {"mr", "ms", "mrs"};
  private static String[] firstNames = {"james", "mary", "john", "patricia", "robert"};
  private static String[] lastNames = {"smith", "johnson", "williams", "brown"};
  private Random rand;

  @Inject
  public RandomUserGenerator(){
    //TODO seed?
    rand = new Random();
  }

  public CompletionStage<Stream<RandomUser>> build(Http.Request request, int results) {
    List<RandomUser> users = new ArrayList<>();
    for(int i = 0; i < results; i++){
      String title = pickRandom(titles);
      String first = pickRandom(firstNames);
      String last = pickRandom(lastNames);
      users.add(new RandomUser(title, first, last, first+"."+last+"@example.com"));
    }
    return CompletableFuture.completedFuture(users.stream());
  }

  private String pickRandom(String[] arr){
    return arr[rand.nextInt(arr.length)];
  }

}
