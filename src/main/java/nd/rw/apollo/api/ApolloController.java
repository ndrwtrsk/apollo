package nd.rw.apollo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/apollo")
class ApolloController {

  @RequestMapping()
  @ResponseStatus(OK)
  public void index() {

  }

}
