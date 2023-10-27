public class Kolo extends Figura{



    public Kolo(float a){
        this.setA(a);
    }
    @Override
    public void obliczPole(){
        float pole = (float) (Math.PI* this.getA() * this.getA()); // lub zamiast pi Math.PI lub potęgowanie MAth.pow()
        System.out.println("Pole kola to:  "+pole);
    }
}

