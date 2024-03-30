package com.example.LTNC_Web2.information;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface informationRepository extends MongoRepository<information,Integer> {
    public information findInformationByInformationId(Integer informationId);
    public void deleteInformationByInformationId(Integer informationId);
}
