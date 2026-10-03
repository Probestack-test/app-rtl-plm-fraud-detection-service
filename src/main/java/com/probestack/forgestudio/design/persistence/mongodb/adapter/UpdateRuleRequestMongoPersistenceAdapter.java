package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.UpdateRuleRequestDomainRepository;
import com.probestack.forgestudio.design.model.UpdateRuleRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.UpdateRuleRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.UpdateRuleRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UpdateRuleRequestMongoPersistenceAdapter implements UpdateRuleRequestDomainRepository {
    private final UpdateRuleRequestMongoRepository repository;

    public UpdateRuleRequestMongoPersistenceAdapter(UpdateRuleRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public UpdateRuleRequest save(UpdateRuleRequest updateRuleRequest) {
        UpdateRuleRequestDocument document = toDocument(updateRuleRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<UpdateRuleRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<UpdateRuleRequest> findAll() {
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

    private UpdateRuleRequestDocument toDocument(UpdateRuleRequest updateRuleRequest) {
        UpdateRuleRequestDocument document = new UpdateRuleRequestDocument();
        BeanUtils.copyProperties(updateRuleRequest, document);
        return document;
    }

    private UpdateRuleRequest toDomain(UpdateRuleRequestDocument document) {
        UpdateRuleRequest domain = new UpdateRuleRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
