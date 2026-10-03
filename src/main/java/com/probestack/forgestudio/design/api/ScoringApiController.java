package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.ScoreRequest;
import com.probestack.forgestudio.design.model.ScoreResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ScoringService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-03T22:22:37.069743944Z[GMT]")
@Controller
@RequestMapping("${openapi.fraudDetectionService.base-path:/fraud/v1}")
public class ScoringApiController implements ScoringApi {

    private static final Logger log = LoggerFactory.getLogger(ScoringApiController.class);

    private final ScoringService scoringService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public ScoringApiController(ScoringService scoringService, GeneratedRequestValidator generatedRequestValidator) {
        this.scoringService = scoringService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<ScoreResponse> scoreTransaction(@RequestBody() ScoreRequest scoreRequest) {
        log.info("Processing scoreTransaction request");
        try {
            generatedRequestValidator.validate("scoreTransaction", scoreRequest);
            var response = scoringService.scoreTransaction(scoreRequest);
            log.info("scoreTransaction completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process scoreTransaction: {}", e.getMessage(), e);
            throw e;
        }
    }
}
