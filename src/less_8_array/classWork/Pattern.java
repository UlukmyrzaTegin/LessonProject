package less_8_array.classWork;

/**
 * TheSusanin
 * 2/27/2021 Feb 2021
 */
public class Pattern {
    public static void main(String args[]) {
        int lines=20;
        int space=(lines*2)-2;
        for(int i=1;i<=(lines/2);i++) {
            boolean flagl=false;
            for(int l=1;l<=i;l++) {
                if(!flagl){
                    System.out.print("*");
                    flagl=true;
                } else {
                    System.out.print(" ");
                    System.out.print("*");
                }
            }
            for(int l=1;l<=space;l++) {
                System.out.print(" ");
            }
            space=space-7;
            boolean flagr=false;
            for(int l=1;l<=i;l++) {
                if(!flagr){
                    System.out.print("*");
                    flagr=true;
                } else {
                    System.out.print(" ");
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        space=space+7;
        for(int i=(lines/2);i>=1;i--) {
            boolean flagl=false;
            for(int l=1;l<=i;l++) {
                if(!flagl){
                    System.out.print("*");
                    flagl=true;
                } else {
                    System.out.print(" ");
                    System.out.print("*");
                }
            }
            for(int l=1;l<=space;l++) {
                System.out.print(" ");
            }
            space=space+7;
            boolean flagr=false;
            for(int l=1;l<=i;l++) {
                if(!flagr){
                    System.out.print("*");
                    flagr=true;
                } else {
                    System.out.print(" ");
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

    }
}