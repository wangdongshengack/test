package com.wds.Title;

import java.math.BigDecimal;

public class Demo1 {

	public static void main(String[] args) {
		shaizi(10);
	}
	
	
	/**
	    * 写一个验证掷骰子概率的程序，同时投掷2颗6面骰子n次，计算其和得到各数字的概率。
	 * @param n
	 */
	public static void shaizi(int n) {
		int a,b,c,i;
		//会出先2-12这11中情况
		int[] a1 = new int[11];
		i = 1;
		while(i<=n) {
			a=(int)Math.floor(Math.random()*6+1);//掷骰子a
			b=(int)Math.floor(Math.random()*6+1);//掷骰子b
			Integer d = new Integer(1);
			c=a+b;
			switch(c)			//统计各种情况出现的次数
			{					//随机数表示骰子1-6点,
								//所以case 0-case10表示和为2-12的情况
				case 2:			
					a1[0]++;		
					break;
				case 3:
					a1[1]++;
					break;
				case 4:
					a1[2]++;
					break;
				case 5:
					a1[3]++;
					break;
				case 6:
					a1[4]++;
					break;
				case 7:
					a1[5]++;
					break;
					
				case 8:
					a1[6]++;
					break;
				case 9:
					a1[7]++;
					break;
				case 10:
					a1[8]++;
					break;
				case 11:
					a1[9]++;
					break;
				case 12:
					a1[10]++;
					break;
				default:
					break;
					
			}
			i++;
		}
		for(i = 0;i<a1.length;i++) {
			BigDecimal n1 = new BigDecimal(a1[i]);
			BigDecimal m1 = new BigDecimal(n);
			BigDecimal result = n1.divide(m1);
			double r = result.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.println("在"+n+"次实验中,两骰子点数之和为"+(i+2)+"出现"
					        +a1[i]
							+"次;"
							+'\n'
							+"频率为"+r);
		}
	}
}
