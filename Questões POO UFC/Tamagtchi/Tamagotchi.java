public class Tamagotchi {
        // Criação dos principais atribultos
        // Checagem com base nos atribultos gerais
        private boolean alive;
        private int clean;
        private int cleanMax;
        private int energy;
        private int energyMax;
        private int hungry;
        private int hungryMax;
        private int diamonds;
        private int age;

        Tamagotchi (int energyMax, int hungryMax, int cleanMax) {
            this.energyMax = energyMax;
            this.energy = energyMax;
            this.hungryMax = hungryMax;
            this.hungry = hungryMax;
            this.cleanMax = cleanMax;
            this.clean = cleanMax;
            this.age = 0;
            this.diamonds = 0;
            this.alive = true;
        }
        
        private boolean testAlive() {                       // Criação do teste de saber se o bixo ta vivo ou morto
            if (this.alive) {                               // Checagem para verdadeiro
                return true; 
            }
            else {                                          // Checagem para falso
                System.out.println("fail: pet esta morto"); // Impressão da mensagem de morte
                return false;
            }
        }
        
        public void eat() {
            if (testAlive()) {
                setEnergy(this.energy - 1);
                setClean(this.clean - 2);
                this.age += 1;
                this.diamonds += 0;
                setHungry(this.hungry + 4);
                if ( this.hungry >= this.hungryMax ) {
                    this.hungry = this.hungryMax;
                }
            }
        }
        
        public void play() {
            if (testAlive()) {
                setEnergy(this.energy - 2);
                setHungry(this.hungry - 1);
                setClean(this.clean - 3);
                this.diamonds += 1;
                this.age += 1;
            }
        }
        
        public void sleep() {
            int numeroTurnos = (this.energyMax - this.energy);
            if (testAlive()) {
                if (this.energyMax - 5 >= this.energy) {
                    this.energy = this.energyMax;
                    setHungry(this.hungry - 1);
                    this.age += numeroTurnos;
                }
                else {
                    System.out.println("fail: nao esta com sono");
                }
            }
        }
        
        public void shower() {
            if (testAlive()) {
                setEnergy(this.energy - 3);
                setHungry(this.hungry - 1);
                this.clean = this.cleanMax;
                this.age += 2;
            }
        } 
 
        public int getClean() {
            return this.clean;
        }
        
        public int getCleanMax() {
            return this.cleanMax;
        }
        
        public int getEnergy() {
            return this.energy;
        }
        
        public int getEnergyMax() {
            return this.energyMax;
        }
        
        public int getHungry() {
            return this.hungry;
        }
        
        public int getHungryMax() {
            return this.hungryMax;
        }
        
        public void setClean(int clean) {
            this.clean = clean;
            if (this.clean > this.cleanMax) {
                this.clean = this.cleanMax;
            }
            else if (this.clean <= 0) {
                this.clean = 0;
                this.alive = false;
                System.out.println("fail: pet morreu de sujeira");
            }
        }
        
        public void setEnergy(int energy) {
            this.energy = energy;
            if (this.energy > this.energyMax) {
                this.energy = this.energyMax;
            }
            else if (this.energy <= 0) {
                this.energy = 0;
                this.alive = false;
                System.out.println("fail: pet morreu de fraqueza");
            }
        }
        
        public void setHungry(int hungry) {
            this.hungry = hungry;
            if (this.hungry > this.hungryMax) {
                this.hungry = this.hungryMax;
            }
            
            else if (this.hungry <= 0) {
                this.hungry = 0;
                this.alive = false;
                System.out.println("fail: pet morreu de fome");
            }
        }
        
        public String toString() {
            String texto = ("E:" + this.energy + "/" + this.energyMax + ", S:" + this.hungry + "/" + this.hungryMax + ", L:" + this.clean + "/" + this.cleanMax + ", D:" + this.diamonds + ", I:" + this.age);
            return texto;
        } 
}
