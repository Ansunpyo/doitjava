package Chapter12;
import java.util.Random;
import java.util.Scanner;
 
public class Lotto {
    public static void main(String[] args) {
        
        
        //�迭ũ�� ����
        int LottoNumber[] = new int[6];
        
        //�����Լ� ����
        Random random = new Random();
        
        //�ζǼ��� ���� (min, max ����)
        int min = 1;
        int max = 45;
 
    
        //for�� ������ 1 ~ 45���� �������� ����
        for (int i = 0; i < LottoNumber.length; i++) {
            // nextInt(45) �̸� �ش� ������ 0 ~ 44 �̹Ƿ�
            // ���� ���� ���ϰ� ������ 1 ~ 45 �̱� ������ �������� �M�Ұ��� min�� �����ָ� �ȴ�!
            LottoNumber[i] = (random.nextInt((max - min) + 1) + min);
            System.out.println("LottoNumber --> " + LottoNumber[i]);
            
            //�ߺ�ó������
            //���� ���ڿ� ���� ���ڰ� ������ �ߺ��� ���ڸ� �˷��ְ� �ٽ� �� ������.
            
            for (int j = 0; j < i; j++) {
                if (LottoNumber[i] == LottoNumber[j]) {
                    System.out.println("�ߺ��� ���ڰ� �־�� --> "+LottoNumber[i]);
                    //�ߺ��Ǽ��� ó���ϱ����� �ݺ��� i ��°�� �ٽ� ������.
                    i--;
                }
 
            }
        }
        
        //������ ������ LottoNumber �迭�� �ٽ� ���������� ����
        for (int i = 0; i < LottoNumber.length; i++) {
            System.out.println("LOTTO NUMBER  ------->               " + LottoNumber[i]);
        }
    }
}
