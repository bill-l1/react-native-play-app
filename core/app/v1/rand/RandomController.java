package v1.rand;

import play.mvc.*;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;

import javax.inject.Inject;
import java.util.List;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

public class RandomController extends Controller {
  private HttpExecutionContext ec;
  private RandomUserGenerator gen;

  @Inject
  public RandomController(HttpExecutionContext ec, RandomUserGenerator gen) {
    this.ec = ec;
    this.gen = gen;
  }

  public CompletionStage<Result> list(Http.Request req, int results){
    return gen.build(req, results).thenApplyAsync(users -> {
      final List<RandomUser> userList = users.collect(Collectors.toList());
      JsonNode node = Json.toJson(userList);
      JsonNode newNode = Json.parse("{\"results\":"+Json.stringify(node)+"}");
      return ok(newNode);
    }, ec.current());
  }


}
