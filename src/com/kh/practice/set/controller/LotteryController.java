package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {

	private HashSet lottery=new HashSet();
	private HashSet win=new HashSet();
	
	public boolean insertObject(Lottery l) {
		boolean flag=true;
		flag=lottery.add(l);
		
		
		return flag;
	}
	public boolean deleteObject(Lottery l) {
		boolean flag=false;
		flag=lottery.remove(l);
		  
		if(flag!=false&&win!=null) {
			win.remove(l);
		}
		return flag;
		
	}
	
	public HashSet winObject() {
		ArrayList list=new ArrayList();
	
		for(Object l : lottery) {
			list.add(l);
			
		}
		
//		 for(int i=0;i<lottery.size();i++){
//			 list.add(0, lottery.);
//		 }
		
		
		
		return win;
	}
	
	public TreeSet sortedWinObject() {
		TreeSet set=new TreeSet();
		
		return set;
	}
	
	public boolean searchWinner(Lottery l) {
		boolean flag=false;
		
		return flag;
		
	}
	
	
	
	
	
}
