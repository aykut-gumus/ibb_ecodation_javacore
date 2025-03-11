package com.aykutgumus._1_part_javatypes;

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
        // Primitive Types : 8 tanedir. null değer alamazsınız.
        // tam sayılar (4 tane)

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
    }
}
