package com.company;

class Cachorro extends Animal{
    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + "Diz: Au au!");
    }
}
