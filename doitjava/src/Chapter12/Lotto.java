package Chapter12;
import java.util.Random;
import java.util.Scanner;
 
public class Lotto {
    public static void main(String[] args) {
        
        
        //¹è¿­Å©±â Á¤ÀÇ
        int LottoNumber[] = new int[6];
        
        //·£´ıÇÔ¼ö Á¤ÀÇ
        Random random = new Random();
        
        //·Î¶Ç¼ıÀÚ ¹üÀÇ (min, max Á¤ÀÇ)
        int min = 1;
        int max = 45;
 
    
        //for¹® µ¹·Á¼­ 1 ~ 45¹øÀÇ ·£´ı¼ıÀÚ ÃßÃâ
        for (int i = 0; i < LottoNumber.length; i++) {
            // nextInt(45) ÀÌ¸é ÇØ´ç ¹üÀ§°¡ 0 ~ 44 ÀÌ¹Ç·Î
            // ³»°¡ ½ÇÁ¦ ±¸ÇÏ°í ½ÍÀº°Ç 1 ~ 45 ÀÌ±â ¶§¹®¿¡ ¸¶Áö¸·¿¡ ¯M¼Ò°ªÀÎ minÀ» ´õÇØÁÖ¸é µÈ´Ù!
            LottoNumber[i] = (random.nextInt((max - min) + 1) + min);
            System.out.println("LottoNumber --> " + LottoNumber[i]);
            
            //Áßº¹Ã³¸®·ÎÁ÷
            //¾ÕÀÇ ¼ıÀÚ¿Í µÚÀÇ ¼ıÀÚ°¡ °°À¸¸é Áßº¹µÈ ¼ıÀÚ¸¦ ¾Ë·ÁÁÖ°í ´Ù½Ã ÇÑ ¹øµ·´Ù.
            
            for (int j = 0; j < i; j++) {
                if (LottoNumber[i] == LottoNumber[j]) {
                    System.out.println("Áßº¹µÈ ¼ıÀÚ°¡ ÀÖ¾î¿ä --> "+LottoNumber[i]);
                    //Áßº¹°Ç¼ö¸¦ Ã³¸®ÇÏ±âÀÇÇØ ¹İº¹ºĞ i ¹øÂ°¸¦ ´Ù½Ã ³»¸°´Ù.
                    i--;
                }
 
            }
        }
        
        //À§¿¡¼­ Á¤¸®µÈ LottoNumber ¹è¿­À» ´Ù½Ã ¸¶Áö¸·À¸·Î Á¤¸®
        for (int i = 0; i < LottoNumber.length; i++) {
            System.out.println("LOTTO NUMBER  ------->               " + LottoNumber[i]);
        }
    }
}
