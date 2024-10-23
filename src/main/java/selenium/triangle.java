package selenium;

public class triangle {
	public static void main(String[] args)
    {
//		int rows = 5;
//  
//        for (int i = 1;  i <= rows ; i++) {  
//            for (int j = 1; j <=rows - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            } 
//            System.out.println();
//        }
		
		int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                
                if (i == height - 1 || j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
		
     }
}
