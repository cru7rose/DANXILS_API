//package com.example.danxils_api.repository;
//
//
//import org.springframework.data.repository.CrudRepository;
//import com.example.danxils_api.model.StatusResponse;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface StatusRepository extends CrudRepository<StatusResponse, String> {
//
//    @Query("SELECT new com.example.danxils_api.model.StatusResponse(" +
//            "CASE " +
//            "   WHEN sh.danxCode IS NULL THEN 'Nieznany status' " +
//            "   WHEN sh.danxCode = 'INFO' THEN 'Stworzony' " +
//            "   WHEN sh.danxCode = 'PSIP' THEN 'Odebrany' " +
//            "   WHEN sh.danxCode = 'TERM' THEN 'Terminal' " +
//            "   WHEN sh.danxCode = 'LOAD' THEN 'Załadowany' " +
//            "   WHEN sh.danxCode = 'POD' THEN 'Dostarczony' " +
//            "   WHEN sh.danxCode = 'DMG' THEN 'Uszkodzony' " +
//            "   WHEN sh.danxCode = 'UTA' THEN 'Zmiana czasu dostawy' " +
//            "   ELSE 'Nieznany status' " +
//            "END, sh.danxCode, sh.logTime, s.barcode, she.longitude, she.latitude) " +
//            "FROM StatusHistory sh " +
//            "JOIN StatusHistoryExt_Log she ON sh.sendingID = she.she_SendingID " +
//            "JOIN Sending s ON sh.sendingID = s.sendingID " +
//            "WHERE s.barcode = :barcode")
//    StatusResponse findStatusByBarcode(String barcode);
//}
