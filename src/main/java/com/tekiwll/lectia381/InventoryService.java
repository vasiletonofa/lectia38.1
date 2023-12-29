package com.tekiwll.lectia381;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class InventoryService {

    DepositService depositService;

    @Autowired
    InventoryService(@Qualifier("DepozitDoi") DepositService depositService) {
        this.depositService = depositService;
    }


}
