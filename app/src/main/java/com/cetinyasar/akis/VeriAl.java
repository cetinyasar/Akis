package com.cetinyasar.akis;

/**
 * Created by Çetin on 2.2.2015.
 */
public class VeriAl {

    public static IsAkisiListesi GorevleriAl(GorevleriAlInput input, IHttpVeriAlan httpVeriAlan)
    {
//        IsAramaSonuc sonuc = isleriAl(input.Query, input.KayitNo);
//        if (!sonuc.Basarili)
//            return new IsAkisiListesiOlusturan().HataIcinOlustur(sonuc);
//        return new IsAkisiListesiOlusturan(sonuc, input.Query, Araclar.ParseInt(input.KayitNo), IAMSessionNesneleri.Kullanici.Id).GecerliAramaIcinOlustur(IAMSessionNesneleri.Kullanici.RolleriStringListOlarakAl(), TemelVeriIslemleriOlustur());

        IsAkisiListesi retVal = httpVeriAlan.GorevleriAl(input);
        return retVal;

    }

//    static List<IsAkisiTanim> isAkisiTanimList;
//    public static List<IsAkisiTanim> IsAkisiTanimlariniAl(int size) {
//        isAkisiTanimList = new ArrayList<IsAkisiTanim>();
//        IsAkisiTanim is1= new IsAkisiTanim();
//        is1.Id = 1890;
//        is1.PanelId = 1;
//        is1.Ad = "(1890) İç Yazılım Görev, Yazılım Geliştir";
//        is1.Aciklama = "Rapor sunucusunda kullanıcı id ve rapor id null geliyor, rapor bittiğinde \"bitti\" mesajı gösterilemiyor.";
//        isAkisiTanimList.add(is1);
//        IsAkisiTanim is2 = new IsAkisiTanim();
//        is2.Id = 1889;
//        is2.PanelId = 1;
//        is2.Ad = "(1889) İç Yazılım Görev, Yazılım Geliştir";
//        is2.Aciklama = "AdaSunucu DLL yapısında düzenleme yapılacak";
//        isAkisiTanimList.add(is2);
//
//        IsAkisiTanim is3 = new IsAkisiTanim();
//        is3.Id = 1889;
//        is3.PanelId = 2;
//        is3.Ad = "(1889) İç Yazılım Görev, Yazılım Geliştir";
//        is3.Aciklama = "AdaSunucu DLL yapısında düzenleme yapılacak";
//        isAkisiTanimList.add(is3);
//
//        for (int i=1; i <= size; i++) {
//            IsAkisiTanim ci = new IsAkisiTanim();
//            ci.Id = i;
//            ci.PanelId = (i % 2) + 1;
//            ci.Ad = "Ad " + i;
//            ci.Aciklama = "Aciklama" + i;
//            isAkisiTanimList.add(ci);
//        }
//        return isAkisiTanimList;
//    }
//
//    public static IsAkisiTanim IsAkisiAl(int isAkisId)
//    {
//        return isAkisiTanimList.get(isAkisId);
//    }

}
