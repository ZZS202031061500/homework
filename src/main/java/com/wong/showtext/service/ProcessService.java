package com.wong.showtext.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessService {
    public List<String> shiftAndSort(List<String> centences) {
        Shift shift = new Shift();
        shift.processShift(centences);
        Sort sort = new Sort();
        sort.processSort(shift.getAfter());
        return shift.getAfter();
    }
}