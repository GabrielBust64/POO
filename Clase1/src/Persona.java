public class Persona {
    int[] mano = new int[3];

    public int getMano() {
        return mano.length;
    }

    public int[] getCartas(){
        return mano;
    }

    public void setMano(int carta, int i) {
        this.mano[i] = carta;
    }
}
