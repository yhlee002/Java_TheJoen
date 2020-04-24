package thread01;

/*
 * cf.thread : 실, 가닥의 의미.
 * - process : 자신만의 데이터를 가진다.
 * - thread : 동일한 데이터를 공유한다.
 * (하나의 프로그램 안에서 공유 데이터 - process의 data - 를 이용해서 병렬적으로 동작하고 이것이 멀티 스레드)
 * 스레드는 하나의 프로세스 안에 존재한다.
 * 
 * [thread 사용 이유]
 * - 동시에 여러 thread가 동작하며 하나의 작업을 나눠서 실행해 작업의 응답속도를 높이고 동시에 여러 작업을 처리할 수 있게도 할 수 있다.
 * 	ex)게임에서 응답성을 높이기 위해 사용, GUI에서는 마우스, 키보드 등의 응답성을 높힘, 웹 브라우저를 서칭하면서 동시에 파일을 다운받을 수 있음
 * 		-----------------------------
 * 		|	\		|			\	| 
 * 		|	/		|			/	|
 * 		|	\		|			\	|
 * 		|	▽		▽			▽	|
 * 		----------------------------
 * 		(하나의 process 내의 3개의 thread - multi thread)
 * 
 * [thread 생성과 실행]
 * - 주로 쓰이는 메소드(thread는 Thread class가 담당한다.)
 *		Thread의 생성자 : Thread(), THread(String name), Thread(Runnable target, String name)
 * 		static void sleep(int milliseconds)
 * 		void run()
 * 		void start()
 * 
 * - 생성 방법
 * (1)extends (class) Thread : 제약이 생김. Java에서는 다중 상속이 불가하기 때문에 다른 클래스를 상속받지 못하게 되는 것이 단점.
 * 							부모가 하나 있으면 Thread를 상속받을 수 없다. 사실상 더 편하긴 함
 * (2)implements (Interface) Runnable : 여러개를 구현 가능
 */
public class Count {
	//아래의 기능을 똑같이 수행하나 Thread를 사용하는 클래스를 생성한 파일 : CountThread.java
	public static void main(String[] args) {
		//1~10까지를 세는 기능
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
		
	}
	
}
