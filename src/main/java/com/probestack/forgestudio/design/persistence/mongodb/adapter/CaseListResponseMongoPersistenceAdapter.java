package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.CaseListResponseDomainRepository;
import com.probestack.forgestudio.design.model.CaseListResponse;
import com.probestack.forgestudio.design.persistence.mongodb.document.CaseListResponseDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.CaseListResponseMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CaseListResponseMongoPersistenceAdapter implements CaseListResponseDomainRepository {
    private final CaseListResponseMongoRepository repository;

    public CaseListResponseMongoPersistenceAdapter(CaseListResponseMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public CaseListResponse save(CaseListResponse caseListResponse) {
        CaseListResponseDocument document = toDocument(caseListResponse);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<CaseListResponse> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<CaseListResponse> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private CaseListResponseDocument toDocument(CaseListResponse caseListResponse) {
        CaseListResponseDocument document = new CaseListResponseDocument();
        BeanUtils.copyProperties(caseListResponse, document);
        return document;
    }

    private CaseListResponse toDomain(CaseListResponseDocument document) {
        CaseListResponse domain = new CaseListResponse();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
