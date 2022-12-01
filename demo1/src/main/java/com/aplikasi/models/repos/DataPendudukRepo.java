package com.aplikasi.models.repos;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aplikasi.models.entities.DataPenduduk;

public interface DataPendudukRepo extends CrudRepository<DataPenduduk, Long> {
    List<DataPenduduk> findByNameContains(String name);

     // search by nik
     @Query("SELECT d FROM DataPenduduk d WHERE d.nik LIKE %?1%")
     List<DataPenduduk> searchDataPendudukbyNIK(String nik);

     @Query("SELECT d FROM DataPenduduk d WHERE d.name LIKE %?1%")
    List<DataPenduduk> searchDataPendudukbyName(String name);

    // search by nik and name
    @Query("SELECT d FROM DataPenduduk d WHERE d.nik LIKE %?1% AND d.name LIKE %?2%")
    List<DataPenduduk> searchDataPendudukbyNIKandName(String nik, String name);

    


}
