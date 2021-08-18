int today = (int)((Math.random() * 7) + 1);
		System.out.println(today);
		boolean isAvailableWithdraw = false;
		
		if(today==7){
			isAvailableWithdraw=true;
			System.out.println("출금하는 날입니다");
		} else {
			isAvailableWithdraw=false;
			System.out.println("출금하지 않는 날입니다");
		}
