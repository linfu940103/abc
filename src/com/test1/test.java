package com.test1;
import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("你好");
		while(true){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int sum=getSum(str);
		System.out.println(sum);
		}
	}
	
public static int getSum(String str){
	int sum=0;
	int sumNew=0;
	ArrayList list=new ArrayList();
	char []c=str.toCharArray();
	for(int i=0;i<c.length;i++){
		//如果list中存在这个字母。那么就将list清空
		if(list.contains(c[i])){
			list.clear();
			if(sum<sumNew){
				sum=sumNew;
			}
		}else{
			//如果list中不存在这个字母，那么就将其加入到list中
			list.add(c[i]);
			sumNew++;
		}
	}
	
	return sum;
}
}
