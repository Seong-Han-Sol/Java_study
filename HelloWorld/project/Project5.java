package project;

public class Project5 {

	public static void main(String[] args) {
		// 숫자 지그재그로 찍기
		
		int n=4; //줄이  n칸인 변수 예를 들어 4일 경우 4줄 (인덱스 줄은 0 1 2 3)
		int s=0;
		for(int i=0; i<n; i++) { //줄
			if(i%2==0) { //짝수줄
				for(int j=0; j<n; j++) { //칸
					s++;
					System.out.print(s + "\t");
				}
				System.out.println("");
				s=s+n;
			}else {//홀수줄
				for(int j=0; j<n; j++) { //칸
					System.out.print(s + "\t");
					s--;
				}
				System.out.println("");
				s=s+n;
			}
		}
	}

}
