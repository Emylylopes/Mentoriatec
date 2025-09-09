public class Avalicao01 {
        public static void main(String[] args) {
            double n1 = 8.8;
            double n2 = 6.6;
            double n3 = 4.4;
            double n4 = 2.2;
            double n5 = 1.1;
            double n6 = 10.0;
            double n7 = 9.9;
            double n8 = 7.5;

            double mediaBimestral1 = (n1 + n2) / 2;
            double mediaBimestral2 = (n3 + n4) / 2;
            double mediaBimestral3 = (n5 + n6) / 2;
            double mediaBimestral4 = (n7 + n8) / 2;

            double semestre1 = (mediaBimestral1 + mediaBimestral2) / 2;
            double semestre2 = (mediaBimestral3 + mediaBimestral4) / 2;

            System.out.println("Resultado Escolar");
            System.out.printf(" 1 Bimestre : %.2f/n", mediaBimestral1);
            System.out.printf(" 2 Bimestre : %.2f/n ", mediaBimestral2);
            System.out.printf(" 1 semestre : %.2f/n", semestre1);

            System.out.printf(" 3 Bimestre :%.2f/n", mediaBimestral3);
            System.out.printf("4 Bimestre :%.2f/n", mediaBimestral4);
            System.out.printf(" 2 semestre : %.2f/n", semestre1);


        }
    }




