package com.aykutgumus._1_part_javatypes;

import java.sql.SQLOutput;

public class _02_Variables {
    public static void main(String[] args) {

        // Veri değişken isimlerini yazarken;
        /*
            veri isimlendirmeleri;
            1-) isim veya sıfat, zamir kullanmamız lazım.
            2-) _ veya $ ile başlayabiliriz
            3-) sayı ile bitebilir
            4-) Sayı ile başlanmaz
            5-) _veya$ dışında özel simgelerle başlanmaz
            6-) Değişken isimleri camelCase kuralına göre yazılır.
         */
        // Anlamlı ve açıklayıcı isimler seçiniz
        // Primitive Types : 8 tanedir. null değer alamazsınız.
        // tam sayılar (4 tane)

        //int studentCounter=11;
        //float totalSalary=14.5355f;

        int schollNumber=23;
        System.out.println(schollNumber);
        schollNumber=44;
        System.out.println(schollNumber);

        int _schollNumber=55;
        System.out.println(_schollNumber);

        int $schollNumber=99;
        System.out.println($schollNumber);

        int schollNumber123=105;
        System.out.println(schollNumber123);

        // yazamazsınız
        //int schoolNumber=11; //aynı isimde yazamazsın
        //int 44schollNumber=11; //sayıyla başlayamazsın
        //int scholl-number=99;
        //System.out.println(school-number);
        int school_number=66;   // değişkenlerde boşluk kullanılmaz
        //yazmayalım
        float totalSalary=14.5355f;
        System.out.println(totalSalary);

        // SABİT
        final int MAX_STUDENTS=100;
        System.out.println(MAX_STUDENTS);
    }
}
