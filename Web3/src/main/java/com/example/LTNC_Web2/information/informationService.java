package com.example.LTNC_Web2.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class informationService {
    @Autowired
    private informationRepository informationRepository;
    // get all information
    public List<information> allInformation(){
        return informationRepository.findAll();
    }

    // get one information by id

    public information getInformationById(Integer id){
        return informationRepository.findInformationByInformationId(id);
    }

    public void addInformationById(Integer informationId,String name,String email){
        informationRepository.save(new information(informationId,name,email));
    }

    public  void deleteStudentById(Integer id){
        informationRepository.deleteInformationByInformationId(id);
    }

    public void updateName(String name , Integer id){
        information inf= informationRepository.findInformationByInformationId(id);
        deleteStudentById(id);
        inf.setName(name);
        informationRepository.save(inf);
    }
}
