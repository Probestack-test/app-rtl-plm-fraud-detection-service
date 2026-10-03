package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CaseListResponse;
import java.time.OffsetDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.CasesService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-03T22:22:37.069743944Z[GMT]")
@Controller
@RequestMapping("${openapi.fraudDetectionService.base-path:/fraud/v1}")
public class CasesApiController implements CasesApi {

    private static final Logger log = LoggerFactory.getLogger(CasesApiController.class);

    private final CasesService casesService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public CasesApiController(CasesService casesService, GeneratedRequestValidator generatedRequestValidator) {
        this.casesService = casesService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<CaseListResponse> listCases(@RequestParam(value = "state", required = false) String state, @RequestParam(value = "fromDate", required = false) OffsetDateTime fromDate, @RequestParam(value = "toDate", required = false) OffsetDateTime toDate, @RequestParam(value = "page", required = false, defaultValue = "1") Integer page, @RequestParam(value = "size", required = false, defaultValue = "20") Integer size) {
        log.info("Processing listCases request");
        try {
            var response = casesService.listCases(state, fromDate, toDate, page, size);
            log.info("listCases completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listCases: {}", e.getMessage(), e);
            throw e;
        }
    }
}
