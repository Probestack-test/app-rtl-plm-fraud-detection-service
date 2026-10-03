package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CreateRuleRequest;
import com.probestack.forgestudio.design.model.Rule;
import java.util.UUID;
import com.probestack.forgestudio.design.model.UpdateRuleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import java.util.List;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.RulesService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-03T22:22:37.069743944Z[GMT]")
@Controller
@RequestMapping("${openapi.fraudDetectionService.base-path:/fraud/v1}")
public class RulesApiController implements RulesApi {

    private static final Logger log = LoggerFactory.getLogger(RulesApiController.class);

    private final RulesService rulesService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public RulesApiController(RulesService rulesService, GeneratedRequestValidator generatedRequestValidator) {
        this.rulesService = rulesService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Rule> createRule(@RequestBody() CreateRuleRequest createRuleRequest) {
        log.info("Processing createRule request");
        try {
            generatedRequestValidator.validate("createRule", createRuleRequest);
            var response = rulesService.createRule(createRuleRequest);
            log.info("createRule completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createRule: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> deleteRule(@PathVariable() UUID ruleId) {
        log.info("Processing deleteRule request");
        try {
            var response = rulesService.deleteRule(ruleId);
            log.info("deleteRule completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process deleteRule: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<Rule>> listRules(@RequestParam(value = "enabled", required = false) Boolean enabled, @RequestParam(value = "severity", required = false) String severity) {
        log.info("Processing listRules request");
        try {
            var response = rulesService.listRules(enabled, severity);
            log.info("listRules completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listRules: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Rule> updateRule(@PathVariable() UUID ruleId, @RequestBody() UpdateRuleRequest updateRuleRequest) {
        log.info("Processing updateRule request");
        try {
            generatedRequestValidator.validate("updateRule", updateRuleRequest);
            var response = rulesService.updateRule(ruleId, updateRuleRequest);
            log.info("updateRule completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process updateRule: {}", e.getMessage(), e);
            throw e;
        }
    }
}
