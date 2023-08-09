import java.util.Scanner;

class movierecomendation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("WELCOME TO MOVIE RECOMENDATION SYSTEM");
        System.out.println("=============================================");
        System.out.println("Select the language");
        System.out.println("1.KANNADA");
        System.out.println("2.ENGLISH");
        System.out.println("3.HINDI");
        System.out.println("4.TAMIL");
        System.out.println("5.MALYALLAM");
        int language = input.nextInt();
        if (language == 1) {
            System.out.println("=============================================");
            System.out.println("Your selected language is Kannada");
            System.out.println("=============================================");
            System.out.println("Select the Geners");
            System.out.println("1.ACTION");
            System.out.println("2.ADAVENTURE");
            System.out.println("3.COMEDY");
            System.out.println("4.DRAMA");
            System.out.println("5.HORROR");
            int geners = input.nextInt();
            System.out.println("These are the recomended movies for you");
            if (geners == 1) {
                System.out.println("1.KABZA");
                System.out.println("2.KGF-2");
                System.out.println("3.UGRAMM");
                System.out.println("4.SALAGA");
            } else if (geners == 2) {
                System.out.println("1.GANDHADA GUDI-2021");
                System.out.println("2.6-5=2");
                System.out.println("3.PANCHATHANTRA");
                System.out.println("4.VIKRANT RONA");

            } else if (geners == 3) {
                System.out.println("1.ADYAKSHA");
                System.out.println("2.RAMBO");
                System.out.println("3.VICTORY");
                System.out.println("4.YARDO DUDDU YALMMAN JATHRE");
            } else if (geners == 4) {
                System.out.println("1.DRAMA");
                System.out.println("2.KRANTI VEERA SANGOLLI RAYANNA");
                System.out.println("3.KURUKSHETRA");
                System.out.println("4.BHABRUVAHANA");

            } else if (geners == 5) {
                System.out.println("1.KARVA");
                System.out.println("2.NANI");
                System.out.println("3.NAMO BHOOTHATMA");
                System.out.println("4.SHHHH..!");

            }
        }
        if (language == 2) {
            System.out.println("=============================================");
            System.out.println("Your selected language is English");
            System.out.println("=============================================");
            System.out.println("Select the Geners");
            System.out.println("1.ACTION");
            System.out.println("2.ADAVENTURE");
            System.out.println("3.COMEDY");
            System.out.println("4.DRAMA");
            System.out.println("5.HORROR");
            int geners1 = input.nextInt();
            System.out.println("These are the recomended movies for you");
            if (geners1 == 1) {
                System.out.println("1.MISSION IMPOSSIBLE-4");
                System.out.println("2.TRANSPORTERS");
                System.out.println("3.JHON WICK");
                System.out.println("4.THE MEG");
            } else if (geners1 == 2) {
                System.out.println("1.FAST AND FURIOUS X");
                System.out.println("2.TRANSFORMERS 5");
                System.out.println("3.BABY DRIVER");
                System.out.println("4.EXPANDABLES");

            } else if (geners1 == 3) {
                System.out.println("1.MR.BEAN");
                System.out.println("2.HANGOVER-2");
                System.out.println("3.THE NICE GUY");
                System.out.println("4.PINEAPPLE EXPRESS");
            } else if (geners1 == 4) {
                System.out.println("1.BROTHERS");
                System.out.println("2.TENET");
                System.out.println("3.INCEPTION");
                System.out.println("4.TOP GUN MAVERICK");

            } else if (geners1 == 5) {
                System.out.println("1.MUMMY-2");
                System.out.println("2.THE NUN");
                System.out.println("3.CONJURING-2");
                System.out.println("4.SAW");

            }
        }
        if (language == 3) {
            System.out.println("=============================================");
            System.out.println("Your selected language is Hindi");
            System.out.println("=============================================");
            System.out.println("Select the Geners");
            System.out.println("1.ACTION");
            System.out.println("2.ADAVENTURE");
            System.out.println("3.COMEDY");
            System.out.println("4.DRAMA");
            System.out.println("5.HORROR");
            int geners2 = input.nextInt();
            System.out.println("These are the recomended movies for you");
            if (geners2 == 1) {
                System.out.println("1.PATHAN");
                System.out.println("2.FORCE");
                System.out.println("3.DON");
                System.out.println("4.ATTACK");
            } else if (geners2 == 2) {
                System.out.println("1.SATHYAMEVA JAYATHE");
                System.out.println("2.BELL BOTTOM");
                System.out.println("3.URI");
                System.out.println("4.ANTHIM");

            } else if (geners2 == 3) {
                System.out.println("1.GRAND MASTHI");
                System.out.println("2.GOLMAL-2");
                System.out.println("3.CHENNAI EXPRESS");
                System.out.println("4.HERA PHERI");
            } else if (geners2 == 4) {
                System.out.println("1.DANGAL");
                System.out.println("2.RAKTHACHARIT");
                System.out.println("3.AIRLIFT");
                System.out.println("4.MISSION MANGAL");

            } else if (geners2 == 5) {
                System.out.println("1.1920");
                System.out.println("2.ATMA");
                System.out.println("3.RAAZ");
                System.out.println("4.ROOHI");

            }
        }
        if (language == 4) {
            System.out.println("=============================================");
            System.out.println("Your selected language is Tamil");
            System.out.println("=============================================");
            System.out.println("Select the Geners");
            System.out.println("1.ACTION");
            System.out.println("2.ADAVENTURE");
            System.out.println("3.COMEDY");
            System.out.println("4.DRAMA");
            System.out.println("5.HORROR");
            int geners3 = input.nextInt();
            System.out.println("These are the recomended movies for you");
            if (geners3 == 1) {
                System.out.println("1.THUPPAKI");
                System.out.println("2.VEDALAM");
                System.out.println("3.KABALI");
                System.out.println("4.ANJAN");
            } else if (geners3 == 2) {
                System.out.println("1.KOCHDIYAN");
                System.out.println("2.TEDDY");
                System.out.println("3.CAPTIAN");
                System.out.println("4.MAANAADU");

            } else if (geners3 == 3) {
                System.out.println("1.THAMIZ PADAM");
                System.out.println("2.123");
                System.out.println("3.RAJINI MRUGAN");
                System.out.println("4.REMO");
            } else if (geners3 == 4) {
                System.out.println("1.PONNIYAN SELVAN");
                System.out.println("2.KARNAN");
                System.out.println("3.SOORARAI POTTRU");
                System.out.println("4.VIDUTHALAI");

            } else if (geners3 == 5) {
                System.out.println("1.DIMONTI COLONY");
                System.out.println("2.PIZZA");
                System.out.println("3.KANCHANA");
                System.out.println("4.KAASHMORA");

            }
        }
        if (language == 5) {
            System.out.println("=============================================");
            System.out.println("Your selected language is Malayallam");
            System.out.println("=============================================");
            System.out.println("Select the Geners");
            System.out.println("1.ACTION");
            System.out.println("2.ADAVENTURE");
            System.out.println("3.COMEDY");
            System.out.println("4.DRAMA");
            System.out.println("5.HORROR");
            int geners4 = input.nextInt();
            System.out.println("These are the recomended movies for you");
            if (geners4 == 1) {
                System.out.println("1.PULI MURUGAN");
                System.out.println("2.LUCIGER");
                System.out.println("3.BHEESHMA PARVAM");
                System.out.println("4.CHRISTOPHER");
            } else if (geners4 == 2) {
                System.out.println("1.MINAL MURULI");
                System.out.println("2.BANNERGATTA");
                System.out.println("3.CHARLIE");
                System.out.println("4.JOJI");

            } else if (geners4 == 3) {
                System.out.println("1.LOVE ACTION DRAMA");
                System.out.println("2.OM SHANTI OM");
                System.out.println("3.ZOYA FACTOR");
                System.out.println("4.DRIVING LICENSE");
            } else if (geners4 == 4) {
                System.out.println("1.MARAKKAR");
                System.out.println("2.IRATTA");
                System.out.println("3.THE KERALA STORY");
                System.out.println("4.2018");

            } else if (geners4 == 5) {
                System.out.println("1.COLD CASE");
                System.out.println("2.THE PRIEST");
                System.out.println("3.DHRONA");
                System.out.println("4.9");

            }
        }
        System.out.println("=============================================");
        System.out.println("............THANK YOU VISIT AGAIN............");
        System.out.println("=============================================");

    }
}
