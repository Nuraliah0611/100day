 package javaapplication5;
public class JavaApplication5 {
    public static void main(String[] args) {
    int tanah1 = 10*15;
    int tanah2 = 10*20;
    int tanah3 = 10*25;
    int tanah4 = 10*30;
    int tanah5 = 10*35;
    
    double persen = 10/100.0;
    
    double jatahTanah1 = tanah1 * persen;
    double jatahTanah2 = tanah2 * persen;
    double jatahTanah3 = tanah3 * persen;
    double jatahTanah4 = tanah4 * persen;
    double jatahTanah5 = tanah5 * persen;
        System.out.println("jatahTanah1="+jatahTanah1);
        System.out.println("jatahTanah2="+jatahTanah2);
        System.out.println("jatahTanah3="+jatahTanah3);
        System.out.println("jatahTanah4="+jatahTanah4);
        System.out.println("jatahTanah1="+jatahTanah5);
        System.out.println("Jatah tanah total="+(jatahTanah1+jatahTanah2+jatahTanah3+jatahTanah4+jatahTanah5));
    }
    
}
