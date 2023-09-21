package com.ashik.MedCare.Controllers;

import com.ashik.MedCare.Repository.SlotRepository;
import com.ashik.MedCare.Utils.GeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class SlotController {

    @Autowired
    private SlotRepository slotRepository;

    @DeleteMapping("/slot/delete/{slotId}")
    public ResponseEntity<?> deleteSlot(@PathVariable Integer slotId){

        slotRepository.deleteById(slotId);

        GeneralResponse generalResponse = new GeneralResponse();
        generalResponse.setMessage("slot deleted");
        generalResponse.setSuccess(true);


        return new ResponseEntity<>(generalResponse, HttpStatus.OK);

    }

}
