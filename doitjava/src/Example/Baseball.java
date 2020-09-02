package Example;



import java.util.*;  
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import javax.swing.event.*;  
  

public class Baseball extends JPanel implements ActionListener, ChangeListener{  
  JTabbedPane pane; // JTabbedPane �ʱ�ȭ  
  Button button1 = new Button("�Է�"); // �Է� ��ư  
  TextField keyb = new TextField(10); // Ű���� �Է��� �޴� �ؽ�Ʈ�ʵ� ����  
  TextArea txtStatus = new TextArea(15,55); // ���� ���� �� ����� ǥ���� TextArea ����  
  int num=35, count=0, mynum=0, gamecount=1; // �Է¹��� ���� �� �ε��� ���� ����  
  JProgressBar progBar; // �������� ǥ���� ���α׷��� �� ����  
  Label progTxt; // ���α׷����� ��  
        
  public Baseball(){  
      // HighLow ������  
      JPanel panel;  
      pane = new JTabbedPane(); // �� ����  
      setLayout(new BorderLayout());  
      String helpmessage="\n\t1���� 100 ������ ���ڸ� �Է��Ͽ�\n\t���߾��� ���ڸ� ã�� ���� ���α׷�.\n\n\t���� �� ���� ã�� ���ϸ� ���ӿ��� ����.";  
      createNumber(); // ���� ���۽� ������ �� ����  
      //���α׷��� �� ����  
      progBar = new JProgressBar();  
      progBar.setMinimum(0); // ���α׷��� ���� �ּҰ� ����  
      progBar.setMaximum(6); // �ִ밪 ����  
      progBar.setValue(0); // �ʱⰪ:0���� ����  
      // ���α׷��� �� ���� ��  
      progTxt= new Label("���� ������: ");  
        
      //���� �÷��� ����  
      panel = new JPanel();  
      panel.add(new Label("���� �Է�:"));  
      panel.add(keyb);  
      keyb.addActionListener(this);  
      panel.add(button1);  
      button1.addActionListener(this); // ��ư�� ������ �� ������ ActionListner ����  
      panel.add(txtStatus);  
      panel.add(progTxt);  
      panel.add(progBar); // ���α׷��� ��  
      pane.addTab("����",panel);  
      //���� ����  
      panel = new JPanel();  
      TextArea help=new TextArea(helpmessage,15,55); // ���� TextArea ���  
      panel.add(new Label("����:"));  
      panel.add(help);  
      pane.addTab("����",panel);  
      pane.setSelectedIndex(0);         
        
      pane.addChangeListener(this);  
      add(pane,"Center");  
  }  
  // ������ �� ����  
  public void createNumber(){  
      Random r=new Random();  
      num = r.nextInt(100)+1;  
      System.out.println("������ ������ ��:"+num);  
      gamecount=1; // ���� ī���� �ʱ�ȭ  
      txtStatus.setText("������ ���ڰ� �����Ǿ����ϴ�.\n0���� 100 ������ ���ڸ� �Է��ϼ���..(Ƚ�� ����:6)\n\n");  
  }  
    
  // ���� �Է¹ޱ�  
  public void inputMynumber() {  
      // ���������� �ޱ�  
      mynum=Integer.parseInt(keyb.getText());  
      // ���� ����  
      //createNumber();  
      if(mynum<0 || mynum>100){  
          txtStatus.setText(txtStatus.getText()+"<�Է��Ͻ� "+mynum+"��(��) �Է� ������ �ʰ��߽��ϴ�.>\n");  
      }  
      keyb.setText(""); // ���� �Է� �� �Է� �ʵ带 �ʱ�ȭ �մϴ�.  
  }  
    
  //���� ����  
  public void playgame(){  
      progBar.setValue(gamecount);                  
        
      if(mynum==num){  
          txtStatus.setText(txtStatus.getText()+"\n�ڡڡڡڡں���ڡڡڡڡ�\n");  
          progBar.setValue(6);  
          gamecount=7;  
      } else{  
          if(mynum<num){  
              txtStatus.setText(txtStatus.getText()+"["+(7-gamecount)+"] "+mynum+"���� Ů�ϴ�.\t["+(mynum+1)+"]~[100]������ ���ڸ� �Է��ϼ���.\n");  
              gamecount++;  
          } else if(mynum>num) {  
              txtStatus.setText(txtStatus.getText()+"["+(7-gamecount)+"] "+mynum+"���� �۽��ϴ�.\t[0]~["+(mynum-1)+"]������ ���ڸ� �Է��ϼ���.\n");  
              gamecount++;  
          }  
      }  
      if(gamecount==7){  
          txtStatus.setText(txtStatus.getText()+"\n������ �������ϴ�. ������ "+num+" �Դϴ�.\n <�ƹ� ���ڳ� ������ ������ �ٽ� �����մϴ�>\n");  
      }  
      if(gamecount==8){  
          createNumber();//�ٽ� ���ο� ���� ����  
          progBar.setValue(0);  
      }  
  }  
    
  // ������ ������   
  public Dimension getPreferredSize(){  
      return new Dimension(450, 400);  
  }  
  // ���� ��ȯ�� �� ȿ��  
  public void stateChanged(ChangeEvent e){     
      int curSelIndex = pane.getSelectedIndex();  
      String curPaneTitle = pane.getTitleAt(curSelIndex);  
      System.out.println("["+curPaneTitle + "]���� ���õǾ����ϴ�");  
  }  
  //�׼� �߰�  
  public void actionPerformed(ActionEvent e) {  
      inputMynumber();  
      playgame();  
  }     
  // ���� �Լ�  
  public static void main(String s[]){  
      JFrame frame = new JFrame("��ſ� HighLow ����~!");  
      Baseball panel = new Baseball();  
        
      frame.setForeground(Color.black);  
      frame.setBackground(Color.lightGray);  
      frame.getContentPane().add(panel,"Center");  
        
      frame.setSize(panel.getPreferredSize());  
      extracted(frame);  
      //���� ���� ������ frame.show(); ����.  

      frame.setDefaultCloseOperation(  
          WindowConstants.DISPOSE_ON_CLOSE);  
      
      frame.addWindowListener(new WindowAdapter() {  
          public void windowClosed(WindowEvent e) {  
              System.exit(0);  
          }  
      });  
  }  
  private static void extracted(JFrame frame) {  
      frame.show();  
      //frame.show();  
  }  
}  


