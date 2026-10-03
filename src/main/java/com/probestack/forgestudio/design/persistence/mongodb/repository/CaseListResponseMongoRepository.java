package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.CaseListResponseDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for CaseListResponse documents.
 */
public interface CaseListResponseMongoRepository extends MongoRepository<CaseListResponseDocument, String> {
}
