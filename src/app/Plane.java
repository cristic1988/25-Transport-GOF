package app;

class Plane implements Transport {
    @Override
    public void move() {
        System.out.println("Летіти літаком");
    }
}
