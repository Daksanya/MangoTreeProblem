import java.util.Scanner;
public class MangoTreeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int treeNumber=sc.nextInt();
        boolean mangoTree =false;
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                count++;
                if(count==treeNumber&&(i==0||j==0||j==columns-1)){
                    mangoTree=true;
                    break;
                }
            }
            if(mangoTree){
                break;
            }
        }
        if(mangoTree){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
