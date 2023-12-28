import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cores = colorSet();
        double[] times = timeSet();
        String parseVariable;
        double transformTime;
        String start;
        String alert;
        boolean verdadeiro = true;
        int cycleIn;
        int cycleOut;
        boolean alertOff = true;
        int alertIndex = 0;

        for(int c = 0; c <= 10; c++){
            System.out.println();
        }

        System.out.println("----------------------------------Semáforo----------------------------------");
        System.out.println("As cores e seus respectivos tempos: ");
        for(int c = 0; c < 3; c++){
            System.out.println(cores[c] + ": " + times[c] + " Segundos");
        }
        System.out.print("Qual das cores informadas será utilizada como alerta? Digite apenas opções válidas: ");
        while(verdadeiro){
            alert = sc.nextLine();
            for (int c = 0; c < 3; c++) {
                System.out.println();
                if (cores[c].equalsIgnoreCase(alert)) {
                    System.out.println("Cor definida como alerta com sucesso!");
                    alertIndex = c;
                    verdadeiro = false;
                }
            }
            if(verdadeiro) {
                System.out.print("Lembre-se, apenas opções válidas: ");
            }
        }

        for(int c = 0; c <= 10; c++){
            System.out.println();
        }

        System.out.print("A cada quantos ciclos o alerta deve começar?");
        do {
            try {
                parseVariable = sc.nextLine();
                cycleIn = Integer.parseInt(parseVariable);
                while (cycleIn <= 0) {
                    System.out.println("Digite um numero positivo e diferente de zero! Tente novamente: ");
                    cycleIn = sc.nextInt();
                }
                if((cycleIn % 2 == 0) || (cycleIn % 3 == 0)){
                    break;
                }
            }
            catch(NumberFormatException ex){
                System.out.print("O valor informado não é numérico, tente novamente: ");
            }
        }
        while(true);

        for(int c = 0; c <= 10; c++){
            System.out.println();
        }

        System.out.print("Quantos ciclos o alerta deve durar?");
        do {
            try {
                parseVariable = sc.nextLine();
                cycleOut = Integer.parseInt(parseVariable);
                while (cycleOut <= 0) {
                    System.out.println("Digite um numero positivo e diferente de zero! Tente novamente: ");
                    cycleOut = sc.nextInt();
                }
                if((cycleOut % 2 == 0) || (cycleOut % 3 == 0)){
                    break;
                }
            }
            catch(NumberFormatException ex){
                System.out.print("O valor informado não é numérico, tente novamente2: ");
            }
        }
        while(true);


        System.out.println();
        System.out.print("Deseja iniciar o semáforo? Digite S ou N: ");
        start = sc.nextLine();
        while(!(start.equalsIgnoreCase("n")) && !(start.equalsIgnoreCase("s"))){
            System.out.println("Lembre-se, apenas S ou N: ");
            start = sc.nextLine();
        }
        if(start.equalsIgnoreCase("s")) {
            System.out.println();
            System.out.println("O semáforo irá iniciar em: ");
            System.out.println();
            try {
                Thread.sleep(3000);
            } catch (java.lang.InterruptedException ex) {
                System.out.println();
            }
            try {
                for (int c = 5; c > 0; c--) {
                    System.out.println(c);
                    Thread.sleep(1000);
                }
            } catch (java.lang.InterruptedException ex) {
                System.out.println();
            }

            for (int c = 0; c <= 10; c++) {
                System.out.println();
            }

            while(true){
                if(alertOff){
                    for(int c = 0; c < cycleIn; c++){
                        for (int c2 = 0; c2 < 3; c2++) {
                            System.out.println(cores[c2]);
                            for (int c3 = 0; c3 <= 4; c3++) {
                                System.out.println();
                            }
                            transformTime = times[c2] * 1000.0;
                            try {
                                Thread.sleep((long) transformTime);
                            } catch (java.lang.InterruptedException ex) {
                                System.out.println();
                            }
                        }
                    }
                    alertOff = false;
                }
                else{
                    for(int c = 0; c < cycleOut; c++){
                        System.out.println(cores[alertIndex]);
                        for (int c3 = 0; c3 <= 4; c3++) {
                            System.out.println();
                        }
                        transformTime = times[alertIndex] * 1000.0;
                        try {
                            Thread.sleep((long) transformTime);
                        } catch (java.lang.InterruptedException ex) {
                            System.out.println();
                        }
                    }
                    alertOff = true;
                }
            }
        }

        else{
            System.out.println("Obrigado por utilizar nosso programa!");
        }
    }

    public static String[] colorSet(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da primeira cor: ");
        String firstColor = sc.nextLine();
        while(firstColor.equalsIgnoreCase(" ") || firstColor.equalsIgnoreCase("") || firstColor.equalsIgnoreCase("0")){
            System.out.print("Você digitou a primeira cor inválida! Tente novamente: ");
            firstColor = sc.nextLine();
        }

        System.out.print("Digite o nome da segunda cor: ");
        String secondColor = sc.nextLine();
        while(secondColor.equalsIgnoreCase(" ") || secondColor.equalsIgnoreCase("") || secondColor.equalsIgnoreCase("0")){
            System.out.print("Você digitou a segunda cor inválida! Tente novamente: ");
            secondColor = sc.nextLine();
        }

        System.out.print("Digite o nome da terceira cor: ");
        String thirdColor = sc.nextLine();
        while(thirdColor.equalsIgnoreCase(" ") || thirdColor.equalsIgnoreCase("") || thirdColor.equalsIgnoreCase("0")){
            System.out.print("Você digitou a terceira cor inválida! Tente novamente: ");
            thirdColor = sc.nextLine();
        }

        System.out.println();
        String change;
        while(firstColor.equalsIgnoreCase(secondColor) || firstColor.equalsIgnoreCase(thirdColor) || secondColor.equalsIgnoreCase(thirdColor)){
            if(firstColor.equalsIgnoreCase(secondColor)){
                System.out.print("Você digitou a primeira e a segunda cor iguais! Qual você gostaria de mudar?");
                change = sc.nextLine();
                while(!(change.equalsIgnoreCase("primeira")) && !(change.equalsIgnoreCase("segunda"))){
                    System.out.print("Digite apenas primeira ou segunda: ");
                    change = sc.nextLine();
                }
                if(change.equalsIgnoreCase("primeira")){
                    System.out.print("Digite outro nome para a primeira: ");
                    firstColor = sc.nextLine();
                    while(firstColor.equalsIgnoreCase(" ") || firstColor.equalsIgnoreCase("") || firstColor.equalsIgnoreCase("0")){
                        System.out.print("Você digitou a primeira cor inválida! Tente novamente: ");
                        firstColor = sc.nextLine();
                    }
                }
                else{
                    System.out.print("Digite outro nome para a segunda: ");
                    secondColor = sc.nextLine();
                    while(secondColor.equalsIgnoreCase(" ") || secondColor.equalsIgnoreCase("") || secondColor.equalsIgnoreCase("0")){
                        System.out.print("Você digitou a segunda cor inválida! Tente novamente: ");
                        secondColor = sc.nextLine();
                    }
                }
            }
            if(firstColor.equalsIgnoreCase(thirdColor)){
                System.out.print("Você digitou a primeira e a terceira cor com nomes iguais! Qual você gostaria de mudar?");
                change = sc.nextLine();
                while(!(change.equalsIgnoreCase("primeira")) && !(change.equalsIgnoreCase("terceira"))){
                    System.out.print("Digite apenas primeira ou terceira: ");
                    change = sc.nextLine();
                }
                if(change.equalsIgnoreCase("primeira")){
                    System.out.print("Digite outro nome para a primeira: ");
                    firstColor = sc.nextLine();
                    while(firstColor.equalsIgnoreCase(" ") || firstColor.equalsIgnoreCase("") || firstColor.equalsIgnoreCase("0")){
                        System.out.print("Você digitou a primeira cor inválida! Tente novamente: ");
                        firstColor = sc.nextLine();
                    }
                }
                else{
                    System.out.print("Digite outro nome para a terceira: ");
                    thirdColor = sc.nextLine();
                    while(thirdColor.equalsIgnoreCase(" ") || thirdColor.equalsIgnoreCase("") || thirdColor.equalsIgnoreCase("0")){
                        System.out.print("Você digitou a terceira cor inválida! Tente novamente: ");
                        thirdColor = sc.nextLine();
                    }
                }
            }
            if(secondColor.equalsIgnoreCase(thirdColor)){
                System.out.print("Você digitou a segunda e a terceira cor com nomes iguais! Qual você gostaria de mudar?  ");
                change = sc.nextLine();
                while(!(change.equalsIgnoreCase("segunda")) && !(change.equalsIgnoreCase("terceira"))){
                    System.out.print("Digite apenas segunda ou terceira: ");
                    change = sc.nextLine();
                }
                if(change.equalsIgnoreCase("segunda")){
                    System.out.print("Digite outro nome para a segunda: ");
                    secondColor = sc.nextLine();
                    while(secondColor.equalsIgnoreCase(" ") || secondColor.equalsIgnoreCase("") || secondColor.equalsIgnoreCase("0")){
                        System.out.print("Você digitou a segunda cor inválida! Tente novamente: ");
                        secondColor = sc.nextLine();
                    }
                }
                else{
                    System.out.print("Digite outro nome para a terceira: ");
                    thirdColor = sc.nextLine();
                    while(thirdColor.equalsIgnoreCase(" ") || thirdColor.equalsIgnoreCase("") || thirdColor.equalsIgnoreCase("0")){
                        System.out.print("Você digitou a terceira cor inválida! Tente novamente: ");
                        thirdColor = sc.nextLine();
                    }
                }
            }
        }

        String[] colors = new String[3];
        colors[0] = firstColor;
        colors[1] = secondColor;
        colors[2] = thirdColor;

        return colors;
    }

    public static double[] timeSet(){
        Scanner sc = new Scanner(System.in);
        String input;
        double firstTime;
        double secondTime;
        double thirdTime;

        //Ler o primeiro
        System.out.print("Digite o tempo em segundos que a primeira cor deve durar: ");
        do{
            try{
                input = sc.nextLine();
                firstTime = Double.parseDouble(input);
                while(firstTime <= 0){
                    System.out.print("Você digitou um numero negativo ou zero, tente novamente: ");
                    input = sc.nextLine();
                    firstTime = Double.parseDouble(input);
                }
                if(!(firstTime % 2 == 0) || !(firstTime % 3 == 0)){
                    break;
                }
            }
            catch(NumberFormatException e){
                System.out.print("O numero digitado não é numérico! Tente novamente: ");
            }
        }
        while (true);

        //Pula linha para ler o segundo
        for(int c = 0; c <= 6; c++){
            System.out.println();
        }

        System.out.print("Digite o tempo em segundos que a segunda cor deve durar: ");
        do{
            try{
                input = sc.nextLine();
                secondTime = Double.parseDouble(input);
                while(secondTime <= 0){
                    System.out.print("Você digitou um numero negativo ou zero, tente novamente: ");
                    input = sc.nextLine();
                    secondTime = Double.parseDouble(input);
                }
                if(!(secondTime % 2 == 0) || !(secondTime % 3 == 0)){
                    break;
                }
            }
            catch(NumberFormatException e){
                System.out.print("O numero digitado não é numérico! Tente novamente: ");
            }
        }
        while (true);

        // Pula linha para ler o terceiro
        for(int c = 0; c <= 6; c++){
            System.out.println();
        }

        System.out.print("Digite o tempo em segundos que a terceira cor deve durar: ");
        do{
            try{
                input = sc.nextLine();
                thirdTime = Double.parseDouble(input);
                while(thirdTime <= 0){
                    System.out.print("Você digitou um numero negativo ou zero, tente novamente: ");
                    input = sc.nextLine();
                    thirdTime = Double.parseDouble(input);
                }
                if(!(thirdTime % 2 == 0) || !(thirdTime % 3 == 0)){
                    break;
                }
            }
            catch(NumberFormatException e){
                System.out.print("O numero digitado não é numérico! Tente novamente: ");
            }
        }
        while (true);

        double[] times = new double[3];
        times[0] = firstTime;
        times[1] = secondTime;
        times[2] = thirdTime;

        return times;
    }

}


