package com.tekiwll.lectia381;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class DepositDoiImpl implements DepositService {
    List<String> list = new ArrayList<>();

    @Override
    public void pastreazaUnitate(String name) {
        list.add(name + " -v2");
    }

    @Override
    public List<String> getUnitati() {
        return list;
    }
}
