package nd.rw.apollo.infra.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
class Ticker {

  @Scheduled(fixedRate = 3000)
  public void tickInfo() {
    log.info("INFO TICK");
  }

  @Scheduled(fixedRate = 300)
  public void tickError() {
    var random = new Random().nextInt(10);
    if (random < 3) {
      log.error("ERROR TICK");
    }
  }

  @Scheduled(fixedRate = 2000)
  public void tickDebug() {
    log.debug("DEBUG TICK");
  }

}
