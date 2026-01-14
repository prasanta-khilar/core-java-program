package com.prasanta.basics.difference;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student std1, Student std2) {

        if(std1.getId()==std2.getId()){
            return 0;
        } else if (std1.getId()>std2.getId()) {
            return 1;
        }else {
            return -1;
        }
    }
}
