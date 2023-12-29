package com.tekiwll.lectia381;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepositConfiguration {

    @Bean("DepozitUnu") // Obiect DepositService -> new DepositUnuImpl() -> nume = DepozitUnu
    public DepositService getDepositService() {
        return new DepositUnuImpl();
    }

    @Bean("DepozitDoi") // Obiect DepositService -> new DepositDoiImpl() -> nume = DepozitDoi
    public DepositService getDepositServiceV2() {
        return new DepositDoiImpl();
    }

    @Bean
    public InventoryService getInventoryService() {
        return new InventoryService(getDepositServiceV2());
    }

}
