package com.bit.day09;

public class Ex08 {

   public static void main(String[] args) {
      System.out.println("�л������������α׷�(ver 0.3.0)");
      int tot=myInput("�ѿ�>");

      int[][] data=new int[tot][3];
      int input=0;
      while(true) {
         input=myInput("1.���� 2.�Է� 0.����>");
         if(input==0) {
            break;
         }else if(input==1) {
            System.out.println("========================================");
            System.out.println("�й�\t|����\t|����\t|����\t|�հ�");
            System.out.println("----------------------------------------");
            for(int i=0; i<data.length; i++) {
               System.out.print(i+1+"\t|");
               int sum=0;
               for(int j=0; j<data[i].length; j++) {
                  sum+=data[i][j];
                  System.out.print(data[i][j]+"\t|");
               }
               System.out.println(sum);
               System.out.println("----------------------------------------");
            }
         }else if(input==2) {
            try {
               input=myInput("�й�>");
               int[] stu=data[input-1];
               stuInput(stu,0);
               stuInput(stu,1);
               stuInput("����>",stu,2);
            }catch(ArrayIndexOutOfBoundsException e) {
               System.out.println("�������� �ʴ� �й��Դϴ�");
            }catch(NumberFormatException e) {
               System.out.println("�Է��� �ٽ� Ȯ���ϼ���");
            }
         }
      }
      
   }
   public static int myInput(String msg) {
      java.util.Scanner sc;
      sc=new java.util.Scanner(System.in);
      System.out.print(msg);
      int su=Integer.parseInt(sc.nextLine());
      return su;
   }
   
   public static void stuInput(int[] stu,int idx) {
      String[] title= {"����>","����>","����>"};
      stu[idx]=myInput(title[idx]);
   }
   
   public static void stuInput(String title,int[] stu,int idx) {
      stu[idx]=myInput(title);
   }

}
