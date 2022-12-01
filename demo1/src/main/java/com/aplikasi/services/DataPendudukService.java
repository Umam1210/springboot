package com.aplikasi.services;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplikasi.models.entities.DataPenduduk;
import com.aplikasi.models.repos.DataPendudukRepo;

@Service
@Transactional
public class DataPendudukService {
    
    @Autowired
    private DataPendudukRepo dataPendudukRepo;


    public DataPenduduk save(DataPenduduk DataPenduduk){
        return dataPendudukRepo.save(DataPenduduk);
    }

    // public DataPenduduk findOne(String id) {
    //     Optional<DataPenduduk> Data = dataPendudukRepo.findById(id);
    //     if (!Data.isPresent()){
    //         return null;
    //     } else {
    //     return Data.get();
    //     }
    // }

    public DataPenduduk findOne(Long id){
        return dataPendudukRepo.findById(id).get();
    }

    public Iterable<DataPenduduk> findAll(){
        return dataPendudukRepo.findAll();
    }

    public void removeOne(Long id){
        dataPendudukRepo.deleteById(id);
    }

    public List<DataPenduduk> findByName(String name) {
        return dataPendudukRepo.findByNameContains(name);
    }

    public List<DataPenduduk> searchDataPenduduks(String nik, String name) {
        List<DataPenduduk> datapenduduk = null;
        // dataPendudukRepo.searchDataPenduduks(query);
        if (nik != "" && name == "") {
            datapenduduk = dataPendudukRepo.searchDataPendudukbyNIK(nik);
        } else if (nik == "" && name != "") {
            datapenduduk = dataPendudukRepo.searchDataPendudukbyName(name);
        } else {
            datapenduduk = dataPendudukRepo.searchDataPendudukbyNIKandName(nik, name);
        }
        return datapenduduk;
    }

    public DataPenduduk create(@Valid DataPenduduk dataPenduduk) {
        return null;
    }

}