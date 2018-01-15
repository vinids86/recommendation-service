package br.com.makeshiftonjava.recommendationservice.application;

import br.com.makeshiftonjava.recommendationservice.model.Recommendation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/recommendation")
public class RecommendationController {

    private static final Logger LOG = LoggerFactory.getLogger(RecommendationController.class);

    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    public ResponseEntity<List<Recommendation>> retrieveRecommendation(@PathVariable Long productId) {
        LOG.info("/recommendation called");
        return ResponseEntity.ok(Collections.singletonList(new Recommendation(123L, "Teste")));
    }
}
