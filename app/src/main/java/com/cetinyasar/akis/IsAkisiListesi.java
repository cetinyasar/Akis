package com.cetinyasar.akis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Çetin on 2.2.2015.
 */
public class IsAkisiListesi {
    //public List<GorevListesiSayfaTab> Tablar = new List<GorevListesiSayfaTab>();
    //public String Query;
    public int KullaniciId;
    public List<String> KullaniciRoller;
    public String ListeSayfasiAnahtari;
    public Boolean AramaSayfasi;
    //public List<GorevSorgu> KayitliSorgular;
    //public IntellisenseListeleri IntellisensBigileri;
    public Date Bugun = new Date();

    public List<Pano> Panolar = new ArrayList<Pano>();
    public Boolean PanoSistemiAktif;

}
