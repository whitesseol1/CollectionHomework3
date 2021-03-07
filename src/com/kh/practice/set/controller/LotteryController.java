package com.kh.practice.set.controller;

import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {

	private HashSet lottery=new HashSet();
	private HashSet win=new HashSet();
	
	public boolean insertObject(Lottery l) {
		lottery.add(l);
		boolean flag=true;
		
		return flag;
	}
	public boolean deleteObject(Lottery l) {
		boolean flag=false;
		
		return flag;
		
	}
	
	public HashSet winObject() {
		
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
