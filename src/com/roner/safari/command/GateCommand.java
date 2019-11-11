package com.roner.safari.command;

import com.roner.safari.supply.area.AnimalArea;
import com.roner.safari.supply.area.DuckArea;

public enum GateCommand implements Commandable {
    DUCK(DuckArea.getInstance()) {
        @Override
        public void execute() {
            animalArea.setOpenGate(!this.animalArea.isOpenGate());
        }
    };

    protected AnimalArea animalArea;

    private GateCommand(AnimalArea instance) {
        this.animalArea = instance;
    }
}
