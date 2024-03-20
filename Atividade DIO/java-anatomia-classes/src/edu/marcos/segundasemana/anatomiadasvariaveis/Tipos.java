import java.util.Scanner;

public class Tipos {
    public static void main(String[] args) {
        // Forma adequada de declarar uma variavel em java
        // <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
        int idade; // Tipo = "int", nomeVariavel = "idade", atribuicaoDeValorOpcional = nenhum valor declarado
        int anoFabricacao = 2024;
        double salarioMinimo = 2500.50; // Forma adequada de atribuir um valor milhar para uma variavel double, o que vem depois do ponto é considerado valor quebrado
  

class Car {
    int pass;
    int gas;
    int passMax;
    int km;
    int gasMax;
    
    Car() {
        pass = 0;
        gas = 0;
        passMax = 2;
        km = 0;
        gasMax = 100;
    }
    
    public void Enter() {
        if (pass < passMax) {
            pass++;
        }
        else {
            System.out.println("fail: limite de pessoas atingido");
        }
    }
    
    public void Leave() {
        if (pass > 0) {
            pass--;
        }
        else {
            System.out.println("fail: nao ha ninguem no carro");
        }
    }
    
    public void Drive(int value) {
        if (gas == 0) {
            System.out.printf("fail: tanque vazio\n");
        }
        else if (value > gas) {  // vai andar até nao ter mais gas
            System.out.printf("fail: tanque vazio apos andar %d km\n", gas);
            km += gas;
            gas = 0;
        }
        else if (pass <= 0) {
            System.out.println("fail: nao ha ninguem no carro");
        }
        else if (gas >= value) {
                km += value;
                gas -= value;
        }
    }
    
    public void Fuel(int value) {
        if (gas + value >= gasMax) {
            gas = gasMax;
        }
        else {
            gas += value;
        }
    }
    
    public String imp() {
        String str = ("pass: " + pass + ", gas: " + gas + ", km: " + km);
        return str;
    }
}


class Solver {
    public static void main (String[] arg) {
        Car car = new Car();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            String line = scan.nextLine();
            System.out.println("$" + line);
            String[] args = line.split(" ");

            if (args[0].equals("end")) {
                break;
            } 
            else if (args[0].equals("enter")) {
                car.Enter();    
            }
            else if (args[0].equals("leave")) {
                car.Leave();
            }
            else if (args[0].equals("drive")) {
                car.Drive(Integer.parseInt(args[1]));
            }
            else if (args[0].equals("fuel")) {
                car.Fuel(Integer.parseInt(args[1]));
            }
            else if (args[0].equals("show")) {
                System.out.println(car.imp());
            }
        }
    }
}
    }
}
