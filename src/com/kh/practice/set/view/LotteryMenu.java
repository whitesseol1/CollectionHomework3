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
		System.out.println("========== KH 추첨 프로그램 ==========");
		System.out.println("1. 추첨 대상 추가");
		System.out.println("2. 추첨 대상 삭제");
		System.out.println("3. 당첨 대상 확인");
		System.out.println("4. 정렬된 당첨 대상 확인");
		System.out.println("5. 당첨 대상 검색");
		System.out.println("9. 종료");
		System.out.print("번호 입력 :");  
		  cho=sc.nextInt();
		    switch(cho) {
			    case 1 : insertObject(); break;
			    case 2 : deleteObject(); break;
			    case 3 : winObject(); break;
			    case 4 : sortedWinObject(); break;
			    case 5 : searchWinner(); break;
			    case 9 : System.out.println("프로그램 종료"); return;
			    default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			    
		    }
		}while(cho!=9);
		
	}
	
	public void insertObject() {
		System.out.print("추가할 추첨 대상 수 :");
		int members=sc.nextInt();
		boolean flag=false;
		int insertMember=0;
		ArrayList<Lottery> list=new ArrayList();
		   do{
			    System.out.print("이름 :");
			         String name=sc.nextLine();
			    System.out.print("핸드폰 번호:"); 
			         String phone=sc.nextLine();
			      Lottery member=new Lottery(name,phone); 
			         for(Lottery l : list) {
			        	  if(l.equals(member)) {
			        		 System.out.println("중복된 대상입니다. 다시 입력하세요");
			        	 }
			         }
			      list.add(member);
			      flag=lc.insertObject(member);
			      
			         if(flag==true) {
			        	 insertMember++;
			         }
			         
		   }while(insertMember==members);
		   
		System.out.println(insertMember+"명 추가 완료되었습니다.");
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
