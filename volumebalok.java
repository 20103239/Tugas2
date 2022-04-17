
package tugas.pkg2;

/**
 *
 * @author Kristina Dewi 20103239
 */
public class volumebalok {
    
    double Pj;
    double Lb;
    double Tg;
    double volumebalok;
    
    /* constructor*/
    public volumebalok (double npj, double nlb, double ntg){
        this.setPj(npj);
        this.setLb(nlb);
        this.setTg(ntg);
    }
    
    /* method set panjang*/
    public void setPj(double npj){
        this.Pj = npj;
    }
    
    /* method set lebar*/
    public void setLb (double nlb){
        this.Lb = nlb;
    }
    
    /* method set tinggi*/
    public void setTg (double ntg){
        this.Tg = ntg;
    }
    
    /*
     method double HitungVolumeBalok
     */
     private double HitungVolumeBalok(){
         this.volumebalok = Pj*Lb*Tg;
         return this.volumebalok;
     }
     
      /*Method : CetakVolumeBalok */
     public void CetakVolumeBalok(){
         this.HitungVolumeBalok();
         System.out.println("Hitung Volume Balok");
         System.out.println("-----------------------");
         System.out.println("Nilai Panjang   :"+this.Pj+"cm");
         System.out.println("Nilai Lebar     :"+this.Lb+"cm");
         System.out.println("Nilai Tinggi    :"+this.Tg+"cm");
         System.out.println("Jadi Volume Balok :"+this.volumebalok+"cm2");
     
     }
    
    
}
