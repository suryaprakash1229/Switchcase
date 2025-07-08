import java.util.Scanner;
class colorcde{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter colorcode(R,B,G,O,Y,W):");
        char code =sc.next().charAt(0);
        switch(code){
            case 'R':
            System.out.println("RED");
            break;
            case 'B':
            System.out.println("BLUE");
            break;
            case 'G':
            System.out.println("GREEN");
            break;
            case 'O':
            System.out.println("ORANGE");
            break;
            case 'Y':
            System.out.println("YELLOW");
            break;
            case 'W':
            System.out.println("WHITE");
            default:
            System.out.println("enter valid character");
        }
    }
}