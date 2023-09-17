package com.ashik.MedCare.Services.ServiceImplementation;

import com.ashik.MedCare.DTOs.SlotDto;
import com.ashik.MedCare.Entities.Slot;
import com.ashik.MedCare.Repository.SlotRepository;
import com.ashik.MedCare.Services.SlotServices;
import com.ashik.MedCare.Utils.SLOT.SlotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SlotServiceImpl  implements SlotServices {

    @Autowired
    private SlotRepository slotRepository;


    @Override
    public List<SlotDto> getAllSlotofSingleDoctor(Integer id) {

        List<Slot> byDoctorId = slotRepository.findByDoctorId(id);
        List<SlotDto> collect = byDoctorId.stream().map((slott) -> SlotUtil.SlotToDtoMapper(slott, new SlotDto())).collect(Collectors.toList());

        return collect;
    }
}
