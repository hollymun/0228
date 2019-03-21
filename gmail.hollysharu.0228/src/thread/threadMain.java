package thread;

public class threadMain {

	public static void main(String[] args) {
/*
		SampleThread t1 = new SampleThread();
		SampleThread t2 = new SampleThread();
		
		//일반 메소드 호출
		//t1.run();
		//t2.run();
	
		//스레드 시작 
		//t1.start();
		//t2.start();
		
		//thread로부터 상속받는 클래스의 인스턴스 생성
		//상속받는 클래스를 만들면 인스턴스를 여러 개 생성 가능 
		//클래스가 메모리 영역에 계속 존재 
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		//anonymours class 이용
		//메모리를 절약할 수는 있지만 여러 개의 인스턴스 생성을 못함 
		Thread th2 = new Thread() {
			public void run() {
				try {
					for(int i=0; i<10; i=i+1) {
						Thread.sleep(500);
						System.out.printf("AnonymousClass 이용\n");
					}
				}
				catch(Exception e) {
						System.out.printf("%s\n", e.getMessage());
					}
				}
		};
		th2.start();
		
		
		//Runnable 인터페이스를 이용한 스레드 생성 및 시작
		Runnable th3 = new Runnable() {

			@Override
			public void run() {
				try {
					for(int i=0; i<10; i=i+1) {
						Thread.sleep(500);
						System.out.printf("Runnable Interface 이용함\n");
					}
				}
				catch(Exception e) {
						System.out.printf("%s\n", e.getMessage());
					}
			}
		};
		Thread th4 = new Thread(th3);
		th4.start();
		
		Thread backgroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0; i<5; i=i+1) {
						Thread.sleep(1000);
						System.out.printf("데몬 스레드\n");
					}
				}catch(InterruptedException e) {
					//예외가 발생했을 때 스레드를 종료할 수 있도록 return을 작성 
					return;
				}
			}
		};
		//데몬 스레드로 생성 - 다른 스레드가 동작 중이 아니면 자동 중지 
		//start 호출하기 전에 설정 
		//온라인게임에서 데이터 전송 등에 많이 사용 - 일정 시간 이상 움직임 없으면 튕기기 
		backgroundThread.setPriority(Thread.MAX_PRIORITY);
		backgroundThread.setDaemon(true);
		backgroundThread.start();
		
		
		Thread forgetgroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0; i<5; i=i+1) {
						Thread.sleep(1000);
						System.out.printf("포그라운드 스레드\n");
						//필요한 자리에서 interrupt 호출
						//backgrougnThread에 interruptedException을 강제로 발생시키는 구문 
						if(i==1) {
							backgroundThread.interrupt();
						}
					}
				}
				catch(Exception e){}
			}
		};
		//데몬스레드가 아니기 때문에 강제로 중지 시키지 않는 이상
		//5초 동안 작업을 수행 
		//우선순위 변경 - 우선순위 높은 게 먼저 출력될 가능성이 높아짐  
		forgetgroundThread.setPriority(Thread.MIN_PRIORITY);
		forgetgroundThread.start();
*/
		
	
	
		
	}
}
