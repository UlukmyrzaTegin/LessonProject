package less_6_ifelse.ExampleSwitch;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/20/2021 Feb 2021
 */
public class SwicthNested {
    public static void main(String[] args) {
        char branch = 'C';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любые числа от 1 до 4 ");
        int collegeYear = scanner.nextInt();
        switch (collegeYear) {
            case 1:
                System.out.println("English, Maths,Science");
                break;
            case 2:
                switch (branch) {
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Macines");
                        break;
                }
                break;
            case 3:
                switch (branch) {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }
    }
}
