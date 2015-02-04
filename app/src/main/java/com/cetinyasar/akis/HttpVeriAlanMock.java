package com.cetinyasar.akis;

import java.util.ArrayList;

/**
 * Created by Çetin on 2.2.2015.
 */
public class HttpVeriAlanMock implements IHttpVeriAlan {
    @Override
    public IsAkisiListesi GorevleriAl(GorevleriAlInput input) {
        IsAkisiListesi retVal = new IsAkisiListesi();
        retVal.Panolar = new ArrayList<Pano>();

        Pano pano1 = new Pano();
        pano1.Ad = "PANO 1";
        pano1.Id = 1;

        pano1.Isler = new ArrayList<AramaSonucuIsAkisiInstance>();
        pano1.Isler.add(0, new AramaSonucuIsAkisiInstance(){{Baslik = "Pano 1 Başlık 1"; Aciklama = "Açıklama 1";}});
        pano1.Isler.add(1, new AramaSonucuIsAkisiInstance(){{Baslik = "Pano 1 Başlık 2"; Aciklama = "Açıklama 2";}});
        pano1.Isler.add(2, new AramaSonucuIsAkisiInstance(){{Baslik = "Pano 1 Başlık 3"; Aciklama = "Açıklama 3";}});
        pano1.Isler.add(3, new AramaSonucuIsAkisiInstance(){{Baslik = "Pano 1 Başlık 4"; Aciklama = "Açıklama 4";}});
        retVal.Panolar.add(pano1);

        Pano pano2 = new Pano();
        pano2.Ad = "PANO 2";
        pano2.Id = 2;
        pano2.Isler = new ArrayList<AramaSonucuIsAkisiInstance>();
        pano2.Isler.add(0, new AramaSonucuIsAkisiInstance(){{Baslik = "Pano 2 Başlık 1"; Aciklama = "Açıklama 1";}});
        pano2.Isler.add(1, new AramaSonucuIsAkisiInstance(){{Baslik = "Pano 2 Başlık 2"; Aciklama = "Açıklama 2";}});
        retVal.Panolar.add(pano2);

        Pano pano3 = new Pano();
        pano3.Ad = "PANO 3";
        pano3.Id = 3;
        pano3.Isler = new ArrayList<AramaSonucuIsAkisiInstance>();
        pano3.Isler.add(0, new AramaSonucuIsAkisiInstance(){{Baslik = "Pano 3 Başlık 1"; Aciklama = "Açıklama 1";}});
        pano3.Isler.add(1, new AramaSonucuIsAkisiInstance(){{Baslik = "Pano 3 Başlık 2"; Aciklama = "Açıklama 2";}});
        retVal.Panolar.add(pano3);


        Pano pano4 = new Pano();
        pano4.Ad = "PANO 4";
        pano4.Id = 4;
        pano4.Isler = new ArrayList<AramaSonucuIsAkisiInstance>();
        pano4.Isler.add(0, new AramaSonucuIsAkisiInstance(){{Baslik = "Pano 4 Başlık 1"; Aciklama = "Açıklama 1";}});
        pano4.Isler.add(1, new AramaSonucuIsAkisiInstance(){{Baslik = "Pano 4 Başlık 2"; Aciklama = "Açıklama 2";}});
        retVal.Panolar.add(pano4);


        return retVal;
    }
}
