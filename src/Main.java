import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Dizideki elemanlarının harmonik ortalamasını bulan programa hoş geldiniz");
         System.out.println("Dizinin boyutunu girin");
        int boyut= klavye.nextInt();
        double[]dizi=new double[boyut];
        double harmonik,terstop=0;
        for (int i=0;i< dizi.length;i++){
          System.out.println(i+1+" . terimim giriniz");
            dizi[i]= klavye.nextInt();
            terstop+=1/dizi[i];
        }
        harmonik=dizi.length/terstop;
    System.out.println("Oluşturduğunuz "+boyut+" elemanlı dizinin harmonik ortalaması =  "+harmonik);
    }
}