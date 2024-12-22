package behavioral.template.impl;

import behavioral.template.BeverageMaker;

// Concrete subclass for making tea
class TeaMaker extends BeverageMaker {
    // Implementing abstract methods
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}