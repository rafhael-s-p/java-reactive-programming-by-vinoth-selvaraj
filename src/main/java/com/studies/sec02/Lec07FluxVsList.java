package com.studies.sec02;

import com.studies.sec02.helper.NameGenerator;
import com.studies.utils.Util;

public class Lec07FluxVsList {

    public static void main(String[] args) {

        // List<String> names = NameGenerator.getNames(5);
        //System.out.println(names);

        NameGenerator.getNames(5)
                .subscribe(Util.onNext());

    }

}