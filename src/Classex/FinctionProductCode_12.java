package Classex;

import util.DataType;

public class FinctionProductCode_12 {
	double[] prices= {2.98,4.5,9.98,4.49,6.87};
	double resultProduct[]=new double[5];
	//int[] arr;
	int productCount,codeNum;
	public FinctionProductCode_12() {
		//arr=new int[5];
	}
	public   void choiceProgram() {
		boolean flag=false;
		while(flag!=true) {//false!=true:true ,   true!=true : false
			System.out.print("상품을 계속 입력하시겠습니까((입력 1,그 이외는 출력):");
			int num=DataType.inputInt();
			if(num==1) {
				//System.out.println("계속 코드 입력!!!");
				inputProductNum();//상품번호 입력
				inputProductCount();//갯수 입력
				calProduct();//계산 
				flag=false;
			}else {
				totalPro();//코드1~5까지 상품의 총 판매가 계산 출력
				flag=true;
			}
		}
		
	}
	private void inputProductCount() {
		System.out.printf("상품갯수를 입력(상품 %d의 가격 %.2f):\n",codeNum,prices[codeNum-1]);
		productCount=DataType.inputInt();
		if(productCount<0) {
			System.out.println("상품 갯수를 정확히 입력하세요");
		    inputProductCount();
		}
	}
	private  void inputProductNum() {
		System.out.print("상품번호 입력(1-5) :");
		codeNum=DataType.inputInt();
		
		if(codeNum<=0 || codeNum>=6) {
			System.out.println("상품번호를 정확히 입력하세요.....");
			inputProductNum();
		}
	}
	private void calProduct() {
		switch (codeNum) {
		case 1:
			resultProduct[0]=prices[0]*productCount;
			break;
		case 2:
			resultProduct[1]=prices[1]*productCount;
			break;
		case 3:
			resultProduct[2]=prices[2]*productCount;
			break;
		case 4:
			resultProduct[3]=prices[3]*productCount;
			break;
		case 5:
			resultProduct[4]=prices[4]*productCount;
			break;
			
		default:
			break;
		}
	}
	
	private  void totalPro() {
		System.out.println("총 판매가 계산");
		for(int i=0;i<resultProduct.length;i++) {
			if(resultProduct[i]!=0)
				System.out.printf("상품 %d의 총 판매가 : %.2f\n",(i+1),resultProduct[i]);
		}
	}
	
}
