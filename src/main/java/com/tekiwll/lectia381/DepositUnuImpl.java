package com.tekiwll.lectia381;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



public class DepositUnuImpl implements DepositService {

    List<String> list = new ArrayList<>();

    @Override
    public void pastreazaUnitate(String name) {
        list.add(name);
    }

    @Override
    public List<String> getUnitati() {
        return list;
    }
}
