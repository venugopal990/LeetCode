package com.leetcode.problems.hard;

import java.util.Arrays;

//https://leetcode.com/problems/candy/?envType=study-plan-v2&envId=top-interview-150
public class Candy {

	public static void main(String[] args) {
		
		Candy candy = new Candy();
		System.out.println(candy.candy(new int[] {1,2,87,87,87,2,1}));
		//{1,0,2}  2, 1, 2 = 5 
		//{1,2,2} 1, 2, 1 = 4
		//{1,2,87,87,87,2,1}

	}
	
	
	public int candy(int[] ratings) {
		
		int[] totalCandies = new int[ratings.length];
		
		
		for (int i = 0; i < totalCandies.length-1; i++) {
			System.out.println(">>>>>>>>>>for>>");
			if(ratings[i]>ratings[i+1]) {
				System.out.println(">>>>>>>>>>>if>>");
				if(totalCandies[i] == 0) {
					System.out.println(">>>>>>>>>>>28>>");
					totalCandies[i]=2;
				}
				
				if(totalCandies[i]!=1) {
					System.out.println(">>>>>>>>>>>31>>");
					totalCandies[i+1]=1;
				}
				
				if(totalCandies[i]!=2) {
					System.out.println(">>>>>>>>>>>34>>");
					totalCandies[i+1]=2;
				}
			}else if(ratings[i] == ratings[i+1]){
				totalCandies[i+1] = totalCandies[i];
			}else {
				System.out.println(">>>>>>>>>>else>>");
				if(totalCandies[i] == 0) {
					System.out.println(">>>>>>>>>>>40>>");
					totalCandies[i]=1;
				}
				if(totalCandies[i]!=2) {
					System.out.println(">>>>>>>>>>>43>>");
					totalCandies[i+1]=2;
				}
				
				if(totalCandies[i]!=1) {
					System.out.println(">>>>>>>>>>>46>>");
					totalCandies[i+1]=1;
				}
			}
			
		}
		
		
		Arrays.stream(totalCandies).forEach(System.out::println);
		
		return Arrays.stream(totalCandies).sum();
        
    }

}
