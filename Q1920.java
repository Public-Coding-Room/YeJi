package week2;
import java.io.*;
import java.util.*;

public class Q1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
															new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(
															new OutputStreamWriter(System.out));

		// n 배열 크기와 요소 입력
		int n = Integer.valueOf( br.readLine());	
		String strN =  br.readLine();
		
		// m 배열 크기와 요소 입력
		int m = Integer.valueOf( br.readLine());
		String strM =  br.readLine();
		
		// n 배열 생성
		int[] nArr = new int[n];
		StringTokenizer st = new StringTokenizer(strN);// 공백 기준으로 문자열 분리
		for (int i = 0; i < n; i++) {
			nArr[i] = Integer.valueOf(st.nextToken());// 문자열을 정수로 변환해 배열에 담는다.
		}
		
		Arrays.sort(nArr);	// n배열 오름차순 정렬
//		System.out.println(Arrays.toString(nArr));

		// m 배열 생성
		int[] mArr = new int[m];
		st = new StringTokenizer(strM);
		for (int i = 0; i < m; i++) {
			mArr[i] = Integer.valueOf(st.nextToken());
		}


		for (int i = 0; i < m; i++) {	// m배열의 크기만큼 검사
			int result = 0;	// 결과. 0으로 초기화
			// Arrays.binarySearch()
			// m배열 요소가 n배열에 있으면 찾은 인덱스를 반환
			// 못찾으면 음수를 반환한다.
			if (Arrays.binarySearch(nArr, mArr[i]) >= 0) {	
				result = 1;	// 찾으면 결과에 1을 저장
			}
			bw.write(result+"\n");//결과 출력
		}
		bw.flush();
		bw.close();
		br.close();

	}
}

