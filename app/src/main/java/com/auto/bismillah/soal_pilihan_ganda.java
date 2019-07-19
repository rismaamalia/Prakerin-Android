package com.auto.bismillah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class soal_pilihan_ganda extends AppCompatActivity {

    public String pintar[] = {
            " Panjang alas suatu segitiga adalah 12 cm dan tingginya 5 cm. Luas segitiga itu adalah?",
            " Luas sebuah segitiga adalah 135 cm² dan panjang alasnya 18 cm. Berapakah tinggi segitiga tersebut?",
            " Keliling segitiga ABC sama kaki adalah 60 cm. Jika AC = BC = 18 cm, maka panjang AB adalah?",
            " Luas sebuah segitiga adalah 210 cm² sedangkan tinggi segitiga tersebut adalah 14 cm. Maka panjang alas segitiga tersebut adalah?",
            " Berapakah luas persegi yang panjang sisinya 14 cm?",
            " Suatu persegi panjang memiliki luas 144 cm² dan panjangnya 16 cm. Tentukan lebar persegi panjang tersebut",
            " Tentukan keliling belah ketupat yang panjang sisinya 13 cm",
            " Suatu belah ketupat memiliki panjang diagonal 15 cm dan 22 cm. Berapakah luas belah ketupat tersebut?",
            " Tentukan luas trapesium yang panjang sisi sejajarnya adalah 12 cm dan 15 cm serta memiliki tinggi 8 cm?",
            " Tentukan luas jajar genjang yang panjang alasnya 19 cm dan tinggi 8 cm ! "

    };

    private String pilihanJawaban[][] = {
            {"40 cm", "30 cm", "20 cm"},
            {"15 cm", "30 cm", "10 cm"},
            {"12 cm", "48 cm", "24 cm"},
            {"40 cm", "30 cm", "20 cm"},
            {"100 cm", "80 cm", "196 cm"},
            {"9 cm", "10 cm", "12 cm"},
            {"52 cm", "50 cm", "24 cm"},
            {"150 cm", "170 cm", "165cm"},
            {"108 cm", "116cm", "100cm"},
            {"130 cm", "150 cm", "152 cm"}


    };

    private String JawabanBenar[] = {
            "30 cm",
            "15 cm",
            "24 cm",
            "30 cm",
            "196 cm",
            "9 cm",
            "52 cm",
            "165 cm",
            "108 cm",
            "152 cm"
    };

    public String getPertanyaan(int x) {
        String soal = pintar[x];
        return soal;
    }

    public String getPilihanJawaban1(int x) {
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    public String getPilihanJawaban2(int x) {
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3(int x) {
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    public String getJawabanBenar(int x) {
        String jawaban = JawabanBenar[x];
        return jawaban;
    }



    public String cerdas[] = {
            " Berapa luas persegi yang mempunyai panjang sisi 5 cm ?",
            "Jika luas suatu bujur sangkar adalah 36 cm berapa panjang sisi persegi Tersebut ?",
            " Suatu persegi panjang mempunyai panjang = 8 cm dan lebar = 5 cm, Berapa Luas persegi panjang itu ?",
            " Suatu persegi panjang mempunyai luas = 70cm dan panjang 10 cm, Berapa lebar dan keliling persegi panjang tersebut ?",
            " Suatu segitiga sama sisi mempunyai panjang alas = 8 cm dan tinggi 6 cm, Berapa Luas segitiga tersebut ?",
            " Suatu jajaran genjang mempunyai panjang= 7 cm dan lebar= 3 cm Berapa keliling jajarangenjang tsb?",
            "Panjang sisi belah ketupat = 5 cm, berapakah kelilingnya ?",
            "Suatu lingkaran mempunyai diameter 12 cm, berapakah luas lingkaran Tersebut ?",
            "  Panjang suatu diagonal layang-layang adalah 15 cm dengan luas 45 cm Berapakah panjang diagonal layang-layang yang satunya ?",
            "Diameter sebuah lingkaran adalah 6 cm, berapa luas setengah lingkaran tersebut?"


    };

    private String pilihanJawabanCerdas[][] = {
            {"25 cm", "30 cm", "40 cm"},
            {"15 cm", "6 cm", "10 cm"},
            {"90 cm", "60 cm", "40 cm"},
            {"9 cm dan 10 cm", "7 cm dan 34 cm", "7 cm dan 30 cm"},
            {"17 cm", "20 cm", "12 cm"},
            {"10 cm", "20 cm", "30 cm"},
            {"30 cm", "10 cm", "20 cm"},
            {"113,04 cm", "117,04 cm", "113,07 cm"},
            {"6 cm", "12 cm", "24 cm"},
            {"130,48 cm", "150,45 cm", "100,48 cm"}


    };

    private String JawabanBenarCerdas[] = {
            "25 cm",
            "6 cm",
            "40 cm",
            "7 cm dan 34 cm",
            "12 cm",
            "20 cm",
            "20 cm",
            "113,04 cm",
            "6 cm",
            "100,48 cm"
    };

    public String getPertanyaanCerdas(int x) {
        String soal = cerdas[x];
        return soal;
    }

    public String getPilihanJawaban1cerdas(int x) {
        String jawaban1 = pilihanJawabanCerdas[x][0];
        return jawaban1;
    }

    public String getPilihanJawaban2cerdas(int x) {
        String jawaban2 = pilihanJawabanCerdas[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3cerdas(int x) {
        String jawaban3 = pilihanJawabanCerdas[x][2];
        return jawaban3;
    }

    public String getJawabanBenarCerdas(int x) {
        String jawaban = JawabanBenarCerdas[x];
        return jawaban;
    }



    public String jenius[] = {
            "Pak ubur memiliki sebidang kebun berbentuk persegipanjang dengan luas 2 hektar." +
                    " jika lebar kebun adalah 125 m, tentukan panjang kebun pak subur tersebut!",
            "Selembar kain bentuk persegipanjang memiliki ukuran perbandingan panjang dan lebar adalah 3:2" +
                    "Jika luas penampang kain adalah 54 m tentukan panjang dan lebar kain tersebut!",
            "Diketahui keliling suatu persegi sebagai berikut.\n K = 52 cm" +
                    "Tentukan ukuran sisi persegi dan luasnya.",
            "Diketahui luas persegi sama dengan luas persegi panjang dengan panjang = 16 cm dan lebar = 4 cm. \n" +
                    "Tentukan keliling persegi tersebut.",
            "Sebuah lantai berbentuk persegi dengan pan&ang sisinya 6 m. \n" +
                    "lantai tersebut akan dipasang ubin berbentuk persegi berukuran 30 cm x 30cm. \n" +
                    "Tentukan banyaknya ubin yang diperlukan untuk menutup lantai."



    };

    private String pilihanJawabanJenius[][] = {
            {"140m", "160m", "180m"},
            {"9m dan 7m", "6m dan 9m", "9m dan 6m"},
            {"13cm dan 169cm", "90cm dan 120cm", "170cm dan 13cm"},
            {"32cm", "34cm", "36cm"},
            {"200 ubin", "600 ubin", "400 ubin"}

    };

    private String JawabanBenarJenius[] = {
            "160m",
            "9m dan 6m ",
            "13cm dan 169cm",
            "32 cm",
            "400 ubin"

    };

    public String getPertanyaanJenius(int x) {
        String soal = jenius[x];
        return soal;
    }

    public String getPilihanJawaban1jenius(int x) {
        String jawaban1 = pilihanJawabanJenius[x][0];
        return jawaban1;
    }

    public String getPilihanJawaban2jenius(int x) {
        String jawaban2 = pilihanJawabanJenius[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3jenius(int x) {
        String jawaban3 = pilihanJawabanJenius[x][2];
        return jawaban3;
    }

    public String getJawabanBenarJenius(int x) {
        String jawaban = JawabanBenarJenius[x];
        return jawaban;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_pilihan_ganda);
    }
}
