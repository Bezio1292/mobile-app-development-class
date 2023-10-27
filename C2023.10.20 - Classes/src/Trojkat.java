public class Trojkat extends Figura {


        public Trojkat(float a, float b){
            this.setA(a);
            this.setB(b);
        }
        @Override
        public void obliczPole(){
            float pole = (float)(0.5* this.getA() * this.getB());
            System.out.println("Pole trojkata to:  "+pole);
        }
}
