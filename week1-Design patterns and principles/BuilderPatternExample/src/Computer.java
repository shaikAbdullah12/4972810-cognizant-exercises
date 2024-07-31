public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String powerSupply;
    private String coolingSystem;
    private String caseType;
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.powerSupply = builder.powerSupply;
        this.coolingSystem = builder.coolingSystem;
        this.caseType = builder.caseType;
    }
    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getGPU() {
        return GPU;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getCoolingSystem() {
        return coolingSystem;
    }

    public String getCaseType() {
        return caseType;
    }
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        private String powerSupply;
        private String coolingSystem;
        private String caseType;
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Builder setCoolingSystem(String coolingSystem) {
            this.coolingSystem = coolingSystem;
            return this;
        }

        public Builder setCaseType(String caseType) {
            this.caseType = caseType;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }

}


