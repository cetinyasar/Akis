package com.cetinyasar.akis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Çetin on 2.2.2015.
 */
public class AramaSonucuIsAkisiInstance {
    public int IsAkisiInstanceId;
    public String Baslik;
    public String Aciklama;
    public Date Deadline;
    public Date OlusturmaTarihi;
    public Date SonlanmaTarihi;
    public boolean Sonlanmis;
    public int OlusturanId;
    //public List<AktifFaaliyet> AktifFaaliyetler = new List<AktifFaaliyet>();
    //public List<TamamlanmisFaaliyet> TamamlanmisFaaliyetler = new List<TamamlanmisFaaliyet>();
    public int Oncelik;
    public List<Integer> OkuyanKullaniciIdler = new ArrayList<Integer>();
    public List<Integer> GizleyenKullaniciIdler = new ArrayList<Integer>();
    public boolean Acil;
    public int AcilSiraNo;
    public String IsKisaAd;

    //javascript tarafında kullanılacak propertyler
    public String OlusturanKullaniciAdi;
    public boolean Gizlenmis;
    public boolean Okunmus;
    public int PanoId;
    public int PanoSiraNo;
    public boolean DragOverDurumunda;
    public boolean Surukleniyor;

}
