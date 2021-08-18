String [] grade = {"gold", "silver" , "bronze", "error"};
		String level =  grade[(int)(Math.random() * 4)];
		System.out.println(level);
		int maxLimit; 
		
		if(level == "gold") {
			maxLimit = 300;
			System.out.format("신용카드 한도는 %s입니다.", maxLimit);
		} else if(level == "silver") {
			maxLimit = 100;
			System.out.format("신용카드 한도는 %s입니다.", maxLimit);
		} else if(level == "bronze") {
			maxLimit = 50;
			System.out.format("신용카드 한도는 %s입니다.", maxLimit);
		} else {
			System.out.println("오류");
		}
		
//		switch (level) {
//			case "gold" ->  {
//				maxLimit = 300;
//				System.out.format("신용카드 한도는 %s입니다.", maxLimit);
//			}
//			case "silver" ->  {
//				maxLimit = 100;
//				System.out.format("신용카드 한도는 %s입니다.", maxLimit);
//			}
//			case "bronze" ->  {
//				maxLimit = 50;
//				System.out.format("신용카드 한도는 %s입니다.", maxLimit);
//			}
//			default -> {
//				System.out.println("오류");
//			}
//		}
