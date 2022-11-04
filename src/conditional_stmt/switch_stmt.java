package conditional_stmt;

public class switch_stmt {
public static void main(String[] args) {
	
	switch("Upma") {
	
	case "Dosa" :{
		System.out.println("On Monday");
		break;
	}
	case "Poha" :{
		System.out.println("On Tuesday");
		break;
	}
	case "Utappa" :{
		System.out.println("On Wednesday");
		break;
	}
	case "Vada Sambar" :{
		System.out.println("On Thursady");
		break;
	}
	case "Batata Vada" :{
		System.out.println("On Friday");
		break;
	}
	case "Upma" :{
		System.out.println("On Saturday");
		break;
	}
	case "Misal" :{
		System.out.println("On Sunaday");
		break;
}
	default:{
		System.out.println("No Snacks today");
	}
}
}
}
