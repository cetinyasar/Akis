package com.cetinyasar.akis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Çetin on 2.2.2015.
 */
public class Pano {
    public int Id;
    public String Ad;
    public Boolean Gosteriliyor = true;
    public Boolean GizlenmislerGosteriliyor = false;
    public Boolean AdDegistiriliyor = false;
    public List<AramaSonucuIsAkisiInstance> Isler = new ArrayList<AramaSonucuIsAkisiInstance>();
//    public SiralamaParametre SiralamaBilgileri = new SiralamaParametre();
//    public FiltrelemeParametre DeadlineFiltrelemeBilgileri = new FiltrelemeParametre();
    public int SiraNo;
    public Boolean DigerIslerPanosu;
    public Boolean YakinTakipPanosu;
    public Boolean PanoSiralamaIstegiIsleniyor;
    public Boolean DragOverDurumunda;


}
