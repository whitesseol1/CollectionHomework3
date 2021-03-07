package com.kh.practice.set.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	
	private Scanner sc=new Scanner(System.in);
	private LotteryController lc=new LotteryController();
	
	public void mainMenu() {
		int cho=0;
		do {
		System.out.println("========== KH ��÷ ���α׷� ==========");
		System.out.println("1. ��÷ ��� �߰�");
		System.out.println("2. ��÷ ��� ����");
		System.out.println("3. ��÷ ��� Ȯ��");
		System.out.println("4. ���ĵ� ��÷ ��� Ȯ��");
		System.out.println("5. ��÷ ��� �˻�");
		System.out.println("9. ����");
		System.out.print("��ȣ �Է� :");  
		  cho=sc.nextInt();
		    switch(cho) {
			    case 1 : insertObject(); break;
			    case 2 : deleteObject(); break;
			    case 3 : winObject(); break;
			    case 4 : sortedWinObject(); break;
			    case 5 : searchWinner(); break;
			    case 9 : System.out.println("���α׷� ����"); return;
			    default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			    
		    }
		}while(cho!=9);
		
	}
	
	public void insertObject() {
		System.out.print("�߰��� ��÷ ��� �� :");
		int members=sc.nextInt();
		boolean flag=false;
		int insertMember=0;
		ArrayList<Lottery> list=new ArrayList();
		   do{
			    System.out.print("�̸� :");
			         String name=sc.nextLine();
			    System.out.print("�ڵ��� ��ȣ:"); 
			         String phone=sc.nextLine();
			      Lottery member=new Lottery(name,phone); 
			         for(Lottery l : list) {
			        	  if(l.equals(member)) {
			        		 System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է��ϼ���");
			        	 }
			         }
			      list.add(member);
			      flag=lc.insertObject(member);
			      
			         if(flag==true) {
			        	 insertMember++;
			         }
			         
		   }while(insertMember==members);
		   
		System.out.println(insertMember+"�� �߰� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void deleteObject() {
		
	}
	
	public void winObject() {
		
	}
	
	public void sortedWinObject() {
		
	}
	
	public void searchWinner() {
		
	}
	
	

}
