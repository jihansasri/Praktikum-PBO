package praktikum7;
import java.util.Scanner;

public class DataMerchant {
    static Scanner in = new Scanner(System.in);
    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahDagang(Merchant merchant){
        Merchant temp[]=new Merchant[DataMerchant.merc.length+1];
        for (int i = 0; i < DataMerchant.merc.length; i++){
            temp[i]=DataMerchant.merc[i];
        }
        temp[DataMerchant.merc.length]=merchant;
        return temp;
    }

    public static void tampilData(){
        for (Merchant mch1 : merc){
            System.out.println("---Dagangan UBFood---");
            System.out.println("Nama Dagangan   : "+mch1.getNamaMerchant());
            System.out.println("Nama Produk     : "+mch1.getNamaProduk());
            System.out.println("Harga           : "+(int)mch1.getHargaMakanan());
        }
    }
    public static Merchant cariMerchant (String nama){
        for (int i = 0; i < DataMerchant.merc.length; i++){
            if (nama.equalsIgnoreCase(DataMerchant.merc[i].getNamaMerchant())){
                return DataMerchant.merc[i];
            }
        }
        return null;
    }
}


