public class Main {
    public static void main(String [] arg) {
        Tamagotchi tamagotchi = new Tamagotchi(20, 20, 20);
        
     while (true) {
            String line = IO.input();
            IO.println("$" + line);
            String[] args = line.split(" ");

                 if (args[0].equals("end"))   { break; } 
            else if (args[0].equals("init"))  { tamagotchi = new Tamagotchi(IO.strToInt(args[1]), IO.strToInt(args[2]), IO.strToInt(args[3])); } 
            else if (args[0].equals("play"))  { tamagotchi.play(); } 
            else if (args[0].equals("eat"))   { tamagotchi.eat(); } 
            else if (args[0].equals("sleep")) { tamagotchi.sleep();   }
            else if (args[0].equals("shower")){ tamagotchi.shower();    }
            else if (args[0].equals("show"))  { IO.println(tamagotchi.toString());        }
            else                              { IO.println("fail: comando invalido");} 
        }
    }
}
