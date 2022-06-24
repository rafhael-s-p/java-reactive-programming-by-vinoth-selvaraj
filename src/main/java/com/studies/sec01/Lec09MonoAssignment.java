package com.studies.sec01;

import com.studies.sec01.assignment.FileService;
import com.studies.utils.Util;

public class Lec09MonoAssignment {

    public static void main(String[] args) {

        FileService.write("file03.txt", "File Content 3")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

        FileService.read("file03.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

        FileService.delete("file03.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

    }

}
