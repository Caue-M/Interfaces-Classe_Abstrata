package com.company;

class Carro implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("o carro está acelerando. ");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando. ");
    }
}
